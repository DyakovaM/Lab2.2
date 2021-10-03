package LAB3;

public class Horse extends Animal {
    public Horse(String food, String location, boolean rideable) {
        super(food, location);
        if (rideable) this.rideable = true;
        else this.rideable = false;
        animalType = "Лошадь";
    }

    boolean rideable;
}
