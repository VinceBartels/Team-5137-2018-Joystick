package org.usfirst.frc.team5137.robot.commands;

import org.usfirst.frc.team5137.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {
	
	public Shoot() {
		requires(Robot.shooter);
		
	}
	public void execute() {
		Robot.shooter.Shoot();
		
	}
	protected void end() {
		Robot.shooter.Stop();
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
