package com.power.proto3;

import com.google.protobuf.InvalidProtocolBufferException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

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

    private static void printContacts(Contacts contacts) throws InvalidProtocolBufferException {
        int i = 1;
        for (PeopleInfo peopleInfo : contacts.getContactsList()) {
            System.out.println("----------联系人" + i++ + "------------");
            System.out.println("姓名：" + peopleInfo.getName());
            System.out.println("姓名：" + peopleInfo.getAge());
            int j = 1;

            for (PeopleInfo.Phone phone : peopleInfo.getPhoneList()) {
                System.out.println("电话" + j++ + "：" + phone.getNumber()
                        + " (" + phone.getType().name() + ")");
            }


            if (peopleInfo.hasData()
                    && peopleInfo.getData().is(Address.class)) {
                Address address = peopleInfo.getData().unpack(Address.class);
                if (!address.getHomeAddress().isEmpty()) {
                    System.out.println("家庭地址：" + address.getHomeAddress());
                }
                if (!address.getUnitAddress().isEmpty()) {
                    System.out.println("单位地址：" + address.getUnitAddress());
                }
            }


//            if (peopleInfo.hasQq()) {
//                System.out.println();
//            } else if (peopleInfo.hasWechat()) {
//                System.out.println();
//            } else {
//                System.out.println();
//            }

            switch (peopleInfo.getOtherContactCase()) {
                case QQ:
                    System.out.println("qq号：" + peopleInfo.getQq());
                    break;
                case WECHAT:
                    System.out.println("微信号：" + peopleInfo.getWechat());
                    break;
                case OTHERCONTACT_NOT_SET:
                    break;
            }

            Map<String, String> remarkMap = peopleInfo.getRemarkMap();
            for (Map.Entry<String, String> entry : remarkMap.entrySet()) {
                System.out.println("   " + entry.getKey() + "：" +  entry.getValue());
            }
        }

    }
}
