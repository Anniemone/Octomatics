package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase{
    private static Shooter shooter;
    public static Shooter getInstance() {
        if (shooter == null) {
            shooter = new Shooter();
        }
        return shooter;
    }

    CANSparkMax kicker1, kicker2, flywheel1, flywheel2;
    public Shooter() {
        kicker1 = new CANSparkMax(15, MotorType.kBrushless);
        kicker2 = new CANSparkMax(18, MotorType.kBrushless);
        flywheel1 = new CANSparkMax(17, MotorType.kBrushless);
        flywheel2 = new CANSparkMax(16, MotorType.kBrushless);
    }
    
    public void setFlywheels(double speed) {
        flywheel1.set(speed);
        flywheel2.set(speed);
    }

    public void setKicker(double speed) {
        kicker1.set(speed);
        kicker2.set(speed);
    }
}
