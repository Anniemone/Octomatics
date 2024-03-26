package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pivot extends SubsystemBase{
    
    private static Pivot pivot;
    public static Pivot getInstance() {
        if (pivot == null) {
            pivot = new Pivot();
        }
        return pivot;
    }

    public static final double MAX_LIMIT = 0;
    public static final double MIN_LIMIT = 0;
    public TalonFX arm1, arm2; 

    public Pivot() {
        arm1 = new TalonFX(13);
        arm2 = new TalonFX(14);
        //tune on controller for position
    }

    public void setPosition(double position) {
        position = MathUtil.clamp(position, MIN_LIMIT, MAX_LIMIT);
        arm1.setPosition(position);
        arm2.setPosition(position);
    }
}
