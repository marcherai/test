package chapter07;

public class ThisEx {

	int year;
	int month;
	int day;

	public ThisEx() {

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public ThisEx(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;

	}

	public void printThis() {
		System.out.println(this);
	}

}
