public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(bin(arr, 5));
    }

    public static int _bin(int[] arr, int target, int startNum, int endNum) {
        int middleNum = (startNum + endNum) / 2;
        if (startNum > endNum) {
            return -1;
        } else if (target == arr[middleNum]) {
            return middleNum;
        } else if (target > arr[middleNum]) {
            return _bin(arr, target, middleNum + 1, endNum);
        } else {
            return _bin(arr, target, startNum, middleNum - 1);
        }
    }

    public static int bin(int[] arr, int target) {
        return _bin(arr, target, 0, arr.length - 1);
    }
}
