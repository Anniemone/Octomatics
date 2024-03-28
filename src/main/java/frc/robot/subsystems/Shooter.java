package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    // local variable to store single instance of this subsystem.
    // You should never make a second instance because it causes problems with the
    // motor instantiation
    private static Shooter shooter;

    public static Shooter getInstance() {
        // If the local subsystem doesn't exist, one is created. Otherwise we move on.
        if (shooter == null) {
            shooter = new Shooter();
        }
        // The instance is returned
        return shooter;
    }

    // Just making the four motors and configuring the, percent output is fine with
    // your lack of precision and should get the job done.
    // If you attempt to shoot from other locations than right in front of the
    // speaker or amp then you will have to add a velocity tune to the flywheels at
    // least.
    CANSparkMax kicker1, kicker2, flywheel1, flywheel2;

    public Shooter() {
        kicker1 = new CANSparkMax(15, MotorType.kBrushless);
        kicker2 = new CANSparkMax(18, MotorType.kBrushless);
        flywheel1 = new CANSparkMax(17, MotorType.kBrushless);
        flywheel2 = new CANSparkMax(16, MotorType.kBrushless);
    }

    // for both of these we are setting the complimentary sets of motors together.
    // This uses percent output of -1 to 1.
    public void setFlywheels(double speed) {
        flywheel1.set(speed);
        flywheel2.set(speed);
    }

    public void setKicker(double speed) {
        kicker1.set(speed);
        kicker2.set(speed);
    }
}
