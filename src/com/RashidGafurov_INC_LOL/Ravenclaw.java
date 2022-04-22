package com.RashidGafurov_INC_LOL;

//Ravenclaw - Zhou Chang, Padma Patil and Marcus Belby.
//smart, wise, witty, and full of creativity.
public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;
    private final static String schoolName = "RavenClaw";

    @Override
    public String toString() {
        return "Ravenclaw: " +
                super.toString() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity;
    }


    public int sumOfAttributes() {
        return this.getCreativity() + this.getSmart() + this.getWise() + this.getWitty();
    }

    public void compareTo(Ravenclaw s1, Ravenclaw s2) {
        if (s1.sumOfAttributes() > s2.sumOfAttributes()) {
            System.out.println(s1.getFullName() + " is better Ravenclaw student, then " + s2.getFullName());
        } else {
            System.out.println(s2.getFullName() + " is better Ravenclaw student, then " + s1.getFullName());
        }
    }

    @Override
    public String getSchoolName() {
        return schoolName;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public Ravenclaw(String fullName, int power, int transDis, int smart, int wise, int witty, int creativity) {
        super(fullName, power, transDis);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
}
