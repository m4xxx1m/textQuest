package com.company;
import java.util.Scanner;

public class Game {

    public static Character hero;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("В этой игре в жанре текстового квеста Вам надо будет выбраться из подземелья, " +
                "наполненного монстрами и сокровищами.\n Ваши основные характеристики: здоровье, " +
                "урон и деньги.\n Каждое Ваше прохождение будет уникальным");
        hero = new Character();
        story = new Story();
        while (true) {
            hero.health += story.current_situation.dHealth;
            hero.damage += story.current_situation.dDamage;
            hero.money += story.current_situation.dMoney;
            System.out.println("");
            System.out.println("Здоровье: " + hero.health + ". Урон: " + hero.damage + ". Деньги: " + hero.money);
            System.out.println(story.current_situation.text);
            if (story.current_situation.isBattle != 0) {
                battle();
                continue;
            }
            if (story.isEnd() || hero.health <= 0) {
                if (story.current_situation.text.equals(Texts.texts[11])) {
                    System.out.println("Вы выбрались из подземелья, заработав при этом " + hero.money + " монет!\n\n\n");
                }
                System.out.println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }

    }

    public static int getMoney() {
        return hero.money;
    }

    public static void battle() {
        Scanner in = new Scanner(System.in);
        Monsters monster = new Monsters(story.current_situation.isBattle);
        while (story.current_situation.isBattle != 0) {
            System.out.println("Здоровье монстра: " + monster.health + "; Ваше здоровье: " + hero.health);
            int choice;
            System.out.println("(1) Атаковать!\n(2) Попытаться убежать");
            while (true) {
                choice = in.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                }
                else {
                    System.out.println("Вы можете выбрать из двух вариантов");
                }
            }
            if (choice == 1) {
                if (hero.damage == 0) {
                    System.out.println("Нападать на монстра без оружия было определенно плохой идеей.\n" +
                            "Монстр убил вас, что было ожидаемо. Конец игры.");
                    System.exit(0);
                }
                int monsterDHealth = (int) (Math.random() * hero.damage);
                monster.health -= monsterDHealth;
                System.out.println("Вы нанесли монстру " + monsterDHealth + " единиц урона");
                if (monster.health <= 0) {
                    System.out.println("Вы победили монстра и получили " +
                            monster.money + " монет.\n Урон вашего меча увеличен на " +
                            monster.level * 3);
                    hero.money += monster.money;
                    hero.damage += monster.level * 3;
                    story.current_situation = story.current_situation.direction[0];
                    return;
                }
                int heroDHealth = (int) (Math.random() * monster.damage);
                hero.health -= heroDHealth;
                System.out.println("Монстр нанёс вам " + heroDHealth + " единиц урона");
                if (hero.health <= 0) {
                    System.out.println("Вы умерли. Конец.");
                    System.exit(0);
                }
            }
            else {
                if (monster.level >= 5) {
                    System.out.println("Дверь оказалась закрытой. Монстр вонзил свой меч вам в спину.\n" +
                            "Конец игры");
                    System.exit(0);
                }
                if (Math.random() <= 0.5) {
                    int dH = monster.damage;
                    hero.health -= dH;
                    if (hero.health <= 0) {
                        System.out.println("Вы умерли. Конец.");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Вам удалось сбежать, но монстр нанёс вам урон в " + dH + " единиц");
                    }
                }
                story.current_situation = story.current_situation.direction[1];
                return;
            }
        }
    }
}
