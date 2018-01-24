package org.usfirst.frc.team5137.robot.subsystems;


import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	Spark shooterMotor = RobotMap.shooterMotor;
	Spark feederMotor = RobotMap.feederMotor;
	

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new Shoot());
		
	}
	public void Shoot() {
	shooterMotor.set(1);
	feederMotor.set(1);
	
	}
	public void Stop() {
		shooterMotor.set(0);
		feederMotor.set(0);
		
	}

	
}