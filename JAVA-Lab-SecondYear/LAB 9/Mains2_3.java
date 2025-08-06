/*
2.3. Remove Duplicates: Given a string, remove all duplicate characters while maintaining order.
a. Input: "banana"
b. Output: "ban"
 */

class Mains2_3{
    public static void main(String[] args){
        System.out.println(rem_dup("banana"));
    }

    public static String rem_dup(String s){
        String res = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(res.indexOf(c) == -1)
                res += c;
        }
        return res;
    }
}                                                                                                                                                       