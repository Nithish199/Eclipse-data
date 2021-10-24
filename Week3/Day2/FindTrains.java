package Week3.Day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTrains {

public static void main(String[] args) {
	List<String> trainNames=Arrays.asList("Mangalour","Vaigai","Pandian","Amaravathi","mangalour");
	
	Collections.sort(trainNames);
	System.out.println(trainNames);
	
	System.out.println(trainNames.get(trainNames.size()-2));
}

}
