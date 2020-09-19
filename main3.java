public class main3 {
      public static void main(String[] args){
        var circle=new Circle();
        circle.makeVisible();
        circle.moveDown();
        circle.slowMoveHorizontal(-70);
        circle.changeSize(100);
        circle.moveHorizontal(-70);
        /*让参数位负数就向左移动了*/
    }
}
