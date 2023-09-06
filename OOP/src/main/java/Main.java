import HomeTask8.DinoPark;
import HomeTask8.Dinosaur;
import HomeTask8.DinosaurEra;
import HomeTask8.TyrannosaurusRex;

public class Main {
    public static void main(String[] args) {
        Dinosaur stegosaurus = new Dinosaur("Stegosaurus", 12, true);
        TyrannosaurusRex trike = new TyrannosaurusRex("Triceratops", 3, false, 5);
        DinosaurEra mesozoic = new DinosaurEra("Mesozoic Era", 150);
        stegosaurus.roar();
        stegosaurus.describe();
        mesozoic.displayInfo();
        trike.hornCount();
        DinoPark park = new DinoPark();
        park.setParkName("Jurassic Park");
        park.setDinosaursCount(327420);
        park.setReservePark(true);
        park.setVisitorsCount(300200);
        System.out.println("Welcome to " + park.getParkName() + "!");
        System.out.println("We have " + park.getDinosaursCount() + " dinosaurs in our park");
        System.out.println("Is it a reserve park? " + park.isReservePark());
        System.out.println("There are " + park.getVisitorsCount() + " visitors every year");
    }
}
