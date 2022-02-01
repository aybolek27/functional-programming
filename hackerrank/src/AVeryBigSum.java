import java.util.ArrayList;
import java.util.List;

public class AVeryBigSum {

public static void main(String[] args) {
	
	List<Long> arr=new ArrayList<>();
	arr.add(27L);
	arr.add(1L);

	
	
	Long result=aVeryBigSum(arr);
	
	System.out.println(result);
}




public static long aVeryBigSum(List<Long> ar) {
	Long result=0L;
	
	for (int i=0;i<ar.size();i++){
		
		result=result+(Long) ar.get(i);
	}
	
	
	return result;
	
}


}
