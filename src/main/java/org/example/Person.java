package org.example;

/**
 * Сущность "человек"
 * @author Razinkova_Elizaveta
 */
public class Person {
    private final int ID;
    private String name;
    private Boolean sex; //true - женщина, false - мужчина
    private Subdivision subdivision;
    private String birthday;
    private int salary;

    /**
     * Конструктор, принимающий на вход массив строк.
     * @param mas массив строк, содержащий поля класса
     * @throws IllegalArgumentException неправильная длина массива
     */
    public Person(String[] mas) {
        if(mas.length != 6) {
            throw new IllegalArgumentException("We need to get mas' length 6!");
        }

        ID = Integer.parseInt(mas[0]);
        name = mas[1];
        if(mas[2].equals("Male")) sex = false;
        else sex = true;
        birthday = mas[3];
        subdivision = new Subdivision(mas[4]);
        salary= Integer.parseInt(mas[5]);

    }

    /**
     * Конструктор, принимающий на вход все параметры для полей класса.
     * @param ID_ персональный номер
     * @param name_ имя
     * @param sex_ пол
     * @param subdivision_ имя подразделения
     * @param birthday_ день рождения
     * @param salary_ зарплата
     */
    public Person(int ID_, String name_, Boolean sex_, String birthday_, Subdivision subdivision_, int salary_) {
        ID = ID_;
        name = name_;
        sex = sex_;
        subdivision = subdivision_;
        birthday = birthday_;
        salary = salary_;
    }

    /**
     * Переопределённый метод toString.
     * @return строка с информацией о значениях полей класса
     */
    @Override
    public String toString() {
        return "[ID: " + ID + " name: " + name + " sex: " + sex +
                " birthday: " + birthday + " subdivision: " + subdivision.toString() + " salary: " + salary + "]";
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
     * @return name имя
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер для sex
     * @return sex пол
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * Геттер для subdivision
     * @return subdivision подразделение
     */
    public Subdivision getSubdivision() {
        return subdivision;
    }

    /**
     * Геттер для salary
     * @return salary зарплата
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Геттер для birthday
     * @return birthday дата рождения
     */
    public String getBirthday() {
        return birthday;
    }

}
