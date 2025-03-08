package busmanagement.Service;

import java.util.ArrayList;

public class Bus {
	
	private int busNo;
	private String StartStation;
	private String DestinationStation;
	private ArrayList<Ticket> tickets;
	
	public Bus(int busNo,String StartStation,String DestinationStation) {
		this.busNo=busNo;
		this.StartStation=StartStation;
		this.DestinationStation=DestinationStation;
		tickets=new ArrayList<>();
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public void setBusNo(int busNo) {
		this.busNo=busNo;
	}
	
	public String getStartStation() {
		return StartStation;
	}
	
	public void setStartStation(String StartStation) {
		this.StartStation=StartStation;
	}
	
	public String getDestinationStation() {
		return DestinationStation;
	}
	
	public void setDestinationStation(String DestinationStation) {
		this.DestinationStation=DestinationStation;
	}
	
	public ArrayList<Ticket> getTickets(){
		return tickets;
	}
	
	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets=tickets;
	}
	
	public String toString() {
		return "Bus{"+"busNo ="+busNo+
				",StartStation ="+StartStation+
				",DestinationStation ="+DestinationStation+
				",tickets ="+tickets+"}";
	}

}
