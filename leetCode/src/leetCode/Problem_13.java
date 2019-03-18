package leetCode;

public class Problem_13 {
	public static int romanToInt(String s) {
			int x = 0;
		        for (int i=0;i<s.length();i++) {
		            switch(s.charAt(i))
		            {
		                case 'I' :
		                    {
		                        if (i==s.length()-1)
		                        {
		                            x+=1;
		                        }
		                        else if (s.charAt(i+1)=='V' )
		                        {
		                            x+=4;
		                            i++;
		                        }
		                        else if (s.charAt(i+1)=='X') 
		                        {
		                            x+=9;
		                            i++;
		                        }
		                        else
		                        {
		                            x+=1;
		                        }
		                        break;
		                    }
		                case 'V' :
		                    {
		                        x+=5;
		                        break;
		                    }
		                case 'X' :
		                    {
		                        if (i==s.length()-1)
		                        {
		                            x+=10;
		                        }
		                        else if (s.charAt(i+1)=='L' )
		                        {
		                            x+=40;
		                            i++;
		                        }
		                        else if (s.charAt(i+1)=='C') 
		                        {
		                            x+=90;
		                            i++;
		                        }
		                        else
		                        {
		                            x+=10;
		                        }
		                        break;
		                    }
		                case 'L' :
		                    {
		                        x+=50;
		                        break;
		                    }
		                case 'C' :
		                    {
		                        if (i==s.length()-1)
		                        {
		                            x+=100;
		                        }
		                        else if (s.charAt(i+1)=='D' )
		                        {
		                            x+=400;
		                            i++;
		                        }
		                        else if (s.charAt(i+1)=='M') 
		                        {
		                            x+=900;
		                            i++;
		                        }
		                        else
		                        {
		                            x+=100;
		                        }
		                        break;
		                    }
		                case 'D' :
		                    {
		                        x+=500;
		                        break;
		                    }
		                case 'M' :
		                    {
		                        x+=1000;
		                        break;
		                    }    
		                default:
		                    {
		                        
		                    }
		            }
		        }
		        
		        return x;
		    }
	public static void main(String args[])
	{
		String m ="XCIX";
		int n;
		n = romanToInt(m);
		System.out.println(n);
		
		
		
	}

	
		}
