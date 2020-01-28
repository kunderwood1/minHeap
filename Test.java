import static java.lang.Math.floor;

public class Test {
/*   private int[] Heap;
    private int size;
    private int maxsize;
    minHeap()

    public int getSize() {
        return size;
    }

    public int getMaxsize() {
        return maxsize;
    }

    public minHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
    }
    public int getMin(){
        return Heap[size];
    }

    private int parent(int i) {
        return i / 2;

    }

    private int leftChild(int i) {

        return (2 * i);
    }

    private int rightChild(int i) {
                return (2 * i) + 1;
    }

    public void print()
    {

        for (int i = 1; i <= size ; i++) {
            System.out.print( Heap[i]);
            System.out.println();
        }
    }
    private void swap(int i1, int i2) {
        int temp = Heap[i1];
        Heap[i1] = Heap[i2];
        Heap[i2] = temp;
    }

    public void insert(int key) {
        if(this.size<=this.maxsize) {
            if(size==0){
                Heap[size] = key;
                size++;
            }else
            size++;
            Heap[size] = key;
            int cur = size;

            while (Heap[cur] < Heap[parent(cur)]) {
                swap(cur, parent(cur));
                cur = parent(cur);
            }
        }else{
            swap(size,key);
            minHeapify(Heap,0);

        }
    }

    private boolean isLeaf(int i) {
        if (i >= (size/ 2) && i <=size) {
            return true;
        }
        return false;
    }

*//*
    private void minHeapify(int i) {
        if (!isLeaf(i)) {
            if (Heap[i] > Heap[leftChild(i)] || Heap[i] > Heap[rightChild(i)]) {
                if (Heap[leftChild(i)] >= Heap[rightChild(i)]) {                              //<----work here
                    swap(i, leftChild(i));
                    minHeapify(leftChild(i));
                } else {
                    swap(i, rightChild(i));
                    minHeapify(rightChild(i));
                }
            }
        }

    }
*//*
private void minHeapify(int arr[], int n, int i)
{
    int smallest = i; // Initialize smallest as root
    int l = 2 * i + 1; // left = 2*i + 1
    int r = 2 * i + 2; // right = 2*i + 2

    // If left child is smaller than root
    if (l < n && arr[l] < arr[smallest])
        smallest = l;

    // If right child is smaller than smallest so far
    if (r < n && arr[r] < arr[smallest])
        smallest = r;

    // If smallest is not root
    if (smallest != i) {
       swap(i,smallest);

        // Recursively heapify the affected sub-tree
        minHeapify(arr, n, smallest);
    }
}




    *//*
        int n = this.size;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            minHeapify(Heap,n,i);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(0, i);
            minHeapify(Heap,i,0);
        }
        Build min heap(A)
        for(i=a.length; i>=2;i--)
        swap 1,i
        Heap.size--;
        minHeapify(Heap,1);
     *//*
    }
*/


    private void minHepify(int[] a, int i) {
    }
}