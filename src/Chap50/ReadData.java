package Chap50;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class ReadData {

    public static void main(String[] args){
        try{
            RandomAccessFile raf = new RandomAccessFile("myfile.txt","r");
            byte b[] = new byte[1000];
            raf.readFully(b,0,100);
        }
        catch(FileNotFoundException e){
            System.err.println("File not found");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        catch(IOException e){
            System.err.println("IO Error");
            System.err.println(e.toString());
            e.printStackTrace();
        }
//  todo   File not found
//myfile.txt (No such file or directory)
//java.io.FileNotFoundException: myfile.txt (No such file or directory)
//	at java.base/java.io.RandomAccessFile.open0(Native Method)
//	at java.base/java.io.RandomAccessFile.open(RandomAccessFile.java:345)
//	at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:259)
//	at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:214)
//	at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:127)
//	at Chap50.ReadData.main(ReadData.java:11)
    }
}
