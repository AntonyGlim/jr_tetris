package com.javarush.task.task22.task2213;

public class Tetris {

    private Field field;
    private Figure figure;

    public static Tetris game;

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }

    /** Будет отвечать за всю игру */
    public void run(){}

    /** Будет отвечать за один шаг */
    public void step(){}

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }
}
