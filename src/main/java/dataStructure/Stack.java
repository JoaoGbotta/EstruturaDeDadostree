package dataStructure;

import java.util.EventListener;

public class Stack {

    private Node top;
    private int height;

    class Node {
        //criar um nó, onde o nó vai apontar pra proximo Nó.

        int value;
        Node next;


        //criar construtor

        Node (int value){
            this.value = value;

        }
    }
    // cosntrutor da pilha
    public Stack (int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    //metodo
    public void getTop(){
        if (top == null){
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Topo: " + top.value);
        }
    }

//altura da pilha
    public void getHeigth(){
        System.out.println("Altura: " + height);
    }
    // metodo de impressão print

    public void print (){
        System.out.println("#######################");
        Node temp = top;
        //enquanto o  temp não for vazio eu vou escrever o valor que esta armazenado no temp.
        while ( temp!= null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        System.out.println("####################");

    }

    public static void main(String[] args) {


// criar pilha para codar.
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeigth();
        myStack.print();

    }


}
