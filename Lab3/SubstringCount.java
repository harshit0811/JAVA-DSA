import java.util.Scanner; 
public class SubstringCount { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter the first string (S1): "); 
String s1 = scanner.nextLine(); 
System.out.print("Enter the second string (S2): "); 
String s2 = scanner.nextLine(); 
int count = countSubstring(s1, s2); 
System.out.println("The number of times " + s1 + " appears in " + s2 + " is: " + count); 
} 
private static int countSubstring(String s1, String s2) { 
int count = 0; 
int s1Length = s1.length(); 
int s2Length = s2.length(); 
for (int i = 0; i <= s2Length - s1Length; i++) { 
if (s2.substring(i, i + s1Length).equals(s1)) { 
count++; 
} 
} 
return count; 
} 
}