package com.destiny.helloworld;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

//消息接收 : 队列模式
public class Receiver {

    public static void main(String[] args) throws JMSException {

        //1.建立连接工厂
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("bhz", "bhz", "tcp://192.168.229.130:61616");

        //2.开启连接
        Connection connection = connectionFactory.createConnection();
        connection.start();
        //3.创建session会话
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

        //4.创建队列
        Destination destination = session.createQueue("queue1");

        //5.创建消费者
        javax.jms.MessageConsumer consumer = session.createConsumer(destination);

        //6.消费者接收数据
       consumer.setMessageListener(new MessageListener() {
           @Override
           public void onMessage(Message message) {
               TextMessage textMessage = (TextMessage) message;
               try {
                   System.out.println("获取到的消息："+textMessage.getText());
               } catch (JMSException e) {
                   e.printStackTrace();
               }
           }
       });


    }

}
