package dataStructure;



//lista ligada tem 3 campos principais. Cabeça, cauda e os campos.

public class LinkedList {


    //Cabeça da lista é um nó
    private Node head;

    //Cauda da lista é um nó
    private Node tail;

    //Tamanho da lista é um numero inteiro.
    private int length;

    class Node{

        String data;
        Node next;
//cosntrutor onde todo nó tem que ter valor armazenado
        Node(String data){
            this.data = data;
        }
    }
//construtor da lista ligado!

    public LinkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead() {
        if (this.head == null){
            System.out.println("lista Vazia");
        } else{
            System.out.println("Head: " + head.data);

        }
    }

    public void getTail() {
        if (this.tail == null) {
            System.out.println("lista Vazia");
        }else{
            System.out.println("Tail: " + tail.data);

        }
    }
    public void getLength() {
        System.out.println("length: " + this.length);
    }
    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }
    //metodo print - operação imprimir
     public void print(){
        // Nó de leitura, inicia pela cabeça da lista.
         System.out.println("#############");
        Node temp = this.head;
        //enquanto aquele nó temporario for diferente ou nulo eu vou imprimir a informação que esta dentro do nó.
        while(temp != null){
            System.out.println(temp.data);
            temp= temp.next;
        }
         System.out.println("#############");
     }
     //metodo append
    public void append(String data){
        Node newNode = new Node(data);
        if( length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node pre = head;
        Node temp = null;

        while (pre.next != tail) {
            pre = pre.next;


        }
        temp = tail;
        tail = pre;
        tail.next = null;



        length--;
        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1 ");
        list.append("elemento 2");
        list.append("elemento 3 ");

        System.out.println(list.removeLast().data);
        list.print();




        //list.getHead();
      //  list.getTail();
     //   list.getLength();
     //   list.print();
        //list.makeEmpty();
    }

}
