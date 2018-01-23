package org.usfirst.frc.team5137.robot.subsystems;


import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	Spark shooterMotor = RobotMap.shooterMotor;
	

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new Shoot());
		
	}
	public void Shoot(JoystickButton shooterButton) {
		if (shooterButton.get()) shooterMotor.set(1);
		
	}
	
}