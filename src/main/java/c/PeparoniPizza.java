package c;

public class PeparoniPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Peparoni Pizza");
    }
    public void bake() {
        System.out.println("Baking Peparoni Pizza");
    }
    public void cut() {
        System.out.println("Cutting Peparoni Pizza");
    }
    public void box() {
        System.out.println("Boxing Peparoni Pizza");
    }
}