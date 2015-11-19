
public class LinkedListNode {
	
	Node head;
	Node tail;
	Node tmp;
	
	int size;
	
	public LinkedListNode(){
		
		head = null;
		tail = null;
		size = 0;
	
	}
	
	public int getSize(){
	
		return size;
	
	}
	
	public boolean isEmpty(){
	
		return head == null;
	
	}
	
	public void insertAtStart(int data){
		
		Node newNode = new Node(data,null);
		size++;
		
		if(head==null){
			
			head = newNode;
			tail = head;
		}
		else{
		
			newNode.next = head;
			head = newNode;
		}
		
	}
	
	public void insertAtEnd(int data){
		
		Node newNode = new Node(data,null);
		size++;
		
		if(head==null){
			
			head = newNode;
			tail = head;
			
		}
		else{
			
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void insertAtPos(int data, int pos){
		
		Node newNode = new Node(data,null);
		Node ptr = head;
		pos = pos-1;
		System.out.println("head"+ptr.getData()+" pos "+pos);
		
		for(int i=0;i<=size;i++){
			
			if(i == pos){
				
				Node tmp = ptr.getNext();
				ptr.next = newNode;
				newNode.next = tmp;
				break;
			}
			
			ptr = ptr.getNext();
			System.out.println("updated ptr "+ptr.getData());
		}
		
		size++;
	}
	
	public void removeAtFirst(){
		
		head = head.next;
		size--;
		System.out.println("\n");
	}
	
	public void removeAtEnd(){
		
		Node nodeTemp = head;
		

		while(nodeTemp.next != tail){
			
			nodeTemp = nodeTemp.next;		
		}
		
		System.out.println(nodeTemp.getData());
		tail = nodeTemp;		
		nodeTemp.next = null;
		size--;
		System.out.println("\n");
	}
	
	public void removeAtPos(int pos){
		
		pos = pos -1;
		Node ptr = head;
		
		for(int i=0;i<size-1;i++){
			
			if(i==pos){
				ptr.next = ptr.next.next;	
			}
			
			ptr = ptr.next;
		}
		size--;
	}
	
	public Node traverse(){
		
		Node current = head;

		while(current!=null){
			
			System.out.print("->"+current.getData());
			current = current.getNext();
		}
		return head;
	}

	/*
		
		public void mergeSort(LinkedListNode ln, int low, int high ){
			
			if(low< high){
				
				int middle = (low + high)/2;
				
				mergeSort(ln, low, middle);
				mergeSort(ln, middle+1, high);
				merge(ln, low, middle, high);				
			}
			
		}
		
		public void merge(LinkedListNode ln, int low, int middle, int high){
			
			Node current1 = head;
			Node current_temp = head;

			while(current1!=null){
				
				System.out.println(" "+current1.getData());
				current_temp.data = current1.getData();
				current1 = current1.getNext();
				current_temp = current_temp.next;
			}
			
			int i = low;
			int j = middle+1;
			int k = low;
			
			
			if(current_temp.data<=current_temp.getNext().getData()){
				current1.data = current_temp.data;
				current_temp = current_temp.getNext();
				current1 = current1.next;
			}
			else{
				current1.data = current_temp.getNext().data;
				current_temp.next = current_temp.next.next;
				current1 = current1.next;	
			}
			
		}
		*/
	
	/******************************************************/
	/*
	public Node findNthtoLast(Node head, int n){
		if(n<1||head==null){
			return null;
		}

		Node ptr1, ptr2 = head;
		
	}
	*/
	
	/*
	public void retEle(){
	System.out.println("\n");	
		Node temp = head;
		int count = 0;
		while(temp!=null){
			count++;
		//	System.out.print("->"+temp.data);		
			temp = temp.next;
		}
		*/
	
	/******************WASTE EFFORT(4 Nov)*************************/
	/*
	public Node mergeSort(Node head){
		
			if(head == null || head.next == null){
			return head;
			}
		
			int count = 0;
			Node p = head;
		
			while(p!=null){
			count++;
			p = p.next;
			}
		
			int middle = count/2;
			System.out.println("middle no "+middle);
		
			Node left = head;
			Node right = null;
		
			Node p2 = head;
			int countHalf = 0;
		
			while(p2!=null){
				countHalf++;
				Node next = p2.next;
			
				if(countHalf==middle){
					p2.next = null;
					right = next;
				}	
			
				p2 = next;
			}
		
			Node h1 = mergeSort(left);
			Node h2 = mergeSort(right);
		
			Node m = merge(h1, h2);
			return m;
			
		}
	
	public Node merge(Node left, Node right){
		
		Node no = new Node();
		Node newT = no;
		Node c = newT;
				
		while(left!=null && right != null){
			
			if(left.data <= right.data){
				//c = left;
				c.data = left.data;
				left = left.next;
			}
			else{
				//c = right;
				c.data = right.data;
				right = right.next;
			}
			c = c.next;
		}
		
		if(left!=null){
			c = left;
			c = c.next;
			left = left.next;
		}
		
		if(right!=null){
			c = right;
			c = c.next;
			right = right.next;
		}
		
		while(c!=null){
			System.out.println("=>"+c.data);
			c = c.next;
		}
		return c;
		
	}
	
	public void sort(Node head){
		mergeSort(head);
	}
	***/
	
	//public void sort(){
		
	//	new MergeSortProg().mergeSort(head);
		
	/****************6th Nov Effort*************************/
		/*
		Node myNode = head;
		Node miami1 = head;
		Node left = head;
		Node right;
		
		int count_node = 0;
		
		while(myNode!=null){
	
			count_node++;
			myNode = myNode.next;
		}
		
		int pivot = count_node/2;
	
		System.out.println("\nLeft sublist:");
		
		for(int i=0;i<pivot;i++){
			
			left.data = miami1.data;
			
			System.out.println(" "+left.data );
			
			left = left.next;
			miami1 = miami1.next;
		
		}
	//	left.next=null;
	//	System.out.println("Between "+miami1.data);
		right = miami1;
		System.out.println("\nRight Sublist");
		
		for(int i=pivot;miami1!=null;i++){
		
			right.data = miami1.data;
			
			System.out.println(" "+right.data);
			miami1 = miami1.next;
			right = right.next;
			
		}
	
		
		System.out.println("Final result is:\n");
		
			
			left = head;
	//		right = 
			
			Node result = merge_sort(left,right);
			

		
		while(result!=null){
			System.out.println(result.data);
			result = result.next;
		}
		

	}
	
	public Node merge_sort(Node left, Node right){
		
		Node result = null;
		
		System.out.println(" L: "+left+" R: "+right);
		
		if(left == null){
			return right;
		}
		
		if(right == null){
			return left;
		}
		
		if(left.data < right.data){
			
			result = left;
			result.next = merge_sort(left.next, right);
			
		}else{
			
			result = right;
			result.next = merge_sort(left, right.next);
		}
		
		return result;
		
		
		
	}*/
	

}
