import java.util.Set;
import java.util.TreeSet;

public class MailBox {
    private static Set<String> mailBox = new TreeSet<>();

    public static void add(String mail){
        if(mailBox.contains(mail)){
            System.out.println("Email: " + mail + " уже добавлен в базу данных!");
            return;
        }
        mailBox.add(mail);
        System.out.println("Email: " + mail + " успешно добавлен!");
    }
    public static  void list(){
        if(mailBox.isEmpty()){
            System.out.println("Папка пуста");
            return;
        }
        for(String s : mailBox){
            System.out.println(s);
        }
    }
}
