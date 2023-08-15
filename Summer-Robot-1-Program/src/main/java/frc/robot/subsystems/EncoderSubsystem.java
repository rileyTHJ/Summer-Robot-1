// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class EncoderSubsystem extends SubsystemBase {
  /** Creates a new EncoderSubsystem. */
  DutyCycleEncoder Encoder = new DutyCycleEncoder(8);
  public EncoderSubsystem() {
    
  }
  public void readEncoder() {
    System.out.println(Encoder.get());
    SmartDashboard.putNumber("Encoder", Encoder.get());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Encoder", Encoder.get());
  }
}
