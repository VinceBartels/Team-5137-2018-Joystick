package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.Intake;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeRoller extends Subsystem {
	Spark intakeMotor = RobotMap.intakeMotor;
	
	
	protected void initDefaultCommand() {
		setDefaultCommand(new Intake());
	}
	

	public void intake(JoystickButton intakeButton) {
	
		if (intakeButton.get()) intakeMotor.set(1);
	
	}
	
}