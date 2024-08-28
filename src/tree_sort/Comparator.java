package tree_sort;

public class Comparator {
    public int compare(Object x, Object y){
        try{
            int a = (int) x;
            int b = (int) y;

            if(a > b){
                return 1;
            } else if (b > a){
                return -1;
            } else {
                return 0;
            }
        } catch(Exception error) {
            System.out.println("Apresentou um erro!");
        }
        return 0;
    }

}
