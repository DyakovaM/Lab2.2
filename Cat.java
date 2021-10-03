package LAB3;

public class Cat extends Animal {

    public Cat(String food, String location, boolean HuntingForMice) {
        super(food, location);
        this.HuntingForMice=HuntingForMice;
        String animalType = "Кошка";
    }
    boolean HuntingForMice;
}
