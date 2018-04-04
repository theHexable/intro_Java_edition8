package Chapter14.Listings;

/**
 *
 * @author Shady Bajary
 * @Listing 14.6
 */
public class TestEdible {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
            }
        }
    }
    
    public static void eat(Edible stuff){
        stuff.howToEat();
    }
}

abstract class Animal implements Edible {

    @Override
    public abstract String howToEat();
    // Date fields, constructors, and methods ommitted here
}

class Chicken extends Animal implements Edible {

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
}

class Tiger extends Animal {

    @Override
    public String howToEat() {
        return "Tiger: is not eaten";
    }
}

abstract class Fruit implements Edible {
    // Date fields, constructors, and methods ommitted here
}

class Apple extends Fruit {

    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {

    public String howToEat() {
        return "Orange: Make orange juice";
    }
}

class Duck extends Animal {

    public String howToEat() {
        return "Duck: Roast it";
    }
}

interface Edible {

    public String howToEat();
}

class Broccoli implements Edible {

    public String howToEat() {
        return "Broccoli: Stir-fry it";
    }
}
