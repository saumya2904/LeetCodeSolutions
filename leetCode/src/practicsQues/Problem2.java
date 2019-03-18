package practicsQues;

public class Problem2 {
public static String rollingString(String s, String[] array) {
	for(int i=0; i<array.length;i++) {
		String[] opr = array[i].split(" ");
		char[] str = s.toCharArray();
		String res = "";
		int l = Integer.parseInt(opr[0]);
		int r = Integer.parseInt(opr[1]);
		for(int j = l; j<=r;j++){
			if (str[j] == 'a' && opr[2].equals("L")) {
			res += "z";
			}
			else if(str[j]=='z' && opr[2].equals("R"))
			res+= "a";
			else if(opr[2].equals("L")) {
				res += Character.toString((char)((int)str[j]-1));			
				}
			else if(opr[2].equals("R")) {
				res += Character.toString((char)((int)str[j]+1));			
				}
		}
	   s = s.substring(0,l)+res+s.substring(r+1);
		}
	return s;
	
}
public static void main(String args[]) {
	String s = "abc";
	String[] array = new String[] {"0 0 L","2 2 L","0 2 R"};
	String res = rollingString(s,array);
	System.out.println(res);
}
}
