package org.usfirst.frc.team5987.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5987.robot.RobotMap;
import org.usfirst.frc.team5987.robot.commands.JoystickCommand;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    private VictorSPX leftMotorA;
    private VictorSPX leftMotorB;
    private VictorSPX rightMotorA;
    private VictorSPX rightMotorB;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public DriveSubsystem(){
    	leftMotorA = new VictorSPX(RobotMap.drive_left_A);
    	leftMotorB = new VictorSPX(RobotMap.drive_left_B);
    	rightMotorA = new VictorSPX(RobotMap.drive_right_A);
    	rightMotorB = new VictorSPX(RobotMap.drive_right_B);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new JoystickCommand());
    }
    
    public void setLeftSpeed(double speed){
    	leftMotorA.set(ControlMode.PercentOutput, speed);
    	leftMotorB.set(ControlMode.PercentOutput, speed);
    }
    public void setRightSpeed(double speed){
    	rightMotorA.set(ControlMode.PercentOutput, speed);
    	rightMotorB.set(ControlMode.PercentOutput, speed);
    }
    public void setSpeed(double left, double right){
    	setLeftSpeed(left);
    	setRightSpeed(right);
    }
    public double getLeftSpeed(){
    	return leftMotorA.getMotorOutputPercent();
    }
    public double getRightSpeed(){
    	return rightMotorA.getMotorOutputPercent();
    }
    
}

