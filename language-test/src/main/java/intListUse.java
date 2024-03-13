import org.junit.jupiter.api.Test;

/**
 * @author c.w
 * @className intListUse
 * @description int型数组的使用
 * @date 2024/01/23
 **/
public class intListUse {

    @Test
    public void intListLength() {
        int[] nums1 = new int[]{2, 3, 4, 3, 4};
        int[] nums2 = new int[]{1, 2, 1, 2, 3};
        int rs1 = alternatingSubarray(nums1);
        int rs2 = alternatingSubarray(nums2);
        System.out.println(rs1);
        System.out.println(rs2);
    }

    public int alternatingSubarray(int[] nums) {
        int length1 = 1;
        int length2 = 1;
        int flag = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int a = check(nums, i, flag);
            if (a == flag) {
                length1++;
                length2 = Math.max(length1, length2);
                flag = -flag;
            }else {
                length2 = Math.max(length1, length2);
                length1 = 1;
                if (a == 1) i--;
                flag = 1;
            }
        }
        return length2;
    }

    public int check(int[] nums, int i, int flag) {
        if (nums[i + 1] - nums[i] == flag) {
            return flag;
        } else {
            return nums[i + 1] - nums[i];
        }
    }
}


