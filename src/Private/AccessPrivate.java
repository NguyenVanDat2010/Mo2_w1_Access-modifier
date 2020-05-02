class Example{
    private int data=40;
    private void msg(){
        System.out.println("Hello Java");
    }
}
//Lớp A chứa thuộc tính và phương thức private.
// Chúng ta sẽ truy cập các thành phần này từ bên ngoài lớp,
// do đó sẽ có lỗi compile-time xảy ra:

public class AccessPrivate {
    public static void main(String[] args) {
        Example example=new Example();
        System.out.println(example.data);   //Compile Time Error
        example.msg();                      //Compile Time Error
    }
}
