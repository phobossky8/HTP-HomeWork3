package by.ldy.hw3.ex5;

	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Fraction[] frArr = enterArr();
			show(frArr);

		}


		public static Fraction[] enterArr(){
			Scanner scan = new Scanner(System.in);
			
			int k = 0;
			int numerator = 0;
			int denominator = 0;

			System.out.print("������� ����������� ��������� �������: ");
			
			while(scan.hasNext()) {
				if (scan.hasNextInt()) {
					k = scan.nextInt();
					if (k >= 1) {
						break;
					} else {
						System.out.println("���������� ��������� �� ����� ���� ������ 1");
						System.out.println("������� ����������� ��������� �������: ");
					}
				} else {
					System.out.println("���������� ��������� ������� ������ ���� ����� ������");
					System.out.println("������� ����������� ��������� �������: ");
					scan.next();
				}
			}

			Fraction[] frArr = new Fraction[k];


			for(int i = 0; i < k; i++){

				System.out.print("\n�����" + (i+1) + " ���������: ");

				while (!scan.hasNextInt()) {
					System.out.println("�������� ����� ������ ���� �����!");
					System.out.print("�����" + (i+1) + " ���������: ");
					scan.next();
				}
				numerator = scan.nextInt();


				System.out.print("�����" + (i+1) + " �����������: ");

				while(scan.hasNext()) {
					if (scan.hasNextInt()) {
						denominator = scan.nextInt();
						if (denominator != 0) {
							break;
						} else {
							System.out.println("����������� �� ����� ���� ����� ����!");
							System.out.print("�����" + (i+1) + " �����������: ");
						}
					} else {
						System.out.println("�������� ����� ������ ���� �����");
						System.out.print("�����" + (i+1) + " �����������: ");
						scan.next();
					}
				}

				frArr[i] = new Fraction(numerator, denominator);
				frArr[i].reduction();
			}

			return frArr;
		}

		public static void show(Fraction[] frArr){

			System.out.println("\n�������� ������ ������: ");

			for(int i = 0; i < frArr.length; i++){
				System.out.println((i+1) + ": " + frArr[i].getNumerator() + "/" + frArr[i].getDenominator());
			}
		}

	
}
