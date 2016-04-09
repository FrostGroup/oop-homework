package library;

public class Name extends Author {

    private String phone;

    public Name (String name, String surname, String phone){
        super(name, surname);
        setName(name);
        setSurname(surname);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
    @Override
    public String toString() {
        return "Name"+'\n' +
                "phone = " + phone + '\n' +
                "name = " + getName() + '\n' +
                "surnam = " + getSurname();
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(obj == null || obj.getClass() != Name.class){
            return false;
        }

        Name temp = (Name) obj;

        return this.getName().equals(temp.getName()) &&
                this.getSurname().equals(temp.getSurname()) &&
                phone.equals(temp.phone);
    }
}
