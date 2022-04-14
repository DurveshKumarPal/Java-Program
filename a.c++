class Solution {
public:
    int removeDuplicates(vector<int>& Nums) 
        
        {
            if(Nums.size() == 0 )
                return 0;
            int k=1;
            int n = Nums.size();
            for(int i=1;i<k;i++)
            {
                if(!Nums[i]==Nums[i-1])
                {
                   Nums[k]=Nums[i];
                     k++;
                }
            }
            return k;
        
    }
};
