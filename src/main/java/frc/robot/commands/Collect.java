package frc.robot.commands;

import javax.swing.GroupLayout.SequentialGroup;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.simple.SetArmPos;
import frc.robot.commands.simple.SetFlywheels;
import frc.robot.commands.simple.SetKicker;
import frc.robot.enums.ArmPostitions;
import frc.robot.enums.ShooterSpeeds;
import frc.robot.subsystems.Pivot;
import frc.robot.subsystems.Shooter;

public class Collect extends Command{
    Shooter shooter;
    Pivot pivot;
    public Collect() {
        this.pivot = Pivot.getInstance();
        this.shooter = Shooter.getInstance();
    }

    @Override
    public void initialize() {
        pivot.setPosition(ArmPostitions.COLLECT.arm);
        shooter.setKicker(ShooterSpeeds.COLLECT.kicker);
        shooter.setFlywheels(ShooterSpeeds.COLLECT.flywheel);
    }

    @Override
    public void end(boolean interrupted) {
        Pivot.getInstance().setPosition(ArmPostitions.FRAME.arm);
        CommandScheduler.getInstance().schedule(new SequentialCommandGroup(new SetKicker(ShooterSpeeds.BACKUP), new WaitCommand(0.05), new SetKicker(ShooterSpeeds.STOP), new SetFlywheels(ShooterSpeeds.STOP), new SetArmPos(ArmPostitions.FRAME)));
    }
    
}
