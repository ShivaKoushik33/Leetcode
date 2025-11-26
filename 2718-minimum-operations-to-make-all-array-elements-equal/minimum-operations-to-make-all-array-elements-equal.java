class Solution {
    public int bs(int arr[],int l,int h,int k){
      while(l<=h){
            int mid=(l+h)/2;
            if(k==arr[mid]){
                return mid;
            }
            if(k>arr[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
      } 
      return l;
        
       
    }
    public List<Long> minOperations(int[] nums, int[] queries) {
        // List<Long> l=new ArrayList<>();
        // long sum=0;
        // for(int i=0;i<queries.length;i++){
        //         sum=0;
        //     for(int j=0;j<nums.length;j++){
        //         sum+=(Math.abs(nums[j]-queries[i]));
        //     }
        //     l.add(sum);
        // }
        // return l;



        //optimal
        long sum=0;
        Arrays.sort(nums);
        List<Long> l=new ArrayList<>();
      long prefix[] = new long[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        

        int n=nums.length;
        for(int i=0;i<queries.length;i++){
           int id=bs(nums,0,nums.length-1,queries[i]);
        //    System.out.println(id);
           long left=0,right=0;
        //    l.add(
        //     Math.abs(queries[i]*(id-1)-prefix[id-1])+
        //    Math.abs((prefix[nums.length-1]-prefix[id+1])-queries[i]*(nums.length-1-id))+
        //    (long)Math.abs(queries[i]-nums[id]) 
        //     );


            if(id>0){
                left=(long)queries[i]*(id)-prefix[id-1];
            }
            if(id<n){
                right=(prefix[n-1]-(id==0?0:prefix[id-1]))-((long)queries[i]*(n-id));
            }
                l.add(left+right);

        }
        return l;
    }
}