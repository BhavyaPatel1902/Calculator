import java.util.ArrayList;
import java.util.List;

public class Calculator
{
    public int add(String number)
	{
        String[] nums;
        String temp;
        String temp1=input;
        if(number.startsWith("//")) 
		{
            if(number.charAt(2) != '[') 
			{
                temp = Character.toString(number.charAt(2));
                temp1 = number.substring(4);
            } 
			else 
			{
                List<Integer> v1 = new ArrayList<>();
                int begin = number.indexOf('[');
                while (begin >= 0) 
				{
                    v1.add(begin);
                    begin = number.indexOf('[',begin + 1);
                }

                List<Integer> v2 = new ArrayList<>();
                int end=number.indexOf(']');
                while(end>=0)
				{
                    v2.add(end);
                    end=number.indexOf(']',end+1);
                }

                int last = v2.get(lst.size() - 1);

                StringBuilder s = new StringBuffer();
                int n = v1.size();
                temp = s.toString();
                temp1 = number.substring(last + 2);
            }
        }
        else 
		{
            temp1 = ("[,\n]");
        }
        nums=temp1.split(temp);
        
        int sum;
        
        sum = 0;
        for(int i=0;i<nums.size();i++) 
		{
            if(nums[i] <= 1000)
			{
                sum += nums[i];
            }
        }
        return sum;
    }
}

class Main
{
    public static void main(String []args)
    {
        Calculator c;
        
        String s = "12,13";
        
        int ans = add(s);
        
        System.out.println(ans);
    }
}
 

