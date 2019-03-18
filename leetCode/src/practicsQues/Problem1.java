package practicsQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem1 {
public static int reductionCost(int[] num) {
	List<Integer> res = new ArrayList<Integer>();
	int cost = 0;
	int sum=0;

	if(num.length==1) {
		cost += num[0];
	}
	for(int i=0;i<num.length;i++) {
    	res.add(num[i]);
    }
	while (res.size()>1) {
		Collections.sort(res);
		sum = res.get(0)+res.get(1);
		cost += sum;
		res.remove(0);
		res.remove(0);
		res.add(0, sum);
	}
	return cost;
	
	
}
public static void main(String args[]) {
	int[] array = new int[] {4,1,2,3,4};
	int res = reductionCost(array);
	System.out.println("result:" + res);
}
}
