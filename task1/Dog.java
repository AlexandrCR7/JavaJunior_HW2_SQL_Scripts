package task1;

public class Dog extends Animal {
    private String dogColour;

    public Dog(){
        this.dogColour = "Black";
        super.name = "Sosiska";
        super.age = 8;
    }
    public void makeSound(){
        System.out.println("AF AFFF AFFF!!!");
    }

    public String getColour() {
        return dogColour;
    }

    @Override
    public String toString() {
        return "task1.Dog{" +
                "colour1='" + dogColour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
