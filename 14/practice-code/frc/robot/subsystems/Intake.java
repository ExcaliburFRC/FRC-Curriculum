package frc.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private final PWMVictorSPX motor = new PWMVictorSPX(1);
    private final DoubleSolenoid piston = new DoubleSolenoid(1, 2);
    private final DigitalInput limitSwitch = new DigitalInput(1);

    public void setSpeed(double speed) {
        motor.setSpeed(speed);
    }

    public enum IntakeState {
        IN(0.7), OFF(0.0), OUT(-0.5);

        public double speed;
        IntakeState(double v) {
            speed = v;
        }
    }

    public void setIntakeState(IntakeState state) {
        switch(state) {
            case IN:
                motor.setSpeed(0.7); break;
            case OFF:
                motor.setSpeed(0);
        }
    }

    public void setPistonState(boolean state) {
        piston.set(state ? Value.kForward : Value.kReverse);
    }

    public boolean getIntakeState() {
        return piston.get() == Value.kForward;
    }

    @Override
    public void periodic() {
        SmartDashboard.putBoolean("Intake State", getIntakeState());
    }

    public boolean isBallCollected(){
        return limitSwitch.get();
    }
}
