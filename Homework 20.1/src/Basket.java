public class Basket {

       public String items = "";
       public int totalPrice = 0;
       public int limit = 0;
       public double totalWeight = 0;

    public Basket(){
        System.out.println("Список товаров:");
        limit = 2000000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public void add(String item, int price) {
            add(item, price, 0, 1);
        }
    public void add(String item, int price, double weight) {
        add(item, price, weight, 1);
    }
    public void add(String item, int price, double weight, int count) {
        if(containsItem(item)) {
            return;
        }
        if(totalPrice + count * price > limit) {
            return;
        }
        items = items + item + " - " + count + " шт. " + count * price + " рублей " + count * weight + " грамм" + "\n";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
    }

        public void print(String title){
            System.out.println(title);
            if(items.isEmpty()) {
                System.out.println("Корзина пуста");
            } else {
                System.out.print(items);
            }
        }
        public void clear(){
            items = "";
            totalPrice = 0;
            totalWeight = 0;
        }

        public boolean containsItem(String item){
            return items.contains(item);
        }

        public void getTotalPricePlusPrice() {
        int price = totalPrice;
        System.out.println("Общая стоимость: " + price + " рублей");
        }

        public void getWeight(){
        double weight = totalWeight;
            System.out.println("Общий вес: " + weight + " грамм");
        }
    }