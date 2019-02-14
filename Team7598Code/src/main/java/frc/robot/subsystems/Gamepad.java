/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Joystick;


public class Gamepad extends Joystick {

    public Gamepad(int gamepadPort)
    {
        super(gamepadPort);
    }

    // //returns X position of Left Joystick
    // public double getLeftX() 
    // {
    //     return getRawAxis(RobotMap.DRIVER_LEFT_X_AXIS);
    // }

    // //returns X position of Right Joystick
    // public double getRightX()
    // {
    //     return getRawAxis(RobotMap.DRIVER_RIGHT_X_AXIS);
    // }

    // //returns Y position of Left Joystick
    // public double getLeftY()
    // {
    //     return getRawAxis(RobotMap.DRIVER_LEFT_Y_AXIS);
    // }

    // //returns Y position of Right Joystick
    // public double getRightY()
    // {
    //     return getRawAxis(RobotMap.DRIVER_RIGHT_Y_AXIS);
    // }

    // //return state of Button A
    // public boolean getButtonStateA()
    // {
    //     return getRawButton(RobotMap.DRIVER_A);
    // }

    // //return state of Button B
    // public boolean getButtonStateB()
    // {
    //     return getRawButton(RobotMap.BUTTON_B);
    // }

    // //return state of Button X
    // public boolean getButtonStateX()
    // {
    //     return getRawButton(RobotMap.BUTTON_X);
    // }
    
    // //return state of Button Y
    // public boolean getButtonStateY()
    // {
    //     return getRawButton(RobotMap.BUTTON_Y);
    // }

    // //return object ButtonA
    // public JoystickButton getButtonA()
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_A); //ask about the this
    // }

    // //return object ButtonB
    // public JoystickButton getButtonB()
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_B);
    // }

    // //return object ButtonX
    // public JoystickButton getButtonX()
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_X);
    // }

    // //return object ButtonY
    // public JoystickButton getButtonY()
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_Y);
    // }

    // //return axis value of DPad
    // public double getDPadX()
    // {
    //     return getRawAxis(RobotMap.AXIS_D_PAD);
    // }

    // //return true if DPad Left (if less that -0.5)
    // public boolean getDPadLeft()
    // {
    //     double x = getDPadX();
    //     return (x < -0.5); //why -0.5?
    // }

    // //return true if DPad Right (if more than 0.5)
    // public boolean getDPadRight()
    // {
    //     double x = getDPadX();
    //     return (x > 0.5); //why 0.5?
    // }

    // //return object Start Button
    // public JoystickButton getStartButton() //also do get button state of start button
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_START);
    // }

    // //return object Back Button
    // public JoystickButton getBackButton()
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_BACK);
    // }

    // //return object Left Shoulder Button
    // public JoystickButton getLeftShoulder()
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_SHOULDER_L);
    // }

    // //return object Right Shoulder Button
    // public JoystickButton getRightShoulder()
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_SHOULDER_R);
    // }

    // //return object Left Stick Click Button
    // /*public JoystickButton getLeftStickClick()//what button is this??
    // {
    //     return new  JoystickButton(this, RobotMap.BUTTON_STICK_L);
    // }

    // //return object Right Stick Click Button
    // public JoystickButton getRightStickClick()
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_STICK_R);
    // }*/

    // //return object Left Trigger Button
    // public JoystickButton getLeftTriggerClick()
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_TRIGGER_L);
    // }

    // //return object RIght Trigger Button
    // public JoystickButton getRightTriggerClick()
    // {
    //     return new JoystickButton(this, RobotMap.BUTTON_TRIGGER_R);
    // }

}
