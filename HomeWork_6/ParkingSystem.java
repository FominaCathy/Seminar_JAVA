public class ParkingSystem {

    int freeBig;
    int freeMedium;
    int freeSmall;


    public ParkingSystem(int big, int medium, int small) {
        freeBig = big;
        freeMedium = medium;
        freeSmall = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
        case 1:
            if (freeBig > 0) {
                freeBig--;
            } else {
                return false;
            }
            break;
        case 2:
            if (freeMedium > 0) {
                freeMedium--;
            } else {
                return false;
            }
            break;
        case 3:
            if (freeSmall > 0) {
                freeSmall--;
            } else {
                return false;
            }
            break;
        default:
            return false;
        }
        return true;
    }

}
