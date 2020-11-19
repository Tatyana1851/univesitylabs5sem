import java.util.Arrays;

public class lab5 {
    public static void main(String args[]){
        System.out.println();
        System.out.println("Задача №1");
        encrypt("Sunshine");
        int[] array={83, 34, -7, 5, -11, 1, 5, -9};
        decrypt(array);
        System.out.println();
        System.out.println("Задача №2");
        System.out.println(canMove("korol","D4","C3"));
    }
    static void encrypt(String string){
        int returnArray[] = new int[string.length()];
        int lastCode=string.charAt(0);
        returnArray[0]=(lastCode);
        for(int i=1;i<string.length();i++){
            int nextCode=string.charAt(i);
            returnArray[i]=(nextCode-lastCode);
            lastCode=nextCode;
        }
        System.out.println(Arrays.toString(returnArray));
    }
    static void decrypt(int[] array){
        String returnString="";
        int lastCode =array[0];
        returnString=returnString+(char)lastCode;
        for(int i=1;i<array.length;i++){
            int sum=lastCode+array[i];
            returnString=returnString+(char)sum;
            lastCode=sum;
        }
        System.out.println(returnString);
    }
    static boolean canMove(String figura, String startPos, String finishPos){
        int startChar=startPos.charAt(0);
        int startNum=startPos.charAt(1);
        int finishChar=finishPos.charAt(0);
        int finishNum=finishPos.charAt(1);
        int charChange=Math.abs(finishChar-startChar);
        int numChange=Math.abs(finishNum-startNum);
        if(figura.toLowerCase()=="peshka"){
            return (finishNum-startNum==1 && finishChar-startChar==0);
        }
        else if(figura.toLowerCase()=="kon"){
            return ((numChange==2 && charChange==1) | (numChange==1 && charChange==2));
        }
        else if(figura.toLowerCase()=="slon"){
            return (numChange==charChange);
        }
        else if(figura.toLowerCase()=="ladya"){
            return ((numChange>0 && charChange==0) | (numChange==0 && charChange>0));
        }
        else if(figura.toLowerCase()=="ferz"){
            return ((numChange>0 && charChange==0)|(numChange==0 && charChange>0)|(numChange==charChange));
        }
        else if(figura.toLowerCase()=="korol"){
            return (numChange<=1 && charChange<=1);
        }
        else{
            return false;
        }
    }
}

