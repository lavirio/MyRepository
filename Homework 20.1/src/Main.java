public class Main {
    public static void main(String[] args) {
        Basket antonBasket = new Basket();
        antonBasket.add("Молоко", 123, 38.5,3);
        antonBasket.add("Печенье", 321, 10.5);
        antonBasket.add("Кофе", 222);

        antonBasket.print("Корзина Антона:");

        antonBasket.getTotalPricePlusPrice();
        antonBasket.getWeight();

        System.out.println();

        Basket peterBasket = new Basket(2000);
        peterBasket.add("Лопата", 500, 15.3);
        peterBasket.add("Генератор", 25000);

        peterBasket.print("Корзина Пети:");

        peterBasket.getTotalPricePlusPrice();
        peterBasket.getWeight();

        System.out.println();

        Basket maryBasket = new Basket();
        maryBasket.print("Корзина Маши:");
        maryBasket.getTotalPricePlusPrice();
    }
}
