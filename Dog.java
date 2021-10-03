package LAB3;

public class Dog extends Animal {
    public Dog(String food, String location, boolean BringsTheBall) {
        super(food,location);
        if (BringsTheBall) this.BringsTheBall = true;
        else this.BringsTheBall = false;
        String animalType = "Собака";
    }
    boolean BringsTheBall;
}

