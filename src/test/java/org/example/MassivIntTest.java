import org.example.MassivInt;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MassivIntTest {

    @Test
    //фильтрация чисел, делящихся на 5, работает корректно
    public void testFilterNumbersDivisibleByFive() {
        MassivInt instance = new MassivInt();

        // Пример данных
        int[] numbers = {10, 15, 23, 42, 55, 60, 77, 85, 90};

        // Ожидаемый результат
        List<Integer> expected = List.of(10, 15, 55, 60, 85, 90);

        // Вызов тестируемого метода
        List<Integer> result = instance.filterNumbersDivisibleByFive(numbers);

        // Проверка результата
        assertEquals(expected, result);
    }

    @Test
    //фильтрация чисел, меньше 100, работает корректно
    public void testFilterNumbersDivisibleBeforeHundred() {
        MassivInt instance = new MassivInt();
        // Пример данных
        int[] numbers = {81, 25, 100, 85, 200, 44,101, 102, 100, 44, 42, 85, 4, 999, 56, 1024};
        // Ожидаемый результат
        List<Integer> expected = List.of(81, 25, 85, 44, 44, 42, 85, 4, 56);
        // Вызов тестируемого метода
        List<Integer> result = instance.filterNumbersDivisibleBeforeHundred(numbers);
        // Проверка результата
        assertEquals(expected, result);
    }

    @Test
    //конвертирование числа из int  в double 0.0+10.1=10.1
    public void convertInDouble() {
        MassivInt instance = new MassivInt();
        // Пример данных
        List <Double> numbers = Arrays.asList(0.0, 2.0, 3.0, 4.0, 5.0);
        // Ожидаемый результат
        Double[] expected = {10.1, 12.1, 13.1, 14.1, 15.1};
        // Вызов тестируемого метода
        Double [] result = instance.convertInDouble(numbers);
        // Проверка результата
        assertArrayEquals(expected, result);
    }

}
