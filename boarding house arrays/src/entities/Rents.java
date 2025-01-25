package entities;

public class Rents {
    private String name;
    private String email;
    private int room;

    public Rents(){}

    public Rents(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }


    public String toString() {
        return room +
                ": " +
                name +
                ", " +
                email;
    }

    public String getName() {
        return name;
    }

    public int getRoom() {
        return room;
    }

    public String getEmail() {
        return email;
    }



}
