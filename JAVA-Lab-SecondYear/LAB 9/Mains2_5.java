/*
2.5. Custom toLowerCase() and toUpperCase(): 
Implement functions to convert a string to lowercase and uppercase without using built-in methods.
 */

class Mains2_5{
    public static void main(String[] args){
        System.out.println(toUpper("TestString"));
        System.out.println(toLower("TestString"));
    }

    public static String toUpper(String s){
        String res = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                if(c<97) res += (char)c;
                else res += (char)(c-32);
            }
        }
        return res;
    }

    public static String toLower(String s){
        String res = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                if(c>90) res += (char)c;
                else res += (char)(c+32);
            }
        }
        return res;
    }
}                                                                                                                                                       