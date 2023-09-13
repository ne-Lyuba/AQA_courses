package main.java;

final class Lipstick extends MakeupProduct{
    private final String colour;

    Lipstick(String brand, String name, String colour) {
        super(brand, name);
        this.colour = colour;
    }

    @Override
    void apply() {
        System.out.println("Applying " + brand + " " + name + " lipstick in " + colour + " colour.");
    }

    @Override
    String getColour() {
        return colour;
    }
}