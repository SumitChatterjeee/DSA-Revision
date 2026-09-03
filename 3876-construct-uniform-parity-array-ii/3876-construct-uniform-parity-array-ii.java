class Solution {
    public boolean checkAllEven(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                return false;
            }
        }
        return true;
    }
    public boolean checkAllOdds(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                return false;
            }
        }
        return true;
    }
    public boolean getCount(ArrayList<Integer>arr,int k){
        int n=arr.size();
        int left=0;
        int right=n-1;
        int count=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr.get(mid)==k){
                right=mid-1;
            }
            else if(arr.get(mid)>k){
                right=mid-1;
            }
            else{
                count+=mid-left+1;
                left=mid+1;
            }

            if(count>=1){
                return true;
            }
        }

        return false;
    }
    public boolean uniformArray(int[] nums1) {
        ArrayList<Integer>arr=new ArrayList<>();

        for(int i:nums1){
            if(i%2==1){
                arr.add(i);
            }
        }

        Collections.sort(arr);

        if(checkAllEven(nums1)){
            return true;
        }

         if(checkAllOdds(nums1)){
            return true;
        }



        int n=nums1.length;

        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                if(!getCount(arr,nums1[i])){
                    return false;
                }
            }
        }

        return true;

    }
}