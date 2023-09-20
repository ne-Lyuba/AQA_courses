package main.java;

public class Main {
    public static void main(String[] args) {
        Lipstick lipstick = new Lipstick("Maybelline", "Super long staying", "red");

        // Using interface methods
        lipstick.apply();
        System.out.println("Lipstick color: " + lipstick.getColour());
        System.out.println("Product Name: " + lipstick.getName());
        boolean suitable = lipstick.isSuitableFor("SENSITIVE");
        System.out.println("Is Suitable for sensitive Skin: " + suitable);

        // Using nested class (LipstickRemover)
        Lipstick.LipstickRemover remover = lipstick.new LipstickRemover();
        remover.removeMakeup();
        
        Eyeshadow eyeshadow = new Eyeshadow("Lamel", "Make Up The Myth of Utopia", "rainbow");
        eyeshadow.apply();
        Eyeshadow defaultEyeshadow = new Eyeshadow("NYX", "Brights");
        defaultEyeshadow.apply();
        System.out.println("Eyeshadow palette colors: " + eyeshadow.getColour());
        System.out.println("Eyeshadow palette colors: " + defaultEyeshadow.getColour());


    }
}
