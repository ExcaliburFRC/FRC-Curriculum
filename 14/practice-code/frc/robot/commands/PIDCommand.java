package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;


public class PIDCommand extends CommandBase {
    private final DoubleSupplier error;
    private final DoubleConsumer out;
    private final double kP;
    private final double kI;
    private final double kD;
    private final double tolerance;


    public PIDCommand(DoubleSupplier error, DoubleConsumer out, double kP, double kI, double kD, double tolerance) {
        this.error = error;
        this.out = out;
        this.kP = kP;
        this.kI = kI;
        this.kD = kD;
        this.tolerance = tolerance;
    }

    private double lastError;
    private double sumError;


    @Override
    public void initialize() {
        lastError = 0;
        sumError = 0;
    }

    int count = 0;

    @Override
    public void execute() {
        double currentError = error.getAsDouble();
        double p = currentError * kP;
        double i = sumError * kI;
        double d = (currentError - lastError) * kD;
        out.accept(p + i + d);

        sumError += currentError;
        lastError = currentError;

        if (tolerance > Math.abs(currentError)) {
            count++;
        } else count = 0;
        SmartDashboard.putNumber("PID", currentError);
    }


    @Override
    public boolean isFinished() {

        return count >= 5;
    }

    @Override
    public void end(boolean interrupted) {
        out.accept(0);
    }
}
