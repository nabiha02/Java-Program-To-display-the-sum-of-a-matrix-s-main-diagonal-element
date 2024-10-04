import java.util.Scanner;

public class Lab4_task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[100][100];

        System.out.println("Enter the Matrix: ");
        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
              matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("The Matrix is: ");
        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int sum =0;
        for(int i=0;i<3;i++){

                sum = sum + matrix[i][i];
        }
        System.out.println("The sum of it's main diagonal element is: "+sum);
    }
}
