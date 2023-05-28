package com.power.start;

import com.google.protobuf.InvalidProtocolBufferException;

import java.util.Arrays;

/**
 * @author power
 * @Date 2023/5/28 15:22
 */
public class FastStart {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        PeopleInfo p1 = PeopleInfo.newBuilder()
                .setName("张三")
                .setAge(20)
                .build();

        // 序列化
        byte[] bytes = p1.toByteArray();
        System.out.println("序列化结果为：" + Arrays.toString(bytes));

        // 反序列化
        PeopleInfo p2 = PeopleInfo.parseFrom(bytes);
//        System.out.println("反序列化结果为：" + p2);
        System.out.println("反序列化结果为：");
        System.out.println("姓名：" + p2.getName());
        System.out.println("年龄：" + p2.getAge());

    }
}
