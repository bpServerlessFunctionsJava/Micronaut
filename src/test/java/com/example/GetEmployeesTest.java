package com.example;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GetEmployeesTest {

    private static GetEmployees getEmployees;

    @BeforeAll
    public static void setupServer() {
        getEmployees = new GetEmployees();
    }

    @AfterAll
    public static void stopServer() {
        if (getEmployees != null) {
            getEmployees.getApplicationContext().close();
        }
    }

    @Test
    public void testHandler() {
        Iterable<Employee> temp = getEmployees.execute("test");
        String test = "";
    }
}
