public class bubbleSort {
    public static void main(String[] args){
        int[] order = {32,12,26,100,7,9};
        order = bub(order);
        for (int i=0;i<order.length;i++){
            System.out.print(order[i] + ",");
        }
    }
    public static int[] bub(int[] ord){
        for(int i=0;i<ord.length;i++){
            for(int j=0;j<ord.length-1;j++){
                if (ord[j] > ord[j+1]){
                    int temp = ord[j];
                    ord[j] = ord[j+1];
                    ord[j+1] = temp;
                }
            }
        }
        return ord;
    }
}
