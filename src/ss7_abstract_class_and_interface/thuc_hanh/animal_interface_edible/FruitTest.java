package ss7_abstract_class_and_interface.thuc_hanh.animal_interface_edible;

import ss7_abstract_class_and_interface.thuc_hanh.animal_interface_edible.fruit.Apple;
import ss7_abstract_class_and_interface.thuc_hanh.animal_interface_edible.fruit.Fruit;
import ss7_abstract_class_and_interface.thuc_hanh.animal_interface_edible.fruit.Orange;

public class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruit=new Fruit[2];
        fruit[0]= new Orange();
        fruit[1]= new Apple();
        for(Fruit fruits : fruit){
            System.out.println(fruits.howToEat());
        }
    }
}
