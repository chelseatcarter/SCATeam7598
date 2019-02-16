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
  public static final int OPERATOR = 0;
  
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  public static final int FORWARD_CHANNEL_CLAW =  0;
  public static final int REVERSE_CHANNEL_CLAW = 1;
  public static final int FORWARD_CHANNEL_H1 = 2;
  public static final int REVERSE_CHANNEL_H1 = 3;
  public static final int FORWARD_CHANNEL_H2 = 4;
  public static final int REVERSE_CHANNEL_H2 = 5;

  //gamepad buttons
  public static final int BUTTON_B = 2;
  public static final int BUTTON_Y = 4;
  
  public static final int BUTTON_TRIGGER_L = 2;
  public static final int BUTTON_TRIGGER_R= 3;

}