package com.mutong.JUC.io.bio;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-27 18:55
 * @time_complexity: O()
 */
public class QQClient2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        System.out.println("连接成功");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        socket.getOutputStream().write(str.getBytes());
    }
}
