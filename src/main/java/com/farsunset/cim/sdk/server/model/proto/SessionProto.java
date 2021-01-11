package com.farsunset.cim.sdk.server.model.proto;

public final class SessionProto {
  private SessionProto() {}
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
     * <code>string account = 2;</code>
     * @return The account.
     */
    String getAccount();
    /**
     * <code>string account = 2;</code>
     * @return The bytes for account.
     */
    com.google.protobuf.ByteString
        getAccountBytes();

    /**
     * <code>string nid = 3;</code>
     * @return The nid.
     */
    String getNid();
    /**
     * <code>string nid = 3;</code>
     * @return The bytes for nid.
     */
    com.google.protobuf.ByteString
        getNidBytes();

    /**
     * <code>string deviceId = 4;</code>
     * @return The deviceId.
     */
    String getDeviceId();
    /**
     * <code>string deviceId = 4;</code>
     * @return The bytes for deviceId.
     */
    com.google.protobuf.ByteString
        getDeviceIdBytes();

    /**
     * <code>string host = 5;</code>
     * @return The host.
     */
    String getHost();
    /**
     * <code>string host = 5;</code>
     * @return The bytes for host.
     */
    com.google.protobuf.ByteString
        getHostBytes();

    /**
     * <code>string channel = 6;</code>
     * @return The channel.
     */
    String getChannel();
    /**
     * <code>string channel = 6;</code>
     * @return The bytes for channel.
     */
    com.google.protobuf.ByteString
        getChannelBytes();

    /**
     * <code>string deviceModel = 7;</code>
     * @return The deviceModel.
     */
    String getDeviceModel();
    /**
     * <code>string deviceModel = 7;</code>
     * @return The bytes for deviceModel.
     */
    com.google.protobuf.ByteString
        getDeviceModelBytes();

    /**
     * <code>string clientVersion = 8;</code>
     * @return The clientVersion.
     */
    String getClientVersion();
    /**
     * <code>string clientVersion = 8;</code>
     * @return The bytes for clientVersion.
     */
    com.google.protobuf.ByteString
        getClientVersionBytes();

    /**
     * <code>string systemVersion = 9;</code>
     * @return The systemVersion.
     */
    String getSystemVersion();
    /**
     * <code>string systemVersion = 9;</code>
     * @return The bytes for systemVersion.
     */
    com.google.protobuf.ByteString
        getSystemVersionBytes();

    /**
     * <code>int64 bindTime = 10;</code>
     * @return The bindTime.
     */
    long getBindTime();

    /**
     * <code>double longitude = 11;</code>
     * @return The longitude.
     */
    double getLongitude();

    /**
     * <code>double latitude = 12;</code>
     * @return The latitude.
     */
    double getLatitude();

    /**
     * <code>string location = 13;</code>
     * @return The location.
     */
    String getLocation();
    /**
     * <code>string location = 13;</code>
     * @return The bytes for location.
     */
    com.google.protobuf.ByteString
        getLocationBytes();

    /**
     * <code>int32 apns = 14;</code>
     * @return The apns.
     */
    int getApns();

    /**
     * <code>int32 state = 15;</code>
     * @return The state.
     */
    int getState();
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
      account_ = "";
      nid_ = "";
      deviceId_ = "";
      host_ = "";
      channel_ = "";
      deviceModel_ = "";
      clientVersion_ = "";
      systemVersion_ = "";
      location_ = "";
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

              account_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              nid_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              deviceId_ = s;
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();

              host_ = s;
              break;
            }
            case 50: {
              String s = input.readStringRequireUtf8();

              channel_ = s;
              break;
            }
            case 58: {
              String s = input.readStringRequireUtf8();

              deviceModel_ = s;
              break;
            }
            case 66: {
              String s = input.readStringRequireUtf8();

              clientVersion_ = s;
              break;
            }
            case 74: {
              String s = input.readStringRequireUtf8();

              systemVersion_ = s;
              break;
            }
            case 80: {

              bindTime_ = input.readInt64();
              break;
            }
            case 89: {

              longitude_ = input.readDouble();
              break;
            }
            case 97: {

              latitude_ = input.readDouble();
              break;
            }
            case 106: {
              String s = input.readStringRequireUtf8();

              location_ = s;
              break;
            }
            case 112: {

              apns_ = input.readInt32();
              break;
            }
            case 120: {

              state_ = input.readInt32();
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
      return SessionProto.internal_static_com_farsunset_cim_sdk_server_model_proto_Model_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SessionProto.internal_static_com_farsunset_cim_sdk_server_model_proto_Model_fieldAccessorTable
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

    public static final int ACCOUNT_FIELD_NUMBER = 2;
    private volatile Object account_;
    /**
     * <code>string account = 2;</code>
     * @return The account.
     */
    public String getAccount() {
      Object ref = account_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        account_ = s;
        return s;
      }
    }
    /**
     * <code>string account = 2;</code>
     * @return The bytes for account.
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NID_FIELD_NUMBER = 3;
    private volatile Object nid_;
    /**
     * <code>string nid = 3;</code>
     * @return The nid.
     */
    public String getNid() {
      Object ref = nid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        nid_ = s;
        return s;
      }
    }
    /**
     * <code>string nid = 3;</code>
     * @return The bytes for nid.
     */
    public com.google.protobuf.ByteString
        getNidBytes() {
      Object ref = nid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        nid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEVICEID_FIELD_NUMBER = 4;
    private volatile Object deviceId_;
    /**
     * <code>string deviceId = 4;</code>
     * @return The deviceId.
     */
    public String getDeviceId() {
      Object ref = deviceId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        deviceId_ = s;
        return s;
      }
    }
    /**
     * <code>string deviceId = 4;</code>
     * @return The bytes for deviceId.
     */
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      Object ref = deviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HOST_FIELD_NUMBER = 5;
    private volatile Object host_;
    /**
     * <code>string host = 5;</code>
     * @return The host.
     */
    public String getHost() {
      Object ref = host_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        host_ = s;
        return s;
      }
    }
    /**
     * <code>string host = 5;</code>
     * @return The bytes for host.
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CHANNEL_FIELD_NUMBER = 6;
    private volatile Object channel_;
    /**
     * <code>string channel = 6;</code>
     * @return The channel.
     */
    public String getChannel() {
      Object ref = channel_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        channel_ = s;
        return s;
      }
    }
    /**
     * <code>string channel = 6;</code>
     * @return The bytes for channel.
     */
    public com.google.protobuf.ByteString
        getChannelBytes() {
      Object ref = channel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        channel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEVICEMODEL_FIELD_NUMBER = 7;
    private volatile Object deviceModel_;
    /**
     * <code>string deviceModel = 7;</code>
     * @return The deviceModel.
     */
    public String getDeviceModel() {
      Object ref = deviceModel_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        deviceModel_ = s;
        return s;
      }
    }
    /**
     * <code>string deviceModel = 7;</code>
     * @return The bytes for deviceModel.
     */
    public com.google.protobuf.ByteString
        getDeviceModelBytes() {
      Object ref = deviceModel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        deviceModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTVERSION_FIELD_NUMBER = 8;
    private volatile Object clientVersion_;
    /**
     * <code>string clientVersion = 8;</code>
     * @return The clientVersion.
     */
    public String getClientVersion() {
      Object ref = clientVersion_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        clientVersion_ = s;
        return s;
      }
    }
    /**
     * <code>string clientVersion = 8;</code>
     * @return The bytes for clientVersion.
     */
    public com.google.protobuf.ByteString
        getClientVersionBytes() {
      Object ref = clientVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        clientVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SYSTEMVERSION_FIELD_NUMBER = 9;
    private volatile Object systemVersion_;
    /**
     * <code>string systemVersion = 9;</code>
     * @return The systemVersion.
     */
    public String getSystemVersion() {
      Object ref = systemVersion_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        systemVersion_ = s;
        return s;
      }
    }
    /**
     * <code>string systemVersion = 9;</code>
     * @return The bytes for systemVersion.
     */
    public com.google.protobuf.ByteString
        getSystemVersionBytes() {
      Object ref = systemVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        systemVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BINDTIME_FIELD_NUMBER = 10;
    private long bindTime_;
    /**
     * <code>int64 bindTime = 10;</code>
     * @return The bindTime.
     */
    public long getBindTime() {
      return bindTime_;
    }

    public static final int LONGITUDE_FIELD_NUMBER = 11;
    private double longitude_;
    /**
     * <code>double longitude = 11;</code>
     * @return The longitude.
     */
    public double getLongitude() {
      return longitude_;
    }

    public static final int LATITUDE_FIELD_NUMBER = 12;
    private double latitude_;
    /**
     * <code>double latitude = 12;</code>
     * @return The latitude.
     */
    public double getLatitude() {
      return latitude_;
    }

    public static final int LOCATION_FIELD_NUMBER = 13;
    private volatile Object location_;
    /**
     * <code>string location = 13;</code>
     * @return The location.
     */
    public String getLocation() {
      Object ref = location_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        location_ = s;
        return s;
      }
    }
    /**
     * <code>string location = 13;</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int APNS_FIELD_NUMBER = 14;
    private int apns_;
    /**
     * <code>int32 apns = 14;</code>
     * @return The apns.
     */
    public int getApns() {
      return apns_;
    }

    public static final int STATE_FIELD_NUMBER = 15;
    private int state_;
    /**
     * <code>int32 state = 15;</code>
     * @return The state.
     */
    public int getState() {
      return state_;
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
      if (!getAccountBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, account_);
      }
      if (!getNidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nid_);
      }
      if (!getDeviceIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, deviceId_);
      }
      if (!getHostBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, host_);
      }
      if (!getChannelBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, channel_);
      }
      if (!getDeviceModelBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, deviceModel_);
      }
      if (!getClientVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, clientVersion_);
      }
      if (!getSystemVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, systemVersion_);
      }
      if (bindTime_ != 0L) {
        output.writeInt64(10, bindTime_);
      }
      if (longitude_ != 0D) {
        output.writeDouble(11, longitude_);
      }
      if (latitude_ != 0D) {
        output.writeDouble(12, latitude_);
      }
      if (!getLocationBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, location_);
      }
      if (apns_ != 0) {
        output.writeInt32(14, apns_);
      }
      if (state_ != 0) {
        output.writeInt32(15, state_);
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
      if (!getAccountBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, account_);
      }
      if (!getNidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nid_);
      }
      if (!getDeviceIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, deviceId_);
      }
      if (!getHostBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, host_);
      }
      if (!getChannelBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, channel_);
      }
      if (!getDeviceModelBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, deviceModel_);
      }
      if (!getClientVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, clientVersion_);
      }
      if (!getSystemVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, systemVersion_);
      }
      if (bindTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(10, bindTime_);
      }
      if (longitude_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(11, longitude_);
      }
      if (latitude_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(12, latitude_);
      }
      if (!getLocationBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, location_);
      }
      if (apns_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, apns_);
      }
      if (state_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, state_);
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
      if (!getAccount()
          .equals(other.getAccount())) return false;
      if (!getNid()
          .equals(other.getNid())) return false;
      if (!getDeviceId()
          .equals(other.getDeviceId())) return false;
      if (!getHost()
          .equals(other.getHost())) return false;
      if (!getChannel()
          .equals(other.getChannel())) return false;
      if (!getDeviceModel()
          .equals(other.getDeviceModel())) return false;
      if (!getClientVersion()
          .equals(other.getClientVersion())) return false;
      if (!getSystemVersion()
          .equals(other.getSystemVersion())) return false;
      if (getBindTime()
          != other.getBindTime()) return false;
      if (Double.doubleToLongBits(getLongitude())
          != Double.doubleToLongBits(
              other.getLongitude())) return false;
      if (Double.doubleToLongBits(getLatitude())
          != Double.doubleToLongBits(
              other.getLatitude())) return false;
      if (!getLocation()
          .equals(other.getLocation())) return false;
      if (getApns()
          != other.getApns()) return false;
      if (getState()
          != other.getState()) return false;
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
      hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAccount().hashCode();
      hash = (37 * hash) + NID_FIELD_NUMBER;
      hash = (53 * hash) + getNid().hashCode();
      hash = (37 * hash) + DEVICEID_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceId().hashCode();
      hash = (37 * hash) + HOST_FIELD_NUMBER;
      hash = (53 * hash) + getHost().hashCode();
      hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + getChannel().hashCode();
      hash = (37 * hash) + DEVICEMODEL_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceModel().hashCode();
      hash = (37 * hash) + CLIENTVERSION_FIELD_NUMBER;
      hash = (53 * hash) + getClientVersion().hashCode();
      hash = (37 * hash) + SYSTEMVERSION_FIELD_NUMBER;
      hash = (53 * hash) + getSystemVersion().hashCode();
      hash = (37 * hash) + BINDTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBindTime());
      hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          Double.doubleToLongBits(getLongitude()));
      hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          Double.doubleToLongBits(getLatitude()));
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
      hash = (37 * hash) + APNS_FIELD_NUMBER;
      hash = (53 * hash) + getApns();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState();
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
        return SessionProto.internal_static_com_farsunset_cim_sdk_server_model_proto_Model_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SessionProto.internal_static_com_farsunset_cim_sdk_server_model_proto_Model_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Model.class, Builder.class);
      }

      // Construct using com.farsunset.cim.sdk.server.model.proto.SessionProto.Model.newBuilder()
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

        account_ = "";

        nid_ = "";

        deviceId_ = "";

        host_ = "";

        channel_ = "";

        deviceModel_ = "";

        clientVersion_ = "";

        systemVersion_ = "";

        bindTime_ = 0L;

        longitude_ = 0D;

        latitude_ = 0D;

        location_ = "";

        apns_ = 0;

        state_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SessionProto.internal_static_com_farsunset_cim_sdk_server_model_proto_Model_descriptor;
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
        result.account_ = account_;
        result.nid_ = nid_;
        result.deviceId_ = deviceId_;
        result.host_ = host_;
        result.channel_ = channel_;
        result.deviceModel_ = deviceModel_;
        result.clientVersion_ = clientVersion_;
        result.systemVersion_ = systemVersion_;
        result.bindTime_ = bindTime_;
        result.longitude_ = longitude_;
        result.latitude_ = latitude_;
        result.location_ = location_;
        result.apns_ = apns_;
        result.state_ = state_;
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
        if (!other.getAccount().isEmpty()) {
          account_ = other.account_;
          onChanged();
        }
        if (!other.getNid().isEmpty()) {
          nid_ = other.nid_;
          onChanged();
        }
        if (!other.getDeviceId().isEmpty()) {
          deviceId_ = other.deviceId_;
          onChanged();
        }
        if (!other.getHost().isEmpty()) {
          host_ = other.host_;
          onChanged();
        }
        if (!other.getChannel().isEmpty()) {
          channel_ = other.channel_;
          onChanged();
        }
        if (!other.getDeviceModel().isEmpty()) {
          deviceModel_ = other.deviceModel_;
          onChanged();
        }
        if (!other.getClientVersion().isEmpty()) {
          clientVersion_ = other.clientVersion_;
          onChanged();
        }
        if (!other.getSystemVersion().isEmpty()) {
          systemVersion_ = other.systemVersion_;
          onChanged();
        }
        if (other.getBindTime() != 0L) {
          setBindTime(other.getBindTime());
        }
        if (other.getLongitude() != 0D) {
          setLongitude(other.getLongitude());
        }
        if (other.getLatitude() != 0D) {
          setLatitude(other.getLatitude());
        }
        if (!other.getLocation().isEmpty()) {
          location_ = other.location_;
          onChanged();
        }
        if (other.getApns() != 0) {
          setApns(other.getApns());
        }
        if (other.getState() != 0) {
          setState(other.getState());
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

      private Object account_ = "";
      /**
       * <code>string account = 2;</code>
       * @return The account.
       */
      public String getAccount() {
        Object ref = account_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          account_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string account = 2;</code>
       * @return The bytes for account.
       */
      public com.google.protobuf.ByteString
          getAccountBytes() {
        Object ref = account_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          account_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string account = 2;</code>
       * @param value The account to set.
       * @return This builder for chaining.
       */
      public Builder setAccount(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        account_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string account = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAccount() {
        
        account_ = getDefaultInstance().getAccount();
        onChanged();
        return this;
      }
      /**
       * <code>string account = 2;</code>
       * @param value The bytes for account to set.
       * @return This builder for chaining.
       */
      public Builder setAccountBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        account_ = value;
        onChanged();
        return this;
      }

      private Object nid_ = "";
      /**
       * <code>string nid = 3;</code>
       * @return The nid.
       */
      public String getNid() {
        Object ref = nid_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          nid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string nid = 3;</code>
       * @return The bytes for nid.
       */
      public com.google.protobuf.ByteString
          getNidBytes() {
        Object ref = nid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          nid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nid = 3;</code>
       * @param value The nid to set.
       * @return This builder for chaining.
       */
      public Builder setNid(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNid() {
        
        nid_ = getDefaultInstance().getNid();
        onChanged();
        return this;
      }
      /**
       * <code>string nid = 3;</code>
       * @param value The bytes for nid to set.
       * @return This builder for chaining.
       */
      public Builder setNidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nid_ = value;
        onChanged();
        return this;
      }

      private Object deviceId_ = "";
      /**
       * <code>string deviceId = 4;</code>
       * @return The deviceId.
       */
      public String getDeviceId() {
        Object ref = deviceId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          deviceId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string deviceId = 4;</code>
       * @return The bytes for deviceId.
       */
      public com.google.protobuf.ByteString
          getDeviceIdBytes() {
        Object ref = deviceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          deviceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string deviceId = 4;</code>
       * @param value The deviceId to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        deviceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string deviceId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeviceId() {
        
        deviceId_ = getDefaultInstance().getDeviceId();
        onChanged();
        return this;
      }
      /**
       * <code>string deviceId = 4;</code>
       * @param value The bytes for deviceId to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        deviceId_ = value;
        onChanged();
        return this;
      }

      private Object host_ = "";
      /**
       * <code>string host = 5;</code>
       * @return The host.
       */
      public String getHost() {
        Object ref = host_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          host_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string host = 5;</code>
       * @return The bytes for host.
       */
      public com.google.protobuf.ByteString
          getHostBytes() {
        Object ref = host_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          host_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string host = 5;</code>
       * @param value The host to set.
       * @return This builder for chaining.
       */
      public Builder setHost(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        host_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string host = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearHost() {
        
        host_ = getDefaultInstance().getHost();
        onChanged();
        return this;
      }
      /**
       * <code>string host = 5;</code>
       * @param value The bytes for host to set.
       * @return This builder for chaining.
       */
      public Builder setHostBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        host_ = value;
        onChanged();
        return this;
      }

      private Object channel_ = "";
      /**
       * <code>string channel = 6;</code>
       * @return The channel.
       */
      public String getChannel() {
        Object ref = channel_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          channel_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string channel = 6;</code>
       * @return The bytes for channel.
       */
      public com.google.protobuf.ByteString
          getChannelBytes() {
        Object ref = channel_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          channel_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string channel = 6;</code>
       * @param value The channel to set.
       * @return This builder for chaining.
       */
      public Builder setChannel(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        channel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string channel = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannel() {
        
        channel_ = getDefaultInstance().getChannel();
        onChanged();
        return this;
      }
      /**
       * <code>string channel = 6;</code>
       * @param value The bytes for channel to set.
       * @return This builder for chaining.
       */
      public Builder setChannelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        channel_ = value;
        onChanged();
        return this;
      }

      private Object deviceModel_ = "";
      /**
       * <code>string deviceModel = 7;</code>
       * @return The deviceModel.
       */
      public String getDeviceModel() {
        Object ref = deviceModel_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          deviceModel_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string deviceModel = 7;</code>
       * @return The bytes for deviceModel.
       */
      public com.google.protobuf.ByteString
          getDeviceModelBytes() {
        Object ref = deviceModel_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          deviceModel_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string deviceModel = 7;</code>
       * @param value The deviceModel to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceModel(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        deviceModel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string deviceModel = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeviceModel() {
        
        deviceModel_ = getDefaultInstance().getDeviceModel();
        onChanged();
        return this;
      }
      /**
       * <code>string deviceModel = 7;</code>
       * @param value The bytes for deviceModel to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceModelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        deviceModel_ = value;
        onChanged();
        return this;
      }

      private Object clientVersion_ = "";
      /**
       * <code>string clientVersion = 8;</code>
       * @return The clientVersion.
       */
      public String getClientVersion() {
        Object ref = clientVersion_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          clientVersion_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string clientVersion = 8;</code>
       * @return The bytes for clientVersion.
       */
      public com.google.protobuf.ByteString
          getClientVersionBytes() {
        Object ref = clientVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          clientVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string clientVersion = 8;</code>
       * @param value The clientVersion to set.
       * @return This builder for chaining.
       */
      public Builder setClientVersion(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clientVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string clientVersion = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientVersion() {
        
        clientVersion_ = getDefaultInstance().getClientVersion();
        onChanged();
        return this;
      }
      /**
       * <code>string clientVersion = 8;</code>
       * @param value The bytes for clientVersion to set.
       * @return This builder for chaining.
       */
      public Builder setClientVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clientVersion_ = value;
        onChanged();
        return this;
      }

      private Object systemVersion_ = "";
      /**
       * <code>string systemVersion = 9;</code>
       * @return The systemVersion.
       */
      public String getSystemVersion() {
        Object ref = systemVersion_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          systemVersion_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string systemVersion = 9;</code>
       * @return The bytes for systemVersion.
       */
      public com.google.protobuf.ByteString
          getSystemVersionBytes() {
        Object ref = systemVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          systemVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string systemVersion = 9;</code>
       * @param value The systemVersion to set.
       * @return This builder for chaining.
       */
      public Builder setSystemVersion(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        systemVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string systemVersion = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSystemVersion() {
        
        systemVersion_ = getDefaultInstance().getSystemVersion();
        onChanged();
        return this;
      }
      /**
       * <code>string systemVersion = 9;</code>
       * @param value The bytes for systemVersion to set.
       * @return This builder for chaining.
       */
      public Builder setSystemVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        systemVersion_ = value;
        onChanged();
        return this;
      }

      private long bindTime_ ;
      /**
       * <code>int64 bindTime = 10;</code>
       * @return The bindTime.
       */
      public long getBindTime() {
        return bindTime_;
      }
      /**
       * <code>int64 bindTime = 10;</code>
       * @param value The bindTime to set.
       * @return This builder for chaining.
       */
      public Builder setBindTime(long value) {
        
        bindTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 bindTime = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBindTime() {
        
        bindTime_ = 0L;
        onChanged();
        return this;
      }

      private double longitude_ ;
      /**
       * <code>double longitude = 11;</code>
       * @return The longitude.
       */
      public double getLongitude() {
        return longitude_;
      }
      /**
       * <code>double longitude = 11;</code>
       * @param value The longitude to set.
       * @return This builder for chaining.
       */
      public Builder setLongitude(double value) {
        
        longitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double longitude = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLongitude() {
        
        longitude_ = 0D;
        onChanged();
        return this;
      }

      private double latitude_ ;
      /**
       * <code>double latitude = 12;</code>
       * @return The latitude.
       */
      public double getLatitude() {
        return latitude_;
      }
      /**
       * <code>double latitude = 12;</code>
       * @param value The latitude to set.
       * @return This builder for chaining.
       */
      public Builder setLatitude(double value) {
        
        latitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double latitude = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLatitude() {
        
        latitude_ = 0D;
        onChanged();
        return this;
      }

      private Object location_ = "";
      /**
       * <code>string location = 13;</code>
       * @return The location.
       */
      public String getLocation() {
        Object ref = location_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          location_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string location = 13;</code>
       * @return The bytes for location.
       */
      public com.google.protobuf.ByteString
          getLocationBytes() {
        Object ref = location_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          location_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string location = 13;</code>
       * @param value The location to set.
       * @return This builder for chaining.
       */
      public Builder setLocation(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        location_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string location = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLocation() {
        
        location_ = getDefaultInstance().getLocation();
        onChanged();
        return this;
      }
      /**
       * <code>string location = 13;</code>
       * @param value The bytes for location to set.
       * @return This builder for chaining.
       */
      public Builder setLocationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        location_ = value;
        onChanged();
        return this;
      }

      private int apns_ ;
      /**
       * <code>int32 apns = 14;</code>
       * @return The apns.
       */
      public int getApns() {
        return apns_;
      }
      /**
       * <code>int32 apns = 14;</code>
       * @param value The apns to set.
       * @return This builder for chaining.
       */
      public Builder setApns(int value) {
        
        apns_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 apns = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearApns() {
        
        apns_ = 0;
        onChanged();
        return this;
      }

      private int state_ ;
      /**
       * <code>int32 state = 15;</code>
       * @return The state.
       */
      public int getState() {
        return state_;
      }
      /**
       * <code>int32 state = 15;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 state = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
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
      "\n\rSession.proto\022(com.farsunset.cim.sdk.s" +
      "erver.model.proto\"\213\002\n\005Model\022\n\n\002id\030\001 \001(\003\022" +
      "\017\n\007account\030\002 \001(\t\022\013\n\003nid\030\003 \001(\t\022\020\n\010deviceI" +
      "d\030\004 \001(\t\022\014\n\004host\030\005 \001(\t\022\017\n\007channel\030\006 \001(\t\022\023" +
      "\n\013deviceModel\030\007 \001(\t\022\025\n\rclientVersion\030\010 \001" +
      "(\t\022\025\n\rsystemVersion\030\t \001(\t\022\020\n\010bindTime\030\n " +
      "\001(\003\022\021\n\tlongitude\030\013 \001(\001\022\020\n\010latitude\030\014 \001(\001" +
      "\022\020\n\010location\030\r \001(\t\022\014\n\004apns\030\016 \001(\005\022\r\n\005stat" +
      "e\030\017 \001(\005B\016B\014SessionProtob\006proto3"
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
        new String[] { "Id", "Account", "Nid", "DeviceId", "Host", "Channel", "DeviceModel", "ClientVersion", "SystemVersion", "BindTime", "Longitude", "Latitude", "Location", "Apns", "State", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
