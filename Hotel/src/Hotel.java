import java.util.Scanner;

public class Hotel {
    private final int lobby = 0;
    private int mainFloor = 0;
    private final int bar = 7;
    private final int guestPermissionAge = 18;
    private final int guestAdolescenceAge = 14;
    private final int guestYoungAge = 12;
    private boolean isContinue1 = true;
    private boolean isContinue2 = true;
    private boolean isContinue3 = true;

    public void goUp(Guest guest) {
        while (isContinue1) {
            if(mainFloor == bar) {
                System.out.println("Вы поднялись на максимальный этаж № " + mainFloor); return;}
            System.out.println("Подняться выше или спуститься ниже? (Up/Down)");
            Scanner scanner = new Scanner(System.in);
            if(scanner.nextLine().equals( "Down")) {
                isContinue1 = false;
                return;
            }
            if (guest.getGuestAge() >= guestPermissionAge) {if (mainFloor < bar ){
                mainFloor = mainFloor + 1;
                System.out.println("Вы поднялись на этаж № " + mainFloor);
            }
            else {System.out.println("Вы поднялись на максимальный этаж № " + mainFloor); return;}}
            else if (guest.getGuestAge() < guestPermissionAge && guest.getGuestAge() >= guestAdolescenceAge) {
                int pool = 6;
                if (mainFloor < pool) {
                mainFloor = mainFloor + 1;
                System.out.println("Вы поднялись на этаж № " + mainFloor);
            }
            else {System.out.println("Вы поднялись на максимально разрешенный для Вас этаж № " + mainFloor); return;}}
            else if (guest.getGuestAge() < guestAdolescenceAge && guest.getGuestAge() >= guestYoungAge) {
                int maxFloor = 5;
                if (mainFloor < maxFloor){
                mainFloor = mainFloor + 1;
                System.out.println("Вы поднялись на этаж № " + mainFloor);}
            else {System.out.println("Вы поднялись на максимально разрешенный для Вас этаж № " + mainFloor); return;}}
            else {
                System.out.println("Вам запрещено заселяться в отель!");
            }
        }
    }
    public void goDown(Guest guest) {
        if(mainFloor != bar) {mainFloor = mainFloor - 1;
            System.out.println("Вы спустились на этаж № " + mainFloor);}
        while (isContinue2) {
            if(mainFloor == lobby) {return;}
            System.out.println("Спуститься ниже или остаться на этом этаже? (Down/Stay)");
            Scanner scanner = new Scanner(System.in);
            if(scanner.nextLine().equals("Stay")) {
                isContinue2 = false;
                System.out.println("Вы остались на этаже № " + mainFloor);
                return;
            }
            if (guest.getGuestAge() >= guestPermissionAge) {if(mainFloor != lobby) {
                mainFloor = mainFloor > lobby ? mainFloor - 1 : mainFloor;
                System.out.println("Вы спустились на этаж № " + mainFloor);}
            else {System.out.println("Вы спустились на минимальный этаж № " + mainFloor); return;}}
            else if (guest.getGuestAge() < guestPermissionAge && guest.getGuestAge() >= guestAdolescenceAge) {if(mainFloor != lobby){
                mainFloor = mainFloor > lobby ? mainFloor - 1 : mainFloor;
                System.out.println("Вы спустились на этаж № " + mainFloor);}
            else {System.out.println("Вы спустились на минимальный этаж № " + mainFloor); return;}}
            else if (guest.getGuestAge() < guestAdolescenceAge && guest.getGuestAge() >= guestYoungAge) {if(mainFloor != lobby) {
                mainFloor = mainFloor > lobby ? mainFloor - 1 : mainFloor;
                System.out.println("Вы спустились на этаж № " + mainFloor);}
            else {System.out.println("Вы спустились на минимальный этаж № " + mainFloor); return;}}
        }
    }
    public void goOut(Guest guest) {
        if (guest.getGuestAge() < guestAdolescenceAge) {
            System.out.println("Вам запрешено покидать отель в одиночку!");
        } else {
            while (isContinue3) {
                if (mainFloor != lobby) {
                    isContinue3 = false;
                } else {
                    System.out.println("Выйти из отеля или остаться? (Out/Stay)");
                    Scanner scanner = new Scanner(System.in);
                    if (scanner.nextLine().equals("Out")) {
                        isContinue3 = false;
                        System.out.println("Вы вышли из отеля!");
                    }
                    else {
                        System.out.println("Вы остались в лобби!");
                        isContinue3 = false;}
                }
            }
        }
    }
    public void info(Guest guest) {
        if(guest.getGuestAge() >= guestPermissionAge) {
            System.out.println("Вам разрешено посещать все этажи отеля!");
        }
        else if (guest.getGuestAge() < guestPermissionAge && guest.getGuestAge() >= guestAdolescenceAge) {
            System.out.println("Вам запрещено подниматься выше 6 этажа!");
        }
        else if (guest.getGuestAge() < guestAdolescenceAge && guest.getGuestAge() >= guestYoungAge) {
            System.out.println("Вам запрещено подниматься выше 5 этажа!");
        }
        else {
            System.out.println("Вам запрещено заселяться в отель!");
        }
    }
}
