package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.example.Main.input;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Тест проброса исключения при неправильном пути к файлу
    @Test
    void inputRuntimeExceptionTest() {
        assertThrows(RuntimeException.class, () -> {
            input(new ArrayList<>(), "abcdefg.csv", ';');
        });
    }

    // Тест чтения из файла
    @Test
    void inputTest() {
        ArrayList<Person> people = new ArrayList<>();
        input(people, "test.csv", ';');

        assertEquals("[ID: 666 name: Kate gender: 1 " +
                        "birthday: 12.09.2003 " + "division: [ID: " + "S".hashCode() + " name: S] salary: 1878]"
                , people.getFirst().toString());
    }
}