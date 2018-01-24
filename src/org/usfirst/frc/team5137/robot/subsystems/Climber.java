package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.Climb;

import edu.wpi.first.wpilibj.Spark;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {
	Spark climber = RobotMap.climber;
	
	
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new Climb());
		
	}

	public void climb() {
		climber.set(1);
		
	}

}
