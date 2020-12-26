package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {

  private CANSparkMax rightLeader;
  private CANSparkMax rightFollower;
  private CANSparkMax leftLeader;
  private CANSparkMax leftFollower;
  private Encoder leftEncoder;
  private Encoder rightEncoder;
  private AHRS gyro;
  private DifferentialDrive drive;

  public Drive() {
    rightLeader = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    leftLeader = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
    leftFollower = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
    rightFollower = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
    rightFollower.follow(rightLeader);
    leftFollower.follow(leftLeader);
    leftEncoder = new Encoder(0, 1);
    rightEncoder = new Encoder(2, 3);
    drive = new DifferentialDrive(leftLeader, rightLeader);
    gyro = new AHRS();
  }

  public void tankDrive(double right, double left) {
    rightLeader.set(right);
    leftLeader.set(left);
  }

  public double getLeftEncoder() {
    return leftEncoder.getDistance();
  }

  public double getRightEncoder() {
    return rightEncoder.getDistance();
  }

  public double getGyroAngle() {
    return gyro.getAngle();
  }

  public void arcadeDrive(double xSpeed, double zRot) {
    drive.arcadeDrive(xSpeed, zRot);
  }
}
