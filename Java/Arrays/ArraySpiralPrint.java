//Print the elements in spiral form clockwise

import java.util.*;

public class ArraySpiralPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int column = sc.nextInt();
        int a[][] = new int[row][column];
        System.out.println("Enter Array: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral Elements are: ");
        spiralPrint(a);
        sc.close();
    }
    static void spiralPrint(int a[][]){
        int top = 0, bottom = a.length-1, left = 0, right = a[top].length-1;
        int count = (bottom +1) * (right+1), dir = 1;
        while(left<=right && top<=bottom){
            if(count>0){
                if(dir == 1){
                    for(int i=left; i<=right; i++){
                        System.out.print(a[top][i]+", ");
                        count--;
                    }
                    top++;
                    dir = 2;
                }
            }
            if(count>0){
                if(dir == 2){
                    for(int i=top; i<=bottom; i++){
                        System.out.print(a[i][right]+", ");
                        count--;
                    }
                    right--;
                    dir = 3;
                }
            }
            if(count>0){
                if(dir == 3){
                    for(int i=right; i>=left; i--){
                        System.out.print(a[bottom][i]+", ");
                        count--;
                    }
                    bottom--;
                    dir = 4;
                }
            }
            if(count>0){
                if(dir == 4){
                    for(int i=bottom; i>=top; i--){
                        System.out.print(a[i][left]+", ");
                        count--;
                    }
                    dir = 1;
                    left++;
                }
            }
        }
        System.out.println("END");
    }
}
