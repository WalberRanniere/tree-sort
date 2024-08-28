package tree_sort;
import java.util.Iterator;

public interface InterfaceArvoreBinariaPesquisa {

    //MÉTODOS GENÉRICOS
    public int size();

    public int height();

    public boolean isEmpty();

    public Iterator<Node> nos(); 

    public Iterator<Node> elements(); 

    //MÉTODOS DE ACESSO
    public Node root();

    public Node parent(Node node);

    public Iterator<Node> children(Node node);

    //MÉTODOS DE CONSULTA
    public boolean isInternal(Node node);

    public boolean isExternal(Node node);

    public boolean isRoot(Node node);

    public int depth(Node node);

    //MÉTODOS DE ATUALIZAÇÃO
    public Object replace(Node node, Object elemento);

}
