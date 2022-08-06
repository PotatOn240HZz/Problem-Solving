// https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule


class Solution {
public:
    int minDifficulty(vector<int>& jobDifficulty, int d) {
        if(jobDifficulty.size()<d)
            return -1;
        if(jobDifficulty.size()==d)
        {
            int sum=0;
            for(int i=0;i<jobDifficulty.size();i++)
                sum+=jobDifficulty[i];
            return sum;
        }
        if(d==1)
        {
            int max=jobDifficulty[0];
            for(int i=1;i<jobDifficulty.size();i++)
                if(max<jobDifficulty[i])
                    max=jobDifficulty[i];
            return max;
        }
        
        vector <int> range;
        vector <int> maxes;
        vector <int> binary;
        range.resize(d);
        maxes.resize(d+1);
        binary.resize(d+1,1);
        maxes[d]=-1;
        range[0]=0;
        binary[0]=1;
        binary[d]=d;
            for(int j=d-1;jobDifficulty.size()*jobDifficulty.size()!=binary[d] && j>=0;j--)
            {
                if(binary[j]!=jobDifficulty.size()-d+1)
                {
                    binary[j]++;
                    binary[d]++;
                    for(int k=j+1;k<binary.size()-1;k++)
                    {
                        binary[d]-=binary[k]-1;
                        binary[k]=1;
                    }
                    j=binary.size()-1;
                    if(binary[d]==jobDifficulty.size())
                    {
                        int range2=binary[d];
                        for(int i=range.size()-1;i>=0;i--)
                        {
                            range[i]=range2-binary[i];
                            range2=range[i];
                        }


                        for(int i=0;i<range.size();i++)
                        {
                            if(i==0)
                            {
                                int tempMax=jobDifficulty[0];
                                for(int j=1;j<range[i+1];j++)
                                        if(tempMax < jobDifficulty[j])
                                            tempMax=jobDifficulty[j];
                                maxes[0]=tempMax;
                            }
                            else if(i == range.size()-1)
                            {
                                int tempMax=jobDifficulty[range[i]];
                                for(int j=range[i]+1;j<jobDifficulty.size();j++)    
                                        if(tempMax < jobDifficulty[j])
                                            tempMax=jobDifficulty[j];
                                maxes[maxes.size()-2]=tempMax;
                            }
                            else
                            {
                                int tempMax=jobDifficulty[range[i]];
                                for(int j=range[i]+1;j<range[i+1];j++)
                                        if(tempMax < jobDifficulty[j])
                                            tempMax=jobDifficulty[j];
                                maxes[i]=tempMax;
                            }
                        }


                        int sum=0;
                        for(int j=0;j<maxes.size()-1;j++)
                            sum+=maxes[j];
                        if(sum<maxes[maxes.size()-1] || maxes[maxes.size()-1]==-1)
                            maxes[maxes.size()-1]=sum;
                    }
               }
            }
        return maxes[maxes.size()-1];
    }
};
        /*
        int row;
        int max;
        int t;
        for(int i=0;i<jobDifficulty.size()-1-d;i++)
        {
            int temp;
            int tempMax=jobDifficulty[i];
            for(int j=i;j<i+d;j++)
            {
                if(tempMax < jobDifficulty[j])
                    tempMax=jobDifficulty[j];
                temp+=jobDifficulty[j];
            }
            if(temp<row || i==0)
            {
                row=temp;
                max=tempMax;
                t=i;
            }
        }
        ans1=max;
        
        
        for(int i=0;i<t;i++)
            int temp;
            int tempMax=jobDifficulty[i];
            for(int j=i;j<i+d;j++)
            {
                if(tempMax < jobDifficulty[j])
                    tempMax=jobDifficulty[j];
                temp+=jobDifficulty[j];
            }
            if(temp<row || i==0)
            {
                row=temp;
                max=tempMax;
                t=i;
            }
            */