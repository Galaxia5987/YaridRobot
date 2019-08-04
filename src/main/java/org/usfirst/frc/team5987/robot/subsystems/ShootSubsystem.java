package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;
import org.usfirst.frc.team5987.robot.commands.JoystickShootCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
/**
 *
 */
public class ShootSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private VictorSPX shootMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public ShootSubsystem(){
    	shootMotor = new VictorSPX(RobotMap.shoot_port);
    }
    
    public void setSpeed(double speed){
    	shootMotor.set(ControlMode.PercentOutput, speed);
    }
    
    public double getSpeed(){
    	return shootMotor.getMotorOutputPercent();
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new JoystickShootCommand());
    }
}

