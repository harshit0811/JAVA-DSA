import java.util.Arrays;
import java.util.Comparator;
public class AbsoluteDistanceSort {
    public static void main(String[] args) { 
int[] x = {9, 1, 12, 4, 2}; 
int z = 6; 
dist_sort(x, x.length, z); 
System.out.println(Arrays.toString(x)); 
} 
static void dist_sort(int[] x, int n, int z) { 
Integer[] xInteger = new Integer[n]; 
for (int i = 0; i < n; i++) { 
xInteger[i] = x[i]; 
} 
Comparator<Integer> absDistanceComparator = (a, b) -> { 
int distA = Math.abs(a - z); 
int distB = Math.abs(b - z); 
return Integer.compare(distA, distB); 
}; 
Arrays.sort(xInteger, absDistanceComparator); 
for (int i = 0; i < n; i++) { 
x[i] = xInteger[i]; 
} 
} 
} 

