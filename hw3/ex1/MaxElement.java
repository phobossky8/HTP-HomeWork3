package by.ldy.hw3.ex1;

import java.util.Random;
import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {

		int[][] mas = initArrFromConsole();
		printArr(mas);
		findMaxElementOfString(mas);
		findMaxElementOfColumn(mas);

	}

	public static int[][] initArrFromConsole() {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int num = 0;

		System.out.print("������� ����������� �������: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("��� ������ ���� ������������� ��������. ��������� �������: ");
		}

		num = sc.nextInt();

		int[][] mas = new int[num][num];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = new int[mas.length];
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		return mas;
	}

	public static void printArr(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d", mas[i][j]);
				System.out.print(" ");
			}
			System.out.println();

		}
	}

	public static void findMaxElementOfString(int[][] mas) {  //������� ������������ �������� �� �������
		int[] max = new int[mas.length];
		for (int i = 0; i < mas.length; i++) {
			max[0] = mas[0][0];
			for (int j = 0; j < mas.length; j++) {
				if (max[i] < mas[i][j]) {
					max[i] = mas[i][j];
				}
			}
			System.out.println("���������� ������� " + (i+1) + "-�� ������ - " + max[i]);

		}
		System.out.println("-------------------------------");
	}
	
	public static void findMaxElementOfColumn(int[][] mas) { //������� ������������ �������� �� ��������
		int[] max = new int[mas.length];		
		for (int j = 0; j < mas.length; j++) {		
			for (int i = 0; i < mas.length; i++) {
				if (max[j] < mas[i][j]) {
					max[j] = mas[i][j];
				}
			}
			System.out.println("���������� ������� " + (j+1) + "-�� ������� - " + max[j]);

		}

	}
}
