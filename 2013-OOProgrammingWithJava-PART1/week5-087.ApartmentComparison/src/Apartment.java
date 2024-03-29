
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    private int price(){
        return pricePerSquareMeter*squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment){
        int firstPrice = this.price();
        int secondPrice = otherApartment.price();
        int difference = firstPrice - secondPrice;
        
        if(difference < 0){
            difference = -difference;
        }
        
        return  difference;
    }
    public boolean moreExpensiveThan(Apartment otherApartment){
        int firstPrice = this.price();
        int secondPrice = otherApartment.price();
        
        if(firstPrice >= secondPrice){
            return true;
        }
        return false;
    }
}
