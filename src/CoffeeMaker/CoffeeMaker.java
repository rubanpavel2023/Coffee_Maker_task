package CoffeeMaker;

public class CoffeeMaker {
    private Coffee coffee;

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public String makeCoffee() {
        return "Take your " + coffee.prepare();
    }
}
