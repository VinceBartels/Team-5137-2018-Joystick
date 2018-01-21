/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5137.robot;

import org.usfirst.frc.team5137.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {
	
    Joystick jackBlack;
    public static DriveTrain driveTrain;
    public static OI oi;

    //int driveMode; // 0 is arcade, 1 is tank
    
    public void robotInit() {
    	RobotMap.init();
    	driveTrain = new DriveTrain();
    	
    	
    	oi = new OI();
        //driveMode = 0; //initiates to arcade drive mode
    }

	public void teleopPeriodic() {
	    Scheduler.getInstance().run();
	    
	    /*double-check these
		double leftJoyX = jackBlack.getRawAxis(0);
		double leftJoyY = jackBlack.getRawAxis(1);
		double rightJoyX = jackBlack.getRawAxis(4);
		double rightJoyY = jackBlack.getRawAxis(5);
		//boolean aIsPressed = jackBlack.getRawButton(1);
		boolean xIsPressed = jackBlack.getRawButton(3);
		boolean bIsPressed = jackBlack.getRawButton(2);
		boolean yIsPressed = jackBlack.getRawButton(4);
		boolean rightBumperIsPressed = jackBlack.getRawButton(6);
		boolean leftBumperIsPressed = jackBlack.getRawButton(5);
		
		if (rightBumperIsPressed) driveMode = 0;
		if (leftBumperIsPressed) driveMode = 1;
		
		switch (driveMode) {
			case 0: // if arcade drive (gonna have to change sign values)
				leftDrive.set(leftJoyY + 0.5 * rightJoyX);
				rightDrive.set(leftJoyY - 0.5 * rightJoyX);
				slideDrive.set(leftJoyX);
				break;
			case 1: // if tank drive
				leftDrive.set(leftJoyY);
				rightDrive.set(rightJoyY);
				slideDrive.set(0); // probably unnecessary, but just in case
				break;
			default: break;
		}
		if (yIsPressed) { 
			shooterMotor.set(1);
			Timer.delay(0.5);
			feederMotor.set(-1);
		}
		if (bIsPressed) {
			climber.set(1.0);
		}
		if (xIsPressed) {
			intakeMotor.set(1);
		}
		else {
			climber.set(0);
			feederMotor.set(0);
			shooterMotor.set(0);
			intakeMotor.set(0);	
		}*/
	 	
	}
}

