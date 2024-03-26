package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climb extends SubsystemBase{
    
    private static Climb climb;
    public static Climb getInstance() {
        if (climb == null) {
            climb = new Climb();
        }
        return climb;
    }

    public static final double MAX_LIMIT = 0;
    public static final double MIN_LIMIT = 0;
    public TalonFX climb1, climb2; 

    public Climb() {
        climb1 = new TalonFX(19);
        climb2 = new TalonFX(20);
        //tune on controller for position
    }

    public void setPosition(double position) {
        position = MathUtil.clamp(position, MIN_LIMIT, MAX_LIMIT);
        climb1.setPosition(position);
        climb2.setPosition(position);
    }

    public void setVelocity(double speed) {
        climb1.set(speed);
        climb2.set(speed);
    }
}
