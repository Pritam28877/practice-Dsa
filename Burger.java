public interface Burger{  
    void addSauce();  
    void bakeBurger();  
}  
Now, let's implement the Burger interface in VegetarianBurger and CheeseBurger classes.

public class VegetarianBurger implements Burger {  
public void addTomatoAndCabbage() {  
        System.out.println("Adding Tomato and Cabbage vegitables");  
    }  
        @Override  
        public void addSauce() {  
        System.out.println("Adding sauce in vegetarian Burger");  
    }  
@Override  
        public void bake() {  
        System.out.println("Baking the vegetarian Burger");  
    }  
}  
public class CheeseBurger implements Burger {  
public void addCheese() {  
        System.out.println("Adding cheese in Burger");  
    }  
@Override  
public void addSauce() {  
        System.out.println("Adding sauce in Cheese Burger");  
    }  
@Override  
        public void bake() {  
        System.out.println("Baking the Cheese Burger");  
    }  
}  