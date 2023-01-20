public class Bread {
    // Variables
    private int price;

    public static int getBreadCnt() {
        return breadCnt;
    }

    private String name;
    private static int breadCnt;

    // Constructors

    public Bread(){

    }

    public Bread(String name, int price){
        this.name = name;
        this.price = price;
    }

    // Methods

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
