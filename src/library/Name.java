package library;

public class Name {
    private String name;
    private String surname;
    private String phone;

    public Name (String name, String surname, String phone){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public Name (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getPhone(){
        return phone;
    }
}
