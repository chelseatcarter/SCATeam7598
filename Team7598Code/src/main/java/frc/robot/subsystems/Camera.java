/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.cscore.UsbCamera;
public class Camera extends Subsystem 
{
  UsbCamera camera;

 public Camera()
 {
  camera = CameraServer.getInstance().startAutomaticCapture();
  camera.setResolution(640, 480);
  camera.setFPS(20);
 }
 
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
