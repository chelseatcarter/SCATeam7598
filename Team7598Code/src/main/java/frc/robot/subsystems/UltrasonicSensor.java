/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.commands.getSensorVals;
import edu.wpi.first.wpilibj.AnalogInput;

/**
 * Add your docs here.
 */
public class UltrasonicSensor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  AnalogInput mb1013;
  double distance;
  private final double DISTANCE_OFFSET = 15.5;

  public UltrasonicSensor()
  {
    mb1013 = new AnalogInput(RobotMap.ULTRASONIC_SENSOR_CHANNEL);
  }

 // returns distance from object in mm 
  public double getValue()
  {
    distance = (mb1013.getValue() * 1.25) - DISTANCE_OFFSET;
    SmartDashboard.putNumber("Distance (mm):", distance);
    return distance;
  }


  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new getSensorVals());
  }
}
