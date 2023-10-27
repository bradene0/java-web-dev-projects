package org.launchcode;

public class CD extends BaseDisk {
    // TODO: Implement your custom interface.
int tracks;


    public CD (String name, Double storageCapacity, String discType, int spinSpeed, int tracks){

        super(name, storageCapacity, discType, spinSpeed)

        this.tracks = tracks;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
