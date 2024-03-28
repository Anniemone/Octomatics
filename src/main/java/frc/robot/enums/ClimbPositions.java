package frc.robot.enums;

public enum ClimbPositions {
    // Self explanitory. I don't know why these were separate when I wrote it, but
    // it doesn't matter because percent ourput is probably the way to go.
    ZERO(0, 0),
    RAISED(1, 1);

    // The local variable and constructor for your enum. look for w3 schools if this
    // is new for you

    public double climb1, climb2;

    private ClimbPositions(double climb1, double climb2) {
        this.climb1 = climb1;
        this.climb2 = climb2;
    }
}
