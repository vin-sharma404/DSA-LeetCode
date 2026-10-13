class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int units=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize>=boxTypes[i][0]){
                units+=boxTypes[i][1]*boxTypes[i][0];
                truckSize-=boxTypes[i][0];
            }
            else{
                units+=boxTypes[i][1]*truckSize;
                truckSize=0;
            }
            if(truckSize==0){
                break;
            }
        }
        return units;
    }
}