class LeadersInArray {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result= new ArrayList<>();
        int n= arr.length;
        int maxnumber= arr[n-1];
        result.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxnumber){
                maxnumber=arr[i];
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);
        return result;
        
    }
}
