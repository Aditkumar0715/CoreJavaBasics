
// enums creating constructor and variables in enum...

enum Laptop{
    Macbook(2000), Elitebook(1400), Surface(1800), Thinkpad;

    private int price;

    private Laptop(){
        price = 500;
    }

    private Laptop(int p){
        this.price = p;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}



public class enums2 {
    public static void main(String[] args) {
        Laptop lap = Laptop.Elitebook;
        lap.setPrice(2500);
        System.out.println(lap + " : " + lap.getPrice());

        // printing all the laptops
        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + " : " + laptop.getPrice());
        }

    }
}
