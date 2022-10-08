package Practice;

public class Flight {
    public int number;
    public String destination;

    public Flight() {
        this.number = 0;
        this.destination = "";
    }

    public Flight(int flightNumber, String destination) {
        if (flightNumber > 0){
            if(destination != "") {
                this.number = flightNumber;
                this.destination = destination;
            } else {
                this.number = 0;
                this.destination = "";
            }
        } else {
            this.number = 0;
            this.destination = "";
        }
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public void display(){
        System.out.println(this.number + ", " + this.destination);
    }



}

