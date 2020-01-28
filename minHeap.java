import static java.lang.Math.floor;

public class minHeap {
    int[] heap;
    int size;
    int maxSize;

    public minHeap(int[] A) {
        heap = A;
        this.size = A.length;
        maxSize = A.length - 1;
    }

    private void swap(int i1, int i2) {
        int temp = heap[i1];
        heap[i1] = heap[i2];
        heap[i2] = temp;
    }

    private void BuildminHeap(int[] A) {
        this.size = A.length;
        for (int i = (int) floor(A.length / 2); i >= 1; i--) {
            minHeapify(A,size, i);
        }
    }

    private void minHeapify(int[] A,int size, int i) {
        int s = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < size && A[l] < A[s])
            s = l;
        if (r < size && A[r] < A[s])
            s = r;
        if (s != i) {
            swap(i,s);

            minHeapify(A, size,s);
        }
    }


    public void HeapSort(int[] A) {
        BuildminHeap(A);
        int size = A.length;
        for (int i = size-1; i >= 2; i--) {
            swap(1, i);
            size--;
            minHeapify(A,size,1);
        }

    }

}





