package org.usfirst.frc.team4131.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	//Define Controllers
	private Joystick ddrpad1 = new Joystick(RobotMap.DDRPAD1);
	
	//Define Buttons
	private JoystickButton plus = new JoystickButton(ddrpad1, 10);
	private JoystickButton minus = new JoystickButton(ddrpad1, 8);
	private JoystickButton a = new JoystickButton(ddrpad1, 2);
	private JoystickButton b = new JoystickButton(ddrpad1, 3);
	private JoystickButton up = new JoystickButton(ddrpad1, 13);
	private JoystickButton down = new JoystickButton(ddrpad1, 15);
	private JoystickButton left = new JoystickButton(ddrpad1, 16);
	private JoystickButton right = new JoystickButton(ddrpad1, 14);

	public OI(){
		
	}
	public boolean up(){
		return up.get();
	}
	public boolean down(){
		return down.get();
	}
	public boolean left(){
		return left.get();
	}
	public boolean right(){
		return right.get();
	}
}
