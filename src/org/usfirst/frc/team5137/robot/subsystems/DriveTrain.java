package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.Robot;
import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.arcadeDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	Victor leftDrive = RobotMap.leftDrive;
	Victor rightDrive = RobotMap.rightDrive;
	Spark slideDrive = RobotMap.slideDrive;
	int driveMode = 0;
	Joystick jackBlack = Robot.oi.jackBlack;
	
	
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new arcadeDrive());
		
	}
	
	public void arcadeDrive() {
		leftDrive.set(jackBlack.getRawAxis(1) + 0.5 * jackBlack.getRawAxis(4));
		rightDrive.set(jackBlack.getRawAxis(1) - 0.5 * jackBlack.getRawAxis(4));
		slideDrive.set(jackBlack.getRawAxis(0));
	}
	
	public void tankDrive() {
		leftDrive.set(jackBlack.getRawAxis(1));
		rightDrive.set(jackBlack.getRawAxis(5));
		slideDrive.set(0);
	}
	
	
	
	public void Stop() {
		leftDrive.set(0);
		rightDrive.set(0);
		slideDrive.set(0);
		
	}
	

}
