class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0, j = 0; i < nums1.length; i++)
        {
            if(nums1[i]==0 && j <= nums2.length-1)
            {
                nums1[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
        for(int i = 0; i < nums1.length; i++)
            System.out.print(nums1[i]);
    }
}