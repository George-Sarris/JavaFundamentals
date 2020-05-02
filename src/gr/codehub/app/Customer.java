package gr.codehub.app;

import java.util.ArrayList;

public class Customer {
    private int idCustom;
    private String Name;
    private String Surname;
    private String HomeAddress;
    private String MobileNumber;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Customer(int id, String name, String surname, String homeAddress, String mobileNumber) {
        this.idCustom = id;
        Name = name;
        Surname = surname;
        HomeAddress = homeAddress;
        MobileNumber = mobileNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setHomeAddress(String homeAddress) {
        HomeAddress = homeAddress;
    }

    public void setMobileNumber(String mobileNumber) {
        this.MobileNumber = mobileNumber;
    }

    public int getIdCustom() {
        return idCustom;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustom=" + idCustom +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", HomeAddress='" + HomeAddress + '\'' +
                ", mobileNumber='" + MobileNumber + '\'' +
                '}';
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayCustomers (){

        customers.forEach(System.out::println);
    }

    public void removeCustomer (int index){
        if (index>=0 && index < customers.size()){
            customers.remove(index);
        }
    }

    public void clear_All_Customers() {
        customers.clear();
    }



}
