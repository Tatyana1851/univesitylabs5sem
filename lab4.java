public class lab4 {
    public static void main(String args[]){
        System.out.println();
        System.out.println("Задача №1");
        esseFunc(7,"hello my name is Bessie and this is my essay");
        System.out.println();
        System.out.println("Задача №2");
        split("()()()");
        System.out.println();
        System.out.println("Задача №3");
        System.out.println(toCamelCase("to camel_case"));
        System.out.println(toSnakeCase("toSnakeCase"));
    }
    static void esseFunc(int stringSize, String text) {
        String bString="";
        String fString="";
        int countOfChars=0;
        int lastSpacePlace=0;
        for(int i=0;i<text.length();i++){
            if((countOfChars>stringSize)){
                System.out.println(fString);
                fString="";
                bString="";
                i=lastSpacePlace+1;
                countOfChars=0;
            }
            if((text.charAt(i)==' ')){
                lastSpacePlace=i;
                fString=bString;
                bString=bString+text.charAt(i);
            }
            else {
                bString=bString+text.charAt(i);
                countOfChars++;
            }
            if(i+1==text.length()){
                System.out.println(bString);
            }
        }
    }
    static void split(String str){
        int balance=0;
        String bString="";
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='('){
                balance++;
            }
            if(str.charAt(i)==')'){
                balance--;
            }
            //System.out.println(balance);
            bString=bString+str.charAt(i);
            if(balance==0){
                System.out.println(bString);
                bString="";
            }
        }
    }
    static String toCamelCase(String string){
        String returnString="";
        String loString=string.toLowerCase();
        String hiString=string.toUpperCase();
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='_' | string.charAt(i)==' '){
                i++;
                returnString=returnString+hiString.charAt(i);
            }
            else{
                returnString=returnString+loString.charAt(i);
            }
        }
        return (returnString);
    }
    static String toSnakeCase(String string){
        String returnString="";
        String loString=string.toLowerCase();
        String hiString=string.toUpperCase();
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==hiString.charAt(i)){
                returnString=returnString+"_";
            }
            returnString=returnString+loString.charAt(i);
        }
        return (returnString);
    }
}
