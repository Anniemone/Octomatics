package frc.robot.commands.simple;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.enums.ClimbPositions;
import frc.robot.subsystems.Climb;

//These commands are used to set the target or output of a mechanism or piece of a mechanism
public class SetClimbPos extends InstantCommand{
    ClimbPositions pos;
    Climb climb;
    public SetClimbPos(ClimbPositions climbPositions) {
        pos = climbPositions;
        climb = Climb.getInstance();
    }

    @Override
    public void initialize() {
        climb.setPosition(pos.climb1);
    }
}
