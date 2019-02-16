/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.RobotMap;
//import frc.robot.subsystems.Gamepad;

/**
 * Add your docs here.
 */
public class HatchArms extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private DoubleSolenoid hatchArmSolenoid1;
  private DoubleSolenoid hatchArmSolenoid2;
  private static final DoubleSolenoid.Value BACKWARDS = DoubleSolenoid.Value.kReverse;
  private static final DoubleSolenoid.Value EXTEND = DoubleSolenoid.Value.kForward;
  //private Gamepad gamepad;

  public HatchArms()
  {
    hatchArmSolenoid1 = new DoubleSolenoid(RobotMap.FORWARD_CHANNEL_H1, RobotMap.REVERSE_CHANNEL_H1);
    hatchArmSolenoid2 = new DoubleSolenoid(RobotMap.FORWARD_CHANNEL_H2, RobotMap.REVERSE_CHANNEL_H2);
    hatchArmSolenoid1.set(BACKWARDS);
    hatchArmSolenoid2.set(BACKWARDS);
  }

  public void extendArm() //assuming there will be no situation when only one need to be extended
  {
    hatchArmSolenoid1.set(EXTEND);
    hatchArmSolenoid2.set(EXTEND);
  }

  public void unextendArm()
  {
    hatchArmSolenoid1.set(BACKWARDS);
    hatchArmSolenoid2.set(BACKWARDS);
  }

  public boolean isArmExtend1()
  {
    if (hatchArmSolenoid1.get().equals(EXTEND) && hatchArmSolenoid2.get().equals(EXTEND)) //do we need to have both in this if statement or can we assume that if one is extended than they both are extended?
      return true;
    else
      return false;
  }

  public boolean isArmBackwards()
  {
    if (hatchArmSolenoid1.get().equals(BACKWARDS) && hatchArmSolenoid2.get().equals(BACKWARDS))
      return true;
    else
      return false;
  }

  public void TestHatchArms()
  {

    //some test code to test arms without joystick?
    //if(isArmExtend())
      //unextendArm();
    //else
      //extendArm();

  // if(gamepad.get) //need to change the buttons used! Ask drive team + mechanical for which buttons to use
  //   extendArm();
  // else if(gamepad.getTriggerPressed())
  //   unextendArm();

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    //setDefaultCommand(new TestHatchArms());
  }
}
