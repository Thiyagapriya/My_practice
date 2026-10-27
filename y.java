class Main {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,20};
        int target = 20;

        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}