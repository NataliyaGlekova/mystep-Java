package teach.homework.hw6.hw6_5;

public class Array2 {

        public static void main(String[] args) {
            int[] arrive_1;
            int[] arrive_2;
            int count=0;
            int index=0;
            arrive_1=new int[10];
            for (int i=0; i<arrive_1.length; i++ ){
                arrive_1[i]= (int) (10+Math.random()*50);
                System.out.println(i+" "+arrive_1[i]);
                if(arrive_1[i]>25){count++;
                }
            }
            System.out.println(count);
            arrive_2=new int[count];
            for (int i=0; i<arrive_1.length; i++){

                if(arrive_1[i]>25){

                    arrive_2[index]=arrive_1[i];
                    System.out.println(index+". "+arrive_2[index]);
                    index++;
                }
            }
        }
    }

