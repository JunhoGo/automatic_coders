package dealut;
public class Person {
   private int current_station;
   private int dest_station;
   private int person_seat;

   Person(){   
      current_station = 0 ;
      dest_station = 0 ;
      person_seat = 0;
   }
   public void setPersonSeat(int seat) {//
      this.person_seat = seat;
      }
   public void setCurrentStation(int currentStation) {//
      this.current_station = currentStation;
      }
   public void setDestinationStation(int destinationStation) {//
      this.dest_station = destinationStation;
      }
   public int getPersonSeat() {
      return person_seat;
   }
   public int getCurrentStation() {
      return current_station;
   }
   public int getDeststation() {
		// TODO Auto-generated method stub
	    return dest_station;
	}
   public int getSeat() {
      return person_seat;
   }

}