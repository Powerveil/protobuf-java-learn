package com.power.proto3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author power
 * @Date 2023/5/28 16:59
 */
public class TestRead {
    public static void main(String[] args) throws IOException {

        // 读取文件，将读取的内容进行反序列化
        Contacts contacts = Contacts.parseFrom(new FileInputStream(
                "src/main/java/com/power/proto3/contacts.bin"));


        // 打印
        printContacts(contacts);

//        System.out.println(contacts.toString());
    }

    private static void printContacts(Contacts contacts) {
        int i = 1;
        for (PeopleInfo peopleInfo : contacts.getContactsList()) {
            System.out.println("----------联系人" + i++ + "------------");
            System.out.println("姓名：" + peopleInfo.getName());
            System.out.println("姓名：" + peopleInfo.getAge());
            int j = 1;

            for (PeopleInfo.Phone phone : peopleInfo.getPhoneList()) {
                System.out.println("电话" + j++ + "："+  phone.getNumber()
                    + " (" + phone.getType().name() + ")");
            }
        }

    }
}
