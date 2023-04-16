// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeSprintBoatRecord.proto

package emu.grasscutter.net.proto;

public final class SummerTimeSprintBoatRecordOuterClass {
  private SummerTimeSprintBoatRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeSprintBoatRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeSprintBoatRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 watcher_id_list = 12;</code>
     * @return A list containing the watcherIdList.
     */
    java.util.List<java.lang.Integer> getWatcherIdListList();
    /**
     * <code>repeated uint32 watcher_id_list = 12;</code>
     * @return The count of watcherIdList.
     */
    int getWatcherIdListCount();
    /**
     * <code>repeated uint32 watcher_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The watcherIdList at the given index.
     */
    int getWatcherIdList(int index);

    /**
     * <code>uint32 start_time = 9;</code>
     * @return The startTime.
     */
    int getStartTime();

    /**
     * <code>uint32 best_score = 1;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>uint32 group_id = 3;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>bool is_touched = 10;</code>
     * @return The isTouched.
     */
    boolean getIsTouched();
  }
  /**
   * <pre>
   * Name: FNBEPEJNOFD
   * </pre>
   *
   * Protobuf type {@code SummerTimeSprintBoatRecord}
   */
  public static final class SummerTimeSprintBoatRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeSprintBoatRecord)
      SummerTimeSprintBoatRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeSprintBoatRecord.newBuilder() to construct.
    private SummerTimeSprintBoatRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeSprintBoatRecord() {
      watcherIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeSprintBoatRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SummerTimeSprintBoatRecord(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              bestScore_ = input.readUInt32();
              break;
            }
            case 24: {

              groupId_ = input.readUInt32();
              break;
            }
            case 72: {

              startTime_ = input.readUInt32();
              break;
            }
            case 80: {

              isTouched_ = input.readBool();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                watcherIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              watcherIdList_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                watcherIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                watcherIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          watcherIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.internal_static_SummerTimeSprintBoatRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.internal_static_SummerTimeSprintBoatRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.class, emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.Builder.class);
    }

    public static final int WATCHER_ID_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList watcherIdList_;
    /**
     * <code>repeated uint32 watcher_id_list = 12;</code>
     * @return A list containing the watcherIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getWatcherIdListList() {
      return watcherIdList_;
    }
    /**
     * <code>repeated uint32 watcher_id_list = 12;</code>
     * @return The count of watcherIdList.
     */
    public int getWatcherIdListCount() {
      return watcherIdList_.size();
    }
    /**
     * <code>repeated uint32 watcher_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The watcherIdList at the given index.
     */
    public int getWatcherIdList(int index) {
      return watcherIdList_.getInt(index);
    }
    private int watcherIdListMemoizedSerializedSize = -1;

    public static final int START_TIME_FIELD_NUMBER = 9;
    private int startTime_;
    /**
     * <code>uint32 start_time = 9;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 1;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 1;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 3;
    private int groupId_;
    /**
     * <code>uint32 group_id = 3;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int IS_TOUCHED_FIELD_NUMBER = 10;
    private boolean isTouched_;
    /**
     * <code>bool is_touched = 10;</code>
     * @return The isTouched.
     */
    @java.lang.Override
    public boolean getIsTouched() {
      return isTouched_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (bestScore_ != 0) {
        output.writeUInt32(1, bestScore_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(3, groupId_);
      }
      if (startTime_ != 0) {
        output.writeUInt32(9, startTime_);
      }
      if (isTouched_ != false) {
        output.writeBool(10, isTouched_);
      }
      if (getWatcherIdListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(watcherIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < watcherIdList_.size(); i++) {
        output.writeUInt32NoTag(watcherIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, bestScore_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, groupId_);
      }
      if (startTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, startTime_);
      }
      if (isTouched_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isTouched_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < watcherIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(watcherIdList_.getInt(i));
        }
        size += dataSize;
        if (!getWatcherIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        watcherIdListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord other = (emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord) obj;

      if (!getWatcherIdListList()
          .equals(other.getWatcherIdListList())) return false;
      if (getStartTime()
          != other.getStartTime()) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getIsTouched()
          != other.getIsTouched()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getWatcherIdListCount() > 0) {
        hash = (37 * hash) + WATCHER_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getWatcherIdListList().hashCode();
      }
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime();
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + IS_TOUCHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTouched());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: FNBEPEJNOFD
     * </pre>
     *
     * Protobuf type {@code SummerTimeSprintBoatRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeSprintBoatRecord)
        emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.internal_static_SummerTimeSprintBoatRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.internal_static_SummerTimeSprintBoatRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.class, emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        watcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        startTime_ = 0;

        bestScore_ = 0;

        groupId_ = 0;

        isTouched_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.internal_static_SummerTimeSprintBoatRecord_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord build() {
        emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord buildPartial() {
        emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord result = new emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          watcherIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.watcherIdList_ = watcherIdList_;
        result.startTime_ = startTime_;
        result.bestScore_ = bestScore_;
        result.groupId_ = groupId_;
        result.isTouched_ = isTouched_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord) {
          return mergeFrom((emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord other) {
        if (other == emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord.getDefaultInstance()) return this;
        if (!other.watcherIdList_.isEmpty()) {
          if (watcherIdList_.isEmpty()) {
            watcherIdList_ = other.watcherIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWatcherIdListIsMutable();
            watcherIdList_.addAll(other.watcherIdList_);
          }
          onChanged();
        }
        if (other.getStartTime() != 0) {
          setStartTime(other.getStartTime());
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getIsTouched() != false) {
          setIsTouched(other.getIsTouched());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList watcherIdList_ = emptyIntList();
      private void ensureWatcherIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          watcherIdList_ = mutableCopy(watcherIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 watcher_id_list = 12;</code>
       * @return A list containing the watcherIdList.
       */
      public java.util.List<java.lang.Integer>
          getWatcherIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(watcherIdList_) : watcherIdList_;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 12;</code>
       * @return The count of watcherIdList.
       */
      public int getWatcherIdListCount() {
        return watcherIdList_.size();
      }
      /**
       * <code>repeated uint32 watcher_id_list = 12;</code>
       * @param index The index of the element to return.
       * @return The watcherIdList at the given index.
       */
      public int getWatcherIdList(int index) {
        return watcherIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 watcher_id_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The watcherIdList to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherIdList(
          int index, int value) {
        ensureWatcherIdListIsMutable();
        watcherIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 12;</code>
       * @param value The watcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addWatcherIdList(int value) {
        ensureWatcherIdListIsMutable();
        watcherIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 12;</code>
       * @param values The watcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllWatcherIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureWatcherIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, watcherIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherIdList() {
        watcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int startTime_ ;
      /**
       * <code>uint32 start_time = 9;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public int getStartTime() {
        return startTime_;
      }
      /**
       * <code>uint32 start_time = 9;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(int value) {
        
        startTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        
        startTime_ = 0;
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 1;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 1;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 3;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 3;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private boolean isTouched_ ;
      /**
       * <code>bool is_touched = 10;</code>
       * @return The isTouched.
       */
      @java.lang.Override
      public boolean getIsTouched() {
        return isTouched_;
      }
      /**
       * <code>bool is_touched = 10;</code>
       * @param value The isTouched to set.
       * @return This builder for chaining.
       */
      public Builder setIsTouched(boolean value) {
        
        isTouched_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_touched = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTouched() {
        
        isTouched_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SummerTimeSprintBoatRecord)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeSprintBoatRecord)
    private static final emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord();
    }

    public static emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeSprintBoatRecord>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeSprintBoatRecord>() {
      @java.lang.Override
      public SummerTimeSprintBoatRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SummerTimeSprintBoatRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SummerTimeSprintBoatRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeSprintBoatRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SummerTimeSprintBoatRecordOuterClass.SummerTimeSprintBoatRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeSprintBoatRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeSprintBoatRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n SummerTimeSprintBoatRecord.proto\"\203\001\n\032S" +
      "ummerTimeSprintBoatRecord\022\027\n\017watcher_id_" +
      "list\030\014 \003(\r\022\022\n\nstart_time\030\t \001(\r\022\022\n\nbest_s" +
      "core\030\001 \001(\r\022\020\n\010group_id\030\003 \001(\r\022\022\n\nis_touch" +
      "ed\030\n \001(\010B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SummerTimeSprintBoatRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeSprintBoatRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeSprintBoatRecord_descriptor,
        new java.lang.String[] { "WatcherIdList", "StartTime", "BestScore", "GroupId", "IsTouched", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
