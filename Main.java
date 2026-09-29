import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

class Main{

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 
        System.out.println("\nEnter an integer number:");
        while(!scanner.hasNextInt()){
           System.out.println("\nEntered not a number");
           scanner.next();
           System.out.println("\nEnter an integer number:");
        }

        return scanner.nextInt();
    }

    public static int getInt(String str){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 
        System.out.println("\n" + str);
        while(!scanner.hasNextInt()){
           System.out.println("\nWrong input");
           scanner.next();
           System.out.println("\n" + str);
        }

        return scanner.nextInt();
    }

    public static int[] getIntArr(){

        int len = 0;
        do {
            len = getInt("Enter array size (1, 2, ...)");
        } while(len<=0);

        int[] arr = new int[len];

        for(int i = 0; i < len; i++){
            arr[i] = getInt("Enter element number " + i);
        }
        
        return arr;
    }

    public static void printArr(int[] arr){
        if (arr!=null) {
            System.out.print("[");
            for(int i = 0; i < arr.length-1; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.print(arr[arr.length-1]+"]");
        }
        else System.out.print("\nArray is empty\n");
    }

    public static void printArr(String str, int[] arr){
        System.out.print(str);
        if (arr!=null) {
            System.out.print("[");
            for(int i = 0; i < arr.length-1; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.print(arr[arr.length-1]+"]");
        }
        else System.out.print("\nArray is empty\n");
    }

    public static char getChar(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 
        System.out.println("\nEnter a char:");
        while(!scanner.hasNext()){
           System.out.println("\nEntered nothing!");
            scanner.next();
            System.out.println("\nEnter a char:");
        }

        return scanner.next().charAt(0);
    }

    public static double getDouble(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 
        System.out.println("\nEnter a double number:");
        while(!scanner.hasNextDouble()){
           System.out.println("\nEntered not a double number");
           scanner.next();
           System.out.println("\nEnter a double number:");
        }

        return scanner.nextDouble();
    }

    public double fraction (double x){

        String text = String.valueOf(x);

        String fractStr = text.substring(text.indexOf(".") + 1);

        return Double.parseDouble("0." + fractStr);
    }

    public int charToNum (char x){
        if(x >= '0' && x <= '9') return x - '0';
        else return -1;
    }

    public boolean is2Digits (int x){
        return (Math.abs(x) > 9 && Math.abs(x) < 100);
    }

    public boolean isInRange (int a, int b, int num){
        if(a>b){
            int c = a; a = b; b = c;
        }
        return (num>=a && num<=b);
    }

    public boolean isEqual(int a, int b, int c){
        return a==b && a==c;
    }

    public int abs (int x){
        return Math.abs(x);
    }

     public boolean is35 (int x){
        return x%5==0 && x%3!=0 || x%3==0 && x%5!=0;
     }

    public int max3 (int x, int y, int z){
        int maxx = x;
        if(y>maxx) maxx = y;
        if(z>maxx) maxx = z;
        return maxx;
    }

    public int sum2 (int x, int y){
        int sum = x+y;
        if(sum>9&&sum<20) return 20;
        return sum;
    }

    public String day (int x){
        switch (x) {
            case 1:
                return ("Monday");
            case 2:
                return ("Tuesday");
            case 3:
                return ("Wednesday");
            case 4:
                return ("Thursday");
            case 5:
                return ("Friday");
            case 6:
                return ("Saturday");
            case 7:
                return ("Sunday");
            default:
                return ("Not a day in a week");
        }
    }

    public String listNums (int x){
        String ans = "";
        if(x >= 0){
            for (int i = 0; i <= x; i++) {
                ans = ans + i + " ";
            }
            return ans.trim();
        }
        return "X не может быть меньше 0";
    }

    public String chet (int x){
        String ans = "";
        if(x >= 0){
            for (int i = 0; i < x; i+=2) {
                ans = ans + i + " ";
            }
            return ans.trim();
        }
        return "X не может быть меньше 0";
    }

    public int numLen (long x){
        int l = 0;
        while (x!=0){
            l++;
            x/=10;
        }

        if(l == 0) return 1;
        return l;
    }

    public void square (int x){
        if (x<=0) System.out.print("\nWrong size of a square");
        System.out.print("\n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void rightTriangle (int x){
        if (x<=0) System.out.print("\nWrong size of a triangle");
        System.out.print("\n");
        int space = x-1;
        for (int i = 0; i < x; i++) {
             for (int j = 0; j < x; j++) {
                if (j<space) System.out.print(" ");
                else System.out.print("*");
            }
            space--;
            System.out.print("\n");
        }
    }

     public int findFirst (int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public int maxAbs (int[] arr){
        int maxx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxx)) maxx = arr[i];
        }
        return maxx;
    }

    public int[] add(int[] arr, int[] ins, int pos){

        if (pos >= 0 && pos < arr.length) {

            int ptr1 = 0;
            int[] arr2 = new int[arr.length + ins.length];

            for (int i = 0; i < arr.length; i++) {
                if(i == pos){
                    for (int j = 0; j < ins.length; j++) {
                        arr2[ptr1] = ins[j];
                        ptr1++;
                    }
                }
                arr2[ptr1] = arr[i];
                ptr1++;
            }
            return arr2;
        }
        System.out.print("\nPos error\n");
        return null;
    }

    public int[] reverseBack(int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length-1-i];
        }
        return arr2;
    }

     public int[] findAll (int[] arr, int x){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
     }

    public static void main(String[] args){
        Main obj = new Main();
        int answer;

        System.out.println(GREEN + "\nPart 1 - Task 1 Fraction" + RESET);
        System.out.println("\nThe fraction of you number is " + obj.fraction(getDouble()));
       
        System.out.println(GREEN + "\nPart 1 - Task 3 Char(from 0 to 9) to Num" + RESET);
        answer = obj.charToNum(getChar());
        if(answer != -1) System.out.println("\nYour char in integer form is " + answer);
        else System.out.println("\nWrong input ");

        System.out.println(GREEN + "\nPart 1 - Task 5 Is number 2 digits long" + RESET);
        System.out.println("\nYour number is two digits long: " + obj.is2Digits(getInt()));

        System.out.println(GREEN + "\nPart 1 - Task 7 Is num in range from a to b" + RESET);
        System.out.println("\nYour number is in range from a to b: " + obj.isInRange(getInt("Enter integer a:"), getInt("Enter integer b:"), getInt()));

        System.out.println(GREEN + "\nPart 1 - Task 9 Are 3 numbers equal" + RESET);
        System.out.println("\nYour 3 numbers are equal: " + obj.isEqual(getInt("Enter integer 1:"), getInt("Enter integer 2:"), getInt("Enter integer 3:")));

        System.out.println(GREEN + "\nPart 2 - Task 1 Absolute value of a number" + RESET);
        System.out.println("\nThe absolute value of your number is " + obj.abs(getInt()));

        System.out.println(GREEN + "\nPart 2 - Task 3 Is number dividable by 3 or 5 (not together)" + RESET);
        System.out.println("\nYour number is dividable by 3 or 5 (not together): " + obj.is35(getInt()));

        System.out.println(GREEN + "\nPart 2 - Task 5 Max from 3 numbers" + RESET);
        System.out.println("\nMax from your 3 numbers is " + obj.max3(getInt("Enter integer 1:"), getInt("Enter integer 2:"), getInt("Enter integer 3:")));

        System.out.println(GREEN + "\nPart 2 - Task 7 Sum of 2 nums (but answers from 10 to 19 are 20)" + RESET);
        System.out.println("\nSum of your numbers is " + obj.sum2(getInt("Enter integer a:"),getInt("Enter integer b:")));

        System.out.println(GREEN + "\nPart 2 - Task 9 Number to week day" + RESET);
        System.out.println("\nYour number corresponds to: " + obj.day(getInt()));

        System.out.println(GREEN + "\nPart 3 - Task 1 Numbers from 0 to X" + RESET);
        System.out.println("\nYour line of numbers is: " + obj.listNums(getInt("Enter integer X:")));

        System.out.println(GREEN + "\nPart 3 - Task 3 Even numbers from 0 to X" + RESET);
        System.out.println("\nYour line of even numbers is: " + obj.chet(getInt("Enter integer X:")));

        System.out.println(GREEN + "\nPart 3 - Task 5 Length of a number" + RESET);
        System.out.println("\nThe length of your number is " + obj.numLen(getInt()));

        System.out.println(GREEN + "\nPart 3 - Task 7 Print a square of *" + RESET);
        obj.square(getInt());

        System.out.println(GREEN + "\nPart 3 - Task 9 Print a right-leaning triangle of *" + RESET);
        obj.rightTriangle(getInt());

        int[]array1;
        int[]array2;

        System.out.println(GREEN + "\nPart 4 - Task 1 Find first entry of a number in an array" + RESET);
        array1 = getIntArr();
        printArr("\n\nYour array is ", array1);
        System.out.println("\nFirst entry of your number is index " + obj.findFirst(array1,getInt()));

        System.out.println(GREEN + "\nPart 4 - Task 3 Find max abs of an array" + RESET);
        array1 = getIntArr();
        printArr("\n\nYour array is ", array1);
        System.out.println("\n\nMax absolute value of your array is " + obj.maxAbs(array1));

        System.out.println(GREEN + "\nPart 4 - Task 5 Insert array into array" + RESET);
        array1 = getIntArr();
        array2 = getIntArr();
        printArr("\n\nArray 1 is", array1);
        printArr("\n\nArray 2 is", array2);
        System.out.print("\n");
        printArr("\nAnser is ",obj.add(array1,array2,getInt()));

        System.out.println(GREEN + "\n\nPart 4 - Task 7 Reverse Array" + RESET);
        array1 = getIntArr();
        printArr("\n\nYour array is ", array1);
        printArr("\n\nReversed array is ", obj.reverseBack(array1));

        System.out.println(GREEN + "\n\nPart 4 - Task 9 Find all entries of a number in an array" + RESET);

        array1 = getIntArr();
        printArr("\n\nYour array is ", array1);

        printArr("\n\nAll entries of you number: ", obj.findAll(array1,getInt()));

    }
}