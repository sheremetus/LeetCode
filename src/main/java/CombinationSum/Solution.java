package CombinationSum;

import java.util.ArrayList;
import java.util.List;




public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        backtrack(res,currentList,target,0,candidates);

        return res;


    }

    public void backtrack(List<List<Integer>> result, List<Integer> current, int target, int index,int[] candidates) {

        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(current));
        }
        for (int i = index; i < candidates.length; i++) {
            current.add(candidates[i]);

            backtrack(result, current, target-candidates[i], i,candidates);
            current.remove(current.size() - 1);
        }


    }
}
