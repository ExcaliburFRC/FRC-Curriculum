package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Intake.IntakeState;

public class AutoCollect extends CommandBase {
    private int balls;
    private final Intake intake;

    public AutoCollect(Intake intake, int balls) {
        this.intake = intake;
        this.balls = balls;
        addRequirements(intake);
    }

    @Override
    public void initialize() {
        intake.setPistonState(true);
    }

    boolean lastIsCollected = false;//TODO: name

    @Override
    public void execute() {
        intake.setIntakeState(IntakeState.IN);
        if (intake.isBallCollected() && !lastIsCollected) {
            balls--;
        }
        lastIsCollected = intake.isBallCollected();
    }

    @Override
    public boolean isFinished() {
        return balls <= 0;
    }

    @Override
    public void end(boolean interrupted) {
        intake.setIntakeState(IntakeState.OFF);
        intake.setPistonState(false);
    }
}
