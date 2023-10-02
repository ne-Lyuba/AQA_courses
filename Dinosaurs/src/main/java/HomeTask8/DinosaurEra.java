package HomeTask8;

public class DinosaurEra {
    private String dinosaurEraName;
    private int yearsAgo;

    public DinosaurEra(String dinosaurEraName, int yearsAgo) {
        this.dinosaurEraName = dinosaurEraName;
        this.yearsAgo = yearsAgo;
    }

    void setDinosaurEraName(String dinosaurEraName) {
        this.dinosaurEraName = dinosaurEraName;
    }

    void setYearsAgo(int yearsAgo) {
        this.yearsAgo = yearsAgo;
    }

    String getDinosaurEraName() {
        return dinosaurEraName;
    }

    int getYearsAgo() {
        return yearsAgo;
    }

    public void displayInfo() {
        System.out.println("Era name: " + dinosaurEraName);
        System.out.println("Years ago: " + yearsAgo + " million years ago");
    }

}
