abstract class Burger {
    String meat;
    boolean cheese;
    short price;

    Burger(String meat, boolean cheese, short price) {
        this.meat = meat;
        this.cheese = cheese;
        this.price = price;
    }

    public abstract String getName();

    public abstract short getPrice();

    public abstract void makeBurger();
}

class ZingerBurger extends Burger {
    boolean zingerPrice;

    ZingerBurger(String meat, boolean cheese, short price, boolean zingerPrice) {
        super(meat, cheese, price);
        this.zingerPrice = zingerPrice;
    }

    @Override
    public String getName() {
        return "Zinger Burger";
    }

    @Override
    public short getPrice() {
        return price;
    }

    @Override
    public void makeBurger() {
        System.out.println("Method of creating Zinger Burger by ZingerBurger class");
    }
}

class BeefBurger extends Burger {
    boolean pickles;

    BeefBurger(String meat, boolean cheese, short price, boolean pickles) {
        super(meat, cheese, price);
        this.pickles = pickles;
    }

    @Override
    public String getName() {
        return "Beef Burger";
    }

    @Override
    public short getPrice() {
        return price;
    }

    @Override
    public void makeBurger() {
        System.out.println("Method of creating Beef Burger by BeefBurger class");
    }
}

public class BurgerShopSimulation {
    public static void main(String[] args) {

        Burger zingerBurger = new ZingerBurger("chicken", true, (short) 900, true);
        Burger beefBurger = new BeefBurger("beef", true, (short) 950, false);

        System.out.print("ZINGER BURGER: ");
        System.out.println(zingerBurger.getName());
        System.out.println("Price: RS" + zingerBurger.getPrice());
        zingerBurger.makeBurger(); // run time polymorphism

        System.out.print("BEEF BURGER: ");
        System.out.println(beefBurger.getName());
        System.out.println("Price: RS" + beefBurger.getPrice());
        beefBurger.makeBurger();
    }
}
