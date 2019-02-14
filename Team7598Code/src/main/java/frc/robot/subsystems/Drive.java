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

/**
 * Add your docs here.
 */
public class Drive extends Subsystem {

  public static Victor frontLeftMotor;
  public static Victor frontRightMotor;
  public static Victor backLeftMotor;
  public static Victor backRightMotor;
  public double maxDriveVal = 0.52;
  
  public Drive()
  {
    frontLeftMotor = new Victor(RobotMap.FRONT_LEFT_MOTOR);
    frontRightMotor = new Victor(RobotMap.FRONT_RIGHT_MOTOR);
    backLeftMotor = new Victor(RobotMap.BACK_LEFT_MOTOR);
    backRightMotor = new Victor(RobotMap.BACK_RIGHT_MOTOR); 
  }
  @Override
  public void initDefaultCommand() {

    
    // Set the default command for a subsystem here.
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
    frontLeftMotor.set(driveLeft(driver)*maxDriveVal);
    frontRightMotor.set(driveRight(driver)*maxDriveVal);
    backLeftMotor.set(driveLeft(driver)*maxDriveVal);
    backRightMotor.set(driveRight(driver)*maxDriveVal);
  }
}




//65 degrees is what you should heat your house to