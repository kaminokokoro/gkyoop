package ex2;

public class App {
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        int[] arr1= new int[5];
        for (int i=0; i<5; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            arr1[i]=randomInt;
        }
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        print(arr1);
        System.out.println();
        int[] arr2=new int[5];
        System.arraycopy(arr1,0,arr2,0,5);
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        BubbleSort bb = new BubbleSort();
        int count=bb.sort(arr2);

        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10
        System.out.println("Using Bubble Sort Algorithm:");
        System.out.print("Before sorting: ");
        print(arr1);
        System.out.println();
        System.out.print("After sorting: ");
        print(arr2);
        System.out.println();
        System.out.println("Number of swap: "+count);

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10
        System.arraycopy(arr1,0,arr2,0,5);
        SelectionSort selectionSort= new SelectionSort();
        count=selectionSort.sort(arr2);
        System.out.println("Using Selection Sort Algorithm:");
        System.out.print("Before sorting: ");
        print(arr1);
        System.out.println();
        System.out.print("After sorting: ");
        print(arr2);
        System.out.println();
        System.out.println("Number of swap: "+count);

        System.arraycopy(arr1,0,arr2,0,5);
        InsertionSort insertionSort= new InsertionSort();
        count=insertionSort.sort(arr2);
        System.out.println("Using Insertion Sort Algorithm:");
        System.out.print("Before sorting: ");
        print(arr1);
        System.out.println();
        System.out.print("After sorting: ");
        print(arr2);
        System.out.println();
        System.out.println("Number of swap: "+count);

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
    }
    public static void print(int[] arr ){
        System.out.print("[");
        for(int i =0; i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[arr.length-1]+"]");
    }

}
