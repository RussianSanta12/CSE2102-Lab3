package c;

public class PizzaRunner {
    public static void main(String[] args) {
        PizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        store.orderPizza(PizzaType.Cheese);
        store.orderPizza(PizzaType.Greek);
        store.orderPizza(PizzaType.Peparoni);
        store.orderPizza(PizzaType.GlutenFree);
        store.orderPizza(PizzaType.Vegan);
    }
}