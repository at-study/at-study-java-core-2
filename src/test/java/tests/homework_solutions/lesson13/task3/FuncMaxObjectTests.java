package tests.homework_solutions.lesson13.task3;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import homework_solution.lesson13.task3.Functions;

public class FuncMaxObjectTests {

    @Test
    @DisplayName("test function MaxObject Strings")
    void testFuncMaxObjectStrings() {
        Assertions.assertEquals("zxcv", Functions.maxObject.execute(Arrays.asList("abcdf", "zxcv", "fdnsnj", "qwwj")));
    }

    @Test
    @DisplayName("test function MaxObject Doubles")
    void testFuncMaxObjectDoubles() {
        Assertions.assertEquals(258.15, Functions.maxObject.execute(Arrays.asList(11.78, 258.15, 192.34, -246.11)));
    }
}
