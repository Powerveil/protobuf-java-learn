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
    internal_static_proto3_Contacts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto3_Contacts_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025proto3/contacts.proto\022\006proto3\"\271\001\n\nPeop" +
      "leInfo\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\'\n\005pho" +
      "ne\030\003 \003(\0132\030.proto3.PeopleInfo.Phone\032g\n\005Ph" +
      "one\022\016\n\006number\030\001 \001(\t\0220\n\004type\030\002 \001(\0162\".prot" +
      "o3.PeopleInfo.Phone.PhoneType\"\034\n\tPhoneTy" +
      "pe\022\006\n\002MP\020\000\022\007\n\003TEL\020\001\"0\n\010Contacts\022$\n\010conta" +
      "cts\030\001 \003(\0132\022.proto3.PeopleInfoB$\n\020com.pow" +
      "er.proto3B\016ContactsProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto3_PeopleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto3_PeopleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_PeopleInfo_descriptor,
        new java.lang.String[] { "Name", "Age", "Phone", });
    internal_static_proto3_PeopleInfo_Phone_descriptor =
      internal_static_proto3_PeopleInfo_descriptor.getNestedTypes().get(0);
    internal_static_proto3_PeopleInfo_Phone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_PeopleInfo_Phone_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_proto3_Contacts_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto3_Contacts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto3_Contacts_descriptor,
        new java.lang.String[] { "Contacts", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
