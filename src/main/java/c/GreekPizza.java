package c;

public class GreekPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Greek Pizza");
    }
    public void bake() {
        System.out.println("Baking Greek Pizza");
    }
    public void cut() {
        System.out.println("Cutting Greek Pizza");
    }
    public void box() {
        System.out.println("Boxing Greek Pizza");
    }
}