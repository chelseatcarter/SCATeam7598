/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * Add your docs here.
 */
public class NewMotors extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public NewMotors(){
    // VictorSP testdigital = new VictorSP(RobotMap.DIGITAL_MOTOR);
    // VictorSP testMotor1 = new VictorSP(RobotMap.TEST_MOTOR1);
    // VictorSP testMotor2 = new VictorSP(RobotMap.TEST_MOTOR2);
    // VictorSP testMotor3 = new VictorSP(RobotMap.TEST_MOTOR3);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
