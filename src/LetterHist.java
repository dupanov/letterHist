/**
 * Created by Вадик on 10.11.2015.
 */
public class LetterHist {
    public static void main(String[] args) {
      //  String str = "abrakaddabra";
    //    printArray(letterHist(str));
     //   System.out.println(isDoubloon("abzba"));
        System.out.println(isAnagram("assa","saka"));
    }

    public static int[] letterHist(String str){
        int[] hist = new int[26];
        int index;
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            index = chars[i]-97;
            hist[index]++;
            }

        return hist;

    }


    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }


    public static boolean isDoubloon(String str){
        int[] histogram = letterHist(str);
        for (int i = 0; i < histogram.length ; i++) {
            if(histogram[i] != 2 && histogram[i] != 0 ){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String str1, String str2){
        int[] hist1 = letterHist(str1);
        int[] hist2 = letterHist(str2);
        for (int i = 0; i < hist1.length ; i++) {

            if( hist1[i] != hist2[i]) {
                return false;
            }
        }
        return true;
    }
}
