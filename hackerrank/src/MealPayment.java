import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MealPayment {


public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	Scanner keyboard=new Scanner()
	double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
	
	int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
	
	int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());
	
	solve(meal_cost, tip_percent, tax_percent);
	
	bufferedReader.close();
}

public static void solve(double meal_cost, int tip_percent, int tax_percent) {
	
	double tip=(meal_cost/100)*tip_percent;
	
	double tax=(meal_cost/100)*tax_percent;
	double result=meal_cost+tip+tax;
	System.out.println(Math.round(result));
	
	
	
}
}
