public class Main {
    public static void main(String[] args) {
        Basket antonBasket = new Basket();
        antonBasket.add("Молоко", 123, 3);
        antonBasket.add("Печенье", 321);
        antonBasket.add("Кофе", 222);

        antonBasket.print("Корзина Васи:");

        antonBasket.getTotalPricePlusPrice();

        System.out.println();

        Basket peterBasket = new Basket(2000);
        peterBasket.add("Лопата", 500);
        peterBasket.add("Генератор", 25000);

        peterBasket.print("Корзина Пети:");

        peterBasket.getTotalPricePlusPrice();

        System.out.println();

        Basket maryBasket = new Basket();
        maryBasket.print("Корзина Маши:");
        maryBasket.getTotalPricePlusPrice();
    }
}
