package com.RashidGafurov_INC_LOL;

public abstract class Hogwarts {
    private String fullName;
    private int power;
    private int transDis;

    public void compareTo(Hogwarts s) {
        if (this.sumOfBasics() > s.sumOfBasics()){
            System.out.println(this.getFullName() + " is stronger than " + s.getFullName());
        } else {
            System.out.println(s.getFullName() + " is stronger than " + this.getFullName());
        }
    }

    public int sumOfBasics() {
        return this.getPower() + this.getTransDis();
    }

    public String toString() {
        return fullName +
                ", power=" + power +
                ", transgression Distance=" + transDis;
    }

    public int sumOfAttributes() {
        return Integer.MAX_VALUE;
    }


    public String getSchoolName() {
        return "Hogwarts";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransDis() {
        return transDis;
    }

    public void setTransDis(int transDis) {
        this.transDis = transDis;
    }

    public Hogwarts(String fullName, int power, int transDis) {
        this.fullName = fullName;
        this.power = power;
        this.transDis = transDis;
    }


}
