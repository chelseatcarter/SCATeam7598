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
  //controllers
  public static final int DRIVER = 0;
  
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  public static final int FOWARD_CHANNEL =  0;
  public static final int REVERSE_CHANNEL = 4;

  //gamepad buttons
  public static final int BUTTON_X= 3;
  public static final int BUTTON_Y = 4;
}
