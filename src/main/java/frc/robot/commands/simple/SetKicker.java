package frc.robot.commands.simple;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.enums.ShooterSpeeds;
import frc.robot.subsystems.Shooter;

//These commands are used to set the target or output of a mechanism or piece of a mechanism
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
