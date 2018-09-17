package anything;
public class Palin {
	class Node
	{
	    String data;
	    Node next;
	 
	    Node(String d)
	    {
	        data = d;
	        next = null;
	    }
	}
	 
	class Palindrome
	{
	    Node head;
	 
	      boolean isPalidromeUtil(String str)
	    {
	        int length = str.length();
	 
	           for (int i=0; i<length/2; i++)
	            if (str.charAt(i) != str.charAt(length-i-1))
	                return false;
	 
	        return true;
	    }
	 
	     boolean isPalindrome()
	    {
	        Node node = head;
	        String str = "";
	        while (node != null)
	        {
	            str = str.concat(node.data);
	            node = node.next;
	        }
	        return isPalidromeUtil(str);
	    }
	 
	     public void main(String[] args)
	    {
	        Palindrome list = new Palindrome();
	        list.head = new Node("112");
	        list.head.next=new Node("11");
	        System.out.println(list.isPalindrome());
	 
	    } }  }
	

