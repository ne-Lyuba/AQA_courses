package HomeTask8;

public class DinoPark {
    public String parkName;
    int dinosaursCount;
    protected boolean isReservePark;
    private int visitorsCount;

    public String getParkName() {
        return parkName;
    }

    public int getDinosaursCount() {
        return dinosaursCount;
    }

    public boolean isReservePark() {
        return isReservePark;
    }

    public int getVisitorsCount() {
        return visitorsCount;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public void setDinosaursCount(int dinosaursCount) {
        this.dinosaursCount = dinosaursCount;
    }

    public void setReservePark(boolean reservePark) {
        isReservePark = reservePark;
    }

    public void setVisitorsCount(int visitorsCount) {
        this.visitorsCount = visitorsCount;
    }


}
