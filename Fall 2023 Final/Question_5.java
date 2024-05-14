 class MaxFinder extends Thread {
    private int[] arr;
    private int max = Integer.MIN_VALUE;

    public MaxFinder(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        for (int num : arr) {
            max = Math.max(max, num);
        }
    }

    public int getMax() {
        return max;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr1 = {3, 1, -5, 10};
        int[] arr2 = {-2, 6, 7, 8, 0};
        int[] arr3 = {12, -6, 4, 2, 1};
        int[] arr4 = {10, 5, -9, 18, 7};

        MaxFinder finder1 = new MaxFinder(arr1);
        MaxFinder finder2 = new MaxFinder(arr2);
        MaxFinder finder3 = new MaxFinder(arr3);
        MaxFinder finder4 = new MaxFinder(arr4);

        finder1.start();
        finder2.start();
        finder3.start();
        finder4.start();

        finder1.join();
        finder2.join();
        finder3.join();
        finder4.join();

        int max = Math.max(Math.max(finder1.getMax(), finder2.getMax()), Math.max(finder3.getMax(), finder4.getMax()));

        System.out.println("The maximum number is " + max);
    }
}