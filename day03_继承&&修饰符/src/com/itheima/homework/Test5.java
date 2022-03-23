package com.itheima.homework;

public class Test5 {
    public static void main(String[] args) {
        PhoneVersion6 pv6 = new PhoneVersion6();
        pv6.speak();
    }
}
class PhoneVersion5{
    public void speak(){
        System.out.println("speak english");
    }
}

class PhoneVersion6 extends PhoneVersion5 {
    public void speak(){
        super.speak();
        System.out.println("说中文");
    }
}
