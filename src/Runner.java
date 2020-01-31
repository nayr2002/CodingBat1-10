import java.util.Arrays;
public class Runner {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(helloName("Bob"));
        System.out.println(cigarParty(30, false));
        System.out.println(bobThere("abcbob"));
        int[] evensArr = {2, 1, 2, 3, 4};
        System.out.println(countEvens(evensArr));
        int[] triplesArr = {1, 1, 2, 2, 1};
        System.out.println(noTriples(triplesArr));
        int[] unluckyArr = {1, 3, 4, 5};
        System.out.println(unlucky1(unluckyArr));
        System.out.println(roundSum(16,17,18));
        System.out.println(gHappy("xxggxx"));
        System.out.println(Arrays.toString(seriesUp(3)));
    }
    public static boolean nearHundred(int n){
        boolean result = ((n >= 90) && (n <= 110)) || ((n >= 190) && (n <= 210));
        return result;
    }

    public static String helloName(String name){
        String result = "Hello " + name + "!";
        return result;
    }

    public static boolean cigarParty(int cigars, boolean isWeekend){
        if(cigars >= 40 && isWeekend == true){
            return true;
        }
        if(cigars >= 40 && cigars <= 60 && isWeekend == true){
            return true;
        }
        return false;
    }

    public static boolean bobThere(String str){
        for(int i = 0; i < str.length() - 2; i++){
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public static int countEvens(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean noTriples(int[] nums){
        for(int i = 0; i < nums.length - 2; i++){
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean unlucky1(int[] nums){
        if (nums.length < 2){ return false; }
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                if (i == 0 || i == 1 || i == nums.length - 2) {
                    if (nums[i+1] == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int roundSum(int a, int b, int c){
        int newA = a - (a % 10);
        int newB = b - (b % 10);
        int newC = c - (c % 10);

        if (a % 10 >= 5){
            newA += 10;
        }
        if (b % 10 >= 5){
            newB += 10;
        }
        if (c % 10 >= 5){
            newC += 10;
        }

        return (newA + newB + newC);
    }

    public static boolean gHappy(String str){
        if (str.length() == 1 && str.equals("g")){
            return false;
        }

        if(str.length() >= 2 && (str.charAt(0) == 'g' && str.charAt(1) != 'g' || str.charAt(str.length()-1) == 'g' &&  str.charAt(str.length()-2) != 'g')) {
            return false;
        }

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == 'g' && str.charAt(i + 1) != 'g' && str.charAt(i - 1) != 'g'){
                return false;
            }
        }

        return true;
    }

    public static int[] seriesUp(int n){
        int[] arr = new int[n*(n + 1)/2];
        int index = 0;
        for(int i = -1; i <= n; i++){
            for(int b = 1; b < i + 1; b++){
               arr[index] = b;
               index++;
            }
        }
        return arr;
    }
}
