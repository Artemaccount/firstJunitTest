import org.example.CalcInt;
import org.example.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcTests {
    private static CalcInt calc;

    @BeforeAll
    public static void createInstance() {
        calc = new Calculator();
        System.out.println("Тестирование начато!");
    }

    @ParameterizedTest
    @CsvSource(value =
            {"5,2,3", "10,5,5", "6,3,3"}
    )
    @DisplayName("Тестирование функции сложения")
    public void add_success_test(int expected, int a, int b) {
        int actual = calc.plus(a, b);
        Assertions.assertEquals(expected, actual, "Функция сложение отработала неверно");
    }

    @ParameterizedTest
    @CsvSource(value =
            {"2,5,3", "5,10,5", "3,6,3"}
    )
    @DisplayName("Тестирование функции вычитания")
    public void minus_success_test(int expected, int a, int b) {
        int actual = calc.minus(a, b);
        Assertions.assertEquals(expected, actual, "Функция вычитания отработала неверно");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Тестирование завершено!");
    }
}
