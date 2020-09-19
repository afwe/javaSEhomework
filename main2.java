public class main2 {
    public static void main(String[] args){
        var circle=new Circle();
        var square=new Square();
        circle.Setposition(300,70);
        square.Setposition(200, 150);
        circle.makeVisible();
        square.makeVisible(); 
        square.moveDown();
        square.moveDown();
        circle.makeInvisible();
        circle.makeInvisible();
        /*mveDown两次发现下降了20*2px，makeInvisible两次任然不可视*/
    }
}
