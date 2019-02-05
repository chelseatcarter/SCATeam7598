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

  //controllers
  public static final int DRIVER = 0;

  //buttons
  public static final int DRIVER_LEFT_X_AXIS = 0;
  public static final int DRIVER_LEFT_Y_AXIS = 1;
  public static final int DRIVER_RIGHT_X_AXIS = 4;
  public static final int DRIVER_RIGHT_Y_AXIS = 5;

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  public static int fowardDoubleSolenoid =  0;
  public static int reverseDoubleSolenoid = 1;

  //ultrasonic sensor port
  public static int ultrasonicSensorPort = 0;

  //gamepad axis ports
  public static final int AXIS_SHOULDER = 3;
  public static final int AXIS_D_PAD = 6;
  public static final int BUTTON_TRIGGER_L = 2;
  public static final int BUTTON_TRIGGER_R= 3;

  //gamepad buttons
  public static final int BUTTON_A = 1;
  public static final int BUTTON_B = 2;
  public static final int BUTTON_X= 3;
  public static final int BUTTON_Y = 4;
  public static final int BUTTON_SHOULDER_L= 5;
  public static final int BUTTON_SHOULDER_R= 6;
  public static final int BUTTON_BACK= 8;
  public static final int BUTTON_START = 7;
  public static final int BUTTON_MODE= -1;
  public static final int BUTTON_LOGITECH  = -1;
}
