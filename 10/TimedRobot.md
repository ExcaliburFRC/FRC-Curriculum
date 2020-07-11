## The `TimedRobot` class
The core class of the project is the `Robot` class, located at `Robot.java`. 
The `Robot` class extends the `TimedRobot` class, that declared methods that are used to define the
structure of the code (**what** runs _when_). 
A typical `Robot` class looks like this:
```java
public class Robot extends TimedRobot {
  //property declarations
  static Object object;
  //...
  
  //more methods, covered soon
}
```
### Init/Periodic methods
The methods declared in `TimedRobot` and overriden in `Robot` contain code for the different "modes"
for the robot - Disabled, Autonomous, Teleop, and Test. 
There are two methods for each mode, named `modeInit()` and `modePeriodic()`. 
The `modeInit()` method is run once when the robot enters that mode, and the `modePeriodic()` method
is run every 20ms while the robot is in that mode. For example, `disabledPeriodic()` runs every 20ms
while the robot is disabled.

#### `robotInit()` and `robotPeriodic()` 
In addition to the mode method pairs, there is another pair of `robotInit()` and `robotPeriodic()`.
Similarly to the mode-specific methods, `robotInit()` runs once when the robot turns on, and
`robotPeriodic()` runs every 20ms while the robot is on. 

### `TimedRobot` method usages
- `robotInit()` is used for initialization of any components or robot-wide data
- `robotPeriodic()` is used for anything that runs the whole time the robot is on, such as
diagnostics
- `autonomousInit()` is used for initialization of autonomous state variables, such as timers for a
time-based auto
- `autonomousPeriodic()` is used for any auto period logic, usually delegated to a method elsewhere
- `teleopInit()` is used for closing any resources used in the auto period, and initialization of
teleop state variables
- `teleopPeriodic()` is used for any teleop period logic, usually delegated to a method elsewhere
- `disabledInit()` is used for closing any resources used by the teleop or auto period
###### Note that these are simply suggestions based on season experience. A specific project might need a different method usage.
###### Code should be split and delegated to external methods, except extremely basic statements
