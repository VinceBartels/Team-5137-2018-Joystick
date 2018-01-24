/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5137.robot;

import org.usfirst.frc.team5137.robot.commands.Auto;
import org.usfirst.frc.team5137.robot.subsystems.Climber;
import org.usfirst.frc.team5137.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5137.robot.subsystems.Shooter;
import org.usfirst.frc.team5137.robot.subsystems.IntakeRoller;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {
	
    Joystick jackBlack;
    public static DriveTrain driveTrain;
    public static Shooter shooter;
    public static OI oi;
    public static IntakeRoller intakeRoller;
    public static Climber climber;
    
    Command autonomousCommand;
    
    
    
    public void robotInit() {
	    	RobotMap.init();
	    	driveTrain = new DriveTrain();
	    	shooter = new Shooter();
	    	intakeRoller = new IntakeRoller();
	    	climber = new Climber();
	    	
	    	autonomousCommand = new Auto();
	    	
	    	oi = new OI();
    }
    
    public void autinomousInit() {
    	if (autonomousCommand != null) autonomousCommand.start();
    }
   
    public void autonomousPeriodic() {
    	Scheduler.getInstance().run();
    	
    }
    
	public void teleopPeriodic() {
	    Scheduler.getInstance().run();
	}
}

