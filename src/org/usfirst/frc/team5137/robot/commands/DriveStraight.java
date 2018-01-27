package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveStraight extends Command{

	public DriveStraight() {
		requires(Robot.driveTrain);
		
	}
	
	protected void execute() {
		Robot.driveTrain.driveStraight();
	}
	protected void interrupted() {
		Robot.driveTrain.stop();
	}
	protected void stop() {
		Robot.driveTrain.stop();
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
