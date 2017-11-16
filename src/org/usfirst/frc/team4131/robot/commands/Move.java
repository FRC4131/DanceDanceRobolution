package org.usfirst.frc.team4131.robot.commands;

import org.usfirst.frc.team4131.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Move extends Command {

	public Move() {
		requires(Robot.mechanum);
	}
	@Override
	protected void initialize() {
	}
	public void execute() {
		Robot.mechanum.move(Robot.oi.up(), Robot.oi.down(), Robot.oi.left(), Robot.oi.right());
	}
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		Robot.mechanum.move(false, false, false, false);
	}
	protected void interrupted() {
		Robot.mechanum.move(false, false, false, false);
	}

}
