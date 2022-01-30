public class Animal {  
    public void eatFood() {  
        System.out.println("Eat Food");  
    }  
}  
  
public class Dog extends Animal {  
    public void woof() {  
        System.out.println("Dog Woof! ");  
    }  
}  
public class Cat extends Animal {  
    public void meow() {  
        System.out.println("Cat Meow!");  
    }  
}  
Both Dog and Cat speak differently, but they need to eat food. The common functionality in both of them is Eating food so, we can put this common functionality into the parent class, i.e., Animals, and then we can extend that parent class in the child class, i.e., Dog and Cat.

Now, each class can focus on its own unique logic, so there is no need to implement the same functionality in both classes.

Dog obj1 = new Dog();  
obj1.eatFood();  
obj1.woof();  
  
Cat obj2 = new Cat();  
obj2.eatFood();  
obj2.meow();  