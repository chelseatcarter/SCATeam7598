/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Gamepad extends Joystick {

    public Gamepad(int gamepadPort)
    {
        super(gamepadPort);
    }
    
    //return state of Button X
    public boolean getButtonStateB()
    {
        return getRawButton(RobotMap.BUTTON_B);
    }
    
    //return state of Button Y
    public boolean getButtonStateY()
    {
        return getRawButton(RobotMap.BUTTON_Y);
    }

    //return object ButtonX
    public JoystickButton getButtonB()
    {
        return new JoystickButton(this, RobotMap.BUTTON_B);
    }

    //return object ButtonY
    public JoystickButton getButtonY()
    {
        return new JoystickButton(this, RobotMap.BUTTON_Y);
    }

    //return object Left Trigger Button
    public JoystickButton getLeftTriggerClick()
    {
        return new JoystickButton(this, RobotMap.BUTTON_TRIGGER_L);
    }

    //return object RIght Trigger Button
    public JoystickButton getRightTriggerClick()
    {
        return new JoystickButton(this, RobotMap.BUTTON_TRIGGER_R);
    }

}
