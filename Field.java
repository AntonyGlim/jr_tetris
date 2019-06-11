package com.javarush.task.task22.task2213;

/**
 * Поле с клетками
 * Будет отвечать за хранение данных о текущих занятых и свободных клетках на поле игры.
 */
public class Field {

    private int width;
    private int height;
    private int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
