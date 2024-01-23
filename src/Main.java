public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------Example for UnOrderedLinearSearch");
        int[] unOrdArr = {22,43,12,-9,0,32};
        int index = UnOrderedLinearSearch(unOrdArr,12);
        System.out.println("Element found at index " + index);
        index = UnOrderedLinearSearch(unOrdArr,8);
        System.out.println("Element found at index " + index);
    }

    public static int UnOrderedLinearSearch(int[] unSortedArray,int number){
        for (int i=0;i<unSortedArray.length;i++){
            if (unSortedArray[i]==number){
                return i;
            }
        }
        return -1;
    }
}