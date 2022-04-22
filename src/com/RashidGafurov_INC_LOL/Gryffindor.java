package com.RashidGafurov_INC_LOL;
//Gryffindor - Harry Potter, Hermione Granger and Ron Weasley
//nobility, honor and courage.
public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    private final static String schoolName = "Gryffindor";

    @Override
    public String toString() {
        return "Gryffindor: " +
                super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;
    }

    @Override
    public String getSchoolName() {
        return schoolName;
    }

    public int sumOfAttributes() {
        return this.getNobility() +
                this.getCourage() +
                this.getHonor();
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public Gryffindor(String fullName, int power, int transDis, int nobility, int honor, int courage) {
        super(fullName, power, transDis);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
}
