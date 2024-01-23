public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------Example for UnOrderedLinearSearch");
        int[] unOrdArr = {22,43,12,-9,0,32};
        int index = UnOrderedLinearSearch(unOrdArr,12);
        System.out.println("Element found at index " + index);
        index = UnOrderedLinearSearch(unOrdArr,8);
        System.out.println("Element found at index " + index);


        System.out.println("-------------------------Example2 for OrderedLinearSearch");
        int[] ordArr = {8,9,43,47,95,100,302};
        int index2 = OrderedLinearSearch(ordArr,100);
        System.out.println("Element found at index " + index2);
        index2 = OrderedLinearSearch(ordArr,22);
        System.out.println("Element found at index " + index2);
    }

    public static int UnOrderedLinearSearch(int[] unSortedArray,int number){
        for (int i=0;i<unSortedArray.length;i++){
            if (unSortedArray[i]==number){
                return i;
            }
        }
        return -1;
    }

    public static int OrderedLinearSearch(int[] sortedArray,int number){
        for (int i=0;i<sortedArray.length;i++){
            if (sortedArray[i]==number){
                return i;
            }
            if (sortedArray[i]>number){
                break;
            }
        }
        return -1;
    }
}