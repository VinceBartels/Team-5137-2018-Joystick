/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5137.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;

public class Robot extends TimedRobot {
	
    Joystick marinara;
    
    Joystick leftJoy;
    Joystick rightJoy;
    
    Victor leftDrive;
    Victor rightDrive;
    Spark slideDrive;
    int driveMode; // 0 is arcade, 1 is tank
    
    public void robotInit() {
    	
    	leftJoy = new Joystick(0);
    	rightJoy = new Joystick(1);
    	
    	//maybe leftDrive should be inverted instead?
    	leftDrive = new Victor(0);
    	rightDrive = new Victor(1);
    	rightDrive.setInverted(true);
    	slideDrive = new Spark (2);
    	
        driveMode = 0; //initiates to arcade drive mode
    }

	public void teleopPeriodic() {
	    
	    //double-check these
		double leftJoyX = leftJoy.getRawAxis(0);
		double leftJoyY = leftJoy.getRawAxis(1);
		double rightJoyX = rightJoy.getRawAxis(0);
		double rightJoyY = rightJoy.getRawAxis(1);
		boolean rightTriggerIsPressed = rightJoy.getRawButton(1);
		boolean leftTriggerIsPressed = leftJoy.getRawButton(1);
		if (rightTriggerIsPressed) driveMode = 0;
		if (leftTriggerIsPressed) driveMode = 1;
		
		switch (driveMode) {
			case 0: // if arcade drive (gonna have to change sign values)
				leftDrive.set(0.5 * leftJoyY + 0.5 * rightJoyX);
				rightDrive.set(0.5 * leftJoyY - 0.5 * rightJoyX);
				slideDrive.set(leftJoyX);
				break;
			case 1: // if tank drive
				leftDrive.set(leftJoyY);
				rightDrive.set(rightJoyY);
				slideDrive.set(0); // probably unnecessary, but just in case
				break;
			default: break;
		}
		
	 	/* cross button activates intake when held
		if (crossIsPressed) {
			intake.set(0.5);
		} else {
			intake.set(0);
		}
		
		// square button activates climber when held
		if (squareIsPressed) {
			climber.set(1);
		} else {
			climber.set(0);
		}		
		
		// up button activates shooter when held
		if (upIsPressed) {
			shooter.set(1);
			Timer.delay(0.5);
			feeder.set(1);
		} else {
			shooter.set(0);
			feeder.set(0);
		}
		*/
	}
}

