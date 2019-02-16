/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.Gamepad;
import edu.wpi.first.wpilibj.buttons.Button;
import frc.robot.commands.GrabHatch;
import frc.robot.commands.ReleaseHatch;
import frc.robot.commands.RetractArms;
import frc.robot.commands.ExtendArms;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
  Gamepad driverstick;
  Gamepad operatorstick;
  public OI(){
    driverstick = new Gamepad(RobotMap.DRIVER);
    operatorstick = new Gamepad(RobotMap.OPERATOR);
    // Button driverLB = operatorstick.getOperatorLB();
    // Button driverRB = operatorstick.getOperatorRB();
    // Button Bbutton = operatorstick.getOperatorButtonB();
    // Button Ybutton = operatorstick.getOperatorButtonY();

    Button driverLB = driverstick.getDriverLB();
    Button driverRB = driverstick.getDriverRB();
    Button Bbutton = driverstick.getDriverButtonB();
    Button Ybutton = driverstick.getDriverButtonY();
    Button RTrigger = driverstick.getRightTriggerClick();
    Button LTrigger = driverstick.getLeftTriggerClick();


    // driverLB.whenPressed(new ExtendArms());
    // driverRB.whenPressed(new RetractArms());
    Bbutton.whenPressed(new GrabHatch());
    Ybutton.whenPressed(new ReleaseHatch());
    RTrigger.whenPressed(new RetractArms());
    LTrigger.whenPressed(new ExtendArms());
  }

  public Gamepad getDriverJoystick()
  {
    return driverstick;
  }

  public Gamepad getOperatorJoystick(){
    return operatorstick;
  }
}
