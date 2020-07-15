# Digital Inputs 
A digital input is any sensor that returns a digital signal (on/off), usually a limit switch / microswitch. These sensors connect to a DIO (Digital Input/Output) port on the roboRIO. 
### Smart motor controller usage
Some smart motor controllers such as the TalonSRX or the SparkMAX have ports that a digital sensor can be connected to, and their values are read through the motor controller object. Only digital sensors connected to a DIO port on the roboRIO will be covered here. 
### Accessing digital inputs in code
Digital inputs connected to the roboRIO are accessed with the `DigitalInput` class in WPILib. 
##### Initialization
```java
    // creates a DigitalInput on DIO 0
    DigitalInput limitSwitch = new DigitalInput(0);
```
##### Reading values
```java
    // gets the sensor reading - returns 'true' if pressed
    boolean isPressed = limitSwitch.get();
```