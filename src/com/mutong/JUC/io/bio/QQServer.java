package com.mutong.JUC.io.bio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-27 18:46
 * @time_complexity: O()
 */
public class QQServer {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(8080));
//        serverSocketChannel.configureBlocking()
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(8080));
        while (true){
            System.out.println("等待连接");
            //阻塞
            Socket accept = serverSocket.accept();
            System.out.println("连接成功");
            System.out.println("等待数据传送");
            //阻塞
            int read = accept.getInputStream().read();
            System.out.println("收到数据了");
        }
    }
}
