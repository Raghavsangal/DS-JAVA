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
    public static LinkedList delete(LinkedList list,int key){
    Node l=list.head,prev =null;
    if(l!=null && l.data==key){
        list.head=l.next;
        return list;
    }
    while(l!=null && l.data!=key){
        prev=l;
        l=l.next;
    }
    if(l!=null){
        prev.next=l.next;
    }
    if(l==null){
        System.out.print(key + "not found");
    }
        return list;
    }
    public static LinkedList deleteAt(LinkedList list,int pos){
        if(pos==1){
            list.head=list.head.next;
        }
        else{
            Node temp=list.head;
            for(int i=0;i<pos-2;i++){
                temp=temp.next;
            }
//            Node temp2=temp.next;
            temp.next=temp.next.next;
        }
        return list;
    }
    public static LinkedList reverse(LinkedList list){
        Node prev=null;
        Node current = list.head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        list.head=prev;
        return list;
    }
}
public class Main{
    public static void main(String[] args){
        LinkedList list= new LinkedList();
        list=list.insert(list,1);
        list=list.insert(list,2);
        list=list.insert(list,3);
        list.print(list);
        list.delete(list,2);
        list.print(list);
        list=list.insert(list,4);
        list.print(list);
        list.deleteAt(list,3);
        list.print(list);
        list.reverse(list);
        list.print(list);
    }
}
