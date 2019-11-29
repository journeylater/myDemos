package com.destiny.helloworld;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 消息发送者
 */
public class Sender {
    public static void main(String[] args) throws JMSException {

        //1.建立连接工厂
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_USER, ActiveMQConnectionFactory.DEFAULT_PASSWORD, "tcp://192.168.229.130:61616");

        //2.开启连接
        Connection connection = connectionFactory.createConnection();

        //3.创建session会话
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

        //4.创建队列
        Destination destination = session.createQueue("queue1");

        //5.创建生产者
        MessageProducer producer = session.createProducer(destination);

        //6.设置生产者特性
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT); //是否持久化

        //7.创建消息
        TextMessage message = session.createTextMessage();

        //8.设置消息内容
        for (int i = 0; i < 5; i++) {
            message.setText("我是消息 ["+i+"] lalalala");
            System.out.println("生产者生产消息：  "+"我是消息 ["+i+"] lalalala");
            producer.send(message); //发送消息
        }

        //9.关闭
        if (connection != null) {
            connection.close();
        }

    }
}
