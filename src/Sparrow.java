public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, String gender, Double weight) {
        super(age, gender, weight);
    }


    public void fly() {
        System.out.println("sparrow flying high");

    }
}
