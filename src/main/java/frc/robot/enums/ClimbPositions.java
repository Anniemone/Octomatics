package frc.robot.enums;

public enum ClimbPositions {
    
    ZERO(0, 0),
    RAISED(1,1);
    public double climb1,climb2;
    private ClimbPositions(double climb1, double climb2) {
        this.climb1 = climb1;
        this.climb2 = climb2;
    }
}
