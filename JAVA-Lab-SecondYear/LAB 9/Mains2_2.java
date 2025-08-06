/*
2.2. Reverse Words in a String: Reverse the order of words in a sentence without using split().
     a. Input: "Java is fun"
     b. Output: "fun is Java"
*/

class Mains2_2{
    public static void main(String[] args){
        System.out.println(rev("Java is fun"));
    }
    public static String rev(String s){
        s = s.trim()+" ";
        String s1 = "", res = "";
        int spaces = s.length() - s.replace(" ", "").length();
        for(int i=0; i<spaces; i++){
            s1 = s.substring(0, s.indexOf(" "));
            s = s.substring(s.indexOf(" ")+1, s.length());
            res = s1 + " " + res;
        }
        return res;
    }
}