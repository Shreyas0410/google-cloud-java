/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/essentialcontacts/v1/service.proto

package com.google.cloud.essentialcontacts.v1;

public final class Service {
  private Service() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_Contact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_Contact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/essentialcontacts/v1/serv"
          + "ice.proto\022!google.cloud.essentialcontact"
          + "s.v1\032\034google/api/annotations.proto\032\027goog"
          + "le/api/client.proto\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + "-google/cloud/essentialcontacts/v1/enums"
          + ".proto\032\033google/protobuf/empty.proto\032 goo"
          + "gle/protobuf/field_mask.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\351\003\n\007Contact\022\022\n\004na"
          + "me\030\001 \001(\tB\004\342A\001\003\022\023\n\005email\030\002 \001(\tB\004\342A\001\002\022j\n#n"
          + "otification_category_subscriptions\030\003 \003(\016"
          + "27.google.cloud.essentialcontacts.v1.Not"
          + "ificationCategoryB\004\342A\001\002\022\032\n\014language_tag\030"
          + "\004 \001(\tB\004\342A\001\002\022L\n\020validation_state\030\010 \001(\01622."
          + "google.cloud.essentialcontacts.v1.Valida"
          + "tionState\0221\n\rvalidate_time\030\t \001(\0132\032.googl"
          + "e.protobuf.Timestamp:\253\001\352A\247\001\n(essentialco"
          + "ntacts.googleapis.com/Contact\022%projects/"
          + "{project}/contacts/{contact}\022#folders/{f"
          + "older}/contacts/{contact}\022/organizations"
          + "/{organization}/contacts/{contact}\"\213\001\n\023L"
          + "istContactsRequest\022A\n\006parent\030\001 \001(\tB1\342A\001\002"
          + "\372A*\022(essentialcontacts.googleapis.com/Co"
          + "ntact\022\027\n\tpage_size\030\002 \001(\005B\004\342A\001\001\022\030\n\npage_t"
          + "oken\030\003 \001(\tB\004\342A\001\001\"m\n\024ListContactsResponse"
          + "\022<\n\010contacts\030\001 \003(\0132*.google.cloud.essent"
          + "ialcontacts.v1.Contact\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\"T\n\021GetContactRequest\022?\n\004name\030\001 \001"
          + "(\tB1\342A\001\002\372A*\n(essentialcontacts.googleapi"
          + "s.com/Contact\"W\n\024DeleteContactRequest\022?\n"
          + "\004name\030\001 \001(\tB1\342A\001\002\372A*\n(essentialcontacts."
          + "googleapis.com/Contact\"\234\001\n\024CreateContact"
          + "Request\022A\n\006parent\030\001 \001(\tB1\342A\001\002\372A*\022(essent"
          + "ialcontacts.googleapis.com/Contact\022A\n\007co"
          + "ntact\030\002 \001(\0132*.google.cloud.essentialcont"
          + "acts.v1.ContactB\004\342A\001\002\"\220\001\n\024UpdateContactR"
          + "equest\022A\n\007contact\030\002 \001(\0132*.google.cloud.e"
          + "ssentialcontacts.v1.ContactB\004\342A\001\002\0225\n\013upd"
          + "ate_mask\030\003 \001(\0132\032.google.protobuf.FieldMa"
          + "skB\004\342A\001\001\"\350\001\n\026ComputeContactsRequest\022A\n\006p"
          + "arent\030\001 \001(\tB1\342A\001\002\372A*\022(essentialcontacts."
          + "googleapis.com/Contact\022X\n\027notification_c"
          + "ategories\030\006 \003(\01627.google.cloud.essential"
          + "contacts.v1.NotificationCategory\022\027\n\tpage"
          + "_size\030\003 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\004 \001(\tB\004\342"
          + "A\001\001\"p\n\027ComputeContactsResponse\022<\n\010contac"
          + "ts\030\001 \003(\0132*.google.cloud.essentialcontact"
          + "s.v1.Contact\022\027\n\017next_page_token\030\002 \001(\t\"\200\002"
          + "\n\026SendTestMessageRequest\022C\n\010contacts\030\001 \003"
          + "(\tB1\342A\001\002\372A*\n(essentialcontacts.googleapi"
          + "s.com/Contact\022C\n\010resource\030\002 \001(\tB1\342A\001\002\372A*"
          + "\022(essentialcontacts.googleapis.com/Conta"
          + "ct\022\\\n\025notification_category\030\003 \001(\01627.goog"
          + "le.cloud.essentialcontacts.v1.Notificati"
          + "onCategoryB\004\342A\001\0022\313\017\n\030EssentialContactsSe"
          + "rvice\022\230\002\n\rCreateContact\0227.google.cloud.e"
          + "ssentialcontacts.v1.CreateContactRequest"
          + "\032*.google.cloud.essentialcontacts.v1.Con"
          + "tact\"\241\001\332A\016parent,contact\202\323\344\223\002\211\001\" /v1/{pa"
          + "rent=projects/*}/contacts:\007contactZ*\"\037/v"
          + "1/{parent=folders/*}/contacts:\007contactZ0"
          + "\"%/v1/{parent=organizations/*}/contacts:"
          + "\007contact\022\265\002\n\rUpdateContact\0227.google.clou"
          + "d.essentialcontacts.v1.UpdateContactRequ"
          + "est\032*.google.cloud.essentialcontacts.v1."
          + "Contact\"\276\001\332A\023contact,update_mask\202\323\344\223\002\241\0012"
          + "(/v1/{contact.name=projects/*/contacts/*"
          + "}:\007contactZ22\'/v1/{contact.name=folders/"
          + "*/contacts/*}:\007contactZ82-/v1/{contact.n"
          + "ame=organizations/*/contacts/*}:\007contact"
          + "\022\376\001\n\014ListContacts\0226.google.cloud.essenti"
          + "alcontacts.v1.ListContactsRequest\0327.goog"
          + "le.cloud.essentialcontacts.v1.ListContac"
          + "tsResponse\"}\332A\006parent\202\323\344\223\002n\022 /v1/{parent"
          + "=projects/*}/contactsZ!\022\037/v1/{parent=fol"
          + "ders/*}/contactsZ\'\022%/v1/{parent=organiza"
          + "tions/*}/contacts\022\353\001\n\nGetContact\0224.googl"
          + "e.cloud.essentialcontacts.v1.GetContactR"
          + "equest\032*.google.cloud.essentialcontacts."
          + "v1.Contact\"{\332A\004name\202\323\344\223\002n\022 /v1/{name=pro"
          + "jects/*/contacts/*}Z!\022\037/v1/{name=folders"
          + "/*/contacts/*}Z\'\022%/v1/{name=organization"
          + "s/*/contacts/*}\022\335\001\n\rDeleteContact\0227.goog"
          + "le.cloud.essentialcontacts.v1.DeleteCont"
          + "actRequest\032\026.google.protobuf.Empty\"{\332A\004n"
          + "ame\202\323\344\223\002n* /v1/{name=projects/*/contacts"
          + "/*}Z!*\037/v1/{name=folders/*/contacts/*}Z\'"
          + "*%/v1/{name=organizations/*/contacts/*}\022"
          + "\230\002\n\017ComputeContacts\0229.google.cloud.essen"
          + "tialcontacts.v1.ComputeContactsRequest\032:"
          + ".google.cloud.essentialcontacts.v1.Compu"
          + "teContactsResponse\"\215\001\202\323\344\223\002\206\001\022(/v1/{paren"
          + "t=projects/*}/contacts:computeZ)\022\'/v1/{p"
          + "arent=folders/*}/contacts:computeZ/\022-/v1"
          + "/{parent=organizations/*}/contacts:compu"
          + "te\022\233\002\n\017SendTestMessage\0229.google.cloud.es"
          + "sentialcontacts.v1.SendTestMessageReques"
          + "t\032\026.google.protobuf.Empty\"\264\001\202\323\344\223\002\255\001\"2/v1"
          + "/{resource=projects/*}/contacts:sendTest"
          + "Message:\001*Z6\"1/v1/{resource=folders/*}/c"
          + "ontacts:sendTestMessage:\001*Z<\"7/v1/{resou"
          + "rce=organizations/*}/contacts:sendTestMe"
          + "ssage:\001*\032T\312A essentialcontacts.googleapi"
          + "s.com\322A.https://www.googleapis.com/auth/"
          + "cloud-platformB\355\001\n%com.google.cloud.esse"
          + "ntialcontacts.v1P\001ZScloud.google.com/go/"
          + "essentialcontacts/apiv1/essentialcontact"
          + "spb;essentialcontactspb\252\002!Google.Cloud.E"
          + "ssentialContacts.V1\312\002!Google\\Cloud\\Essen"
          + "tialContacts\\V1\352\002$Google::Cloud::Essenti"
          + "alContacts::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.essentialcontacts.v1.EnumsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_essentialcontacts_v1_Contact_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_essentialcontacts_v1_Contact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_Contact_descriptor,
            new java.lang.String[] {
              "Name",
              "Email",
              "NotificationCategorySubscriptions",
              "LanguageTag",
              "ValidationState",
              "ValidateTime",
            });
    internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_descriptor,
            new java.lang.String[] {
              "Contacts", "NextPageToken",
            });
    internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Contact",
            });
    internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor,
            new java.lang.String[] {
              "Contact", "UpdateMask",
            });
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "NotificationCategories", "PageSize", "PageToken",
            });
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_descriptor,
            new java.lang.String[] {
              "Contacts", "NextPageToken",
            });
    internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_descriptor,
            new java.lang.String[] {
              "Contacts", "Resource", "NotificationCategory",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.essentialcontacts.v1.EnumsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
