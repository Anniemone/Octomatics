package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climb extends SubsystemBase {
    // local variable to store single instance of this subsystem.
    // You should never make a second instance because it causes problems with the
    // motor instantiation
    private static Climb climb;

    public static Climb getInstance() {
        // If the local subsystem doesn't exist, one is created. Otherwise we move on.
        if (climb == null) {
            climb = new Climb();
        }
        // The instance is returned
        return climb;
    }

    // Position limits for where your climb can go
    public static final double MAX_LIMIT = 0;
    public static final double MIN_LIMIT = 0;
    public TalonFX climb1, climb2;

    public Climb() {
        climb1 = new TalonFX(19);
        climb2 = new TalonFX(20);
        // Tune on controller for position. You can also configure the motors here and
        // it is better praactice, please see REV and crte docs for details
    }

    // Sets the target of both motors together. I wasn't sure if they were on the
    // same axel/gearbox so one could likely be made a follower
    public void setPosition(double position) {
        // This is from a util class we wrote and use. It makes sure the target is
        // between the maximum and minimum
        position = MathUtil.clamp(position, MIN_LIMIT, MAX_LIMIT);
        climb1.setPosition(position);
        climb2.setPosition(position);
    }

    // Being a winch and somewhat imprecise, I also made a function to use velocity
    public void setVelocity(double speed) {
        climb1.set(speed);
        climb2.set(speed);
    }
}
