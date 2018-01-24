package org.usfirst.frc.team5137.robot;

import org.usfirst.frc.team5137.robot.commands.Climb;
import org.usfirst.frc.team5137.robot.commands.Intake;
import org.usfirst.frc.team5137.robot.commands.Shoot;
import org.usfirst.frc.team5137.robot.commands.arcadeDrive;
import org.usfirst.frc.team5137.robot.commands.tankDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public Joystick jackBlack;
	public JoystickButton shooterButton;
	public JoystickButton climberButton;
	public JoystickButton intakeButton;
	public JoystickButton arcadeModeBumper;
	public JoystickButton tankModeBumper;
	
	public OI() {
		jackBlack = new Joystick(0);
		
		shooterButton = new JoystickButton(jackBlack, 4);
		shooterButton.whileHeld(new Shoot());
		
		climberButton = new JoystickButton(jackBlack, 2);
		climberButton.whileHeld(new Climb());
		
		intakeButton = new JoystickButton(jackBlack, 3);
		intakeButton.whileHeld(new Intake());
		
		arcadeModeBumper = new JoystickButton(jackBlack, 6);
		arcadeModeBumper.toggleWhenPressed(new arcadeDrive());

		tankModeBumper = new JoystickButton(jackBlack, 5);
		tankModeBumper.toggleWhenPressed(new tankDrive());
		
	}
}
