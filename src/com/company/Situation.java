package com.company;

public class Situation {
    Situation[] direction;
    String text;
    int dHealth, dDamage, dMoney;
    int isBattle; // число отличное от нуля, показывает уровень противника
    public Situation (String text, int variants, int dh,int dd,int dm, int isBattle) {
        this.text=text;
        dHealth = dh;
        dDamage = dd;
        dMoney = dm;
        this.isBattle = isBattle;
        direction = new Situation[variants];
    }
}
