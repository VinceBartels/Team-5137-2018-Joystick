package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command {

	
	public Climb() {
		requires(Robot.climber);
		
	}
	public void execute() {
		Robot.climber.climb(Robot.oi.climberButton);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}


}
