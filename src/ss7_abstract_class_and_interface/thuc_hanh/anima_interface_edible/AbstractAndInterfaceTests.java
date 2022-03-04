package ss7_abstract_class_and_interface.thuc_hanh.anima_interface_edible;

import ss7_abstract_class_and_interface.thuc_hanh.anima_interface_edible.animal.Animal;
import ss7_abstract_class_and_interface.thuc_hanh.anima_interface_edible.animal.Chicken;
import ss7_abstract_class_and_interface.thuc_hanh.anima_interface_edible.animal.Tiger;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
        Chicken chicken=new Chicken();
        System.out.println(chicken.howToEat());
    }
}
