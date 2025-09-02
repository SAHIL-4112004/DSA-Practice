/**
 * Problem: Intersection of Two Arrays (leetcode 349)
 * Link: https://leetcode.com/problems/intersection-of-two-arrays/submissions/1757332605/
 * Approach : Binary Search
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);

        Set<Integer> result = new HashSet<>();

        for(int n : nums1){
            if(binarySearch(nums2, n)) result.add(n);
        }

        int[] arr = new int[result.size()];
        int i=0;
        for(int n : result){
            arr[i++] = n;
        }

        return arr;
    }

    public static boolean binarySearch(int[] nums2, int key){
        int left = 0;
        int right = nums2.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(nums2[mid]==key) return true;
            else if(nums2[mid]>key) right = mid-1;
            else left=mid+1;
        }

        return false;
    }
}