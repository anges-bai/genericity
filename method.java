public class TestDemo {
public static void main(String[] args) { 
System.out.println(add(1,4,5,6));
// 随意传递的内容，随意个数 
System.out.println(add(new int[]{1,2,3}));
// 可变参数可以接收数组
System.out.println(add(new int[]{1,2,3,4,5,6,7,8})); 
}

public static int add(int ... data) {
// 本身还是一个数组 
int result = 0 ;
for (int i = 0; i < data.length; i++) { 
result += data[i] ;
}
return result ;
}
}
