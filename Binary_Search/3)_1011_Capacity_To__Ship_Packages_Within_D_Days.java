Input : 1) A weight array "weights"
        2) an integer variable "days"

Output : return the least weight capacityof the ship that will result 
         in all the packages on the conveyor belt being shipped within days days.

Problem Summary : We want the minimum ship capacity such that we can ship all packages within given number of days.
                  - We must load weights in order
                  - Each day we load until capacity is full
                  - If adding next item exceeds capacity → new day
                  Goal → Find smallest capacity such that total days ≤ given days.

Algorithm/Pattern to Remember : This follows the Binary Search on Answer pattern (Minimize the Maximum).
                                Binary Search Pattern (Minimize Maximum Load)
                                      left  = max(weights)      → smallest valid capacity
                                      right = sum(weights)       → largest possible capacity
                                      while left < right:
                                          mid = (left + right) / 2
                                          if canShip(mid):       
                                              right = mid        → try smaller value
                                          else:
                                              left = mid + 1     → need bigger capacity

                                canShip(capacity)
                                    Simulate loading day by day:
                                      - Start with dayCount = 1
                                      - Add items until you exceed capacity
                                      - If exceed → new day
                                      - If days > allowed → false

Time & Space Complexity :   Time Complexity → O(n log sum(weights))
                            - We perform log(sum) binary search steps
                            - Each step scans weights → O(n)
                            Space Complexity → O(1)
                            Only variables used.

Final Clean Code : 
                    class Solution {
                        public int shipWithinDays(int[] weights, int days) {
                            int left = 0, right = 0;
                            // boundaries
                            for (int w : weights) {
                                left = Math.max(left, w);
                                right += w;
                            }
                            // binary search on answer
                            while (left < right) {
                                int mid = left + (right - left) / 2;
                    
                                if (canShip(weights, days, mid)) {
                                    right = mid;      // try smaller capacity
                                } else {
                                    left = mid + 1;   // need bigger capacity
                                }
                            }
                            return left;
                        }
                        // simulation
                        private boolean canShip(int[] weights, int days, int cap) {
                            int dayCount = 1;
                            int currentLoad = 0;
                            for (int w : weights) {
                                if (currentLoad + w > cap) {
                                    dayCount++;
                                    currentLoad = 0;
                    
                                    if (dayCount > days) return false;
                                }
                                currentLoad += w;
                            }
                            return true;
                        }
                    }
