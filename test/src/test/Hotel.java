package test;

public class Hotel {
    private int roomNumber;
    private String name;
    private int telefonNumber;
    private String guestId;
    private int numberofGuests;


    public Hotel(int roomNumber, String name, int telefonNumber, String guestId, int numberofGuests){

        this.roomNumber = roomNumber;
        this.name = name;
        this.telefonNumber = telefonNumber;
        this.guestId = guestId;
        this.numberofGuests = numberofGuests;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(int telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public int getNumberofGuests() {
        return numberofGuests;
    }

    public void setNumberofGuests(int numberofGuests) {
        this.numberofGuests = numberofGuests;
    }


}


