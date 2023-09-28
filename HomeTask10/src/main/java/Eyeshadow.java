package main.java;

/**
 * This class represents a specific makeup product, such as eyeshadow.
 */
final class Eyeshadow extends MakeupProduct {
    private final String colourPalette;

    /**
     * Constructor to create an eyeshadow object.
     *
     * @param brand The brand of the eyeshadow.
     * @param name  The name of the eyeshadow.
     */
    Eyeshadow(String brand, String name, String colourPalette) {
        super(brand, name, MakeupType.EYESHADOW);
        this.colourPalette = colourPalette;
    }

    Eyeshadow(String brand, String name) {
        this(brand, name, "Unknown Palette");
    }

    @Override
    public void apply() {
        System.out.println("Applying " + brand + " " + name + " eyeshadow palette with " + colourPalette + " colours");
    }

    @Override
    public boolean isSuitableFor(String skinType) {
        return !SkinType.DRY.toString().equals(skinType);
    }

    @Override
    public String getColour() {
        return colourPalette;
    }
}
