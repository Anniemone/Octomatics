package frc.robot.enums;

public enum ShooterSpeeds {
    COLLECT(0,0),
    FIRE(0,0),
    BACKUP(0,0),
    STOP(0,0);
    
    public double kicker, flywheel;
    private ShooterSpeeds(double kicker, double flywheel){
        this.kicker = kicker;
        this.flywheel = flywheel;
    }
}
