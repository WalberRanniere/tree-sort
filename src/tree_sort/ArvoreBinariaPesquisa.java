package tree_sort;
import java.util.ArrayList;
import java.util.Iterator;

public class ArvoreBinariaPesquisa implements InterfaceArvoreBinariaPesquisa {
    private Node raiz;
    private Comparator comparator = new Comparator();
    private ArrayList<Integer> array_aux;
    private int size;


    public ArvoreBinariaPesquisa(Object elemento){
        this.raiz = new Node(elemento, null);
        this.size++;
    }

    public ArvoreBinariaPesquisa(){
        raiz = null;
        this.size = 0;
    }

    public Comparator getComparator() {
        return comparator;
    }
    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    public Node getRaiz() {
        return this.raiz;
    }
    public void setRaiz(Node v) {
        this.raiz = v;
    }

    public boolean isRoot(Node node) {
        return node == this.raiz;
    }
    public boolean isInternal(Node node) {
        return node.getFilhoEsquerdo() != null || node.getFilhoDireito() != null;
    }
    public boolean isExternal(Node node) {
        return node.getFilhoEsquerdo() == null && node.getFilhoDireito() == null;
    }

    public Node search(Node node, Object elemento) {
        if (isExternal(node)) {
            return node;
        }
        if ((int)elemento == (int)node.getElement()) {
            return node;
        }
        if (comparator.compare(elemento, node.getElement()) < 0) {
            if (node.getFilhoEsquerdo() != null) {
                return search(node.getFilhoEsquerdo(), elemento);
            } else {
                return node;
            }
        } else {
            if (node.getFilhoDireito() != null) {
                return search(node.getFilhoDireito(), elemento);
            } else {
                return node;
            }
        }
    }

    public Node insertRec(Object element) {
        Node pai = search(raiz, element);
        Node new_node = new Node(element, pai);
        if (comparator.compare(element, pai.getElement()) < 0) {
            pai.setFilhoEsquerdo(new_node);
        } else {
            pai.setFilhoDireito(new_node);
        }
        size++;
        return new_node;
    }

    public void insert(Object elemento){
        if (raiz == null) {
            raiz = new Node(elemento, null);
        } else {
            insertRec(elemento);
        }
        size++;
    }

    public void inOrder(Node raiz){
        if(raiz != null){
            inOrder(raiz.getFilhoEsquerdo());
            System.out.print(raiz.getElement()+ " ");
            inOrder(raiz.getFilhoDireito());
        }
    }
  
}
