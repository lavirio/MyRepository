public class Basket {

        static String items = "";
        static int totalPrice = 0;

        public static void main(String[] args) {
            add("Молоко", 53);
            add("Чай", 100);
            add("Молоко", 60);
            add("Молоко", 58);

            print("Содержимое корзины:");
            int currentTotalPrice = getTotalPrice();
            System.out.println("Цена всех товаров: " + currentTotalPrice + " рубля");
            clear();
            System.out.println();
            print("Содержимое корзины:");
            currentTotalPrice = getTotalPrice();
            System.out.println("Цена всех товаров: " + currentTotalPrice + " рублей");
        }

        public static void add(String item, int price) {
            if(containsitem(item)) {
                return;
            }
            items = items + item + " - " + price  + "\n";
            totalPrice = totalPrice + price;
        }

        public static void print(String title){
            System.out.println(title);
            if(items.isEmpty()) {
                System.out.println("Корзина пуста");
            } else {
                System.out.print(items);
            }
        }

        public static void clear(){
            items = "";
            totalPrice = 0;
        }

        public static boolean containsitem(String item){
            return items.contains(item);
        }

        public static int getTotalPrice() {
            return totalPrice;
        }
    }

