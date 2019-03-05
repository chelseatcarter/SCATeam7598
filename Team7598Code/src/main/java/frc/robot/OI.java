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

public class OI 
{
  Gamepad driverStick;
  Gamepad operatorStick;

  public OI()
  {
    driverStick = new Gamepad(RobotMap.DRIVER);
    operatorStick = new Gamepad(RobotMap.OPERATOR);

    Button bButton = operatorStick.getOperatorButtonB();
    Button yButton = operatorStick.getOperatorButtonY();
    Button lBumper = operatorStick.getOperatorLB();
    Button rBumper = operatorStick.getOperatorRB();
    // Button drBumper = driverStick.getDriverRB();
    // Button dlBumper = driverStick.getDriverLB();

    bButton.whenPressed(new GrabHatch());
    yButton.whenPressed(new ReleaseHatch());
    lBumper.whenPressed(new ExtendArms());
    rBumper.whenPressed(new RetractArms());
  }

  public Gamepad getDriverJoystick()
  {
    return driverStick;
  }

  public Gamepad getOperatorJoystick()
  {
    return operatorStick;
  }
}
