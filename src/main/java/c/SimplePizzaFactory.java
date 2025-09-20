package c;

public class SimplePizzaFactory implements PizzaFactory {
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case Cheese:
                return new CheesePizza();
            case Greek:
                return new GreekPizza();
            case Peparoni:
                return new PeparoniPizza();
            case GlutenFree:
                return new GlutenFreePizza();
            case Vegan:
                return new VeganPizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type");
        }
    }
}