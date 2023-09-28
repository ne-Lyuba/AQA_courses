package HomeTask8;

public class Dinosaur {
    private String name;
    private int age;
    private boolean isVegetarian;

    public Dinosaur(String name, int age, boolean isVegetarian) {
        this.name = name;
        this.age = age;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public void roar() {
        System.out.println(name + " says: Roar!");
    }

    public void describe() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + age);
        System.out.println("Is it a vegetarian? " + isVegetarian);
    }

    protected void dinoJump(){
        System.out.println("Dino " + name + " jump");
    }
}
