package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {

    private CANSparkMax rightLeader ;
    private CANSparkMax rightFollower ;
    private CANSparkMax leftLeader ;
    private CANSparkMax leftFollower ;
    private Encoder leader ;
    private Encoder follower ;
    private AHRS gyro ;


    public Drive() {
//        rightLeader = new CANSparkMax()
    }
}
