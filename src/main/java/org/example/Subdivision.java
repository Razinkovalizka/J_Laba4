package org.example;

/**
 * Сущность "подразделение"
 * @author Razinkova_Elizaveta
 */
public class Subdivision {
    private static int nextID = 1;
    private final int ID;
    private String name;

    /**
     * Конструктор, принимающий на вход название подразделения.
     * @param name_ название подразделения
     */
    public Subdivision(String name_) {
        ID = nextID++;
        name = name_;
    }

    /**
     * Переопределённый метод toString.
     * @return строка с информацией о значениях полей класса
     */
    @Override
    public String toString() {
        return "[ID: " + ID + " name: " + name + "]";
    }

    /**
     * Геттер для ID
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Геттер для name
     * @return name
     */
    public String getName() {
        return name;
    }
}
