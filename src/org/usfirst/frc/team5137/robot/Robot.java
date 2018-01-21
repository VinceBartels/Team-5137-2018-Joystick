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
	    
	    /*if (rightBumperIsPressed) driveMode = 0;
		if (leftBumperIsPressed) driveMode = 1;
		
		
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

