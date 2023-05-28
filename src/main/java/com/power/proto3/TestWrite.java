package com.power.proto3;

import java.io.*;
import java.util.Scanner;

/**
 * @author power
 * @Date 2023/5/28 16:23
 */
public class TestWrite {
    public static void main(String[] args) throws IOException {
        Contacts.Builder contactsBuilder = Contacts.newBuilder();
        // 读取本地已存在的 contacts.bin，反序列化出通讯录对象
        File file = new File("src/main/java/com/power/proto3/contacts.bin");


//            Contacts contacts =
//                    Contacts.parseFrom(new FileInputStream(file));
//
//            contactsBuilder = contacts.toBuilder();

        try {
            contactsBuilder.mergeFrom(new FileInputStream(file));
        } catch (IOException e) {
            System.out.println("contacts.bin not find, create new File");
            file.createNewFile();
        }


        // 想通讯录中新增一个联系人
        contactsBuilder.addContacts(addPeopleInfo());


        // 序列化通讯录，将结果写入文件中

        FileOutputStream fileOutputStream =
                new FileOutputStream(file);

        contactsBuilder.build().writeTo(fileOutputStream);
        fileOutputStream.close();

    }

    private static PeopleInfo addPeopleInfo() {
        PeopleInfo.Builder builder = PeopleInfo.newBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------新增联系人-------------");
        System.out.print("请输入联系人姓名：");
        String name = scanner.nextLine();
        builder.setName(name);
        System.out.print("请输入联系人年龄：");
        int age = Integer.parseInt(scanner.nextLine());
        builder.setAge(age);

        for (int i = 0; ; i++) {
            System.out.print("请输入联系人电话" + (i + 1) + "(只输入回车完成电话新增)：");

            String phoneNumber = scanner.nextLine();
            if (phoneNumber.isEmpty()) {
                break;
            }

            PeopleInfo.Phone.Builder phoneBuilder = PeopleInfo.Phone.newBuilder();
            phoneBuilder.setNumber(phoneNumber);
            builder.addPhone(phoneBuilder);
//            builder.setPhone(i, PeopleInfo.Phone.newBuilder().setNumber(phone));
        }

        System.out.println("------------添加联系人成功------------");

        return builder.build();
    }
}
