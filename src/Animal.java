// abstract classes can only be extended
public abstract class Animal {

    int age;
    String gender;
    Double weight;

    public Animal (int age, String gender, Double weight){
        this.age = age;
        this.gender = gender;
        this.weight = weight;

    }


//public void move(){
//
//    System.out.println("moving.." );
//}

public  void eat (){
    System.out.println("eating...");

}

public void sleep(){
    System.out.println("sleeping...");
}


// if a method has no body than it should be an abstract method and the class in which it is has to be an abstract class
public abstract void move();






}
