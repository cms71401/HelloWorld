package Ch7Arrays;

public class FrequentDigits {
    public static void main (String[]args){
        int number=31242558;
        System.out.println("The number has ");
        AmtOfDig(number);
    }

    public static void AmtOfDig(int number) {
        int dig0 = 0;
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dig4 = 0;
        int dig5 = 0;
        int dig6 = 0;
        int dig7 = 0;
        int dig8 = 0;
        int dig9 = 0;
        int i=0;
        int length = (int) (Math.log10(number) + 1);
        while(i<length){
            if(i==0){
                dig0++;
            }
            else if(i==1){
                dig1++;
            }
            else if(i==2){
                dig2++;
            }
            else if(i==3){
                dig3++;
            }
            else if(i==4){
                dig4++;
            }
            else if(i==5){
                dig5++;
            }
            else if(i==6){
                dig6++;
            }
            else if(i==7){
                dig7++;
            }
            else if(i==8){
                dig8++;
            }
            else if(i==9){
                dig9++;
            }
            i++;
        }
        System.out.println("There are "+ dig0+" 0's, " + dig1+" 1's, "+dig2+ " 2's "+ dig3 + " 3's, "+ dig4+ " 4's, "+ dig5 + " 5's, "+ dig6+ " 6's, "+ dig7 +" 7's, "+ dig8 +" 8's, and "+ dig9+ " 9's.");




    }

}
