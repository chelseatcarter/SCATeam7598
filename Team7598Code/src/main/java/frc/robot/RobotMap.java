/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//Oh my there is absolutely nothing here

package frc.robot;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  //motors
  public static final int FRONT_LEFT_MOTOR = 2;
  public static final int FRONT_RIGHT_MOTOR = 4;
  public static final int BACK_LEFT_MOTOR = 0;
  public static final int BACK_RIGHT_MOTOR =3;
  //public static final int DIGITAL_MOTOR = 9;
  //public static final int TEST-MOTOR1 = 9;
  //public static final int TEST_MOTOR2 = 8;
  //public static final int TEST_MOTOR3 = 6;

  //controllers
  public static final int DRIVER = 0;

  //buttons
  public static final int DRIVER_LEFT_X_AXIS = 0;
  public static final int DRIVER_LEFT_Y_AXIS = 1;
  public static final int DRIVER_RIGHT_X_AXIS = 4;
  public static final int DRIVER_RIGHT_Y_AXIS = 5;
  public static final int DRIVER_LT = 2;
  public static final int DRIVER_RT = 3;

  public static final int DRIVER_A = 1;
	public static final int DRIVER_B = 2;
	public static final int DRIVER_X = 3;
	public static final int DRIVER_Y = 4;
	public static final int DRIVER_LB = 5;
	public static final int DRIVER_RB = 6;
	public static final int DRIVER_START = 7;
	public static final int DRIVER_BACK = 8; 
  

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
