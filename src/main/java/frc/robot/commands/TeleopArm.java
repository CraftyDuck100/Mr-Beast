package.frc.robot.commands;

// Hope this is all the imports I need. Probably isnt. Probably even have a useless import in here somewhere.

import frc.robot.Constants;
import frc.robot.subsystems.Arm;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class TeleopArm extends CommandBase {

    //currently blank but chances are this space will likely be needed. This is a bare bones Proof of concept

    public void extendarm() {
        shoulderFalcon.set(shoulderSpeed);
        elbowMotor.set(elbowSpeed);
        wristMotor.set(wristSpeed);
    }
}