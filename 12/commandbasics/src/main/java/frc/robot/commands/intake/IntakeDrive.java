package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

import java.util.function.*;

public class IntakeDrive extends CommandBase {
    private final Intake intake;
    private final BooleanSupplier pistonSupplier;
    private final DoubleSupplier motorSupplier;

    public IntakeDrive(Intake intake, BooleanSupplier pistonSupplier, DoubleSupplier motorSupplier) {
        this.intake = intake;
        this.pistonSupplier = pistonSupplier;
        this.motorSupplier = motorSupplier;
        addRequirements(intake);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        intake.setIntakeState(pistonSupplier.getAsBoolean());
        intake.setSpeed(motorSupplier.getAsDouble());
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        intake.setSpeed(0);
    }

}
