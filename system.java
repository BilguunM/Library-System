

import java.util.Scanner;

public class system {
	librarian lib;
	book bk;
	bookCategory bc;
	student st;	
	ArrayList<book> book = new ArrayList<>();
	ArrayList<student> student = new ArrayList<>();
	Scanner input = new Scanner(System.in);

	public system() {
		lib = new librarian("Tsetseg", "lib_001","212");
		st = new student("15b1seas1232", "Ganbold", "Hulan","SHD-16khoroo-32-14", 99080706);
		st = new student("15b1seas2136", "Batbold", "Otgonbileg", "SHD-16khoroo-32-14", 377663471);
		student.add(st);
		bc = new bookCategory("001", "Gadaad nom");
		bc = new bookCategory("002", "Bailgaliin uhaanii nom");
		bk= new book("bk001","magadlal statistic","Nomin",2012, 50);
		Menu();		
	}
	
void inputPin() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an account : ");
		String acc = input.next();
		if(!lib.passCheck(acc)){
			inputPin();
		}
		
		System.out.print("Enter a pin : ");
		String pin = input.next();
		
		if(!lib.passCheck(pin)){
			inputPin();
			}
	
	void checkbook(int id) {
		System.out.print("Enter a book id: ");
		String bookid = input.nextLine();
		
		String[] a=bookid.split(" ");
		int k=0;
		for(int i=0; i<a.length; i++) {
			//System.out.println(a[i]);
			for (k = 0; k < book.size(); k++) {
				if (book.get(k).bookIdCheck(a[i])) {
					System.out.println("\t"+book.get(k).toString());
					student.get(id).bookList.add(book.get(k));
					
					break;
				}
			}
			if(k== book.size()) {
				System.out.println(a[i] + " ene nom baihgui bna");
			}
		}	
		System.out.println("\n\t"+student.get(id).toString());
	}
		}
	}

    public void Menu() {
		int choice;
		boolean boo=true;
		inputPin();
		Scanner in = new Scanner(System.in);
		
		while(boo) {
			System.out.println("\t-----------------------------------------------------");
			System.out.println("\t\t\t Main menu");
			System.out.println("\t1. Book issue\t2. book remove\t3. Search  4. Add book\t 5. Exit");
			System.out.println("\t-----------------------------------------------------");
			
			System.out.print("Enter an choice : ");
			choice=in.nextInt();
			System.out.println(" ");
			
			switch(choice) {
			case 1: 
				System.out.print("Enter a student id: ");
					break;
			case 2:{
				System.out.print("Enter a student id: ");
				break;
			}			
			case 3:{
				System.out.print("Enter a name of book: ");
				break;
			}
			case 4:{
				System.out.print("Enter a name of book: ");
				break;
			}
			case 5:
				System.out.println("ta systemees garlaa");
			//	inputPin();
				System.exit(0);
				break;
			default:
				System.out.println("Your choice is wrong! Please try again. ");
				break;
				
			}			
		}
    }

	public static void main(String[] args) {
	new system();

	}

}
