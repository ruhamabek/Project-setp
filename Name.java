public class Name {
    //This comment is from Hayat MohammedSherif
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // This comment is from Gelila Dereje
    //This commit is from Ruhama Bekele
    // This is a second comment from Gelila Dereje

    //this is merge from Ruhama
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