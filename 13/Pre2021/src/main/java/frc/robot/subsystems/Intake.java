package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    DoubleSolenoid piston = new DoubleSolenoid(0, 1);
    CANSparkMax motor = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);


    public void up() {
        piston.set(DoubleSolenoid.Value.kForward);
        motor.set(0);
    }
}
