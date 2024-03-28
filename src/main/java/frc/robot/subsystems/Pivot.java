package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pivot extends SubsystemBase {
    // local variable to store single instance of this subsystem.
    // You should never make a second instance because it causes problems with the
    // motor instantiation
    private static Pivot pivot;

    public static Pivot getInstance() {
        // If the local subsystem doesn't exist, one is created. Otherwise we move on.
        if (pivot == null) {
            pivot = new Pivot();
        }
        // The instance is returned
        return pivot;
    }

    // Position limits for where your pivot can go.
    public static final double MAX_LIMIT = 0;
    public static final double MIN_LIMIT = 0;
    public TalonFX arm1, arm2;

    public Pivot() {
        arm1 = new TalonFX(13);
        arm2 = new TalonFX(14);
        // Tune on controller for position. You can also configure the motors here and
        // it is better praactice, please see REV and crte docs for details
    }

    public void setPosition(double position) {
        // Sets the target of both motors together. I wasn't sure if they were on the
        // same axel/gearbox so one could likely be made a follower
        position = MathUtil.clamp(position, MIN_LIMIT, MAX_LIMIT);
        arm1.setPosition(position);
        arm2.setPosition(position);
    }
}
