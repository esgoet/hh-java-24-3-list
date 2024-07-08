package sack;

public class Main {
    public static void main(String[] args) {
        Sack sack = new Sack();
        System.out.println(sack);
        sack.add(2);
        sack.add(5);
        sack.add(1);
        sack.add(4);
        sack.add(5);
        sack.add(6);
        sack.add(7);

        System.out.println(sack);
        sack.removeLast();
        System.out.println(sack);

        sack.removeByIndex(3);
        System.out.println(sack);
        sack.removeByIndex(0);
        System.out.println(sack.contains(5));
        System.out.println(sack);


    }
}
