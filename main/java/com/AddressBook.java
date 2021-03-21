package com;

public class AddressBook {
    public static void main(String[] args) {
        String firstName,lastName,address,city,state,zipCode,phoneNumber;

        System.out.println("Welcome To Address Book");
        System.out.println("Enter First Name");
        firstName=GetData.getStringValue();
        System.out.println("Enter Last Name");
        lastName=GetData.getStringValue();
        System.out.println("Enter Address");
        address=GetData.getStringValue();
        System.out.println("Enter City");
        city=GetData.getStringValue();
        System.out.println("Enter State");
        state=GetData.getStringValue();
        System.out.println("Enter Zip");
        zipCode=GetData.getStringValue();
        System.out.println("Enter phone number");
        phoneNumber=GetData.getStringValue();
        int choice,i=0;
        final Menu menu = new Menu();
        while(i==0)
        {
            System.out.println("--- Address Book Management ---\n");
            System.out.println("\t--MENU--");
            System.out.println("1: Add New Person      ");
            System.out.println("2: Edit Person     ");
            System.out.println("3: Display Records     ");
            System.out.println("4: Exit		       \n");
            System.out.println(" -----------------------");
            System.out.println("--- Enter Your Choice ---");
            choice = GetData.getIntValue();
            switch(choice)
            {
                case 1 :
                    menu.addPerson();
                    break;
                case 2 :
                    menu.display();
                    menu.editPerson();
                    break;
                case 3 :
                    i=1;
                    break;
                default :
                    System.out.println("Please Enter Valid Option!!!");
            }
        }
    }
}

