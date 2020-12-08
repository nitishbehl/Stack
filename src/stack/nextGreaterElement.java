package stack;

public class nextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (nums2[j] != nums1[i]) {
                j++;
                for (int k = j; k < nums2.length; k++) {
                    if (nums2[k] > nums1[i]) {
                        result[i] = nums2[k];
                        break;
                    }
                }
                result[i] = -1;
            }
        }
        return result;

    }


}

