package Java_practice.Arrays;

public class ArrayClass {
    public static void main(String[] args) {

        int [][] jagged = new int[3][];
        jagged [0] = new int[]{80,90};
        jagged [1] = new int []{70,85,95};
        jagged [2] = new int [] {100};

        for(int i = 0; i < jagged.length;i++){
            System.out.println(i);
            for(int j = 0 ; j<jagged[i].length;j++){
                System.out.println(jagged[i][j]+ " ");
            }
        }


    }
}
