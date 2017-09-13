package com.saral.training.Java;

import java.util.Scanner;

public class LinkedListExample {

	public static  Node insert(Node head,int data) {
		try{
		Integer x = Integer.parseInt("3");
		
		}
		catch(Exception e){
			System.err.println("bad ");
		}
		
		//Complete this method
        if(head == null){
            return new Node(data);
        }
        else if(head.next==null){
        	head.next=new Node(data);
        }
        else{
        	insert(head.next,data);
        }
        return head;
    }
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
