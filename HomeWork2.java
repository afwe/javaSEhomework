import java.util.Scanner;
class HomeWork2{
    public static void main(String[] args){
        System.out.println("Welcome");
        System.out.println("please push product before buy it");
        System.out.println("1 pushmoney");
        System.out.println("2 buyproduct");
        System.out.println("3 pushproduct");
        System.out.println("4 check total money in theMachine");
        System.out.println("0 exit");
        Scanner scan = new Scanner(System.in);
        int query=1;
        double x;
        int pos;
        var machine=new theMachine();
        while(query!=0){
            query=scan.nextInt();
            if(query==0){
                System.out.println("exit");
            }
            if(query==1){
                System.out.println("push money:");
                x=scan.nextDouble();
                machine.PushMoney(x);
            }
            else if(query==2){
                System.out.println("please select the position of the product");
                pos=scan.nextInt();
                machine.buy(pos);
            }
            else if(query==3){
                System.out.println("please push the product");
                x=scan.nextDouble();
                machine.PushProduct(x);
            }
            else if(query==4){
                System.out.print("tot is ");
                System.out.print(machine.gettot());
                System.out.println("");
            }
            else{
                System.out.println("Nan");
            }
        }

    }
}