/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Organization.java
 * Author: Duc Ta
 * @author: Divij Anand
 * @partner: N/A
 * **********************************************
 */


package Assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"


//

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

//

public sealed abstract class Organization permits Club, University, OwnerGroup {

    //
    // Data Fields
    //
    private String name;        // Advanced OOP
    private String address;     // Advanced OOP

    //
    // Constructors
    //
    protected Organization(){
    }

    public Organization(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //
    // Abstract Methods
    //
    public abstract void displayAbout();
    public abstract void displayMission();
}

//

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

//