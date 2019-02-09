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
  public final double V5mm;
  public UltrasonicSensor()
  {
    mb1013 = new AnalogInput(RobotMap.ultrasonicSensorPort);
    V5mm =((double)5.0/4096.0);
    System.out.println(V5mm);
  }

 // returns distance from object in mm 
  public double getValue()
  {
    // SmartDashboard.putNumber("Analog Value (0-4096):",mb1013.getValue());
    // double voltage = mb1013.getVoltage();
    // SmartDashboard.putNumber("Voltage: " , voltage);
    // double distance = (voltage/V5mm) * 5;
    SmartDashboard.putNumber("Distance (mm): ",mb1013.getValue() * 1.25);
    return distance;

  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new getSensorVals());
  }
}
