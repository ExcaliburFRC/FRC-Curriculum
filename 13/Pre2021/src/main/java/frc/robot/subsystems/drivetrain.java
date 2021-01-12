package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

public class drivetrain {

    private CANSparkMax rightLeader;
    private CANSparkMax rightFollower;
    private CANSparkMax leftLeader;
    private CANSparkMax leftFollower;


    public DriveTrain (){
        rightLeader = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftLeader = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftFollower = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightFollower = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
    }
    public void tankDrive(double right, double left) {
        rightLeader.set(right);
        leftLeader.set(left);
    }
}
