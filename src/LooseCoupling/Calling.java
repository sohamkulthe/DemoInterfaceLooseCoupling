package LooseCoupling;

public class Calling {
    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
        int result = binarySearch.BinarySearch(new int[] {3,4,5,2,1},4);
        System.out.println(result);
    }
}
