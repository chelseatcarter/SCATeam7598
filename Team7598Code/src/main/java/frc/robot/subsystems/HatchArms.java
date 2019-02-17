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
import edu.wpi.first.wpilibj.PWM;

public class HatchArms extends Subsystem 
{
  
  private DoubleSolenoid hatchArmSolenoid2;
  private static final DoubleSolenoid.Value BACKWARDS = DoubleSolenoid.Value.kReverse;
  private static final DoubleSolenoid.Value EXTEND = DoubleSolenoid.Value.kForward;

  public static PWM hatchMover;

  public HatchArms()
  {
    
    hatchArmSolenoid2 = new DoubleSolenoid(RobotMap.FORWARD_CHANNEL_H2, RobotMap.REVERSE_CHANNEL_H2);
    hatchMover = new PWM(RobotMap.HATCH_MOTOR);
  }

  public void extendArm()
  {

    hatchArmSolenoid2.set(EXTEND);
  }

  public void unextendArm()
  {
 
    hatchArmSolenoid2.set(BACKWARDS);
  }

  public boolean isArmExtend1()
  {
    if (hatchArmSolenoid2.get().equals(EXTEND))
      return true;
    else
      return false;
  }

  public boolean isArmBackwards()
  {
    if (hatchArmSolenoid2.get().equals(BACKWARDS))
      return true;
    else
      return false;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public double moveHatchArmsLeft(Gamepad operator)
  {
    double leftDist = operator.getRawAxis(RobotMap.OPERATOR_LT);
      return leftDist;
  }

  public double moveHatchArmsRight(Gamepad operator){

    double rightDist = -1*operator.getRawAxis(RobotMap.OPERATOR_RT);
    return rightDist;

}

public void moveHatch(Gamepad operator){
  
  hatchMover.setSpeed(moveHatchArmsLeft(operator));
  hatchMover.setSpeed(moveHatchArmsRight(operator));
}
}
