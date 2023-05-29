package com.power.proto3;

import com.google.protobuf.Any;

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

            System.out.print("请输入此电话类型<1、移动电话    2、固定电话>：");
            int tpye = Integer.parseInt(scanner.nextLine());
            switch (tpye) {
                case 1:
                    phoneBuilder.setType(PeopleInfo.Phone.PhoneType.MP);
                    break;
                case 2:
                    phoneBuilder.setType(PeopleInfo.Phone.PhoneType.TEL);
                    break;
                default:
                    System.out.println("选择错误");
            }

            builder.addPhone(phoneBuilder);
//            builder.setPhone(i, PeopleInfo.Phone.newBuilder().setNumber(phone));
        }

        Address.Builder addressBuilder = Address.newBuilder();
        System.out.print("请输入联系人家庭地址：");
        String homeAddress = scanner.nextLine();
        addressBuilder.setHomeAddress(homeAddress);


        System.out.print("请输入联系人单位地址：");
        String unitAddress = scanner.nextLine();
        addressBuilder.setUnitAddress(unitAddress);


        builder.setData(Any.pack(addressBuilder.build()));


        System.out.print("请选择要添加的其他联系方式(1、qq号   2、微信号)：");
        int otherContact = Integer.parseInt(scanner.nextLine());
        if (1 == otherContact) {
            System.out.print("请输入qq号：");
            String qq = scanner.nextLine();
            builder.setQq(qq);
        }else if (2 == otherContact) {
            System.out.print("请输入微信号：");
            String wechat = scanner.nextLine();
            builder.setWechat(wechat);
        } else {
            System.out.println("无效选择，设置失败！");
        }

        for (int i = 0; ; i++) {
            System.out.print("请输入备注" + (i + 1) + "标题(只输入回车完成备注新增)：");
            String key = scanner.nextLine();
            if (key.isEmpty()) {
                break;
            }

            System.out.print("请输入备注内容：");
            String value = scanner.nextLine();

            builder.putRemark(key, value);
        }


        System.out.println("------------添加联系人成功------------");

        return builder.build();
    }
}
