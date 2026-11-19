class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,res,current,candidates,target);
        return res;
    }
    public void backtrack(int index,List<List<Integer>> res, List<Integer> current, int[] candidates, int target){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i==index || candidates[i]!=candidates[i-1] && candidates[i]<=target){
                current.add(candidates[i]);
                backtrack(i+1,res,current,candidates,target-candidates[i]);
                current.remove(current.size()-1);
            }
        }
    }
}