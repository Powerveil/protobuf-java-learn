// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto3/contacts.proto

package com.power.proto3;

public final class ContactsProtos {
  private ContactsProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto3_PeopleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto3_PeopleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto3_PeopleInfo_Phone_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto3_PeopleInfo_Phone_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto3_PeopleInfo_RemarkEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto3_PeopleInfo_RemarkEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto3_Contacts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto3_Contacts_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto3_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto3_Address_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025proto3/contacts.proto\022\006proto3\032\031google/" +
      "protobuf/any.proto\"\355\002\n\nPeopleInfo\022\014\n\004nam" +
      "e\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\'\n\005phone\030\003 \003(\0132\030.pr" +
      "oto3.PeopleInfo.Phone\022\"\n\004data\030\004 \001(\0132\024.go" +
      "ogle.protobuf.Any\022\014\n\002qq\030\005 \001(\tH\000\022\020\n\006wecha" +
      "t\030\006 \001(\tH\000\022.\n\006remark\030\007 \003(\0132\036.proto3.Peopl" +
      "eInfo.RemarkEntry\032g\n\005Phone\022\016\n\006number\030\001 \001" +
      "(\t\0220\n\004type\030\002 \001(\0162\".proto3.PeopleInfo.Pho" +
      "ne.PhoneType\"\034\n\tPhoneType\022\006\n\002MP\020\000\022\007\n\003TEL" +
      "\020\001\032-\n\013RemarkEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030" +
      "\002 \001(\t:\0028\001B\017\n\rother_contact\"0\n\010Contacts\022$" +
      "\n\010contacts\030\001 \003(\0132\022.proto3.PeopleInfo\"5\n\007" +
      "Address\022\024\n\014home_address\030\001 \001(\t\022\024\n\014unit_ad" +
      "dress\030\002 \001(\tB$\n\020com.power.proto3B\016Contact" +
      "sProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_proto3_PeopleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto3_PeopleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_PeopleInfo_descriptor,
        new java.lang.String[] { "Name", "Age", "Phone", "Data", "Qq", "Wechat", "Remark", "OtherContact", });
    internal_static_proto3_PeopleInfo_Phone_descriptor =
      internal_static_proto3_PeopleInfo_descriptor.getNestedTypes().get(0);
    internal_static_proto3_PeopleInfo_Phone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_PeopleInfo_Phone_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_proto3_PeopleInfo_RemarkEntry_descriptor =
      internal_static_proto3_PeopleInfo_descriptor.getNestedTypes().get(1);
    internal_static_proto3_PeopleInfo_RemarkEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_PeopleInfo_RemarkEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_proto3_Contacts_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto3_Contacts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_Contacts_descriptor,
        new java.lang.String[] { "Contacts", });
    internal_static_proto3_Address_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto3_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_Address_descriptor,
        new java.lang.String[] { "HomeAddress", "UnitAddress", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
