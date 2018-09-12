
package Classes;

public class Person {
    private String name;
    private final String birthdate;
    private final String placeOfBirth;
    private String occupation;
    
    public Person(String n, String bdate, String birthPlace, String job) {
       name = n;
       birthdate = bdate;
       placeOfBirth = birthPlace;
       occupation = job;
       
    }
    public void printPerson() {
        System.out.println(this.name+" "+this.birthdate+" "+this.placeOfBirth+" "+this.occupation);
    }    
    public void setName(String name){
        this.name = name;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getName() {
        return name;
    }
    public String getOccupation() {
        return occupation;
    }
}
