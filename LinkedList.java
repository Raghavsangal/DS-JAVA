import java.io.*;

class LinkedList{
    Node head;
   static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static LinkedList insert(LinkedList list,int data){
        Node n=new Node(data);
        n.next=null;
        if(list.head==null){
            list.head=n;
        }
        else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=n;
        }
        return list;
    }
    public static void print(LinkedList list){
        Node currNode=list.head;
        System.out.print("LinkedList: ");
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
    }
}
public class Main{
    public static void main(String[] args){
        LinkedList list= new LinkedList();
        list=list.insert(list,1);
        list=list.insert(list,2);
        list=list.insert(list,3);
        list.print(list);
        
    }
}