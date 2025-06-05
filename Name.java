public class Name {
    //This comment is from Hayat MohammedSherif
    private String firstName;
    private String lastName;
    public String nickName;
    public String doubleName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Name (String doubleName, String nickName){
        this.doubleName=doubleName;
        this.nickName=nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}