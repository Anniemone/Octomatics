package frc.robot.commands.simple;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.enums.ArmPostitions;
import frc.robot.subsystems.Pivot;

//These commands are used to set the target or output of a mechanism or piece of a mechanism
public class SetArmPos extends InstantCommand {
    ArmPostitions pos;
    Pivot pivot;

    public SetArmPos(ArmPostitions armPostitions) {
        pos = armPostitions;
        pivot = Pivot.getInstance();
    }

    @Override
    public void initialize() {
        pivot.setPosition(pos.arm);
    }
}
