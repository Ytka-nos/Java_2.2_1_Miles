public class BonusMilesService {
    public int calculate (int cost){
        int oneMile = 20_00;
        int countMiles = cost / oneMile;
        return countMiles;
    }
}
