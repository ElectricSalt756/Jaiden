public class mergeSort {
    public static void main(String[] args) {
        int[] rray = { 4, 2, 3, 1 };
        printOut(rray);
        split(rray);
        printOut(rray);
    }

    public static void split(int[] ray) {
        _split(ray, 0, ray.length - 1);
    }

    public static void _split(int[] ray, int startNum, int endNum) {
        int middleNum = (startNum + endNum) / 2;
        if (startNum == endNum) {
            return;
        }
        _split(ray, startNum, middleNum);
        _split(ray, middleNum + 1, endNum);
        merSort(ray, startNum, endNum, middleNum);
    }

    public static void merSort(int[] arr, int startNum, int endNum, int middleNum) {
        int tempNum = startNum;
        int startNum2 = middleNum + 1;
        int[] tempArr = new int[endNum - startNum + 1];
        int i = 0;
        while (startNum <= middleNum && startNum2 <= endNum) {
            if (arr[startNum] < arr[startNum2]) {
                tempArr[i] = arr[startNum];
                i++;
                startNum++;
            } else {
                tempArr[i] = arr[startNum2];
                i++;
                startNum2++;
            }
        }
        while (startNum <= middleNum) {
            tempArr[i] = arr[startNum];
            i++;
            startNum++;
        }
        while (startNum2 <= endNum) {
            tempArr[i] = arr[startNum2];
            i++;
            startNum2++;
        }
        for (int j = 0; j < tempArr.length; j++) {
            arr[j + tempNum] = tempArr[j];
        }
    }

    public static void printOut(int[] arra) {
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + ", ");
        }
        System.out.println();
    }
}
