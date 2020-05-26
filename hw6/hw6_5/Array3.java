package teach.homework.hw6.hw6_5;

public class Array3 {
    public static void main(String[] args) {
        int[] arrive_1;
        int[] arrive_2;
        int count1=0;
        int count2=0;
        arrive_1=new int[10];
        for (int i=0; i<10; i++ ){
            arrive_1[i]= (int) (10+Math.random()*50);
            System.out.println(i+" "+arrive_1[i]);
            if(arrive_1[i]>25){count1++;
            }
        }
        System.out.println(count1);
        arrive_2=new int[count1+1];
        for (int i=0; i<10; i++){

            if(arrive_1[i]>25){
                count2++;
                arrive_2[count2]=arrive_1[i];
                System.out.println(count2-1+". "+arrive_2[count2]);
            }
        }
    }
}
