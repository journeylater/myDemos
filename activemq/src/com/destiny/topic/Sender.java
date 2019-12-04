package com.destiny.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 消息发送者
 */
public class Sender {
    public static void main(String[] args) throws JMSException {

        //定义发送消息的主题名称
        String TOPIC_NAME = "MyTopicMessage";

        //1.建立连接工厂
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("bhz", "bhz", "tcp://192.168.229.130:61616");

        //2.开启连接
        Connection connection = connectionFactory.createConnection();
        connection.start();

        //3.创建session会话
       // Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
        Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);

        //4.创建目标
        Destination destination = session.createTopic(TOPIC_NAME);

        //5.创建生产者
        MessageProducer producer = session.createProducer(destination);

        //6.设置生产者特性
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT); //是否持久化

        //7.创建消息
        TextMessage message = session.createTextMessage();

        //8.设置消息内容
        for (int i = 0; i < 100; i++) {
            message.setText("[主题模式]我是消息 ["+i+"] lalalala");
            System.out.println("生产者生产消息：  "+"我是消息 ["+i+"] lalalala");
            producer.send(message); //发送消息
        }
        session.commit(); //使用事务必须提交
        //9.关闭
        if (connection != null) {
            connection.close();
        }

    }
}
