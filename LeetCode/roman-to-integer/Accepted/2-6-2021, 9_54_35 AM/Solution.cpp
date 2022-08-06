// https://leetcode.com/problems/roman-to-integer

class Solution {
public:
    int romanToInt(string s) {
        int value=0;
        for(int i=0;i<s.size();i++)
        {
            if(s.at(i)=='I')
                value++;
            else if(s.at(i)=='V')
            {
                value+=5;
                if(i!=0 && s.at(i-1)=='I')
                    value-=2;
            }
            else if(s.at(i)=='X')
            {
                value+=10;
                if(i!=0 && s.at(i-1)=='I')
                    value-=2;
            }
            else if(s.at(i)=='L')
            {
                value+=50;
                if(i!=0 && s.at(i-1)=='X')
                    value-=20;
            }
            else if(s.at(i)=='C')
            {
                value+=100;
                if(i!=0 && s.at(i-1)=='X')
                    value-=20;
            }
            else if(s.at(i)=='D')
            {
                value+=500;
                if(i!=0 && s.at(i-1)=='C')
                    value-=200;
            }
            else if(s.at(i)=='M')
            {
                value+=1000;
                if(i!=0 && s.at(i-1)=='C')
                    value-=200;
            }
        }
        return value;
    }
};