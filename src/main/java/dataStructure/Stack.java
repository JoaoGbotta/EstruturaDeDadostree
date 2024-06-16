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
    // metodo push (inserir)

    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0 ){
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    //metodos de remoção

    public Node pop(){
        if (height == 0)
            return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;

    }


    public static void main(String[] args) {


// criar pilha para codar.
        Stack myStack = new Stack(2);
        myStack.push(1);

        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);

        System.out.println(myStack.pop() == null);




      /*  myStack.getTop();
        myStack.getHeigth();
        myStack.print();

        myStack.push(1);

        myStack.print();
        myStack.getTop();
        myStack.getHeigth();
*/
    }


}
