package LooseCoupling;

public class BinarySearchImpl {
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int BinarySearch(int[] numbers, int n)
    {
        //implementation of sort
        int[] sortAlgo = sortAlgorithm.Sort(numbers);
        System.out.println(sortAlgorithm);
        //logic
        return 3;
    }
}
