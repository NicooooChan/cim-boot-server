package com.farsunset.cim.sdk.server.model.proto;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.farsunset.cim.sdk.server.model.proto.Model)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    long getId();

    /**
     * <code>string action = 2;</code>
     * @return The action.
     */
    String getAction();
    /**
     * <code>string action = 2;</code>
     * @return The bytes for action.
     */
    com.google.protobuf.ByteString
        getActionBytes();

    /**
     * <code>string content = 3;</code>
     * @return The content.
     */
    String getContent();
    /**
     * <code>string content = 3;</code>
     * @return The bytes for content.
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>string sender = 4;</code>
     * @return The sender.
     */
    String getSender();
    /**
     * <code>string sender = 4;</code>
     * @return The bytes for sender.
     */
    com.google.protobuf.ByteString
        getSenderBytes();

    /**
     * <code>string receiver = 5;</code>
     * @return The receiver.
     */
    String getReceiver();
    /**
     * <code>string receiver = 5;</code>
     * @return The bytes for receiver.
     */
    com.google.protobuf.ByteString
        getReceiverBytes();

    /**
     * <code>string extra = 6;</code>
     * @return The extra.
     */
    String getExtra();
    /**
     * <code>string extra = 6;</code>
     * @return The bytes for extra.
     */
    com.google.protobuf.ByteString
        getExtraBytes();

    /**
     * <code>string title = 7;</code>
     * @return The title.
     */
    String getTitle();
    /**
     * <code>string title = 7;</code>
     * @return The bytes for title.
     */
    com.google.protobuf.ByteString
        getTitleBytes();

    /**
     * <code>string format = 8;</code>
     * @return The format.
     */
    String getFormat();
    /**
     * <code>string format = 8;</code>
     * @return The bytes for format.
     */
    com.google.protobuf.ByteString
        getFormatBytes();

    /**
     * <code>int64 timestamp = 9;</code>
     * @return The timestamp.
     */
    long getTimestamp();
  }
  /**
   * Protobuf type {@code com.farsunset.cim.sdk.server.model.proto.Model}
   */
  public  static final class Model extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.farsunset.cim.sdk.server.model.proto.Model)
      ModelOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Model.newBuilder() to construct.
    private Model(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Model() {
      action_ = "";
      content_ = "";
      sender_ = "";
      receiver_ = "";
      extra_ = "";
      title_ = "";
      format_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Model();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Model(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              id_ = input.readInt64();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              action_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              sender_ = s;
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();

              receiver_ = s;
              break;
            }
            case 50: {
              String s = input.readStringRequireUtf8();

              extra_ = s;
              break;
            }
            case 58: {
              String s = input.readStringRequireUtf8();

              title_ = s;
              break;
            }
            case 66: {
              String s = input.readStringRequireUtf8();

              format_ = s;
              break;
            }
            case 72: {

              timestamp_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageProto.internal_static_com_farsunset_cim_sdk_server_model_proto_Model_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageProto.internal_static_com_farsunset_cim_sdk_server_model_proto_Model_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Model.class, Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }

    public static final int ACTION_FIELD_NUMBER = 2;
    private volatile Object action_;
    /**
     * <code>string action = 2;</code>
     * @return The action.
     */
    public String getAction() {
      Object ref = action_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        action_ = s;
        return s;
      }
    }
    /**
     * <code>string action = 2;</code>
     * @return The bytes for action.
     */
    public com.google.protobuf.ByteString
        getActionBytes() {
      Object ref = action_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 3;
    private volatile Object content_;
    /**
     * <code>string content = 3;</code>
     * @return The content.
     */
    public String getContent() {
      Object ref = content_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 3;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDER_FIELD_NUMBER = 4;
    private volatile Object sender_;
    /**
     * <code>string sender = 4;</code>
     * @return The sender.
     */
    public String getSender() {
      Object ref = sender_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      }
    }
    /**
     * <code>string sender = 4;</code>
     * @return The bytes for sender.
     */
    public com.google.protobuf.ByteString
        getSenderBytes() {
      Object ref = sender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECEIVER_FIELD_NUMBER = 5;
    private volatile Object receiver_;
    /**
     * <code>string receiver = 5;</code>
     * @return The receiver.
     */
    public String getReceiver() {
      Object ref = receiver_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        receiver_ = s;
        return s;
      }
    }
    /**
     * <code>string receiver = 5;</code>
     * @return The bytes for receiver.
     */
    public com.google.protobuf.ByteString
        getReceiverBytes() {
      Object ref = receiver_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        receiver_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EXTRA_FIELD_NUMBER = 6;
    private volatile Object extra_;
    /**
     * <code>string extra = 6;</code>
     * @return The extra.
     */
    public String getExtra() {
      Object ref = extra_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        extra_ = s;
        return s;
      }
    }
    /**
     * <code>string extra = 6;</code>
     * @return The bytes for extra.
     */
    public com.google.protobuf.ByteString
        getExtraBytes() {
      Object ref = extra_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        extra_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TITLE_FIELD_NUMBER = 7;
    private volatile Object title_;
    /**
     * <code>string title = 7;</code>
     * @return The title.
     */
    public String getTitle() {
      Object ref = title_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        title_ = s;
        return s;
      }
    }
    /**
     * <code>string title = 7;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FORMAT_FIELD_NUMBER = 8;
    private volatile Object format_;
    /**
     * <code>string format = 8;</code>
     * @return The format.
     */
    public String getFormat() {
      Object ref = format_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        format_ = s;
        return s;
      }
    }
    /**
     * <code>string format = 8;</code>
     * @return The bytes for format.
     */
    public com.google.protobuf.ByteString
        getFormatBytes() {
      Object ref = format_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        format_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 9;
    private long timestamp_;
    /**
     * <code>int64 timestamp = 9;</code>
     * @return The timestamp.
     */
    public long getTimestamp() {
      return timestamp_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      if (!getActionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, action_);
      }
      if (!getContentBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_);
      }
      if (!getSenderBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sender_);
      }
      if (!getReceiverBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, receiver_);
      }
      if (!getExtraBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, extra_);
      }
      if (!getTitleBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, title_);
      }
      if (!getFormatBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, format_);
      }
      if (timestamp_ != 0L) {
        output.writeInt64(9, timestamp_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (!getActionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, action_);
      }
      if (!getContentBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, content_);
      }
      if (!getSenderBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sender_);
      }
      if (!getReceiverBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, receiver_);
      }
      if (!getExtraBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, extra_);
      }
      if (!getTitleBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, title_);
      }
      if (!getFormatBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, format_);
      }
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(9, timestamp_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Model)) {
        return super.equals(obj);
      }
      Model other = (Model) obj;

      if (getId()
          != other.getId()) return false;
      if (!getAction()
          .equals(other.getAction())) return false;
      if (!getContent()
          .equals(other.getContent())) return false;
      if (!getSender()
          .equals(other.getSender())) return false;
      if (!getReceiver()
          .equals(other.getReceiver())) return false;
      if (!getExtra()
          .equals(other.getExtra())) return false;
      if (!getTitle()
          .equals(other.getTitle())) return false;
      if (!getFormat()
          .equals(other.getFormat())) return false;
      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction().hashCode();
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + SENDER_FIELD_NUMBER;
      hash = (53 * hash) + getSender().hashCode();
      hash = (37 * hash) + RECEIVER_FIELD_NUMBER;
      hash = (53 * hash) + getReceiver().hashCode();
      hash = (37 * hash) + EXTRA_FIELD_NUMBER;
      hash = (53 * hash) + getExtra().hashCode();
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
      hash = (37 * hash) + FORMAT_FIELD_NUMBER;
      hash = (53 * hash) + getFormat().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Model parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Model parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Model parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Model parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Model parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Model parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Model parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Model parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Model parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Model parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Model parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Model parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Model prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.farsunset.cim.sdk.server.model.proto.Model}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.farsunset.cim.sdk.server.model.proto.Model)
        ModelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MessageProto.internal_static_com_farsunset_cim_sdk_server_model_proto_Model_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MessageProto.internal_static_com_farsunset_cim_sdk_server_model_proto_Model_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Model.class, Builder.class);
      }

      // Construct using com.farsunset.cim.sdk.server.model.proto.MessageProto.Model.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        id_ = 0L;

        action_ = "";

        content_ = "";

        sender_ = "";

        receiver_ = "";

        extra_ = "";

        title_ = "";

        format_ = "";

        timestamp_ = 0L;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MessageProto.internal_static_com_farsunset_cim_sdk_server_model_proto_Model_descriptor;
      }

      @Override
      public Model getDefaultInstanceForType() {
        return Model.getDefaultInstance();
      }

      @Override
      public Model build() {
        Model result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Model buildPartial() {
        Model result = new Model(this);
        result.id_ = id_;
        result.action_ = action_;
        result.content_ = content_;
        result.sender_ = sender_;
        result.receiver_ = receiver_;
        result.extra_ = extra_;
        result.title_ = title_;
        result.format_ = format_;
        result.timestamp_ = timestamp_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Model) {
          return mergeFrom((Model)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Model other) {
        if (other == Model.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (!other.getAction().isEmpty()) {
          action_ = other.action_;
          onChanged();
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        if (!other.getSender().isEmpty()) {
          sender_ = other.sender_;
          onChanged();
        }
        if (!other.getReceiver().isEmpty()) {
          receiver_ = other.receiver_;
          onChanged();
        }
        if (!other.getExtra().isEmpty()) {
          extra_ = other.extra_;
          onChanged();
        }
        if (!other.getTitle().isEmpty()) {
          title_ = other.title_;
          onChanged();
        }
        if (!other.getFormat().isEmpty()) {
          format_ = other.format_;
          onChanged();
        }
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Model parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Model) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>int64 id = 1;</code>
       * @return The id.
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>int64 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private Object action_ = "";
      /**
       * <code>string action = 2;</code>
       * @return The action.
       */
      public String getAction() {
        Object ref = action_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          action_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string action = 2;</code>
       * @return The bytes for action.
       */
      public com.google.protobuf.ByteString
          getActionBytes() {
        Object ref = action_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          action_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string action = 2;</code>
       * @param value The action to set.
       * @return This builder for chaining.
       */
      public Builder setAction(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        action_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string action = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAction() {
        
        action_ = getDefaultInstance().getAction();
        onChanged();
        return this;
      }
      /**
       * <code>string action = 2;</code>
       * @param value The bytes for action to set.
       * @return This builder for chaining.
       */
      public Builder setActionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        action_ = value;
        onChanged();
        return this;
      }

      private Object content_ = "";
      /**
       * <code>string content = 3;</code>
       * @return The content.
       */
      public String getContent() {
        Object ref = content_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string content = 3;</code>
       * @return The bytes for content.
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 3;</code>
       * @param value The content to set.
       * @return This builder for chaining.
       */
      public Builder setContent(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>string content = 3;</code>
       * @param value The bytes for content to set.
       * @return This builder for chaining.
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        content_ = value;
        onChanged();
        return this;
      }

      private Object sender_ = "";
      /**
       * <code>string sender = 4;</code>
       * @return The sender.
       */
      public String getSender() {
        Object ref = sender_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          sender_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string sender = 4;</code>
       * @return The bytes for sender.
       */
      public com.google.protobuf.ByteString
          getSenderBytes() {
        Object ref = sender_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          sender_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string sender = 4;</code>
       * @param value The sender to set.
       * @return This builder for chaining.
       */
      public Builder setSender(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sender_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string sender = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSender() {
        
        sender_ = getDefaultInstance().getSender();
        onChanged();
        return this;
      }
      /**
       * <code>string sender = 4;</code>
       * @param value The bytes for sender to set.
       * @return This builder for chaining.
       */
      public Builder setSenderBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sender_ = value;
        onChanged();
        return this;
      }

      private Object receiver_ = "";
      /**
       * <code>string receiver = 5;</code>
       * @return The receiver.
       */
      public String getReceiver() {
        Object ref = receiver_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          receiver_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string receiver = 5;</code>
       * @return The bytes for receiver.
       */
      public com.google.protobuf.ByteString
          getReceiverBytes() {
        Object ref = receiver_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          receiver_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string receiver = 5;</code>
       * @param value The receiver to set.
       * @return This builder for chaining.
       */
      public Builder setReceiver(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        receiver_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string receiver = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReceiver() {
        
        receiver_ = getDefaultInstance().getReceiver();
        onChanged();
        return this;
      }
      /**
       * <code>string receiver = 5;</code>
       * @param value The bytes for receiver to set.
       * @return This builder for chaining.
       */
      public Builder setReceiverBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        receiver_ = value;
        onChanged();
        return this;
      }

      private Object extra_ = "";
      /**
       * <code>string extra = 6;</code>
       * @return The extra.
       */
      public String getExtra() {
        Object ref = extra_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          extra_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string extra = 6;</code>
       * @return The bytes for extra.
       */
      public com.google.protobuf.ByteString
          getExtraBytes() {
        Object ref = extra_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          extra_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string extra = 6;</code>
       * @param value The extra to set.
       * @return This builder for chaining.
       */
      public Builder setExtra(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        extra_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string extra = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearExtra() {
        
        extra_ = getDefaultInstance().getExtra();
        onChanged();
        return this;
      }
      /**
       * <code>string extra = 6;</code>
       * @param value The bytes for extra to set.
       * @return This builder for chaining.
       */
      public Builder setExtraBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        extra_ = value;
        onChanged();
        return this;
      }

      private Object title_ = "";
      /**
       * <code>string title = 7;</code>
       * @return The title.
       */
      public String getTitle() {
        Object ref = title_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          title_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string title = 7;</code>
       * @return The bytes for title.
       */
      public com.google.protobuf.ByteString
          getTitleBytes() {
        Object ref = title_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          title_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string title = 7;</code>
       * @param value The title to set.
       * @return This builder for chaining.
       */
      public Builder setTitle(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        title_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string title = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTitle() {
        
        title_ = getDefaultInstance().getTitle();
        onChanged();
        return this;
      }
      /**
       * <code>string title = 7;</code>
       * @param value The bytes for title to set.
       * @return This builder for chaining.
       */
      public Builder setTitleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        title_ = value;
        onChanged();
        return this;
      }

      private Object format_ = "";
      /**
       * <code>string format = 8;</code>
       * @return The format.
       */
      public String getFormat() {
        Object ref = format_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          format_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string format = 8;</code>
       * @return The bytes for format.
       */
      public com.google.protobuf.ByteString
          getFormatBytes() {
        Object ref = format_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          format_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string format = 8;</code>
       * @param value The format to set.
       * @return This builder for chaining.
       */
      public Builder setFormat(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        format_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string format = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFormat() {
        
        format_ = getDefaultInstance().getFormat();
        onChanged();
        return this;
      }
      /**
       * <code>string format = 8;</code>
       * @param value The bytes for format to set.
       * @return This builder for chaining.
       */
      public Builder setFormatBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        format_ = value;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 9;</code>
       * @return The timestamp.
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 9;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(long value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0L;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.farsunset.cim.sdk.server.model.proto.Model)
    }

    // @@protoc_insertion_point(class_scope:com.farsunset.cim.sdk.server.model.proto.Model)
    private static final Model DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Model();
    }

    public static Model getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Model>
        PARSER = new com.google.protobuf.AbstractParser<Model>() {
      @Override
      public Model parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Model(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Model> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Model> getParserForType() {
      return PARSER;
    }

    @Override
    public Model getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_farsunset_cim_sdk_server_model_proto_Model_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_farsunset_cim_sdk_server_model_proto_Model_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rMessage.proto\022(com.farsunset.cim.sdk.s" +
      "erver.model.proto\"\227\001\n\005Model\022\n\n\002id\030\001 \001(\003\022" +
      "\016\n\006action\030\002 \001(\t\022\017\n\007content\030\003 \001(\t\022\016\n\006send" +
      "er\030\004 \001(\t\022\020\n\010receiver\030\005 \001(\t\022\r\n\005extra\030\006 \001(" +
      "\t\022\r\n\005title\030\007 \001(\t\022\016\n\006format\030\010 \001(\t\022\021\n\ttime" +
      "stamp\030\t \001(\003B\016B\014MessageProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_farsunset_cim_sdk_server_model_proto_Model_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_farsunset_cim_sdk_server_model_proto_Model_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_farsunset_cim_sdk_server_model_proto_Model_descriptor,
        new String[] { "Id", "Action", "Content", "Sender", "Receiver", "Extra", "Title", "Format", "Timestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
