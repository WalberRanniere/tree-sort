package tree_sort;

public class Node {
    private Object elemento;
    private Node pai, filhoEsquerdo, filhoDireito;

    public Node(Object elemento, Node pai) {
        this.elemento = elemento;
        this.pai = pai;
        this.filhoDireito = null;
        this.filhoEsquerdo = null;
    }

    public Object getElement() {
        return elemento;
    }
    public void setElement(Object elemento) {
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
