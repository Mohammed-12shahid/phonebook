package projj;
import java.util.*;
public class MyClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,PhoneBook> pb=new HashMap<>();
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
            	 int pno=sc.nextInt();
            	 System.out.println("enter name");
            	 String na=sc.next();
            	 System.out.println("enter address");
            	 String ad=sc.next();
            	 pb.put(pno, new PhoneBook(pno,na,ad));
            	 break;
            case 2:
            	   for (Map.Entry<Integer, PhoneBook> en : pb.entrySet()) {
                   int pnoo = en.getKey();
                   PhoneBook pp = en.getValue();
                   System.out.println("pno " + pnoo + ", Name: " + pp.getName() + ",Address: "+pp.getAddress());
            	   }
            	   break;
            case 3:System.out.println("enter phone number that you want to delete");
            		int pnoo=sc.nextInt();
            		PhoneBook deletedpno = pb.remove(pnoo);
                    
                    if (deletedpno != null) {
                        System.out.println("phone number= " + deletedpno.getphNo() + " has been deleted.");
                    } else {
                        System.out.println("phone number  " + pnoo + ". Nothing to delete.");
                    }
                    break;
            case 4:System.out.print("Enter the phone number you want to update ");
            		int pnooo = sc.nextInt();
                    PhoneBook pno1 = pb.get(pnooo);
                    if (pno1 != null) {
                    	System.out.print("Enter the  name to be updated: ");
                    	String updatedName = sc.next();
                    	pno1.setName(updatedName);
                    	pb.put(pnooo, pno1); // Update the employee in the map
                    	System.out.println("phone nember " + pnooo + " has been updated with the name " + updatedName + ".");
                    } else {
                    	System.out.println("No phone number " + pnooo + ". Nothing to update.");
                    }
                    break;
            case 5:System.out.print("Enter the phone number you want to search ");
            		int p=sc.nextInt();
            		PhoneBook po1 = pb.get(p);
            		if (po1 != null) {
                        System.out.println("phone nummber found:  " + po1.getphNo() + ", Name: " + po1.getName() + ",Address: "+po1.getAddress());
                    } else {
                        System.out.println("No phone number " + p + ".");
                    }
            case 6:System.exit(0);
            default:System.out.println("invalid choice");
            		
            }
            }
            
		}
	}


