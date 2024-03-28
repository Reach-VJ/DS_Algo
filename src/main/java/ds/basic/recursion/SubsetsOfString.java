package ds.basic.recursion;

public class SubsetsOfString {
    public static void main(String [] args) {
        String str = "ABC";
        String current = "";
        int i = 0;
        SubsetsOfString.subSets(str,current,i);
        //OP : "", C, B, BC, A, AC, AB, ABC
    }

    public static void subSets(String str, String current, int i) {
        if(i == str.length()) {
            System.out.println(current);
            return;
        }
        subSets(str,current,i+1);
        subSets(str,current+str.charAt(i),i+1);
    }
}
