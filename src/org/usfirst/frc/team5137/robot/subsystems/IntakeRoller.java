package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeRoller extends Subsystem {

	Spark intakeMotor = RobotMap.intakeMotor;
	
	protected void initDefaultCommand() {
	
	}
	
	public void intake() {
		intakeMotor.set(1);
	}
	
	public void stop() {
		intakeMotor.set(0);
	}

}