package projj;
import java.util.*;
public class MyClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String,PhoneBook> pb=new HashMap<>();
		while(true) {
			System.out.println("Phonebook Menu:");
            System.out.println("1. Add contact");
            System.out.println("2. display contacts");
            System.out.println("3. Delete contact");
            System.out.println("4. Update contact");
            System.out.println("5. Search contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); 
            switch(choice) {
            case 1:System.out.println("enter phone number");
            	 String pno=sc.next();
               	 System.out.println("enter name");
            	 String na=sc.next();
            	 System.out.println("enter address");
            	 String ad=sc.next();
            	 if(vali.valPhNo(pno)){
            	 pb.put(pno, new PhoneBook(pno,na,ad));
            	 }else {
            		 System.out.println("phone number is not in correct format");
            	 }
            	 break;
            case 2:
            	   for (Map.Entry<String, PhoneBook> en : pb.entrySet()) {
                   String pnoo = en.getKey();
                   PhoneBook pp = en.getValue();
                   System.out.println("pno " + pnoo + ", Name: " + pp.getName() + ",Address: "+pp.getAddress());
            	   }
            	   break;
            case 3:System.out.println("enter phone number that you want to delete");
            String pnoo=sc.next();
            		PhoneBook deletedpno = pb.remove(pnoo);
                    
                    if (deletedpno != null) {
                        System.out.println("phone number= " + deletedpno.getphNo() + " has been deleted.");
                    } else {
                        System.out.println("phone number  " + pnoo + ". Nothing to delete.");
                    }
                    break;
            case 4:
            		while(true) {
            			System.out.println("Enter A to update Name: ");
            			System.out.println("Enter B to update address: ");
            			char choice1=sc.next().charAt(0);
            			
            			if (choice1== 'A') {
            					System.out.println("Enter the phone number you want to update ");
            					String pnooo = sc.next();
				                 PhoneBook pno1 = pb.get(pnooo);
				                 if (pno1 != null) {
				                    System.out.println("Enter the  name to be updated: ");
				                    String updatedName = sc.next();
				                    pno1.setName(updatedName);
				                    pb.put(pnooo, pno1); // Update the employee in the map
				                    System.out.println("phone nember " + pnooo + " has been updated with the name " + updatedName + ".");
				                 } else {
				                    System.out.println("No phone number " + pnooo + ". Nothing to update.");
				                 }
				                 break;
            			}
            			if(choice1=='B') {
            					 System.out.println("Enter the phone number you want to update ");
            					 String pnoooo = sc.next();
            					 PhoneBook pno11 = pb.get(pnoooo);
            					 if (pno11 != null) {
            						 System.out.println("Enter the  address to be updated: ");
            						 String updatedAddress = sc.next();
            						 pno11.setAddress(updatedAddress);
            						 pb.put(pnoooo, pno11); 
            						 System.out.println("phone nember " + pnoooo + " has been updated with the address " + updatedAddress + ".");
            					 } else {
            						 System.out.println("No phone number " + pnoooo + ". Nothing to update.");
            					 }
            					 break;
            							}
            					}
            		break;
			case 5:System.out.println("Enter the phone number you want to search ");
					String p=sc.next();
            		PhoneBook po1 = pb.get(p);
            		if (po1 != null) {
                        System.out.println("phone nummber found:  " + po1.getphNo() + ", Name: " + po1.getName() + ",Address: "+po1.getAddress());
                    } else {
                        System.out.println("No phone number " + p + ".");
                    }
            		break;
            case 6:System.exit(0);
            default:System.out.println("invalid choice");
            		
            }
            }
            
		}
	}


