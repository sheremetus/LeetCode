package ContainerWithMostWater;

public class Solution {


    public int maxArea(int[] height) {


        int res = 0;
        int temp ;
        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                temp = height[j] * (j - i);
                if (res < temp) {
                    res = temp;
                }

            }
        }




        return res;


    }
}
