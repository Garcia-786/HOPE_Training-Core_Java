package Day9;

/*
Inheritence -> Is a relationship between two classes where one class (child) inherits the properties and behaviors of another class (parent).
Abstarction -> Has a relationship between two classes where one class (child) has a reference to another class (parent) and can use its methods and properties.

relationships in this program:
    1. Battery and Remote -> Has a relationship (Remote has a Battery)
    2. Remote and TV -> Has a relationship (TV has a Remote)

*/

class Battery {
    public void powerSupply() {
        System.out.println("Battery:40% remaining");
    }
}

class Remote {
    private Battery bt;
    public Remote() {
        bt = new Battery(); 
    }

    public void changeChannel() {
        bt.powerSupply(); 
        System.out.println("Channel changed");
    }

    public void changeVolume() {
        System.out.println("Volume increased");
    }
}

class TV {
    private Remote remote;
    public TV(Remote remote) {
        this.remote = remote; // passed from outside → aggregation
    }
    public void increaseVolume() {
        remote.changeVolume();
    }
    public void changeChannel() {
        remote.changeChannel();
    }
}

public class Relationship {
    public static void main(String[] args) {
        Remote r = new Remote(); 
        TV t = new TV(r);       
        t.changeChannel();
        t.increaseVolume();
    }
}