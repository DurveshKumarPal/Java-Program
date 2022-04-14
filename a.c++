class Solution {
public:
    int removeDuplicates(vector<int>& Nums) {
        
        {
            if(Nums.size() == 0 )
                return 0;
            int k=1;
            int n = Nums.size();
            for(int j=1;j<k;j++)
            {
                if(!Nums[j]==Nums[j-1])
                {
                   Nums[k]=Nums[j];
                     k++;
                }
            }
            return k;
        } 
    }
};
