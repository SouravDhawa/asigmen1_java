package Exam2.q4;

public class Person {
    String name;

    String gender;
    Address myadress;

    public Address getMyadress() {
        return myadress;
    }

    public void setMyadress(Address myadress) {
        this.myadress = myadress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
