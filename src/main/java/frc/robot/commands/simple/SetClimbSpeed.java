package frc.robot.commands.simple;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.enums.ShooterSpeeds;
import frc.robot.subsystems.Climb;
import frc.robot.subsystems.Shooter;

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