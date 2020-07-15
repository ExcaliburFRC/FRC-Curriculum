# Encoders
Encoders are one of the most useful sensors in the FRC - they measure rotational motion, and can be geared for linear motion.
There are two types of encoders - Quadrature and Hall-Effect. Most encoders used in FRC are Quadrature, but sometimes Hall-Effect sensors are used.
### Hall-Effect Sensors
Hall-Effect sensors produce an analog signal that is proportional to the strength of a magnetic field. Some brushless motors (such as REV's NEO) use a built-in hall-effect sensor so a motor controller can drive them. Hall-Effect sensors connect to a single AnalogIn port, therefore if one is connected to the roboRIO, it should be accessed the same as other [Analog Inputs](./AnalogInput.md). Due to their rarity in FRC, the rest of this doc will cover only Quadrature encoders.
### Quadrature Encoders
Quadrature encoders produce pulses on two channels named A and B, with a delay between the two. The direction of the motion is represented by which channel leads the other. Each channel is a digital signal, so a Quadrature encoder takes two DIO ports. Quadrature encoders are **relative**, so they count from the last 'reset'. A work-around for this is adding a limit switch in the 'zero' point, and resetting the encoder count when the limit switch is pressed. 
### Accessing Quadrature encoders in code
Quadrature Encoders connected to the roboRIO are accessed with the `Encoder` class in WPILib. 
##### Initialization
```java
    // creates an Encoder on DIO 0 and 1
    Encoder encoder = new Encoder(0, 1);
```
##### Reading values
```java
    // gets the sensor reading
    int count = encoder.get();
```
##### Inverting count direction
```java
    // invert count direction
    encoder.setReverseDirection(true)
```
##### Reset
```java
    // reset count 
    encoder.reset();
```