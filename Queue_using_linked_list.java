package com.intershala.javaapp;
class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
		this.next=null;
	}
}
public class Queue {
	Node front;
	Node rear;
	Queue(){
		this.front=null;
		this.rear=null;
	}
	void insert(int data){
		Node n=new Node(data);
		if(this.rear==null){
			this.front=this.rear=n;
		}
		this.rear.next=n;
		this.rear=n;
	}
	Node delete(){
		if(this.front==null){
			return null;
		}
		Node temp=this.front;
		this.front=this.front.next;
		if (this.front == null) {
			this.rear = null;
		}
		return temp;
	}
	public static void main(String args[]){
		Queue q=new Queue();
		q.insert(1);
		q.insert(2);
		q.insert(3);
//		q.delete();
		System.out.println("Dequeued item is "+ q.delete().data);
	}

}
