package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.Drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	Victor leftDrive = RobotMap.leftDrive;
	Victor rightDrive = RobotMap.rightDrive;
	Spark slideDrive = RobotMap.slideDrive;
	int driveMode = 0;
	
	
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new Drive());
		
	}
	
	public void driveWillGetNewName(Joystick jackBlack, JoystickButton arcadeModeBumper, JoystickButton tankModeBumper) {
		
		if (arcadeModeBumper.get()) driveMode = 0;
		if (tankModeBumper.get()) driveMode = 1;
		
		switch (driveMode) {
			case 0: // if arcade drive (gonna have to change sign values)
				leftDrive.set(jackBlack.getRawAxis(1) + 0.5 * jackBlack.getRawAxis(4));
				rightDrive.set(jackBlack.getRawAxis(1) - 0.5 * jackBlack.getRawAxis(4));
				slideDrive.set(jackBlack.getRawAxis(0));
				break;
			case 1: // if tank drive
				leftDrive.set(jackBlack.getRawAxis(1));
				rightDrive.set(jackBlack.getRawAxis(5));
				slideDrive.set(0);
				break;
			default: break;
		}
	
	}
	
	

}
