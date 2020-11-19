public class lab3 {
    public static void main(String args[]){
        System.out.println();
        System.out.println("Задача №1");
        solutions(5,3,7);
        System.out.println();
        System.out.println("Задача №2");
        findWord("all zip files are zipped","zip",2);
        findWord("all zip files are compressed","zip",2);
        System.out.println();
        System.out.println("Задача №3");
        System.out.println(checkPerfect(28));
        System.out.println();
        System.out.println("Задача №4");
        flipEndChars("Ada");
        System.out.println();
        System.out.println("Задача №5");
        System.out.println(isValidHexCode("#6a66A6"));
    }
    static void solutions(double a, double b, double c){
        Double D=b*b-4*a*c;
        if (D>0) {
            System.out.println("Дискриминант больше нуля и уравнение имеет два корня");
            double x1=(-b+Math.sqrt(D))/(2*a);
            double x2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("Первый корень равен: "+x1);
            System.out.println("Второй корень равен: "+x2);
        }
        else if (D==0){
            System.out.println("Дискриминант равен нулю и уравнение имеет один корень");
            double x=(-b)/(2*a);
            System.out.println("Корень равен: "+x);
        }
        else{
            System.out.println("Дискриминант меньше нуля и уравнение не имеет корней");
        }
    }
    static void findWord (String mainString, String sWord, int repeatTimes){
        int charNumber=0;
        for(int i=0;i<=mainString.length()-sWord.length();i++){
            int count =0;
            for(int j=0; j<sWord.length();j++){
                if (sWord.charAt(j)==mainString.charAt(i+j)){
                    count++;
                }
            }
            if(sWord.length()==count){
                repeatTimes-=1;
                if (repeatTimes<=0) {
                    System.out.println("Совпадение найдено: "+i);
                }
            }
        }
        if (repeatTimes>0){
            System.out.println("Совпадение не найдено: -1");
        }
    }
    static boolean checkPerfect(int number){
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%(i)==0){
                sum+=i;
                System.out.println(i);
            }
        }
        return (number==sum);
    }
    static void flipEndChars(String mainString){
        if(mainString.length()>=2){
            char startChar=mainString.charAt(0);
            char endChar=mainString.charAt(mainString.length()-1);
            String answer="";
            if(startChar==endChar){
                System.out.println("Два - это пара");
            }
            else{
                answer=(answer + endChar);
                for(int i=1;i<mainString.length()-1;i++){
                    answer+=mainString.charAt(i);
                }
                answer=(answer + startChar);
            }
            System.out.println(answer);
        }
        else{
            System.out.println("Невозможно");
        }
    }
    static boolean isValidHexCode(String hexCode){
        if(hexCode.charAt(0)=='#'){
            if(hexCode.length()==7){
                int code;
                for (int i=1;i<hexCode.length();i++) {
                    code = hexCode.charAt(i);
                    if(!((48<=code && code<=57) | (97<=code && code<=102) | (65<=code && code<=70))){
                        System.out.println("Некорректные символы");
                        return false;
                    }
                }
                return true;
            }
            else{
                System.out.println("Длина должна быть 6");
                return false;
            }
        }
        else{
            System.out.println("Пропущен '#'");
            return false;
        }
    }
}
