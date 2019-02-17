package ca.fourthreethreefour;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;


public class EasyTables {

    EasyTables(){

    }


    ShuffleboardTab dynamicSettingsTab = Shuffleboard.getTab("Dynamic Settings");
    NetworkTableEntry DRIVE_ENTRY_SHUFFLE = dynamicSettingsTab.addPersistent("Drive Value", 0).getEntry();
    NetworkTableEntry SPEED_ENTRY_SHUFFLE = dynamicSettingsTab.addPersistent("Drive Speed", 0).getEntry();

    public void updateDirection(Double drive){
        DRIVE_ENTRY_SHUFFLE.setDouble(drive);

    }

    public void updateSpeed(Double speed){
        SPEED_ENTRY_SHUFFLE.setDouble(speed);
    }
    
}