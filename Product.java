public class Product {
    private double price;
    private int saled=0;
    public Product(double x){
        price=x;
        saled=0;
    }
    public void post(){
        System.out.println(price);
    }
    public double getprice(){
        return price;
    }
    public int BeSaled(double x){
        if(saled>0){
            System.out.println("product has been saled");
            return 0;
        }
        if(x>price){
            saled=1;
            System.out.println("product saled");
            return 1;
        }
        else return 0;
    }
}
