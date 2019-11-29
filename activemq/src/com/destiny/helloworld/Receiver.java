package com.destiny.helloworld;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

//消息接收
public class Receiver {

    public static void main(String[] args) throws JMSException {

        //1.建立连接工厂
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_USER, ActiveMQConnectionFactory.DEFAULT_PASSWORD, "tcp://192.168.229.130:61616");

        //2.开启连接
        Connection connection = connectionFactory.createConnection();
        connection.start();
        //3.创建session会话
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

        //4.创建队列
        Destination destination = session.createQueue("queue1");

        //5.创建消费者
        MessageConsumer consumer = session.createConsumer(destination);

        //6.消费者接收数据
        while (true) {
            TextMessage message = (TextMessage) consumer.receive();
            if (message == null) break;
            System.out.println("收到的消息：" + message);
        }

        //9.关闭
        if (connection != null) {
            connection.close();
        }

    }

}
