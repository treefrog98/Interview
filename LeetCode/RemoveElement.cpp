class RemoveElement {
public:
    int removeElement(vector<int>& nums, int val) {
        if(nums.size() == 0){
            return 0;
        }
        // bounds
        int left = 0;
        int right = nums.size() - 1;

        while (nums[right] == val) {
            right--;
        }

        // loop up checking if an element == val
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
                while (nums[right] == val) {
                    right--;
                }
            }
            left++;
        }
        return left;
    }
};
