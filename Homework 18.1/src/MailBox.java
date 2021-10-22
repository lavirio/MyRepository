import java.util.Set;
import java.util.TreeSet;

public class MailBox {
    private static final Set<String> mailBox = new TreeSet<>();

    public static void add(String mail){
        if(mailBox.contains(mail)){
            System.out.println("Email: " + mail + " уже добавлен в базу данных!");
            return;
        }
        mailBox.add(mail);
        System.out.println("Email " + mail + " успешно добавлен!");
    }
    public static void list(){
        if(mailBox.isEmpty()){
            System.out.println("Папка пуста!");
            return;
        }
        for(String s : mailBox){
            System.out.println(s);
        }
    }
    public static void delete(String mail){
        if(!mailBox.contains(mail)){
            System.out.println("Такого email нет!");
            return;
        }
        else {
            System.out.println("Email " + mail + " успешно удален!");
            mailBox.remove(mail);
        }
    }
}
