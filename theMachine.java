import java.util.ArrayList;
public class theMachine {
    private double tot;
    private ArrayList<Product> List=new ArrayList();
    public theMachine(){
        tot=0;
    }
    public double gettot(){
        return tot;
    }
    public void PushProduct(double x){
        var newpro=new Product(x);
        List.add(newpro);
        System.out.println("add product successfully");
    }
    public void PushMoney(double x){
        tot+=x;
    }
    public void getInfo(){
        for(int i=0;i<List.size();i++){
            Product thisp=List.get(i);
            System.out.print("The ");
            System.out.print(i);
            System.out.print("th product's price is");
            thisp.post();
            System.out.println("");
        }
    }
    public void buy(int pos){
        Product thisp=List.get(pos);
        if(tot>=thisp.getprice()){
            System.out.println("sold successfully");
            tot-=thisp.getprice();
            List.remove(pos);
        }
        else{
            System.out.println("lack money");
        }
    }

}