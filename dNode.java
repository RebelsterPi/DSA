package anything;

public class dNode {
	int data;
	dNode next;
	dNode prev;
	dNode head;
	dNode t;
	dNode(){}
	dNode (int d){
		data=d;
		next=null; 
		prev=null;

	}
	//============Insertion===============

	void insertAtdFirst() {
		dNode n= new dNode();
		if (head ==null) {
			head=n;}
		else {n.next=head;
			head.prev=n;}
			}
	void insertAtdPos(int pos) {
		dNode t= head;
		dNode n = new dNode();
		for (int i=1;i<pos-1;i++) {
			n.next=t.next;
			n.prev=t;
			t.next.prev=n;
			t.next=n;
				
		}
		}	
    void insertAtdLast() {
	dNode n= new dNode();
	if (head == null) {head=n;}
	else {dNode t= head;
	while(t.next!=null) {t=t.next;
	n.prev=t;
	t.next=n;} }
	}	
    //============delete===============
    void DeletedFirst() {
    	if(head==null) {
    		System.out.println("Empty");
    	}
    	if (head.next==null)
    			{head=null;}
    	else {dNode t=head;
    	head=head.next;
    	head.prev=null;
    	t.next=null;
    	}
    }
    void DeletedPos(int pos) {
    	if(head == null) {
    		System.out.println("Empty");
    	}
    	else {
    		dNode no=head;
    		for(int i=0;i<pos-1;i++) {
    			no=no.next;
    			dNode n1=no.next;
    			no.next=n1.next;
    			n1.next.prev=no;
    			n1=null;
    		}
    	}
    }
    void DeletedLast() {
    	if(head==null) {
    		System.out.println("Empty");
    	}
    	else {
    		dNode t = new dNode();
    	while(t.next!=null) {
    		t=t.next;
    	}
    	t.prev.next=null;
    	}
    }
    //============print func===============
    public void printList() {
		dNode n = head;
		System.out.print("|");
		while (n != null) {
			System.out.print(" "+n.data + " |");
			
			n = n.next;
		}
		System.out.println("");
	}
}
