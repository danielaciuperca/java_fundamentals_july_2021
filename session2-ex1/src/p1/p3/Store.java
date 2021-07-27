package p1.p3;

// p3 este un subpachet al pachetului p1
// p1.p3.Store

/*
    encapsulation:
    private / protected attributes
    getters and setters for each attribute

 */

public class Store {
    private String name;
    private String address;
    private boolean open;

    //getter
    public String getName() {
        return this.name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOpen() {
        return this.open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
