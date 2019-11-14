package com.destiny.annotation.myAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyTest {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("destiny");
        person.setUserName("root");
        System.out.println(query(person));

    }
    public static String query(Person person) {
        StringBuilder sb = new StringBuilder();
        //通过反射，获取Class对象
        Class p = person.getClass();
        //判断此Class是不是注解类
        boolean exist = p.isAnnotationPresent(Table.class);
        if (!exist) {
            return null;
        }
        Table table = (Table) p.getAnnotation(Table.class);
        String tableName = table.value();
        sb.append(" SELECT * FROM ").append(tableName).append(" WHERE 1=1");
        Field[] declaredFields = p.getDeclaredFields();
        for (Field field : declaredFields) {
            boolean fexist = field.isAnnotationPresent(Column.class);
            if (!fexist) {
                return null;
            }
            Column annotation = field.getAnnotation(Column.class);
            String columnName = annotation.value();
            String fieldName = field.getName();
            Object fieldvalue = null;
            String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            try {
                Method method = p.getMethod(getMethodName);
                fieldvalue = method.invoke(person);
            } catch (Exception e) {
                e.printStackTrace();
            }
            sb.append(" AND ").append(columnName).append("=").append(fieldvalue);
        }
        return sb.toString();
    }
}
