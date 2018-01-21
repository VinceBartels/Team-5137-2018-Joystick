package org.usfirst.frc.team5137.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;

public class RobotMap {

    public static Victor leftDrive;
    public static Victor rightDrive;
    public static Spark climber;
    public static Spark slideDrive;
    public static Spark shooterMotor;
    public static Spark feederMotor;
    public static Spark intakeMotor;
    
    public static void init() {
    	leftDrive = new Victor(0);
    	rightDrive = new Victor(1);
    	rightDrive.setInverted(true);
    	slideDrive = new Spark (2);
    	shooterMotor = new Spark(3);
    	climber = new Spark (4);
    	feederMotor = new Spark(5);
    	intakeMotor = new Spark(6);
    }
}
