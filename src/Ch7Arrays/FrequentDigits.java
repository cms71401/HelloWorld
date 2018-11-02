package Ch7Arrays;

public class FrequentDigits {
    public static void main (String[]args){
        int number = 666374943;

        int max= mode(number);
        System.out.println(max+ " occurs the most");
    }

    public static int mode(int number) {
        int x= number;
        int count=0;
        int [] digits= new int [10];
        while (x>0) {
            x /= 10;
            ++count;
        }
        int temp=0;
        for (int i=0; i<count;i++){
            temp=number%10;
            number/=10;
            ++digits[temp];
        }
        int end=-1;
        for (int i=0; i < 10; i++){
            if(digits[i]>end){
                end=i;
            }
        }
    return end;
    }

}
