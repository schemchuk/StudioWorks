package de.telran.stanislavsPacage.lesson22.junitExample;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class JunitAnnotationExample {

    private ArrayList<String> list = new ArrayList<>();

    @BeforeAll
    public static void method1() {
        System.out.println("Using @BeforeClass, executing befor all tests cases");
    }

    @BeforeEach
    public void method2() {
        System.out.println("Using @Before, executing befor each test cases");
    }

  @Test
    public void  method3() {
        list.add("test");
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
        assertTrue(list.isEmpty() == false);
    }

    @Test
    public void  method33() {
        list.add("test2");
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
        assertTrue(list.isEmpty() == false);
    }

    @AfterEach
    public void method4() {
        System.out.println("Using @AfterClass, executing befor all tests cases");
    }

    @AfterAll
    public static void method5() {
        System.out.println("Using @After, executing befor each test cases");
    }

}
