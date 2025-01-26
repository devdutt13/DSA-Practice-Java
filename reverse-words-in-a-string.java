class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String temp = "";
        s = s.trim();
        int left = 0;
        int right = s.length();
         int f = 0;
       	while (left < right)
	{
		char ch = s.charAt(left);
		if (ch != ' ')
		{
			temp += ch;
            f =1;
		}
		else if (ch == ' ') 
		{   
            if(f==0){
                left++;
                continue;
            }
			
            else if (!ans.equals(""))
			{
				ans = temp + " " + ans;
               
			}
			else
			{
				ans = temp;
			}
			temp = "";
             System.out.println(ans);
             f=0;
		}
left++;
		
	}

	//If not empty string then add to the result(Last word is added)
	if (!temp.equals(""))
	{
		if (!ans.equals(""))
		{
			ans = temp + " " + ans;
		}
		else
		{
			ans = temp;
		}
	}

	return ans;
}

     
}
