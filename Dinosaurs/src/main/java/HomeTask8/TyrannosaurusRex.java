package HomeTask8;

public class TyrannosaurusRex extends Dinosaur{
    protected int hornCount;

    public TyrannosaurusRex(String name, int age, boolean isVegetarian, int hornCount) {
        super(name, age, isVegetarian);
        this.hornCount = hornCount;
    }
    public void hornCount() {
        System.out.println(getName() +" charges with its " + hornCount + " horns!");
    }

}
