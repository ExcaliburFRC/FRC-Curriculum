# Advanced motor controllers (CAN)
The two-way communication over CAN allows for more features, and some smart/CAN motor controllers can have sensors connected directly to them. The three smart motor controllers used by the team are the CTRE TalonSRX and VictorSPX, and REV's SparkMAX. The exact syntax is different between vendors, but the general idea is the same. 
##### Initialization
The motor controller object constructors require the device CAN ID (that is set on the device itself using the vendor-specific client - Phoenix Tuner or the SparkMAX Client). The SparkMax constructor also requires a `MotorType` value indicating if the motor is brushless. 
```java
    TalonSRX talon = new TalonSRX(talonID);
    VictorSPX victor = new VictorSPX(victorID);
    CANSparkMax spark = new CANSparkMax(sparkID, MotorType.kBrushless);
```
##### Following
One of the features made possible by CAN is following - one motor controller follows all commands to a different controller, "following" that motor. This is useful in multi-motor mechanisms, where we want to make sure all motors are getting the same commands. This is also useful to reduce CAN traffic. A common use of this is having a VictorSPX follow a TalonSRX due to the Talon's more advanced features (covered later). Cross-vendor following is unsupported.
```java 
    victor.follow(talon);
    spark.follow(otherSpark);
```
##### Motor Control Commands
Basic motor controllers can be given only servo-like duty cycle commands. More advanced commands can be given to smart motor controllers. Non-duty-cycle commands are given to a SparkMAX through the `CANPIDController` object, that can be reached with `spark.getPIDController()`. In the CTRE motor controllers, these commands are given through the motor controller object. 
Command types are specified using the `ControlMode` (CTRE) / `ControlType` (REV) enums: (the constants are CTRE/REV)
- Duty cycle control : `PercentOutput` / `kDutyCycle`
- Position PID : `Position` / `kPosition`
- Velocity PID : `Velocity` / `kVelocity`
- Current Control : `Current` _[TalonSRX only]_ / `kCurrent`
- Raw Voltage : _[Unsupported]_ / `kVoltage`
- Automatic Motion Profiling (Position) : `MotionMagic` _[TalonSRX only]_ / `kSmartMotion`
- Follower : `Follower` / _[Undefined, should be done with `CANSparkMax.follow(CANSparkMax)`]_

```java
    talon.set(controlMode, value);
    spark.getPIDController().setReference(value, controlType);
```