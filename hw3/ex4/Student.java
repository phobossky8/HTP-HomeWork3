package by.ldy.hw3.ex4;

import java.util.Scanner;

public class Student {
	private int studentID;
	private String name;
	private String surname;
	private String patronymic;
	private String dateOfBirth;
	private String address;
	private String telephoneNumber;
	private String faculty;
	private int course;

	public Student() {

	}

	public Student(int studentID, String name, String surname, String patronymic, String dateOfBirth, String address,
			String telephoneNumber, String faculty, int course) {
		this.studentID = studentID;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.faculty = faculty;
		this.course = course;

	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getPatronymic() {
		return patronymic;
	}
	
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;		
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public int getCourse() {
		return course;
	}
	
	public void setCourse(int course) {
		this.course = course;
	}
	
	public void information() {
		System.out.println("Личный номер студента - " + studentID);
		System.out.println("Имя студента - " + name);
		System.out.println("Фамилия студента - " + surname);
		System.out.println("Отчество студента - " + patronymic);
		System.out.println("Дата рождения студента - " + dateOfBirth);
		System.out.println("Адрес студента - " + address);
		System.out.println("Факультет - " + faculty);
		System.out.println("Курс - " + course);
	}

	public void someInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Какую информацию о клиенте вы хотите знать?");
		System.out.println(
				"Введите цифру, для получения соответствующей информации: 1 - ID, 2 - Имя, 3 - Фамилия, 4 - Отчество, 5 - Дата рождения, 6 - Адрес, 7 - Факультет, 8 - Курс, 0 - завершение работы");

		int num = 1;
		
		while (num != 0) {
			num = sc.nextInt();
			if (num == 1)
				System.out.println("Личный номер студента - " + studentID);			
			else if (num == 2)
				System.out.println("Имя студента - " + name);
			else if (num == 3)
				System.out.println("Фамилия студента - " + surname);
			else if (num == 4)
				System.out.println("Отчество студента - " + patronymic);
			else if (num == 5)	
				System.out.println("Дата рождения студента - " + dateOfBirth);
			else if (num == 6)
				System.out.println("Адрес студента - " + address);
			else if (num == 7)
				System.out.println("Факультет - " + faculty);
			else if (num == 8)
				System.out.println("Курс - " + course);
			else if (num == 0) {
				System.out.println("Конец программы!");
				break;
			}
			System.out.println("Хотите ли вы знать еще что-нибудь?");
			
		}
		
		
	}
	
}
