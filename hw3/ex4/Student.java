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
		System.out.println("������ ����� �������� - " + studentID);
		System.out.println("��� �������� - " + name);
		System.out.println("������� �������� - " + surname);
		System.out.println("�������� �������� - " + patronymic);
		System.out.println("���� �������� �������� - " + dateOfBirth);
		System.out.println("����� �������� - " + address);
		System.out.println("��������� - " + faculty);
		System.out.println("���� - " + course);
	}

	public void someInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���������� � ������� �� ������ �����?");
		System.out.println(
				"������� �����, ��� ��������� ��������������� ����������: 1 - ID, 2 - ���, 3 - �������, 4 - ��������, 5 - ���� ��������, 6 - �����, 7 - ���������, 8 - ����, 0 - ���������� ������");

		int num = 1;
		
		while (num != 0) {
			num = sc.nextInt();
			if (num == 1)
				System.out.println("������ ����� �������� - " + studentID);			
			else if (num == 2)
				System.out.println("��� �������� - " + name);
			else if (num == 3)
				System.out.println("������� �������� - " + surname);
			else if (num == 4)
				System.out.println("�������� �������� - " + patronymic);
			else if (num == 5)	
				System.out.println("���� �������� �������� - " + dateOfBirth);
			else if (num == 6)
				System.out.println("����� �������� - " + address);
			else if (num == 7)
				System.out.println("��������� - " + faculty);
			else if (num == 8)
				System.out.println("���� - " + course);
			else if (num == 0) {
				System.out.println("����� ���������!");
				break;
			}
			System.out.println("������ �� �� ����� ��� ���-������?");
			
		}
		
		
	}
	
}
