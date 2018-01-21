package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.Drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	Victor leftDrive = RobotMap.leftDrive;
	Victor rightDrive = RobotMap.rightDrive;
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new Drive());
		
	}

	public void driveWillGetNewName(Joystick jackBlack) {
		leftDrive.set(jackBlack.getRawAxis(1));
		rightDrive.set(jackBlack.getRawAxis(5));
	}
	
	
	

}
