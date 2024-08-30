package tree_sort;
import java.util.ArrayList;
import java.util.Arrays;



public class TreeSort {

    public static void print_array(Object arr[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }

    public static void  insert_tree_elements(ArvoreBinariaPesquisa arv, Object array[]){
        for(int i = 0; i < array.length; i++){
            arv.insert(array[i]);
        }
    }

    public static void main(String[] args) {
        //1. Criando um Array e mostrando na Tela.
        Object[] array = {6, 7, 2, 8, 12, 1, 5};
        print_array(array, array.length);

        //2. Criando uma Arvore Binaria de Pesquisa e inserindo os elementos do array.
        ArvoreBinariaPesquisa arvore = new ArvoreBinariaPesquisa();
        insert_tree_elements(arvore, array);

        //3. Passando o inOrder na ABP e mostrando cada elemento ordenado.
        arvore.inOrder(arvore.getRaiz());
        System.err.println();
    }
}
