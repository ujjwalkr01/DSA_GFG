package arrays2D_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class BoundarytraversalMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 1, col = 2;

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		ArrayList<Integer> ans= spiralMatrix(arr, row, col);
		System.out.print(ans);
	}

	private static ArrayList<Integer> spiralMatrix(int[][] arr, int row, int col) {
        int left=0, right=col-1;
        int top=0, down=row-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(left==0) {
        	leftToright(arr, left, right, top, list);
        	top++;
        	if(top>down){
        	    break;
        	}
        	
        	topTodown(arr, top, down, right, list);
        	right--;
        	if(left>right){
        	    break;
        	}
        	
        	rightToleft(arr, right, left, down, list);
        	down--;
        	if(top>down){
        	    break;
        	}
        	
        	downTotop(arr, down, top, left, list);
        	left++;
        	if(left>right){
        	    break;
        	}
        }
		return list;
	}
	
	public static void leftToright(int arr[][], int start, int end, int top, ArrayList<Integer> list) {
		
		for(int i=start;i<=end;i++) {
			System.out.print(arr[top][i]+" ");
			list.add(arr[top][i]);
		}
	}
	
	public static void topTodown(int arr[][], int start, int end, int right, ArrayList<Integer> list) {
		
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i][right]+" ");
			list.add(arr[i][right]);
		}
	}
	public static void rightToleft(int arr[][], int start, int end, int down, ArrayList<Integer> list) {
		
		for(int i=start;i>=end;i--) {
			System.out.print(arr[down][i]+" ");
			list.add(arr[down][i]);
		}
	}
	public static void downTotop(int arr[][], int start, int end, int left, ArrayList<Integer> list) {
		
		for(int i=start;i>=end;i--) {
			System.out.print(arr[i][left]+" ");
			list.add(arr[i][left]);
		}
	}
	

}
