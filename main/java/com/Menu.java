package com;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Menu {
    List<Person> p = new ArrayList<Person>();
    List<Person> PERSON = new ArrayList<Person>();

    public void addPerson() {
        int i=0;
        String firstName = null;
        final String lastName, address, city, state, phoneNumber,zipCode;
        while(i==0) {
            System.out.print("Enter First Name : ");
            firstName = GetData.getStringValue();
            if (checkExists(firstName)) {
                System.out.println("Person Name Already Exists!!\nPlease enter different name...");
            }
            else {
                i=1;
            }
        }
        System.out.print("Enter Last Name : ");
        lastName = GetData.getStringValue();
        System.out.print("Enter Phone Number : ");
        phoneNumber = GetData.getStringValue();
        System.out.print("Enter Address : ");
        address = GetData.getStringValue();
        System.out.print("Enter city : ");
        city = GetData.getStringValue();
        System.out.print("Enter zip : ");
        zipCode = GetData.getStringValue();
        System.out.print("Enter state : ");
        state = GetData.getStringValue();

        p.add(new Person(firstName, lastName, address, city, state, phoneNumber, zipCode));
        PERSON.add(new Person(firstName,lastName,address,city,state,phoneNumber,zipCode));
    }


    public void display()
    {
        for(Person p1: p)
            for(Person person: PERSON)
            {
                System.out.println(p1);
                System.out.println(person);
            }

    }

    public void editPerson() {
        int id, choice = 0, i = 0;
        String firstName, lastName, address, city, state, phoneNumber, zipCode;
        for (Person person : PERSON) {
            System.out.println("ID: #" + PERSON.indexOf(person) + " : " + person);
        }
        System.out.print("\nEnter ID to Edit Contact : ");
        id = GetData.getIntValue();
        System.out.println(PERSON.get(id));
        while (i == 0) {
            System.out.println("What You Want to edit...\n"
                    + "\t1: Address\n"
                    + "\t2: city\n"
                    + "\t3: State\n"
                    + "\t4: Phone\n"
                    + "\t5: Zip Code\n"
                    + "\t6. Save And Exit\n");
            choice = GetData.getIntValue();
            switch (choice) {
                case 1:
                    System.out.print("Enter new Street : ");
                    address = GetData.getStringValue();
                    PERSON.get(id).setAddress(address);
                    break;
                case 2:
                    System.out.print("Enter new City : ");
                    city = GetData.getStringValue();
                    PERSON.get(id).setCity(city);
                    break;
                case 3:
                    System.out.print("Enter new State : ");
                    state = GetData.getStringValue();
                    PERSON.get(id).setState(state);
                    break;
                case 4:
                    System.out.print("Enter new Phone : ");
                    phoneNumber = GetData.getStringValue();
                    PERSON.get(id).setPhoneNumber(phoneNumber);
                    break;
                case 5:
                    System.out.print("Enter new Zip Code : ");
                    zipCode = GetData.getStringValue();
                    PERSON.get(id).setZipCode(zipCode);
                    break;
                case 6:
                    i = 1;
                    break;
                default:
                    System.out.println("Please Enter Valid Option");
            }
            System.out.println(PERSON.get(id));

        }
    }
            public void delete() {
                int id;
                for(Person p: PERSON)
                {
                    System.out.println("ID: "+PERSON.indexOf(p)+" : "+p);
                }
                System.out.print("\nEnter #ID to delete Contact : ");
                id = GetData.getIntValue();
                PERSON.remove(id);
            }
    public boolean checkExists(String firstName)
    {
        int flag=0;
        for (Person p: PERSON)
        {
            if (p.getFirstName().equals(firstName))
            {
                flag=1;
                break;
            }
        }
        if (flag==1)
        {
            return true;
        }
        return false;
    }
}




