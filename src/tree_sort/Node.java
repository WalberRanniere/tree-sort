package tree_sort;

public class Node {
    private Object elemento;
    private Node pai, filhoEsquerdo, filhoDireito;

    public Node(Object elemento, Node pai, Node filhoEsquerdo, Node filhoDireito) {
        this.elemento = elemento;
        this.pai = pai;
        this.filhoEsquerdo = filhoEsquerdo;
        this.filhoDireito = filhoDireito;
    }

    public Node(Object elemento) {
        this.elemento = elemento;
        this.pai = null;
        this.filhoDireito = null;
        this.filhoEsquerdo = null;
    }

    public Object getElemento() {
        return elemento;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Node getPai(){
        return pai;
    }

    public void setPai(Node pai){
        this.pai = pai;
    }

    public Node getFilhoEsquerdo(){
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(Node filhoEsquerdo){
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public Node getFilhoDireito(){
        return filhoDireito;
    }

    public void setFilhoDireito(Node filhoDireito){
        this.filhoDireito = filhoDireito;
    }

}
