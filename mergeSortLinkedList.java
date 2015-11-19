
public class mergeSortLinkedList extends LinkedListNode{
	
	public void sort(Node n){
		Node tmp = n;
		
		MergeSort(tmp);
	}
	
	Node a;
	Node b;
	
	public void MergeSort(Node headRef){
		
		
		Node head1 = headRef;
	
		if(head1 == null || head1.next == null){
			return;
		} 
		
		Node Euler = splitList(head1);
		printList(Euler);
		
	}
	
	/* perform merge sort on the linked list */
	
	public Node splitList(Node head1){
		
		Node slow;
		Node fast;
		Node left, right;
		
		
		if(head1 == null || head1.next == null){
			left  = head1;
			right = null;
			
			return head1;
		}
		else{
			
			slow = head1;
			fast = head1.next;

			
			while(fast!=null){
				
				fast = fast.next;
				
				if(fast!=null){
					
					slow = slow.next;
					fast = fast.next;
				}
			}
			
			left = head1;
			right = slow.next;

			slow.next = null;
		
			//return splitList(head1,left, right);
		}
		
	/*
		System.out.println("left.data "+left.data+" - "+"left.next.data "+left.next.data );
		System.out.println("right.data "+right.data+" - "+"right.next.data "+right.next.data );
		
		
		Node h1 = splitList(left);
		Node h2 = splitList(right);
		
		System.out.println(h1.data+" - "+h1.next.data );
		Node merged = SortedMerge(h1, h2);
		return merged;
	*/
		
		return SortedMerge(splitList(left),splitList(right));
	}
	
	/* merge the lists.. */
	public Node SortedMerge(Node a, Node b){

		//	System.out.println("...Inside sorted_merge..."+a.data+ " "+b.data);
	
		Node result = null;
		
		if(a == null){
			return b;
		}
		else if( b == null){
			return a;
		}
		
		if(a.data < b.data){
			result = a;
			result.next = SortedMerge(a.next, b);
		}
		else{
			result = b;
			result.next = SortedMerge(a,b.next);
		}
		
		return result;
	}
	
	
	
	public void printList(Node Euler){
		System.out.println("\nPrinting sorted elements");
		Node Ref = Euler;
	
		while(Ref!=null){
			
			System.out.println(" "+Ref.data);
			Ref = Ref.next;
		}
	}
	
}
