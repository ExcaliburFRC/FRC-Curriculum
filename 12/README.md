# Lesson 12 - Command-Based (part 1/2)

### Description
Learn the basics of the Command-Based framework.

### Topics:
- `Subsystem` 
    - `Subsystem.periodic()` 
- `Command` 
    - `CommandScheduler`
    - Lifecycle
        - `Command.initialize()` 
        - `Command.execute()` 
        - `Command.isFinished()` 
        - `Command.end(boolean)` 
    - `Command.addRequirements()` 

- Built-In Command types
    - `InstantCommand` 
    - `RunCommand` 
    - `FunctionalCommand` 
    - `PrintCommand`
    - `ConditionalCommand`
    - `SelectCommand`
    

### Practice
#### `Intake` Subsystem + Commands
Writing an `Intake` subsystem class with relevant commands/button binds, based on 2020#1 robot intake:
- DoubleSolenoid for closing/opening intake
- `VictorSPX` for controlling intake motor (with vendordep)

###### Options: 
- enum for motor mode (OFF, IN, EJECT)
- button binds for each operation
- 
