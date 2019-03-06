package co.baron.domain;

/**
 * Created by asad on 06/03/19.
 */

public class Professor {
    private int profId;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;

    public Professor() {
    }

    public Professor(int profId, String firstName, String lastName, String address, String phone) {
        this.profId = profId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    public Professor(int profId, String firstName, String lastName) {
        this.profId = profId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getProfId() {
        return profId;
    }

    public void setProfId(int profId) {
        this.profId = profId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
