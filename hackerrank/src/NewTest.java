import java.util.Scanner;

public class NewTest {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count=2;
	String a="Hello";
	String b="world";
	String[] result = new String[count];
	for (int i=0; i<count;i++){
	result[i]=a;
	}

	
	for (int j=0; j<count; j++){
		System.out.println(result[j]);
	}
}

}
