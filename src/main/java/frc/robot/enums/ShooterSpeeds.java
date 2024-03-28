package frc.robot.enums;

public enum ShooterSpeeds {
    // The combined required outputs for your mechanisms doing different actions
    COLLECT(0, 0),
    FIRE(0, 0),
    // This one is for the small amount of movement needed to have the note not
    // touching your shooter wheels, so they can start spinning.
    BACKUP(0, 0),
    STOP(0, 0);

    public double kicker, flywheel;

    private ShooterSpeeds(double kicker, double flywheel) {
        this.kicker = kicker;
        this.flywheel = flywheel;
    }
}
