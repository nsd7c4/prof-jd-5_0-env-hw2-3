package com.RashidGafurov_INC_LOL;

//Hufflepuff - Zachariah Smith, Cedric Diggory, Justin Finch-Fletchley.
//hardworking, loyal, honest.
public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    private final static String schoolName = "Hufflepuff";

    @Override
    public String toString() {
        return "Hufflepuff: " +
                super.toString() +
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest;
    }

    @Override
    public int sumOfAttributes() {
        return this.getHardworking() + this.getHonest() + this.getLoyal();
    }

    @Override
    public String getSchoolName() {
        return schoolName;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public Hufflepuff(String fullName, int power, int transDis, int hardworking, int loyal, int honest) {
        super(fullName, power, transDis);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
}
