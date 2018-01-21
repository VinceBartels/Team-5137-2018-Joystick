package org.usfirst.frc.team5137.robot;

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
		climberButton = new JoystickButton(jackBlack, 2);
		intakeButton = new JoystickButton(jackBlack, 3);
		arcadeModeBumper = new JoystickButton(jackBlack, 6);
		tankModeBumper = new JoystickButton(jackBlack, 5);
	
	}
}
