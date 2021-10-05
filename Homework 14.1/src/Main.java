public class Main {
    public static void main(String[] args) {
        String str = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String [] newstr = str.replaceAll("\\D+"," ").trim().split(" ");
        int sum = 0;
        for(int i = 0; i < newstr.length; i++) {
            sum += Integer.parseInt(newstr[i]);
        }

        System.out.println(sum);


    }
}
