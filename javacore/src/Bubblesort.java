public class Bubblesort {
    public static void main(String[] args) {
        int array[] = {142, 18, 38, 17, 92};
        System.out.println("Before Sorting:");
        for (int k=0;k<array.length;k++) {
            System.out.println(array[k]);
        }

        //bubble sorting
        int temp;
        for (int i = 0; i < array.length; i++) {
            int flag = 0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        System.out.println("After Sorting:");
        for (int k=0;k<array.length;k++) {
            System.out.println(array[k]);
        }
    }
}

