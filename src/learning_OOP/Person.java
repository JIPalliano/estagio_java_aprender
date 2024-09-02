package learning_OOP;

public class Person {
    private String firstName, lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age>0 && age<100 ? 0:age;
    }

    public Boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){
        if(getFirstName().isEmpty() && getLastName().isEmpty()){
            return "";
        }
        if(getFirstName().isEmpty()){
            return getLastName();
        }
        if(getLastName().isEmpty()){
            return getFirstName();
        }
        return getFirstName()+" "+getLastName();
    }

}
