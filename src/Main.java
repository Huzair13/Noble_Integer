import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array !!! ");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements !!!");
        Integer[] array=new Integer[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        int nobleElement=nobleElementFinder(array,size);
        System.out.println(nobleElement);
    }

    private static int nobleElementFinder(Integer[] array, int size) {
        Arrays.sort(array);

//        int countOfSmall=0;
//        int countOfNoble=0;
//        if(array[0]==0) {
//            countOfNoble++;
//        }
//        int count=0;
        Arrays.sort(array);
        for(int i=0;i<size;i++){
//            if(array[i]!=array[i-1]){
//                countOfSmall=size-i+1;
//            }
//            if(countOfSmall==array[i]){
//                countOfNoble++;
//            }

            int c=size-(i+1);
            if(array[i]==c){
                return 1;
            }
        }
        return -1;
    }
}