package frc.robot.commands.simple;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Climb;

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