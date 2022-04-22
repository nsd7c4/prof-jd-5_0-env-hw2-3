package com.RashidGafurov_INC_LOL;

//Slytherin.- Draco Malfoy, Graham Montagu, Gregory Goyle
//cunning, determination, ambition, resourcefulness and a thirst for power.
public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;
    private final static String schoolName = "Slytherin";

    @Override
    public String toString() {
        return "Slytherin: " +
                super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstPower=" + thirstPower;
    }

    @Override
    public String getSchoolName() {
        return schoolName;
    }


    public int sumOfAttributes() {
        return this.getAmbition() +
                this.getCunning() +
                this.getDetermination() +
                this.getResourcefulness() +
                this.getThirstPower();
    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setThirstPower(int thirstPower) {
        this.thirstPower = thirstPower;
    }

    public Slytherin(String fullName, int power, int transDis, int cunning, int determination, int ambition, int resourcefulness, int thirstPower) {
        super(fullName, power, transDis);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }
}
