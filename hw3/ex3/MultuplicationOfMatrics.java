package by.ldy.hw3.ex3;

import java.util.Random;
import java.util.Scanner;

public class MultuplicationOfMatrics {

	public static void main(String[] args) {
		int[][] mas = enterArray();
		printArray(mas);
		System.out.println("-----------");
		printArray(mas);
	}

	public static int[][] enterArray() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter size of array: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter INTEGER type of size: ");
		}

		int size = sc.nextInt();
		int[][] mas = new int[size][size];

		for (int i = 0; i < size; i++) {
			mas[i] = new int[size];
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				mas[i][j] = rand.nextInt(10);
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
	
	public static int[][] changeStringsOfArray(int[][]arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите номер строки от 1 до " + arr.length + ", элементы которой хотите помен€ть:");
		
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.print("¬ведите корректную цифру: ");			
		}
				
		int firstStr = sc.nextInt();
							
		System.out.print("¬ведите номер строки от 1 до " + arr.length + ", с которой будете мен€ть элеметы:");
		
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.print("¬ведите корректную цифру: ");
		}
		
		int secondStr = sc.nextInt();
		
		
		int[] temp1 = new int[arr.length];
		int[] temp2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			temp1[i] = arr[firstStr-1][i];
			temp2[i] = arr[secondStr-1][i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[firstStr-1][i] = temp2[i];
			arr[secondStr-1][i] = temp1[i];
		}
		
		return arr;

	}

}
