package myPack;
import Default.pack.*;
class MainOfPackAccessDefault {
    public static void main(String[] args) {
        AccessDefault accessDefault=new AccessDefault();    //Compile Time Error
        accessDefault.msg();                                //Compile Time Error
    }
}
