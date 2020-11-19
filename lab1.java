public class lab1 {
    public static void main(String[] args){
        System.out.println("Задача №1");
        System.out.println("Остаток от деления равен: " + modulnoeDelenie(-34,7));
        System.out.println();
        System.out.println("Задача №2");
        System.out.println("Площадь треугольника равна: "+ ploshadTreugolnika(5,5));
        System.out.println();
        System.out.println("Задача №3");
        System.out.println("У животных всего ног: "+ kolichestvoNog(1,2,3));
        System.out.println();
        System.out.println("Задача №4");
        System.out.println("Это выражение: "+ profitableGamble(0.9, 1, 2));
        System.out.println();
        System.out.println("Задача №5");
        System.out.println("Это операция: "+ operation(11, 15,3));
        System.out.println();
        System.out.println("Задача №6");
        System.out.println("Код символа: "+ convertCharToInt('['));
        System.out.println();
        System.out.println("Задача №7");
        System.out.println("Сумма: "+ addUpTo(10));
        System.out.println();
        System.out.println("Задача №8");
        System.out.println("Третья сторона: "+ nextEdge(5,7));
        System.out.println();
        System.out.println("Задача №9");
        System.out.println("Сумма кубов массива чисел: "+ sumOfCubes(1,5,9));
        System.out.println();
        System.out.println("Задача №10");
        System.out.println("Может ли делится результат: "+abcMath(5,2,3) );
    }
    static int modulnoeDelenie(int delimoe, int delitel){
        delimoe=Math.abs(delimoe);
        delitel=Math.abs(delitel);
        int n=0;
        int temp=0;
        int answer=0;
        do{
            answer=temp;
            n++;
            temp=delitel*n;
        }
        while (temp <= delimoe);
        return(delimoe-answer);
    }
    static double ploshadTreugolnika(double osnovanie, double vysota){
        return(0.5*osnovanie*vysota);
    }
    static int kolichestvoNog(int chicken, int cow, int pig){
        return(chicken*2+cow*4+pig*4);
    }
    static boolean profitableGamble(double prob, double prize, double pay){
        if ((prob*prize) > pay) {
            return (true);
        }
        else{
            return(false);
        }
    }
    static String operation(int ans, int num1, int num2){
        if (ans==num1+num2){
            return("Сложение");
        }
        else if (ans==num1-num2){
            return("Вычитание");
        }
        else if (ans==num1*num2){
            return("Умножение");
        }
        else if (ans==num1/num2){
            return("Деление");
        }
        else{
            return("Ничего");
        }
    }
    static int convertCharToInt(char ch){
        return(ch);
    }
    static int addUpTo(int number){
        int sum=0;
        for (int i=1; i<=number; i++){
            sum+=i;
        }
        return(sum);
    }
    static int nextEdge(int edge1, int edge2){
        return(edge1+edge2-1);
    }
    static int sumOfCubes(int ...numbers) {
        int sum=0;
        for (int n: numbers){
            sum+=Math.pow(n,3);
        }
        return(sum);
    }
    static boolean abcMath(int a, int b, int c){
        int sum=a;
        for (int i=0; i<b; i++) {
            sum+=sum;
        }
        return sum % c == 0;
    }
}