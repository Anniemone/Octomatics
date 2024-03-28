package frc.robot.enums;

//This stores all the places your pivot can be by name.
public enum ArmPostitions {
    // wherever your zero point is, either all the way to a side or in the center.
    ZERO(0),
    // The position at which you can score in the amp, it looks like your bot could
    // do it ioiof you try
    AMP(0),
    // The place where it aims into the speaker to make a shot
    BUMP(0),
    // collection position, likely all the way down.
    COLLECT(0),
    // An upright angle so your mechanism is within frame perimeter. This also
    // prevents fouls
    FRAME(0);

    // The local variable and constructor for your enum. look for w3 schools if this
    // is new for you
    public double arm;

    private ArmPostitions(double arm) {
        this.arm = arm;
    }
}
