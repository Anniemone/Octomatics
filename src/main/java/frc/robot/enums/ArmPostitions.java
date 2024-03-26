package frc.robot.enums;

public enum ArmPostitions {
    ZERO(0),
    AMP(0),
    BUMP(0),
    COLLECT(0),
    FRAME(0);
    public double arm;
    private ArmPostitions(double arm){
        this.arm = arm;
    }
}
