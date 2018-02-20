package by.ldy.hw3.ex4;

import java.util.Scanner;

public class Customer {
	private int customerID;
	private String name;
	private String surname;
	private String patronymic;
	private String dateOfBirth;
	private String address;
	private String creditCardID;
	private String bankAccountID;

	public Customer() {

	}

	public Customer(int idCustomer, String name, String surname, String patronymic, String dateOfBirth, String address,
			String creditCardID, String bankAccountID) {
		super();
		this.customerID = idCustomer;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.creditCardID = creditCardID;
		this.bankAccountID = bankAccountID;
	}

	public int getIdCustomer() {
		return customerID;
	}

	public void setIdCustomer(int idCustomer) {
		this.customerID = idCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname(String surname) {
		return surname;
	}

	public void setSurname() {
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

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreditCardNumber() {
		return creditCardID;
	}

	public void setCreditCardNUmber(String creditCardID) {
		this.creditCardID = creditCardID;
	}

	public String getBankAccountID() {
		return bankAccountID;
	}

	public void setBankAccountNumber(String bankAccountID) {
		this.bankAccountID = bankAccountID;
	}

	public void fullInfo() {
		System.out.println("��� ������� - " + name);
		System.out.println("������� ������� - " + surname);
		System.out.println("�������� ������� - " + patronymic);
		System.out.println("ID ������� - " + customerID);
		System.out.println("���� �������� ������� - " + dateOfBirth);
		System.out.println("����� ������� - " + address);
		System.out.println("ID �������� - " + creditCardID);
		System.out.println("ID ����������� ����� - " + bankAccountID);
	}

	public void optionInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���������� � ������� �� ������ �����?");
		System.out.println(
				"������� �����, ��� ��������� ��������������� ����������: 1 - ���, 2 - �������, 3 - ��������, 4 - ID, 5 - ���� ��������, 6 - �����, 7 - ID ��������, 8 - ID �����, 0 - ��� ���������� ������ � �����.");

		int num = 1;
		
		while (num != 0) {
			num = sc.nextInt();
			if (num == 1)
				System.out.println("��� ������� - " + name);
			else if (num == 2)
				System.out.println("������� ������� - " + surname);
			else if (num == 3)
				System.out.println("�������� ������� - " + patronymic);
			else if (num == 4)
				System.out.println("ID ������� - " + customerID);
			else if (num == 5)
				System.out.println("���� �������� ������� - " + dateOfBirth);
			else if (num == 6)
				System.out.println("����� ������� - " + address);
			else if (num == 7)
				System.out.println("ID �������� - " + creditCardID);
			else if (num == 8)
				System.out.println("ID ����������� ����� - " + bankAccountID);
			else if (num == 0) {
				System.out.println("����� ���������!");
				break;
			}
			System.out.println("������ �� �� ����� ��� ���-������?");
			
		}

	}
}