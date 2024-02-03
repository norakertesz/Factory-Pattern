public class Main {
    public static void main(String[] args) {
        System.out.println("********************PIZZA WORLD********************");
        PizzaStore gStore= new GrazPizzaStore();
        PizzaStore wStore= new WienPizzaStore();
        System.out.println("Hallo! Ich bestelle eine Hawaii Pizza.");
        Pizza pizza1 = gStore.orderPizza("hawaii");

        System.out.println("Hallo! Ich bestelle eine veggie Pizza.");
        Pizza pizza2 = wStore.orderPizza("veggie");

    }
}