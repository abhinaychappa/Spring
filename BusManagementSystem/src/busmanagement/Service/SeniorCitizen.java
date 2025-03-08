package busmanagement.Service;

public class SeniorCitizen extends Passenger {


	private int age;
	
	public SeniorCitizen(String passengerName, String gender, String source, String destination) {
		super(passengerName, gender, source, destination);
		this.age=age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "SeniorCitien{"+"age"+age+"}";
	}
}
