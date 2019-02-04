/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * Add your docs here.
 */
public class UltrasonicSensor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  AnalogInput mb1013;
  double distance;
  
  public UltrasonicSensor()
  {
    mb1013 = new AnalogInput(RobotMap.ultrasonicSensorPort);
  }

 // returns distance from object in mm 
  public double getValue()
  {
    //int raw = mb1013.getValue();
    double voltage = mb1013.getVoltage();
    double V5mm = (5 / 4096) * 1000;
    double distance = (voltage/V5mm) * 5;
    System.out.println("Distance (mm): " + distance);
    return distance;
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
