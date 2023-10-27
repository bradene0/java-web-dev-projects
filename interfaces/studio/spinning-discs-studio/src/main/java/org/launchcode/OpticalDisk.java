package org.launchcode;

// Shared behaviors

    // Both spin
    // Both Store Data
    // Both read data
    // Both report of shared fields
    // Both inserted into a drive

//------------------------------------------------------

// Interface Behaviors

    //Both spin: spinDisc();
    //Both read: readDisc();
    //Both written by laser: writeDisk();
    //Both store data: storeData();
    //Both report data: reportData();

public interface OpticalDisk {

    int maxRPM = 5000;
    void spinDisc();

    String readDisc();

    void writeDisc();

    String storeData();

    String reportData();
}