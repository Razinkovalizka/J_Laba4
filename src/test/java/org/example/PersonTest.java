package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    // Тест проброса исключения при неправильной длине массива.
    @Test
    void constructorWithParametersIllegalArgumentExceptionTest() {
        String[] vars = {"666", "Kate", "Female", "12.09.2003", "S"};

        assertThrows(IllegalArgumentException.class, () -> {
            new Person(vars);
        });
    }
}