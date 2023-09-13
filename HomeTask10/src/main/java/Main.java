package main.java;

public class Main {
    public static void main(String[] args) {
        Lipstick lipstick = new Lipstick("Maybelline", "Super long staying", "red");
        lipstick.apply();
        System.out.println("Lipstick color: " + lipstick.getColour());
        Eyeshadow eyeshadow = new Eyeshadow("Lamel", "Make Up The Myth of Utopia", "rainbow");
        eyeshadow.apply();
        System.out.println("Eyeshadow palette colors: " + eyeshadow.getColour());

    }
}
