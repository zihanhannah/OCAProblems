package Chap1;

public class TestServer {
//    instance variable
    int count = 9;

    public void login(){
        int count = 11;
        System.out.println("local variable count is  " + count);
    }
    public void count(){
        System.out.println("instance variable count is " + count);
    }
    public void setSize(int count){
//        this.size means the current object's instance variable, size. the size on the right is the parameter
        this.count = count;
    }

    public static void main(String[] args){
        TestServer test = new TestServer();
        test.count();
        test.setSize(10);
        System.out.println(test.count);
        test.login();

    }
    }