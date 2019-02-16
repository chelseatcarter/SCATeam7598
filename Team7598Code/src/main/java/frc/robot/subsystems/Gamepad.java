/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;

public class Gamepad extends Joystick {

    public Gamepad(int gamepadPort)
    {
        super(gamepadPort);
    }

    public JoystickButton getOperatorButtonB()
    {
        return new JoystickButton(this, RobotMap.OPERATOR_B);
    }
    
    public JoystickButton getDriverButtonB()
    {
        return new JoystickButton(this, RobotMap.DRIVER_B);
    }

    //return object ButtonY
    public JoystickButton getOperatorButtonY()
    {
        return new JoystickButton(this, RobotMap.OPERATOR_Y);
    }

    //return object ButtonY
    public JoystickButton getDriverButtonY()
    {
        return new JoystickButton(this, RobotMap.DRIVER_Y);
    }

    //return object Left Trigger Button
    public JoystickButton getLeftTriggerClick()
    {
        return new JoystickButton(this, RobotMap.DRIVER_LT);
    }

    //return object RIght Trigger Button
    public JoystickButton getRightTriggerClick()
    {
        return new JoystickButton(this, RobotMap.DRIVER_RT);
    }

    public JoystickButton getOperatorLB()
    {
        return new JoystickButton(this, RobotMap.OPERATOR_LB);
    }

    public JoystickButton getOperatorRB()
    {
        return new JoystickButton(this, RobotMap.OPERATOR_RB);
    }

    public JoystickButton getDriverLB()
    {
        return new JoystickButton(this, RobotMap.DRIVER_LB);
    }

    public JoystickButton getDriverRB()
    {
        return new JoystickButton(this, RobotMap.DRIVER_RB);
    }
}
