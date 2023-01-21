public class Person {
    /**Класс описывает Человека */
    private String fName;
    private String sName;
    private String bDate;
    private Gender gender;

    public Person (String firstName, String secondName, String birthDate, Gender gender) {
        this.fName = firstName;
        this.sName = secondName;
        this.bDate = birthDate;
        this.gender = gender;
    }

    public String getFirstName(){
        return this.fName;
    }

    public String getSurName() {
        return this.sName;
    }

    public String getBirthDate() {
        return this.bDate;
    }

    public Gender getGender() {
        return this.gender;
    }

   
    @Override
    public String toString() {
        return String.format("%s %s %s %s", fName, sName, bDate, gender);
    }
}

