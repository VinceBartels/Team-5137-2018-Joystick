package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

	public Drive() {
		requires(Robot.driveTrain);
		
	}
	
	public void execute() {
		Robot.driveTrain.driveWillGetNewName(Robot.oi.jackBlack);
		
	}
	
	
	
	
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
