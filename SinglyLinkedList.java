
import java.util.*;

public class SinglyLinkedList {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Singly Linked List:\n");
		
		LinkedListNode ll = new LinkedListNode();
		
		
		
		do{
			
			System.out.println("1.Insert At begining");
			System.out.println("2.Insert At position");
			System.out.println("3.Insert At End");
			
			System.out.println("4.Remove at Begining");
			System.out.println("5.Remove at End");
			System.out.println("6.Remove at position");
			
			System.out.println("7.Check Empty Status");
			System.out.println("8.Size");
			
			int choice =  sc.nextInt();
			
			switch(choice)
			{
			
			case 1:
				System.out.println("Enter element to insert:BEGINING");
				ll.insertAtStart(sc.nextInt());
				break;
				
			case 2:
				System.out.println("Enter element to insert:AT POSITION");
				int elem = sc.nextInt();
				
				System.out.println("Enter position to insert");
				int pos = sc.nextInt();
				
				if(pos<1 || pos>ll.size){
					
					System.out.println("Invalid choice of position");
				}else{
					
					ll.insertAtPos(elem, pos);
				}
				break;
				
			case 3:
				System.out.println("Enter element to insert:END");
				ll.insertAtEnd(sc.nextInt());
				break;
				
			case 4:
				System.out.println("Enter element to remove:BEGINING");
				ll.removeAtFirst();
				break;
				
			case 5:
				System.out.println("Enter element to remove:END");
				ll.removeAtEnd();
				break;
			
			case 6:
				System.out.println("Enter element to remove:AT POSITION");
				
				System.out.println("Enter position to remove an element");
				int pos1 = sc.nextInt();
				
				if(pos1<1 || pos1>ll.size){
					
					System.out.println("Invalid choice of position");
				}else{
					
					ll.removeAtPos(pos1);
				}
				break;
				
			case 7:
				System.out.println("Empty Staus:"+ll.isEmpty());
				break;
				
			case 8:
				System.out.println("Size:"+ll.getSize());
				break;
				
			default:
				System.out.println("Invalid entry");
			}
			
		System.out.println("Traversing Inside LinkedList:");
		ll.traverse();
			
		System.out.println("\nDo you want to continue(y/n)");
		ch = sc.next().charAt(0);
		}
		while(ch =='y'||ch == 'Y');
		
		System.out.println("Final Result of Linked_List");
		Node myList = ll.traverse();
		
		System.out.println("\n-------myList:"+myList.data+ "-"+myList.next.data+"-"+myList.next.next.data+"-"+myList.next.next.next.data);
		/*
		//ll.retEle();
		Node head = new Node();
		*/
		new mergeSortLinkedList().sort(myList);
		
	}

}
