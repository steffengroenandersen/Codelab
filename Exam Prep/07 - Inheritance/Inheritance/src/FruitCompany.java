public class FruitCompany {
    public static void main(String[] args){
        Banana b1 = new Banana("BananaName");

        b1.showFruitWeight();
        b1.weight = 2;
        b1.showFruitWeight();
    }
}
