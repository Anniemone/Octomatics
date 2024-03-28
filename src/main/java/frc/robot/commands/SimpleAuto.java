package frc.robot.commands;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants.DriveConstants;
import frc.robot.subsystems.SwerveSubsystem;

public class SimpleAuto extends SequentialCommandGroup {
    public SimpleAuto() {
        addCommands(
                // fire
                new Fire(),
                // Janky dynamic handling of your stolen swerve code.
                new InstantCommand(() -> {
                    ChassisSpeeds chassisSpeeds;
                    chassisSpeeds = ChassisSpeeds.fromFieldRelativeSpeeds(
                            5, 0, 0, SwerveSubsystem.getInstance().getRotation2d());

                    SwerveModuleState[] moduleStates = DriveConstants.kDriveKinematics
                            .toSwerveModuleStates(chassisSpeeds);

                    SwerveSubsystem.getInstance().setModuleStates(moduleStates);
                }));
    }
}
