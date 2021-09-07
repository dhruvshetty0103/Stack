package com.linkedlist.stack;

/* Linked list program reused to implement stack
 * Stack Node
 * Constructor to create a new node
 * Next is by default initialized as null
*/
class Node 
{
    int data;
    Node next;
    Node(int d)
    { 
    	data = d;
    }
}
public class Stack 
{
	static Node head; // head of list
    
	// Method to insert a new node
    public static Stack insert(Stack list, int data)
    {
    	// Create a new node with given data
        Node newNode = new Node(data);
        // If the Linked List is empty,then make the new node as head
        if (list.head == null) 
        	list.head = newNode;
        else 
        {
        	//Adding the new node at the beginning according to use case 2
        	newNode.next = head;
            head=newNode;
        }
        // Return the list by head
        return list;
    }
   
    // Method to print the LinkedList.
    public static void printList(Stack list)
    {
        Node currNode = list.head;
        System.out.print("Stack: ");
    
        // Traverse through the LinkedList
        while (currNode != null) 
        {
            // Print the data at current node and go to next node
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        Stack list = new Stack();
   
        // Insert the values
        list = insert(list,70);
        list = insert(list,30);
        list = insert(list,56);
   
        // Print the LinkedList
        printList(list);
    }
}