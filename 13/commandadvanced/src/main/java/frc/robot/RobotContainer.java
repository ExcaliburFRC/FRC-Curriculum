/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.intake.AutoCollect;
import frc.robot.commands.intake.IntakeDrive;
import frc.robot.subsystems.Intake;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
    // The robot's subsystems and commands are defined here...
    private final Intake intake = new Intake();
    private Command intakeDrive;

    /**
     * The container for the robot.  Contains subsystems, OI devices, and commands.
     */
    public RobotContainer() {
        // Configure the button bindings
        configureButtonBindings();
    }

    /**
     * Use this method to define your button->command mappings.  Buttons can be created by
     * instantiating a {@link GenericHID} or one of its subclasses ({@link
     * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
     * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {
        Joystick joystick = new Joystick(1);
        JoystickButton button = new JoystickButton(joystick, 2);
        Trigger trigger = new Trigger(() -> Math.random() > 0);
        Trigger t2 = new Trigger(() -> false);
        trigger = trigger.or(t2.negate());
        button.and(t2);
        trigger.whenActive(() -> intake.setPistonState(!intake.getIntakeState()), intake);
        intakeDrive = new IntakeDrive(intake, () -> joystick.getRawButton(2), () -> joystick.getRawAxis(2));
        CommandGroupBase sequentialCommandGroup = new AutoCollect(intake, 2).andThen(intakeDrive);
    }


    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getIntakeCommand() {
        // An ExampleCommand will run in autonomous
        return intakeDrive;
    }
}
