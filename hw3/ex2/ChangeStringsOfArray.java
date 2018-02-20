package by.ldy.hw3.ex2;

import java.util.Random;
import java.util.Scanner;

public class ChangeStringsOfArray {
	public static void main(String[] args) {

		int size = askAboutSizeOfArrays();

		int[][] mas1 = enterArray(size);
		int[][] mas2 = enterArray(size);

		printArray(mas1);
		printArray(mas2);

		int[][] mas3 = sumOfArrays(mas1, mas2);

		printArray(mas3);
		
		int[][] multArr = multiArrays(mas1, mas2);
		
		printArray(multArr);
	}

	public static int askAboutSizeOfArrays() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter INTEGER type of size: ");
		}
		int size = sc.nextInt();
		return size;
	}

	public static int[][] enterArray(int size) {

		Random rand = new Random();

		int[][] mas = new int[size][size];

		for (int i = 0; i < size; i++) {
			mas[i] = new int[size];
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				mas[i][j] = rand.nextInt(10) + 1;
			}
		}
		return mas;
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("-----------");

	}

	public static int[][] sumOfArrays(int[][] arr1, int[][] arr2) {
		int[][] mas3 = new int[arr1.length][arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				mas3[i][j] = arr1[i][j] + arr2[i][j];

			}
		}
		return mas3;
	}
	
	public static int[][] multiArrays(int[][]arr1, int[][]arr2){
		int[][] mas4 = new int [arr2.length][arr2.length];
		for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr2.length; j++) {
                for(int k = 0; k < arr2.length; k++) {
                    mas4[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
		return mas4;
	}

}
