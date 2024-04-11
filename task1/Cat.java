package task1;

public class Cat extends Animal{
    private String catColour;

    public Cat(){
        this.catColour = "Red";
        super.name = "Tosha";
        super.age = 7;
    }

    public void makeSound(){
        System.out.println("Maaaayyyy");
    }

    public String getCatColour() {
        return catColour;
    }

    @Override
    public String toString() {
        return "task1.Cat{" +
                "colour='" + catColour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
