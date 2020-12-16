package com.company;

public class Situation {
    public Situation[] direction;
    public String subject;
    public String text;
    public int dstamina;
    public int dsentiment;
    public int dmoney;
    public int dintellect;
    public String djob;

    public Situation (String subject, String text, String djob, int variants, int dintellect, int dmoney, int dsentiment, int dstamina) {
        this.subject = subject;
        this.text = text;
        this.dintellect = dintellect;
        this.dmoney = dmoney;
        this.dsentiment = dsentiment;
        this.dstamina = dstamina;
        this.djob = djob;
        direction = new Situation[variants];
    }


}
