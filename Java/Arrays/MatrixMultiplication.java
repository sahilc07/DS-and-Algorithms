import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns: ");
        int columns = sc.nextInt();

        int a[][] = new int[rows][columns];
        int b[][] = new int[rows][columns];
        
        if(rows == columns){
            System.out.println("Enter Matrix a: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter Matrix b: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    b[i][j] = sc.nextInt();
                }
            }

            int c[][] = new int[rows][columns];

            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    c[i][j] = 0;
                    for(int k=0; k<rows; k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Multiplied Matrix: ");
            for(int i=0; i<rows; i++){
                for(int j=0;j<columns; j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        } else{
            System.out.println("Matrix Multiplication not possible!");
        }
        sc.close();
    }
}