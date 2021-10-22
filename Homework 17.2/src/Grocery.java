import java.util.ArrayList;

public class Grocery {
    private static final ArrayList <String> buyingList = new ArrayList<>();

    public static void add(String doing){
        if(buyingList.contains(doing)){
            System.out.println("Дело уже существует!");
            return;
        }
    buyingList.add(doing);
    System.out.println("Добавлено дело " + doing);
    }

    public static void add(int index, String doing){
        if(buyingList.contains(doing)){
            System.out.println("Дело уже существует!");
            return;
        }
        if(!validateIndex(index)){
            System.out.println("Номер дела выходит за рамки списка");
            return;
        }
        buyingList.add(index,doing);
        System.out.println("Добавдено дело " + doing);
    }

    public static void list(){
        if(buyingList.isEmpty()){
            System.out.println("Список дел пуст!");
            return;
        }
        for (int i = 0; i < buyingList.size(); i++) {
            System.out.println(i + " - " + buyingList.get(i));
        }
    }

    public static  void edit(int index, String newDoing) {
        if(validateIndex(index)) {
            System.out.println("Дело " + buyingList.get(index) + " заменено на " + newDoing);
            buyingList.set(index, newDoing);
        }
    }
    public static void delete (int index) {
        if (validateIndex(index)) {
            System.out.println("Дело " + buyingList.get(index) + " удалено!");
            buyingList.remove(index);
        }
    }
    private static boolean validateIndex(int index){
        if(Grocery.buyingList.size() < index) {
            System.out.println("Дела с таким номером не существует!");
            return false;
        }
        return true;
    }
}
