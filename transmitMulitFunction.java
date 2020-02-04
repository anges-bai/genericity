public class TestDemo { 
public static void main(String[] args) {
System.out.println(add("Hello")); 
System.out.println(add("Hello",1,4,5,6)); 
System.out.println(add("Hello",new int[]{1,2,3})); 
}

public static int add(String msg,int ... data) { 
int result = 0 ;
for (int i = 0; i < data.length; i++) {
result += data[i] ; 
}
return result ; 
}
}
