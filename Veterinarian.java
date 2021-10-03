package LAB3;

public class Veterinarian {
    public static void treatAnimal(Animal[] animals){
        for (Animal a:animals){
            System.out.println(a.food + " " + a.location);
        }
    }
}

