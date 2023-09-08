package Chater16.Ex;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex16_1 {
    public static void main(String[] args) {
        InetAddress ip = null;
        InetAddress[] ipArr = null;

        try{
            ip = InetAddress.getByName("www.naver.com");
            System.out.println("ip.getHostName() = " + ip.getHostName());
            System.out.println("ip.getHostAddress() = " + ip.getHostAddress());
            System.out.println("ip.toString() = " + ip.toString());

            byte[] ipAddr = ip.getAddress();
            System.out.println("getAddress() :"+ Arrays.toString(ipAddr));
            String result = "";
            for (byte b : ipAddr) {
                result += (b < 0 ? b + 256 : b) + ".";
            }
            System.out.println("getAddress()+256 :" + result);
            System.out.println();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try{
            ip = InetAddress.getLocalHost();
            System.out.println("ip.getHostName() = " + ip.getHostName());
            System.out.println("ip.getHostAddress() = " + ip.getHostAddress());
            System.out.println();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try{
            ipArr = InetAddress.getAllByName("www.naver.com");

            for(int i=0;i<ipArr.length;i++){
                System.out.println("ipArr["+i+"] :" + ipArr[i]);
            }
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
