package main.java;

/**
 * This class represents makeup products.
 */
abstract class MakeupProduct implements MakeupProductInterface {
    final String brand;
    final String name;
    protected MakeupProduct.MakeupType type;


    /**
     * Constructor to create a makeup object.
     *
     * @param brand The brand of the makeup product.
     * @param name  The name of the makeup product.
     */
    MakeupProduct(String brand, String name, MakeupProduct.MakeupType type) {
        this.brand = brand;
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }


    public abstract String getColour();
}