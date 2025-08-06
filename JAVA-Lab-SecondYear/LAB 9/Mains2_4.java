/*
2.4. Find First Non-Repeating Character: Given "swiss", output 'w'.
 */

class Mains2_4{
    public static void main(String[] args){
        System.out.println(non_repeat("swiss"));
    }

    public static char non_repeat(String s){
        char res = ' ';
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)){
                res = c;
                break;
            }
        }
        return res;
    }
}                                                                                                                                                       