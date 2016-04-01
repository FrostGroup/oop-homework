package oop.homework.week2.studentsubject;


public class Address {
    private String city;
    private String street;
    private String house;
    private String apartment;

    public Address(String city, String street, String house, String apartment){
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public void showAddress(){
        System.out.println(city);
        System.out.println(street);
        System.out.println(house);
        System.out.println(apartment);
    }

    public String getCity(){
        return city;
    }

    public String getStreet(){
        return street;
    }

    public String getHouse(){
        return house;
    }

    public String getApartment(){
        return apartment;
    }


}
