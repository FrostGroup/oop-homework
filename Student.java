package oop.homework.week2;

import oop.homework.week2.Subject;



public class Student {

    private Subject[] subjects = new Subject[5];
    private Address address;
    private Name name;

    public Student ( Address address, Name name ){
        this.address = address;
        this.name = name;
    }

    public Subject [] addSubject (Subject subject){
        int temp = 0;
        for (int i = 0; i <subjects.length ; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                temp++;
                break;
            }
        }
        if (temp == 0) {
            System.out.println("Subject full!!!");
            return subjects;
        }
        else {
            System.out.println("Create new subject, thank you");
            return subjects;
        }
    }

    public Subject study (Subject subject, int workingHours){
        for (int i = 0; i <subjects.length ; i++) {
            if (subjects[i] != null && subjects[i].getName() == subject.getName()){
                subjects[i].setWorkingHoursStudent(subject.getWorkingHoursStudent() + workingHours);
                break;
            }
        }
        return subject;
    }

    public Subject removeLastSubject(){
        Subject subject = new Subject();
        for (int i = subjects.length - 1; i >= 0  ; i--) {
            if (subjects[i] != null){
                System.out.println(subjects[i].getName() + "  remove");
                subject = subjects[i];
                subjects[i] = null;
                break;
            }
        }
        return subject;
    }

    public void showAllSubject(){
        for (int i = 0; i < getSubject().length ; i++) {
            if (getSubject()[i] != null) {
                System.out.println(getSubject()[i].getName() + ": Name");
                System.out.println(getSubject()[i].getHoursSemester() + ": HoursSemester");
                System.out.println(getSubject()[i].getStudentSubjectRating() + ": StudentSubjectRating");
                System.out.println(getSubject()[i].getWorkingHoursStudent() + ": WorkingHoursStudent");
                System.out.println();
            }
        }
    }

    public int averageRatingAllSubject(){
        int temp = 0;
        int rating = 0;
        for (int i = 0; i <getSubject().length ; i++) {
            if (getSubject()[i] != null){
                temp++;
                rating += getSubject()[i].getStudentSubjectRating();
            }
        }
        return rating /= temp;
    }

    public Subject[] getSubject(){
        return subjects;
    }

    public Address getAddress(){
        return address;
    }

    public Name getName(){
        return name;
    }

    public void setSubject (Subject[] subjects){
        this.subjects = subjects;
    }

    public void setAddress (Address address){
        this.address = address;
    }

    public void setName (Name name){
        this.name = name;
    }
}
