package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public Node root;

    // Classe Node representa um nó na árvore
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        // Construtor para inicializar um nó com um valor
        public Node(int value) {
            this.value = value;
        }

        // Método para verificar se o nó é uma folha
        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }
    }

    // Método para inserir um novo nó com o valor fornecido na árvore
    public void insert(int value) {
        // Se a árvore estiver vazia, cria um novo nó raiz
        if (root == null) {
            root = new Node(value);
        } else {
            // Caso contrário, usa uma fila para inserção em ordem de nível
            Node newNode = new Node(value);
            Queue<Node> fila = new LinkedList<>();
            fila.add(root);

            while (!fila.isEmpty()) {
                Node currentNode = fila.remove();

                // Verifica o filho esquerdo do nó atual
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;  // Nó inserido, sai do loop
                } else {
                    fila.add(currentNode.left);
                }

                // Verifica o filho direito do nó atual
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;  // Nó inserido, sai do loop
                } else {
                    fila.add(currentNode.right);
                }
            }
        }

    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(final Node node){
        //E R D
        if (node == null) return;

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);

    }


        //cria man e logo em seguida criar a arvore.
        public static void main (String[]args){

            Tree tree = new Tree();
            tree.insert(37);
            tree.insert(11);
            tree.insert(66);
            tree.insert(8);
            tree.insert(17);
            tree.insert(42);
            tree.insert(72);

            System.out.println("##############");
            tree.inOrder();
            System.out.println("###############");





/*
            System.out.println(tree.root.value);
            System.out.println(tree.root.left.value);
            System.out.println(tree.root.right.value);

            System.out.println(tree.root.isLeaf());
            System.out.println(tree.root.right.isLeaf());

 */
    }
}