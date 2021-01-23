package com.company;

public class Story {
    public Situation current_situation;

    Story() {
        int first_monster_level = 1;
        int second_monster_level = 3;
        int boss_level = 5;
        Situation start_story = new Situation(Texts.texts[0],
                2, 0, 0, 0, 0);
        start_story.direction[0] = new Situation(Texts.texts[1], // 0
                2, 0, 10, 0, first_monster_level);
        start_story.direction[1] = new Situation(Texts.texts[1], // 1
                2, 0, 0, 0, first_monster_level);
        start_story.direction[0].direction[0] = new Situation(Texts.texts[2], // 00
                2, 0, 0, 0, 0);
        start_story.direction[0].direction[1] = new Situation(Texts.texts[3], // 01
                4, 0, 0, 0, 0);
        start_story.direction[0].direction[1].direction[1] = new Situation(Texts.texts[4], // 011
                2, 5, 0,0, second_monster_level);
        start_story.direction[0].direction[1].direction[0] = new Situation(Texts.texts[5], // 010
                0, -1000,0,0,0);
        start_story.direction[0].direction[1].direction[2] = new Situation(Texts.texts[5], // 012
                0, -1000,0,0,0);
        start_story.direction[0].direction[1].direction[3] = new Situation(Texts.texts[5], // 013
                0, -1000,0,0,0);
        start_story.direction[1].direction[1] = new Situation(Texts.texts[3], // 11
                4, 0, 0,0,0);
        start_story.direction[1].direction[1].direction[1] = new Situation(Texts.texts[4], // 111
                2, 5, 0,0, second_monster_level);
        start_story.direction[1].direction[1].direction[0] = new Situation(Texts.texts[5], // 110
                0, -1000,0,0,0);
        start_story.direction[1].direction[1].direction[2] = new Situation(Texts.texts[5], // 112
                0, -1000,0,0,0);
        start_story.direction[1].direction[1].direction[3] = new Situation(Texts.texts[5], // 113
                0, -1000,0,0,0);
        start_story.direction[0].direction[0].direction[0] = new Situation(Texts.texts[6], // 000
                2, 0, 0,0, 0);
        start_story.direction[0].direction[0].direction[1] = new Situation(Texts.texts[3], // 001
                4, 0, 0, 0, 0);
        start_story.direction[0].direction[0].direction[1].direction[1] = new Situation(Texts.texts[4], // 0011
                2, 5, 0,0, second_monster_level);
        start_story.direction[0].direction[0].direction[1].direction[0] = new Situation(Texts.texts[5], // 0010
                0, -1000,0,0,0);
        start_story.direction[0].direction[0].direction[1].direction[2] = new Situation(Texts.texts[5], // 0012
                0, -1000,0,0,0);
        start_story.direction[0].direction[0].direction[1].direction[3] = new Situation(Texts.texts[5], // 0013
                0, -1000,0,0,0);
        start_story.direction[0].direction[0].direction[0].direction[0] = new Situation(Texts.texts[7], // 0000
                0, -100, 0, 0, 0);
        start_story.direction[0].direction[0].direction[0].direction[1] = new Situation(Texts.texts[8], // 0001
                2, 0, 5, 0, boss_level);
        start_story.direction[1].direction[1].direction[1].direction[1] = new Situation(Texts.texts[10], // 1111
                1, 0, 0, 0, boss_level);
        start_story.direction[0].direction[0].direction[1].direction[1].direction[0] = new Situation(Texts.texts[9], // 00110
                1, 0, 0, 20, 0);
        start_story.direction[0].direction[0].direction[1].direction[1].direction[1] = new Situation(Texts.texts[10], // 00111
                1, 0, 0, 0, boss_level);
        start_story.direction[0].direction[0].direction[1].direction[1].direction[0].direction[0] = new Situation(Texts.texts[10], // 001100
                1, 0, 0, 0, boss_level);
        start_story.direction[0].direction[1].direction[1].direction[0] = new Situation(Texts.texts[9], // 0110
                1, 0, 0, 20, 0);
        start_story.direction[0].direction[1].direction[1].direction[1] = new Situation(Texts.texts[10], // 0111
                1, 0, 0, 0, boss_level);
        start_story.direction[0].direction[1].direction[1].direction[0].direction[0] = new Situation(Texts.texts[10], // 01100
                1, 0, 0, 0, boss_level);
        start_story.direction[0].direction[1].direction[1].direction[1].direction[0] = new Situation(Texts.texts[11], // 01110
                0, 0, 0, 0, 0);
        start_story.direction[0].direction[1].direction[1].direction[0].direction[0].direction[0] = new Situation(Texts.texts[11], // 011000
                0, 0, 0, 0, 0);
        start_story.direction[0].direction[0].direction[1].direction[1].direction[1].direction[0] = new Situation(Texts.texts[11], // 001110
                0, 0, 0, 0, 0);
        start_story.direction[0].direction[0].direction[1].direction[1].direction[0].direction[0].direction[0] = new Situation(Texts.texts[11], // 011000
                0, 0, 0, 0, 0);
        start_story.direction[0].direction[0].direction[0].direction[1].direction[0] = new Situation(Texts.texts[11], // 00010
                0, 0, 0, 0, 0);
        current_situation = start_story;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}