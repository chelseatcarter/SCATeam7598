/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.AnalogInput;
import frc.robot.RobotMap;
import frc.robot.commands.getEncoderVals;

/**
 * Add your docs here.
 */
public class AbsoluteEncoder extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  int encoderIn;
  double inRotationPosition;
  int pastval;
  int delta;
  int direction;
  long  rotationCount;
  double armPosition;
  double multiplier = 360.0/4096.0;
  AnalogInput encoder;

  public AbsoluteEncoder()
  {
    encoder = new AnalogInput(RobotMap.ENCODER_CHANNEL);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new getEncoderVals());
  }

  public void encoderFunction()
  {
    while(true) 
    {
      encoderIn = encoder.getValue();
      double voltage = encoder.getVoltage();
      SmartDashboard.putNumber("Encoder Input Value: ", encoderIn);
      SmartDashboard.putNumber("Voltage:", voltage);
      delta = pastval - encoderIn;
      SmartDashboard.putNumber("Delta", delta);
      inRotationPosition = (double)encoderIn* multiplier;
      SmartDashboard.putNumber("Rotation Position:", inRotationPosition);
  
      if (delta > 100)
       direction = 1; 
      else if (delta < -100)
        direction = 2;
      else 
        direction = 0;
      
      SmartDashboard.putNumber("Encoder Direction", direction);
  
      if (delta > 3000 || delta < -3000) 
      {
        if (direction == 1 )
          rotationCount +=  1;
        if (direction == 2)
          rotationCount -= 1;
      }
      SmartDashboard.putNumber("Rotation Count", rotationCount);
      armPosition = rotationCount/20;
      pastval = encoderIn;
    }
  }
}
