public class main16 {
    public static void main(String[] args){
        var circle=new Circle();
        var square=new Square();
        var triangle=new Triangle();
        circle.Setposition(300,10);
        square.Setposition(200, 150);
        triangle.Setposition(230, 90);
        triangle.Setsize(60, 60); 
        square.makeVisible();
        triangle.makeVisible();
        circle.makeVisible();
        circle.sunset(70);
    }
}
