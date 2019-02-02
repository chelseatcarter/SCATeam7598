/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
public static int fowardDoubleSolenoid =  0;
public static int reverseDoubleSolenoid = 1;

//ultrasonic sensor port
public static int ultrasonicSensorPort = 0;

//gamepad axis ports
public static int AXISLEFTX = 1;
public static int AXISLEFTY = 2;
public static int AXISSHOULDER = 3;
public static int AXISRIGHTX = 4;
public static int axisRightY = 5;
public static int axisDPad = 6;

//gamepad buttons
public static int buttonA = 2;
public static int buttonB = 3;
public static int buttonX = 1;
public static int buttonY = 4;
public static int buttonShoulderL = 5;
public static int buttonShoulderR = 6;
public static int buttonTriggerL = 7;
public static int buttonTriggerR = 8;
public static int buttonBack = 9;
public static int buttonStart = 10;
public static int buttonStickL = 11;
public static int buttonStickR = 12;
public static int buttonMode = -1;
public static int buttonLogitech  = -1;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  
 
}
