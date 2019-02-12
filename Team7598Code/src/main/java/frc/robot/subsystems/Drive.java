/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.DriveSlow;

/**
 * Add your docs here.
 */
public class Drive extends Subsystem 
{
  public static Talon frontLeftMotor;
  public static Talon frontRightMotor;
  public static Talon backLeftMotor;
  public static Talon backRightMotor;

  public double maxDriveVal = 0.7;
  public double minDriveVal = maxDriveVal/2;
  
  public Drive()
  {
    frontLeftMotor = new Talon(RobotMap.FRONT_LEFT_MOTOR);
    frontRightMotor = new Talon(RobotMap.FRONT_RIGHT_MOTOR);
    backLeftMotor = new Talon(RobotMap.BACK_LEFT_MOTOR);
    backRightMotor = new Talon(RobotMap.BACK_RIGHT_MOTOR); 
  }

  @Override
  public void initDefaultCommand() 
  {
    setDefaultCommand(new DriveSlow());
  }

  public double driveRight(Joystick driver)
  {
    double rightDriverVal = driver.getRawAxis(RobotMap.DRIVER_RIGHT_Y_AXIS);
    return rightDriverVal;
  }

  public double driveLeft(Joystick driver)
  {
    double leftDriverVal = -1.0*driver.getRawAxis(RobotMap.DRIVER_LEFT_Y_AXIS);
    return leftDriverVal;
  }

  public void driveSlow(Joystick driver)
  {
    frontLeftMotor.set(driveLeft(driver)*minDriveVal);
    frontRightMotor.set(driveRight(driver)*minDriveVal);
    backLeftMotor.set(driveLeft(driver)*minDriveVal);
    backRightMotor.set(driveRight(driver)*minDriveVal);
  }

  public void throttledTankDrive(Joystick driver)
  {
    frontLeftMotor.set(driveLeft(driver)*maxDriveVal);
    frontRightMotor.set(driveRight(driver)*maxDriveVal);
    backLeftMotor.set(driveLeft(driver)*maxDriveVal);
    backRightMotor.set(driveRight(driver)*maxDriveVal);
  }
}
