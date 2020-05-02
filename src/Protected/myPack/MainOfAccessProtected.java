package Protected.myPack;
import Protected.pack.*;

//Protected có thể truy cập trong Package và bên ngoài Package nhưng chỉ thông qua kế thừa
//Protected có thể được áp dụng trên thuộc tính, phương thức và hàm tạo. Nó không thể được áp dụng trên lớp.

class MainOfAccessProtected extends AccessProtected {
    public static void main(String[] args) {
        MainOfAccessProtected mainOfAccessProtected=new MainOfAccessProtected();
        mainOfAccessProtected.msg();
    }
}
