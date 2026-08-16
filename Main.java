import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ex 1
        //write a java program to test if the first and the last element of an array of integers are same > The length of the array must be greater than or equal to 2
//
//        System.out.println("enter the size of this array ");
//        ArrayList<Integer> number = new ArrayList<Integer>();
//        int size;
//        int num;
//        size=input.nextInt();
//        for(int i =0 ;i<size;i++){
//            System.out.println("enter the value in this array at position "+ (i+1));
//            num=input.nextInt();
//            number.add(i,num);
//
//
//        }
//        if(number.size()<2){
//            System.out.println("the array are less than 2 try again");
//        }
//        System.out.println(number);
//        if(number.getFirst()==number.getLast()){
//            System.out.println("the number at last and first are equals");
//        }
//
        //ex2
        //write a java program to find the number greater than the average of numbers of a given array
//        System.out.println("enter the size of the array");
//        int siz2 = input.nextInt();
//        int greater;
//        ArrayList<Integer> greaterAverage = new ArrayList<>();
//        int i;
//        int sum = 0;
//        for (i = 0; i < siz2; i++) {
//            System.out.println("enter the elemnt in array  " + (i + 1));
//            greater = input.nextInt();
//            greaterAverage.add(i, greater);
//            sum = sum + greater;
//
//        }
//        int ave=sum/siz2;
//
//        for(int j=0;j<siz2;j++){
//            if(greaterAverage.get(j)>ave){
//                System.out.println("this number are greater the average in   " +j+"\n it is a "+greaterAverage.get(j)+"\n the average is  "+ave);
//            }
//
//        }

        //ex3 write a java program to get the larger value between first and last element of an array of integers
//        System.out.println("enter the size of array");
//        int size3=input.nextInt();
//        int num3;
//        ArrayList<Integer> lrager=new ArrayList<>();
//        for(int i =0 ; i<size3;i++){
//            System.out.println("enter the element number  "+ (i+1));
//            num3=input.nextInt();
//            lrager.add(i,num3);
//        }
//        int max=lrager.get(0);
//        for(int i =1; i<size3;i++){
//            if(lrager.get(i)>max){
//                 max= lrager.get(i);
//
//
//            }
//        }
//        System.out.println("the max number is  "+max);

        //ex 4
        //write a java program to swap the first and last element of an array and create a new array
//        System.out.println("enter the size of array");
//        int siz4=input.nextInt();
//        int value;
//        ArrayList<Integer> orginal=new ArrayList<>();
//        ArrayList<Integer> swap=new ArrayList<>();
//
//        for(int i=0 ; i<siz4;i++){
//            System.out.println("enter the number in array ");
//            value=input.nextInt();
//            orginal.add(i,value);
//            System.out.println(orginal);
//        }
//
//        for(int j=siz4-1 ; j>=0 ;j--){
//           swap.add(orginal.get(j));
//
//        }
//        System.out.println(swap);

        //ex5
        //write a program that places the odd element of an array before the even element
//        System.out.println("enter the size of array");
//        ArrayList<Integer> oddFirst=new ArrayList<>();
//        int siz5=input.nextInt();
//        int value;
//        // طريقة انشاء مصفوفة وتعبئتها من المستخدم
//        System.out.println("enter the value in an array ");
//        for(int i =0 ; i<siz5;i++){
//            value=input.nextInt();
//            oddFirst.add(i,value);
//
//        }
        //نحتاج نستد لوب عشان نبدل القيم في المصفوفة , مع حافظة اضافية اثناء التبديل
//        for(int i =0 ; i<siz5;i++){
//            if (oddFirst.get(i)%2==0){
//                //العدد زوجي ندل للوب الثانية
//                for(int j=i+1;j<siz5;j++){
//                    if( oddFirst.get(j) %2 != 0){//العدد فردي
//                        int val= oddFirst.get(i);//حفظ الزوجي
//                        //حفظتنا قيمة المتغير الفردي نحتاج نبدلها مع قيمة المتغير الزوجي من اللوب الاولى
//                        oddFirst.set(i,oddFirst.get(j));// odd
//                        //بدلنا قيمة المتغير i
//                        oddFirst.set(j,val);
//                        break;
//                    }
//
//                }
//            }
//        }
//        System.out.println("Array after putting odd number first  "+oddFirst);
        //ex6
        //write a program that test the equality of two arrays
        System.out.println("enter the size of array 1 and two");
        int siz6=input.nextInt();
        ArrayList<Integer> arra1=new ArrayList<>();
        ArrayList<Integer> arra2=new ArrayList<>();
        int val6;
        //تعبئة كل المصفوفتين
        for(int i =0;i<siz6;i++){
            System.out.println("enter the number in arra1 item  "+(i+1));
            val6=input.nextInt();
            arra1.add(i,val6);
        }
        for(int j =0;j<siz6;j++){

            System.out.println("enter the number in arra2 item  "+(j+1));
            val6=input.nextInt();
            arra2.add(j,val6);
        }
        int equal=0;
        for(int k = 0 ;k<siz6;k++){
            if(arra1.get(k)==arra2.get(k)){
                equal++;

            }
        }
        if(equal==siz6){
            System.out.println("this array are equal");

        }else
            System.out.println("this array are not equal"+"\n the score of equality is "+equal);


        System.out.println(arra1);
        System.out.println(arra2);

    }
}