package Ch7Arrays;

        import java.util.Arrays;

public class ArrayPractice2 {
    public static void main (String[]args){
        doNow();

    }

    public static void doNow(){
        int random1= (int) (Math.random() * (10 - 1) + 1);
        int [] array1= new int [random1];
        for(int i=0; i<random1;i++ ){
            int random2= (int) (Math.random() * (10 - 1) + 1);
            array1[i]=random2;
        }
        System.out.println(Arrays.toString(array1));


    }
}
