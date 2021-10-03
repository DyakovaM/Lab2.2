package LAB3;

public class Vet_appointment {
    public static void main(String[] args){
        Animal animal1=new Animal("Мясо","Россия");
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.eat());
        System.out.println(animal1.sleep());
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.eat());
        System.out.println(animal1.unSleep());
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.eat());
        System.out.println();
        Dog animal2=new Dog("Корм","Россия", true);
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.eat());
        System.out.println(animal2.sleep());
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.eat());
        System.out.println(animal2.unSleep());
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.eat());
        System.out.println("Собака приносит мяч?:" + animal2.BringsTheBall);
        System.out.println();
        Cat animal3=new Cat("Паштет","Россия", false);
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.eat());
        System.out.println(animal3.sleep());
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.eat());
        System.out.println(animal3.unSleep());
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.eat());
        System.out.println("Охотиться за мышами? :" + animal3.HuntingForMice);
        System.out.println();

        Horse animal4=new Horse("Овес","Россия", false);
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.eat());
        System.out.println(animal4.sleep());
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.eat());
        System.out.println(animal4.unSleep());
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.eat());
        System.out.println("Приспооблена к верховой езде?:" + animal4.rideable);
        System.out.println();
        Animal[] animals = {animal1, animal2, animal3, animal4};
        Veterinarian.treatAnimal(animals);
    }
}
