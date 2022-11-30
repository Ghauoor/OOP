package OOP_Basics.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.setPrice(33);


    }

}

class Laptop {
    int ram;
    private int price;

    public void setPrice(int price) {
        //Check Part
        boolean isAdmin = false;
        if (!isAdmin) {
            System.out.println("You are not Admin");
        } else
            this.price = price;


    }
}
