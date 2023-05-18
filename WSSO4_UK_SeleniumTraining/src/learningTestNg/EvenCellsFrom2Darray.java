package learningTestNg;

import java.util.Scanner;

public class EvenCellsFrom2Darray {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row size");
		int row_size=sc.nextInt();
		System.out.println("Enter Col size");
		int col_size=sc.nextInt();
		int[][] array=new int[row_size][col_size];
		int total=row_size*col_size;
		int sum=0;
		System.out.println("Enter "+total+" values of the array");
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < col_size; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < col_size; j++) {
				if(i%2==0&&j%2==0) {
					sum=sum+array[i][j];
				}
			}
		}
		
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < col_size; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(sum);
		
	}

}
