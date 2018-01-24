package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class autoDriveStraight extends Command {
	

	public autoDriveStraight() {
		requires(Robot.driveTrain);
		
	}
	public void execute() {
		Robot.driveTrain.autoDriveStraight();
		
	}
	protected void interrupted() {
		Robot.driveTrain.stop();
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
