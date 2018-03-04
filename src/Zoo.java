public class Zoo {
    public static void main(String[] args) {


       Animal fish1 = new Fish(2,"F",2.5);
       //fish1.move();

       Animal chick1 = new Chicken(1,"M",2.5);
       //chick1.move();
       moveAnimal(fish1);
       moveAnimal(chick1);

    }


    public static void moveAnimal(Animal animal){
        animal.move();


    }
}
