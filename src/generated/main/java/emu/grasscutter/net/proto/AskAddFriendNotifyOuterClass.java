// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AskAddFriendNotify.proto

package emu.grasscutter.net.proto;

public final class AskAddFriendNotifyOuterClass {
  private AskAddFriendNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AskAddFriendNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AskAddFriendNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_uid = 7;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>.FriendBrief target_friend_brief = 13;</code>
     * @return Whether the targetFriendBrief field is set.
     */
    boolean hasTargetFriendBrief();
    /**
     * <code>.FriendBrief target_friend_brief = 13;</code>
     * @return The targetFriendBrief.
     */
    emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getTargetFriendBrief();
    /**
     * <code>.FriendBrief target_friend_brief = 13;</code>
     */
    emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getTargetFriendBriefOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4086
   * Name: CDMDKCDGNPE
   * </pre>
   *
   * Protobuf type {@code AskAddFriendNotify}
   */
  public static final class AskAddFriendNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AskAddFriendNotify)
      AskAddFriendNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AskAddFriendNotify.newBuilder() to construct.
    private AskAddFriendNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AskAddFriendNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AskAddFriendNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AskAddFriendNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            case 56: {

              targetUid_ = input.readUInt32();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder subBuilder = null;
              if (targetFriendBrief_ != null) {
                subBuilder = targetFriendBrief_.toBuilder();
              }
              targetFriendBrief_ = input.readMessage(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetFriendBrief_);
                targetFriendBrief_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.internal_static_AskAddFriendNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.internal_static_AskAddFriendNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify.class, emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify.Builder.class);
    }

    public static final int TARGET_UID_FIELD_NUMBER = 7;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 7;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int TARGET_FRIEND_BRIEF_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief targetFriendBrief_;
    /**
     * <code>.FriendBrief target_friend_brief = 13;</code>
     * @return Whether the targetFriendBrief field is set.
     */
    @java.lang.Override
    public boolean hasTargetFriendBrief() {
      return targetFriendBrief_ != null;
    }
    /**
     * <code>.FriendBrief target_friend_brief = 13;</code>
     * @return The targetFriendBrief.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getTargetFriendBrief() {
      return targetFriendBrief_ == null ? emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance() : targetFriendBrief_;
    }
    /**
     * <code>.FriendBrief target_friend_brief = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getTargetFriendBriefOrBuilder() {
      return getTargetFriendBrief();
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
      if (targetUid_ != 0) {
        output.writeUInt32(7, targetUid_);
      }
      if (targetFriendBrief_ != null) {
        output.writeMessage(13, getTargetFriendBrief());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, targetUid_);
      }
      if (targetFriendBrief_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getTargetFriendBrief());
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
      if (!(obj instanceof emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify other = (emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (hasTargetFriendBrief() != other.hasTargetFriendBrief()) return false;
      if (hasTargetFriendBrief()) {
        if (!getTargetFriendBrief()
            .equals(other.getTargetFriendBrief())) return false;
      }
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
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      if (hasTargetFriendBrief()) {
        hash = (37 * hash) + TARGET_FRIEND_BRIEF_FIELD_NUMBER;
        hash = (53 * hash) + getTargetFriendBrief().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify prototype) {
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
     * CmdId: 4086
     * Name: CDMDKCDGNPE
     * </pre>
     *
     * Protobuf type {@code AskAddFriendNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AskAddFriendNotify)
        emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.internal_static_AskAddFriendNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.internal_static_AskAddFriendNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify.class, emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify.newBuilder()
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
        targetUid_ = 0;

        if (targetFriendBriefBuilder_ == null) {
          targetFriendBrief_ = null;
        } else {
          targetFriendBrief_ = null;
          targetFriendBriefBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.internal_static_AskAddFriendNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify build() {
        emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify buildPartial() {
        emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify result = new emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify(this);
        result.targetUid_ = targetUid_;
        if (targetFriendBriefBuilder_ == null) {
          result.targetFriendBrief_ = targetFriendBrief_;
        } else {
          result.targetFriendBrief_ = targetFriendBriefBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify other) {
        if (other == emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.hasTargetFriendBrief()) {
          mergeTargetFriendBrief(other.getTargetFriendBrief());
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
        emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 7;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 7;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief targetFriendBrief_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> targetFriendBriefBuilder_;
      /**
       * <code>.FriendBrief target_friend_brief = 13;</code>
       * @return Whether the targetFriendBrief field is set.
       */
      public boolean hasTargetFriendBrief() {
        return targetFriendBriefBuilder_ != null || targetFriendBrief_ != null;
      }
      /**
       * <code>.FriendBrief target_friend_brief = 13;</code>
       * @return The targetFriendBrief.
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getTargetFriendBrief() {
        if (targetFriendBriefBuilder_ == null) {
          return targetFriendBrief_ == null ? emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance() : targetFriendBrief_;
        } else {
          return targetFriendBriefBuilder_.getMessage();
        }
      }
      /**
       * <code>.FriendBrief target_friend_brief = 13;</code>
       */
      public Builder setTargetFriendBrief(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (targetFriendBriefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetFriendBrief_ = value;
          onChanged();
        } else {
          targetFriendBriefBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FriendBrief target_friend_brief = 13;</code>
       */
      public Builder setTargetFriendBrief(
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (targetFriendBriefBuilder_ == null) {
          targetFriendBrief_ = builderForValue.build();
          onChanged();
        } else {
          targetFriendBriefBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FriendBrief target_friend_brief = 13;</code>
       */
      public Builder mergeTargetFriendBrief(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (targetFriendBriefBuilder_ == null) {
          if (targetFriendBrief_ != null) {
            targetFriendBrief_ =
              emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.newBuilder(targetFriendBrief_).mergeFrom(value).buildPartial();
          } else {
            targetFriendBrief_ = value;
          }
          onChanged();
        } else {
          targetFriendBriefBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FriendBrief target_friend_brief = 13;</code>
       */
      public Builder clearTargetFriendBrief() {
        if (targetFriendBriefBuilder_ == null) {
          targetFriendBrief_ = null;
          onChanged();
        } else {
          targetFriendBrief_ = null;
          targetFriendBriefBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FriendBrief target_friend_brief = 13;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder getTargetFriendBriefBuilder() {
        
        onChanged();
        return getTargetFriendBriefFieldBuilder().getBuilder();
      }
      /**
       * <code>.FriendBrief target_friend_brief = 13;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getTargetFriendBriefOrBuilder() {
        if (targetFriendBriefBuilder_ != null) {
          return targetFriendBriefBuilder_.getMessageOrBuilder();
        } else {
          return targetFriendBrief_ == null ?
              emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance() : targetFriendBrief_;
        }
      }
      /**
       * <code>.FriendBrief target_friend_brief = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
          getTargetFriendBriefFieldBuilder() {
        if (targetFriendBriefBuilder_ == null) {
          targetFriendBriefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder>(
                  getTargetFriendBrief(),
                  getParentForChildren(),
                  isClean());
          targetFriendBrief_ = null;
        }
        return targetFriendBriefBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AskAddFriendNotify)
    }

    // @@protoc_insertion_point(class_scope:AskAddFriendNotify)
    private static final emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify();
    }

    public static emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AskAddFriendNotify>
        PARSER = new com.google.protobuf.AbstractParser<AskAddFriendNotify>() {
      @java.lang.Override
      public AskAddFriendNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AskAddFriendNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AskAddFriendNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AskAddFriendNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AskAddFriendNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AskAddFriendNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030AskAddFriendNotify.proto\032\021FriendBrief." +
      "proto\"S\n\022AskAddFriendNotify\022\022\n\ntarget_ui" +
      "d\030\007 \001(\r\022)\n\023target_friend_brief\030\r \001(\0132\014.F" +
      "riendBriefB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FriendBriefOuterClass.getDescriptor(),
        });
    internal_static_AskAddFriendNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AskAddFriendNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AskAddFriendNotify_descriptor,
        new java.lang.String[] { "TargetUid", "TargetFriendBrief", });
    emu.grasscutter.net.proto.FriendBriefOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
