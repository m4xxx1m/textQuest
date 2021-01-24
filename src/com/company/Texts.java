package com.company;

public class Texts {
    public static final String[] texts;
    public static final int amountOfTexts = 12;
    static {
        texts = new String[amountOfTexts];
        texts[0] = "Вы очутились в какой-то тёмной комнате, хорошо, что " +
                "хоть дверь есть.\n" +
                "Рядом с Вами лежит меч\n" +
                "(1) Взять меч, идти дальше;\n" +
                "(2) И без меча обойдусь";
        texts[1] = "Монстр!!!\n";
        texts[2] = "Вы победили своего первого монстра!\n" +
                "Перед вами две двери. Из одной из них вы слышите шум.\n" +
                "Возможно это очередной монстр, а может быть и нет...\n" +
                "(1) Пойти на шум;\n" +
                "(2) Пожалуй лучше пойду во вторую комнату.";
        texts[3] = "Вы попали в пустую комнату. Перед вами дверь.\n" +
                "Но всё не так просто. На двери написано:\n" +
                "'День спит, ночь глядит,\n" +
                "Утром умирает, другой сменяет'\n" +
                "Судя по всему, вам надо разгадать загадку.\n" +
                "(1)Месяц\n" +
                "(2)Свечи\n" +
                "(3)Ветер\n" +
                "(4)Вампир";
        texts[4] = "Вы ответили правильно, дверь перед вами открылась. Однако расслабляться рано.\n" +
                "Перед вами очередной монстр, который, скорее всего, сильнее предыдущего";
        texts[5] = "Вам на голову прилетел огромный камень. Судя по всему, загадку вы не разгадали";
        texts[6] = "Со словами 'Спасибо, герой!' вас встретил какой-то старик.\n" +
                "За убийство монстра он предлагает вам свою помощь - зелье, повышающее все характеристики\n" +
                "(1) Принять;\n" +
                "(2) Попросить лучше меч, который вы случайно заметили.";
        texts[7] = "'Чудо-зелье' оказалось ядом. Старик забрал все ваши деньги, пока вы мучительно умирали";
        texts[8] = "Старик, кажется, обиделся, однако дал меч. Вы идете дальше...\n" +
                "И видите перед собой громадного монстра!!! Это очень серьезный противник!";
        texts[9] = "Как оказалось, этот монстр охранял сундук.\n" +
                "(1) Взять деньги (20 монет) и пойти дальше";
        texts[10] = "Вы идете дальше... И натыкаетесь на огромного монстра!!!";
        texts[11] = "Вы победили этого ужасного монстра! У него на шее висел ключ, которым вы легко открыли \n" +
                "следующую дверь. Однако за ней нет никаких монстров, вы видите солнечный свет!";
    }
}
