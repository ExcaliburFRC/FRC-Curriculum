# Analog Inputs
An analog input is any sensor that returns a analog signal (a varying voltage in the range of 0-5V). In most sensors, the voltage is proportional to the sensor reading. These sensors connect to an AnalogIn port on the roboRIO. 
#### Smart motor controller usage
Some smart motor controllers such as the TalonSRX or the SparkMAX have ports that an analog sensor can be conected to, and sensor values can be read through the motor controller object. Only analog sensors connected to the roboRIO will be covered here.
### Accessing analog inputs in code
Analog inputs connected to the roboRIO can be accessed with the `AnalogPotentiometer` class in WPILib. The raw `AnalogInput` class exists too but is less useful, as it can't be used to scale the raw voltages into meaningful units.
##### Initialization
```java
    // the analog port the sensor is connected to
    int channel = 0;
    // the full range of the mechanism - i.e 180 degrees
    double range = 180;
    // the offset - value when the sensor returns 0V
    double offset = 30;

    AnalogPotentiometer sensor = new AnalogPotentiometer(channel, range, offset);
```
##### Reading values
```java
    // gets the sensor reading after scale and offset
    double scaledValue = sensor.get();
```