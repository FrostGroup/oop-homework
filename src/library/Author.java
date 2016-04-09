package library;


public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString(){
        return "Author" + '\n' +
                "name = " + name + '\n' +
                "surname = " + surname;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        if (obj == null || obj.getClass() != Author.class){
            return false;
        }

        Author temp = (Author) obj;

        return name.equals(temp.name) && surname.equals(temp.surname);
    }
}
