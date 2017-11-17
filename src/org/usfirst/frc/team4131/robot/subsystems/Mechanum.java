package org.usfirst.frc.team4131.robot.subsystems;

import org.usfirst.frc.team4131.robot.RobotMap;
import org.usfirst.frc.team4131.robot.commands.Move;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Mechanum extends Subsystem {
	private CANTalon DRIVE1, DRIVE2, DRIVE3, DRIVE4;
	public Mechanum() {
		DRIVE1 = new CANTalon(RobotMap.DRIVE1); //Front Left
		DRIVE2 = new CANTalon(RobotMap.DRIVE2); //Front Right
		DRIVE3 = new CANTalon(RobotMap.DRIVE3); //Back Right
		DRIVE4 = new CANTalon(RobotMap.DRIVE4); //Back Left
	}
	@Override
	protected void initDefaultCommand(){
		setDefaultCommand(new Move());
	}
	public void move(boolean up, boolean down, boolean left, boolean right) {
		if (up == false && down == false && left == false && right == false) {
			haltward();
		} else if (up == true && down == true && left == true && right == true) {
			haltward();
		} else if ((up == true && down == true) || (left == true && right == true)) {
			forward();
		} else if (up == true) {
			forward();
		} else if (down == true) {
			backward();
		} else if (left == true) {
			leftward();
		} else if (right = true) {
			rightward();
		} else {
			haltward();
		}
	}
	public void forward() {
		//1 & 4 right
		//2 & 3 left
		DRIVE1.set(0.5);
		DRIVE2.set(-0.5);
		DRIVE3.set(-0.5);
		DRIVE4.set(0.5);
	}
	public void backward() {
		DRIVE1.set(-0.5);
		DRIVE2.set(0.5);
		DRIVE3.set(0.5);
		DRIVE4.set(-0.5);
	}
	public void leftward() {
		DRIVE1.set(0.5);
		DRIVE2.set(-0.5);
		DRIVE3.set(0.5);
		DRIVE4.set(-0.5);
	}
	public void rightward() {
		DRIVE1.set(-0.5);
		DRIVE2.set(0.5);
		DRIVE3.set(-0.5);
		DRIVE4.set(0.5);
	}
	public void haltward() {
		DRIVE1.set(0);
		DRIVE2.set(0);
		DRIVE3.set(0);
		DRIVE4.set(0);
	}
}
