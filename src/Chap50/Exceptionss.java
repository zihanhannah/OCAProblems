package Chap50;

import java.io.IOException;
import java.io.RandomAccessFile;
// todo method 1: handle the exception by try....catch

class Exceptionss {
    public static void doStuff(){
        try {
            doMore();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void doMore() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("myfile.txt","r");
        byte b[] = new byte[1000];
        raf.readFully(b,0,100);
        throw new IOException();
    }

    public static void main(String[] args) {
        doStuff();
    }

// todo   java.io.FileNotFoundException: myfile.txt (No such file or directory)
//	at java.base/java.io.RandomAccessFile.open0(Native Method)
//	at java.base/java.io.RandomAccessFile.open(RandomAccessFile.java:345)
//	at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:259)
//	at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:214)
//	at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:127)
//	at Chap50.Exceptionss.doMore(Exceptionss.java:15)
//	at Chap50.Exceptionss.doStuff(Exceptionss.java:9)
//	at Chap50.Exceptionss.main(Exceptionss.java:22)

//    todo declare the exception by using throws....
//    public static void doStuff() throws IOException {
//        doMore();
//    }
//    public static void doMore() throws IOException {
//        RandomAccessFile raf = new RandomAccessFile("myfile.txt","r");
//        byte b[] = new byte[1000];
//        raf.readFully(b,0,100);
//        throw new IOException();
//    }
//
//    public static void main(String[] args) throws IOException {
//        doStuff();
//    }
}
