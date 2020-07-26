package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private final PWMVictorSPX motor = new PWMVictorSPX(1);
    private final DoubleSolenoid piston = new DoubleSolenoid(1, 2);

    public void setSpeed(double speed) {
        motor.setSpeed(speed);
    }

    public void setIntakeState(boolean state) {
        piston.set(state ? Value.kForward : Value.kReverse);
    }

    public boolean getIntakeState() {
        return piston.get() == Value.kForward;
    }

    @Override
    public void periodic() {
        SmartDashboard.putBoolean("Intake State", getIntakeState());
    }
}
