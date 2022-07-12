package session4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingChallenge {
    public static void main(String[] args) {

        int[] res1 = convertToArray("hsfkhrgzkuhfkzughvzxduhg1436546xfgtbxijik");
        int[] res2 = convertToArray("hfdgvzdjuhgvzkujrkv");
        int[] res3 =convertToArray("1256488");
        int[] res4 =convertToArray("@&^562223kjhgt");
        int[] res5 = convertToArray("");
        String str = null;


        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
        System.out.println(Arrays.toString(res3));
        System.out.println(Arrays.toString(res4));
        System.out.println(Arrays.toString(res5));

    }

    //Exp: "45p85poi89iok1  --> 4585891
    //Exp: hgytpsirnfhns --> []
    //given str return an int array which contains only numbers
    //pseudocode -> high level steps of solving a problem in english words

    public static int[] convertToArray(String str) {


        if(str ==null || str.isEmpty()){
            int[] empty = {};
            return empty;
            //or:     return new int[]{};
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isDigit(each)) {
                list.add(Character.getNumericValue(each));
                // or    list.add (Integer.parseInt (each + "");

            }
        }

        int[] result = new int[list.size()];// creates a new empty primitive array with the size of the ArrayList
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
return result;
        // second approach:

        //List<Character> list = new ArrayList<>();
        //
        //        for (int i = 0; i < str.length(); i++) {
        //           char each =  str.charAt(i);
        //           if(Character.isDigit(each)){
        //               list.add((each));
        //              }
        //            }


    }
}
