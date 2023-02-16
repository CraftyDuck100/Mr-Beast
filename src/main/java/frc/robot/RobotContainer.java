// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BDSM license file in the root directory of this project.  

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.autos.*;
import frc.robot.commands.*;
import frc.robot.subsystems.*;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // Creates new HID object for the driver on port 0
  private final GenericHID driver = new GenericHID(0);
  // Creates button mappings on the controller
  private final int Left = getRawButton(1);
  private final int Right = getRawButton(2);
  private final int Up = getRawButton(3);
  private final int Down = getRawButton(4);
  // Define the Swerve subsystem as swerveSubsystem
  private final Swerve swerveSubsystem = new Swerve();
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    boolean fieldRelative = true; // Do you want field oriented control?
    boolean openLoop = true; // Do you want acceleration on the robot
    swerveSubsystem.setDefaultCommand(new TeleopSwerve(swerveSubsystem, driver, Left, Right, Up, Down, fieldRelative, openLoop));  //Default command to drive the bot

    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // the testAuto routine will run in auton
    return new testingAuto(swerveSubsystem);
  }
}
