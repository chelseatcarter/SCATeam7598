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
import frc.robot.commands.TestSolenoid;

/**
 * Add your docs here.
 */
public class Claw extends Subsystem {
  // Put methods for controlling this subsystem
  //create a constructor called Claw
  private DoubleSolenoid clawGrabSolenoid;
  private static final DoubleSolenoid.Value CLOSED = DoubleSolenoid.Value.kReverse;
  private static final DoubleSolenoid.Value OPEN = DoubleSolenoid.Value.kForward;


  public Claw()
  {
     clawGrabSolenoid = new DoubleSolenoid(RobotMap.fowardDoubleSolenoid, RobotMap.reverseDoubleSolenoid);
     clawGrabSolenoid.set(CLOSED);
  }

  public void openClaw()
  {
    clawGrabSolenoid.set(OPEN);
  }

  public void closeClaw()
  {
    clawGrabSolenoid.set(CLOSED);
  }

  public boolean isClawOpen()
  {  	
    return clawGrabSolenoid.get().equals(OPEN);
  }
  
  public boolean isClawClosed()
  {
    return clawGrabSolenoid.get().equals(CLOSED);
  }
 
  public void TestSolenoid()
  {
    if (isClawOpen())
      closeClaw();
    else
      openClaw();
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
