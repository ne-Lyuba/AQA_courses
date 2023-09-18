package main.java;

final class Eyeshadow extends MakeupProduct {
    private final String colourPalette;

    Eyeshadow(String brand, String name, String colourPalette) {
        super(brand, name);
        this.colourPalette = colourPalette;
    }

    Eyeshadow(String brand, String name) {
        this(brand, name, "Unknown Palette");
    }

    @Override
    void apply() {
        System.out.println("Applying " + brand + " " + name + " eyeshadow palette with " + colourPalette + " colours");
    }

    @Override
    String getColour() {
        return colourPalette;
    }
}
