public class WienPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("hawaii")) {
            return new WienHawaiiPizza();

        } else if (item.equals("veggie")) {
            return new WienVeggiePizza();
        } else {
            return null;
        }
    }
}