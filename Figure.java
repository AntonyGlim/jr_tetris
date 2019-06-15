package com.javarush.task.task22.task2213;

/**
 * Фигура
 * Этот класс будет описывать падающую фигурку
 */
public class Figure {

    private int x;
    private int y;
    private int[][] matrix; //отвечает за форму

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    /** для движения фигурки влево */
    public void left(){
        x = x - 1;
        if (!isCurrentPositionAvailable()){
            x = x + 1;
        }
    }

    /** для движения фигурки вправо */
    public void right(){
        x = x + 1;
        if (!isCurrentPositionAvailable()){
            x = x - 1;
        }
    }

    /** для движения фигурки вправо */
    public void down(){
        y = y + 1;
        if (!isCurrentPositionAvailable()){
            y = y - 1;
        }
    }

    /** для движения фигурки вверх */
    public void up(){
        y = y - 1;
        if (!isCurrentPositionAvailable()){
            y = y + 1;
        }
    }

    /** для поворота фигурки вокруг главной диагонали */
    public void rotate(){}

    /** падение фигурки в низ до дна */
    public void downMaximum(){}

    /** проверка может ли фигурка быть помещена в текущую позицию. */
    public boolean isCurrentPositionAvailable(){
        return true;
    }

    /** вызывается, когда фигурка достигла дна или уперлась в другую фигурку */
    public void landed(){}

}
