package frc.robot.commands.simple;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.enums.ArmPostitions;
import frc.robot.subsystems.Pivot;

public class SetArmPos extends InstantCommand{
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
