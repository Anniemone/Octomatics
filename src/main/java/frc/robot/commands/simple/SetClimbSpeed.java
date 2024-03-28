package frc.robot.commands.simple;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Climb;

//These commands are used to set the target or output of a mechanism or piece of a mechanism
public class SetClimbSpeed extends InstantCommand{
    double speed;
    Climb climb;
    public SetClimbSpeed(double speed) {
        this.speed = speed;
        climb = Climb.getInstance();
    }

    @Override
    public void initialize() {
        climb.setVelocity(speed);
    }
}