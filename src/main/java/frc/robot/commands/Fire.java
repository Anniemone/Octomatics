package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.simple.SetArmPos;
import frc.robot.commands.simple.SetFlywheels;
import frc.robot.commands.simple.SetKicker;
import frc.robot.enums.ArmPostitions;
import frc.robot.enums.ShooterSpeeds;

public class Fire extends SequentialCommandGroup{
    public Fire() {
        addCommands(
            new SetArmPos(ArmPostitions.BUMP),
            new WaitCommand(2),
            new SetFlywheels(ShooterSpeeds.FIRE),
            new WaitCommand(0.5),
            new SetKicker(ShooterSpeeds.FIRE),
            new WaitCommand(1),
            new SetKicker(ShooterSpeeds.STOP),
            new SetFlywheels(ShooterSpeeds.STOP)
        );
    }
}
