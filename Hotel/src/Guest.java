public class Guest {
    private final String guestName;
    private final int guestAge;

    public Guest(String name, int age) {
        this.guestName = name;
        this.guestAge = age;
    }

    public int getGuestAge() {
        return guestAge;
    }

    public String getGuestName(){
        return guestName;
    }

    public void guest() {
        if (guestAge % 10 == 1) {
            System.out.println("Гость №1:" +
                    " Имя - " + getGuestName() +
                    ", Возраст - " + getGuestAge() + " год");
        }
        else if (guestAge % 10 >= 2 && guestAge % 10 <= 4) {
            System.out.println("Гость №1:" +
                    " Имя - " + getGuestName() +
                    ", Возраст - " + getGuestAge() + " года");
        }
        else {
            System.out.println("Гость №1:" +
                    " Имя - " + getGuestName() +
                    ", Возраст - " + getGuestAge() + " лет");
        }
    }
}
