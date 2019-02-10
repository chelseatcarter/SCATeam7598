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

    //return state of Button B
    public boolean getButtonStateB()
    {
        return getRawButton(RobotMap.BUTTON_B);
    }

    //return object ButtonB
    public JoystickButton getButtonB()
    {
        return new JoystickButton(this, RobotMap.BUTTON_B);
    }
}
