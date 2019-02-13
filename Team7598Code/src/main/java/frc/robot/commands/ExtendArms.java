/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class ExtendArms extends Command {

  public boolean done;
  public double dist;
  public double time;
  public ExtendArms(double distToDrive, double seconds) {
    // Use requires() here to declare subsystem dependencies
    //requires(robot.m_arms);
    distToDrive = dist;
    seconds = time;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    done = false;
  }
  


  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return done;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
