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

			System.out.print("Введите количествео элементов массива: ");
			
			while(scan.hasNext()) {
				if (scan.hasNextInt()) {
					k = scan.nextInt();
					if (k >= 1) {
						break;
					} else {
						System.out.println("Колмчество элементов не может быть меньше 1");
						System.out.println("Введите количествео элементов массива: ");
					}
				} else {
					System.out.println("Количество элементов массива должно быть ЦЕЛЫМ числом");
					System.out.println("Введите количествео элементов массива: ");
					scan.next();
				}
			}

			Fraction[] frArr = new Fraction[k];


			for(int i = 0; i < k; i++){

				System.out.print("\nДробь" + (i+1) + " числитель: ");

				while (!scan.hasNextInt()) {
					System.out.println("Вводимое число должно быть ЦЕЛЫМ!");
					System.out.print("Дробь" + (i+1) + " числитель: ");
					scan.next();
				}
				numerator = scan.nextInt();


				System.out.print("Дробь" + (i+1) + " знаменатель: ");

				while(scan.hasNext()) {
					if (scan.hasNextInt()) {
						denominator = scan.nextInt();
						if (denominator != 0) {
							break;
						} else {
							System.out.println("Знаменатель не может быть равен нулю!");
							System.out.print("Дробь" + (i+1) + " знаменатель: ");
						}
					} else {
						System.out.println("Вводимое число должно быть ЦЕЛЫМ");
						System.out.print("Дробь" + (i+1) + " знаменатель: ");
						scan.next();
					}
				}

				frArr[i] = new Fraction(numerator, denominator);
				frArr[i].reduction();
			}

			return frArr;
		}

		public static void show(Fraction[] frArr){

			System.out.println("\nИтоговый массив дробей: ");

			for(int i = 0; i < frArr.length; i++){
				System.out.println((i+1) + ": " + frArr[i].getNumerator() + "/" + frArr[i].getDenominator());
			}
		}

	
}
