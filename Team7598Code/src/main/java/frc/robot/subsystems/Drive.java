/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import edu.wpi.first.wpilibj.Victor;
import frc.robot.subsystems.Gamepad;
import edu.wpi.first.wpilibj.PWM;

public class Drive extends Subsystem 
{
  public static Victor leftMotors;
  public static Victor rightMotors;
  public double maxDriveVal = 0.52;

  public static PWM climbMotor;
  public double liftVal = 0.6;
  
  public Drive()
  {
    leftMotors = new Victor(RobotMap.LEFT_MOTORS);
    rightMotors = new Victor(RobotMap.RIGHT_MOTORS);
    climbMotor = new PWM(RobotMap.CLIMB_MOTOR);
  }

  @Override
  public void initDefaultCommand() 
  {
    setDefaultCommand(new TankDrive());
  }

  public double driveRight(Gamepad driver)
  {
    double rightDriverVal = driver.getRawAxis(RobotMap.DRIVER_RIGHT_Y_AXIS);
    return rightDriverVal;
  }

  public double driveLeft(Gamepad driver)
  {
    double leftDriverVal = -1.0*driver.getRawAxis(RobotMap.DRIVER_LEFT_Y_AXIS);
    return leftDriverVal;
  }

  public void throttledTankDrive(Gamepad driver)
  {
    leftMotors.set(driveLeft(driver)*maxDriveVal);
    rightMotors.set(driveRight(driver)*maxDriveVal);
  }

  public double climbFunction(Gamepad operator)
  {
    double liftPower = operator.getRawAxis(RobotMap.OPERATOR_LEFT_X_AXIS);
    return liftPower;
  }

  public void startClimb(Gamepad operator){
    
    climbMotor.setSpeed(climbFunction(operator)*liftVal);
  }
}