package frc.robot.commands.simple;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.enums.ShooterSpeeds;
import frc.robot.subsystems.Shooter;

public class SetKicker extends InstantCommand{
    double speed;
    Shooter shooter;
    public SetKicker(ShooterSpeeds shooterSpeeds) {
        speed = shooterSpeeds.flywheel;
        shooter = Shooter.getInstance();
    }

    @Override
    public void initialize() {
        shooter.setKicker(speed);
    }
}
