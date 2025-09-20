package c;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PizzaStoreTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testOrderCheesePizza() {
        PizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza(PizzaType.Cheese);
        String output = outputStream.toString();
        assertTrue(output.contains("Preparing Cheese Pizza"));
        assertTrue(output.contains("Baking Cheese Pizza"));
        assertTrue(output.contains("Cutting Cheese Pizza"));
        assertTrue(output.contains("Boxing Cheese Pizza"));
        outputStream.reset();
    }

    @Test
    public void testOrderGreekPizza() {
        PizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza(PizzaType.Greek);
        String output = outputStream.toString();
        assertTrue(output.contains("Preparing Greek Pizza"));
        assertTrue(output.contains("Baking Greek Pizza"));
        assertTrue(output.contains("Cutting Greek Pizza"));
        assertTrue(output.contains("Boxing Greek Pizza"));
        outputStream.reset();
    }

    @Test
    public void testOrderPeparoniPizza() {
        PizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza(PizzaType.Peparoni);
        String output = outputStream.toString();
        assertTrue(output.contains("Preparing Peparoni Pizza"));
        assertTrue(output.contains("Baking Peparoni Pizza"));
        assertTrue(output.contains("Cutting Peparoni Pizza"));
        assertTrue(output.contains("Boxing Peparoni Pizza"));
        outputStream.reset();
    }

    @Test
    public void testOrderGlutenFreePizza() {
        PizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza(PizzaType.GlutenFree);
        String output = outputStream.toString();
        assertTrue(output.contains("Preparing Gluten Free Pizza"));
        assertTrue(output.contains("Baking Gluten Free Pizza"));
        assertTrue(output.contains("Cutting Gluten Free Pizza"));
        assertTrue(output.contains("Boxing Gluten Free Pizza"));
        outputStream.reset();
    }

    @Test
    public void testOrderVeganPizza() {
        PizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza(PizzaType.Vegan);
        String output = outputStream.toString();
        assertTrue(output.contains("Preparing Vegan Pizza"));
        assertTrue(output.contains("Baking Vegan Pizza"));
        assertTrue(output.contains("Cutting Vegan Pizza"));
        assertTrue(output.contains("Boxing Vegan Pizza"));
        outputStream.reset();
    }
}