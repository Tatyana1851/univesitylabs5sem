import javax.print.attribute.standard.OrientationRequested;
import java.util.Arrays;

public class lab2 {
    public static void main(String args[]){
        System.out.println();
        System.out.println("Задача №1");
        System.out.println(repeat("word", 3));
        System.out.println();
        System.out.println("Задача №2");
        int [] array={1,2,3};
        differenceMaxMin(array);
        System.out.println();
        System.out.println("Задача №3");
        System.out.println("Среднее значение целое: "+ isAvgWhole(array));
        System.out.println();
        System.out.println("Задача №4");
        System.out.println("Итоговый массив:  "+cumulativeSum(array));
        System.out.println();
        System.out.println("Задача №5");
        System.out.println("Цифр после запятой:  "+getDecimalPlaces("43,000"));
    }
    static String repeat(String word, int count){
        String answer="";
        for (int i=0; i<word.length(); i++){
            char c=word.charAt(i);
            for(int j=0; j<count; j++){
                answer=answer + c;
            }
        }
        return(answer);
    }
    static void differenceMaxMin(int[] numbers){
        int max=numbers[0];
        int min=numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];
            }
            if (numbers[i] <= min) {
                min = numbers[i];
            }
        }
        System.out.println("Максимальное значение: "+ max + " Минимальное значение: "+ min + " Разница: " + (max-min));
    }
    static boolean isAvgWhole(int[] numbers){
        double avg=0;
        double sum=0;
        for(int i=0; i<numbers.length;i++){
            sum+=numbers[i];
        }
        avg=sum/numbers.length;
        if (avg%1==0){
            return(true);
        }
        else{
            return (false);
        }
    }
    static String cumulativeSum(int[] numbers){
        int sum=0;
        int[] temp=new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<=i; j++){
                sum+=numbers[j];
            }
            temp[i]=sum;
            sum=0;
        }
        return (Arrays.toString(temp));
    }
    static int getDecimalPlaces(String sNumber){
        int count=0;
        boolean trigger=false;
        for (int i=0; i<sNumber.length();i++){
            if (trigger){
                count++;
            }
            if (sNumber.charAt(i)=='.' | sNumber.charAt(i)==',')  {
                trigger=true;
            }
        }
        return count;
    }
}
