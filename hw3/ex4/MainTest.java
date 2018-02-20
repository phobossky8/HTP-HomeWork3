package by.ldy.hw3.ex4;

public class MainTest {

	public static void main(String[] args) {

		Customer cus1 = new Customer(123, "Ivan", "Ivanov", "Yurevich", "01.11.1982", "Pobedy,5", "1234 1234 1234",
				"№ 155");
		Customer cus2 = new Customer(123, "Petr", "Petrov", "Andreevich", "11.11.1992", "Belogo,11", "5487 2394 1583",
				"№ 155");

		Student st1 = new Student(21245, "Андрей", "Факов", "Урюпович", "15.10.1980", "Glebki,2",
			"029 591-15-16", "Компьютерные сети", 3);
		Student st2 = new Student(15665, "Роман", "Защитов", "Алибегович", "11.11.1982", "Krasnaya,4",
				"044 753-12-12", "ФИТУ", 1);
		
		cus1.fullInfo();
		System.out.println("--------------------------");
		cus2.optionInfo();
		
		System.out.println("--------------------------");
		
		st1.information();
		System.out.println("--------------------------");
		st2.someInfo();
		
	}
	
}
