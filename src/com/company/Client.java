package com.company;

public class Client {
    private String firstName;
    private String lastName;
    private int point;
    MembershipType membershipType;

    public Client(String firstName, String lastName, int point) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.point = point;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    /*
    public void trade(Trade trade, int point) {
        trade.setPrice(point);
        if (trade.getPrice() > 0){
            if (trade.getPrice() < 10){

            }
        }
    }
    */
    public void trade() {
        // trades less than 10 falls in bronze membership
        if (point < 10) {
            // first trade sets membership to bronze
            if (point == 0) {
                Bronze bronze = new Bronze();
                setMembershipType(bronze);
                point++;
            }
            point++;
        } else if (point <19) {
            // points are less than 19 falls in silver membership
            if (point == 10){
                // points equal to 10 sets membership to silver
                Silver silver = new Silver();
                setMembershipType(silver);
                point++;
            }
            point++;
        } else if (point >= 20) {
            if (point == 20) {
                Gold gold = new Gold();
                setMembershipType(gold);
                point++;
            }
            point++;
        }
    }


}
