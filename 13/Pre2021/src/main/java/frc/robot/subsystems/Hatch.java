package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Hatch extends SubsystemBase {
    DoubleSolenoid Get1;
    DoubleSolenoid Get2;


    public Hatch() {
        Get1 = new DoubleSolenoid(Constants.Get1Port);
        Get2 = new DoubleSolenoid(Constants.Get2Port);
    }


    public void setRollerMotorPower(double p){
        rollerMotor.set(ControlMode.PercentOutput, p);
    }

    public void setLifterPistonPosition(boolean on){
        Value value = on ? Value.kForward : Value.kReverse;
        Get1.set(value);
    }

    public boolean getLifterPistonPosition(){
        return lifterPiston.get() == Value.kForward ? true : false;
    }
}