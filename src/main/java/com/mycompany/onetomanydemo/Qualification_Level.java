package com.mycompany.onetomanydemo;

/**
 *
 * @author bhumika
 */

public class Qualification_Level {

    public enum qualificationLevel{
        Beginner, Intermediate, Pro
    }
    private qualificationLevel ql;

    public Qualification_Level() {

    }

    public Qualification_Level(qualificationLevel ql) {
        this.ql = ql;
    }

    public qualificationLevel getQl() {
        return ql;
    }

    public void setQl(qualificationLevel ql) {
        this.ql = ql;
    }

}
