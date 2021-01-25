import java.util.Random;

public class exercise_8 {
//Имеется целое число  Random rand = new Random(); int x = rand.nextInt();
public static void main(String[] args) {

    Random rand = new Random();
    //int x = rand.nextInt();
    int x = rand.nextInt(100000);
    int lastX=0;
    if (x<0) lastX = (x % 10)*-1;
    else {
        lastX = (x % 10) ;
    }

    System.out.println( x);
  //  System.out.println( y);
    System.out.println(lastX);

    if ((lastX == 1)) {
        System.out.println(x+" рубль");
    } else if ((lastX >=2) &(lastX<=4)){
        System.out.println(x+" рубля");
    } else if  (lastX==0){
        System.out.println(x+" рублей");
    } else if (lastX >=5) {
        System.out.println(x+" рублей");

    }





}









}
