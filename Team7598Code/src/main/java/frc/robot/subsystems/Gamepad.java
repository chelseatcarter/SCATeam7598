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

public class Gamepad extends Joystick 
{
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

    public JoystickButton getOperatorButtonY()
    {
        return new JoystickButton(this, RobotMap.OPERATOR_Y);
    }

    public JoystickButton getDriverButtonY()
    {
        return new JoystickButton(this, RobotMap.DRIVER_Y);
    }

    public JoystickButton getOperatorLeftTrigger()
    {
        return new JoystickButton(this, RobotMap.OPERATOR_LT);
    }

    public JoystickButton getDriverLeftTrigger()
    {
        return new JoystickButton(this, RobotMap.DRIVER_LT);
    }

    public JoystickButton getOperatorRightTrigger()
    {
        return new JoystickButton(this, RobotMap.OPERATOR_RT);
    }

    public JoystickButton getDriverRightTrigger()
    {
        return new JoystickButton(this, RobotMap.DRIVER_RT);
    }

    public JoystickButton getOperatorLB()
    {
        return new JoystickButton(this, RobotMap.OPERATOR_LB);
    }

    public JoystickButton getDriverLB()
    {
        return new JoystickButton(this, RobotMap.DRIVER_LB);
    }

    public JoystickButton getOperatorRB()
    {
        return new JoystickButton(this, RobotMap.OPERATOR_RB);
    }

    public JoystickButton getDriverRB()
    {
        return new JoystickButton(this, RobotMap.DRIVER_RB);
    }
}
