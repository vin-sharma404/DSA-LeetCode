class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        backtrack(0,candidates,current,res,target);
        return res;
    }
    public void backtrack(int index, int[] candidates, List<Integer> current, List<List<Integer>> res, int target ){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        if(index==candidates.length){
            return;
        }
        if(candidates[index]<=target){
            current.add(candidates[index]);
            backtrack(index,candidates,current,res,target-candidates[index]);
            current.remove(current.size()-1);
        }
        backtrack(index+1,candidates,current,res,target);
    }
}