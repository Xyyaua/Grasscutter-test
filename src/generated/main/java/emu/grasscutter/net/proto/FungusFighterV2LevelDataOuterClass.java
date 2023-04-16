// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterV2LevelData.proto

package emu.grasscutter.net.proto;

public final class FungusFighterV2LevelDataOuterClass {
  private FungusFighterV2LevelDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterV2LevelDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterV2LevelData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 PHEIGICNDCJ = 14;</code>
     * @return The pHEIGICNDCJ.
     */
    int getPHEIGICNDCJ();

    /**
     * <code>bool is_level_open = 10;</code>
     * @return The isLevelOpen.
     */
    boolean getIsLevelOpen();
  }
  /**
   * <pre>
   * Name: GEPNCOBIMBD
   * </pre>
   *
   * Protobuf type {@code FungusFighterV2LevelData}
   */
  public static final class FungusFighterV2LevelData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterV2LevelData)
      FungusFighterV2LevelDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterV2LevelData.newBuilder() to construct.
    private FungusFighterV2LevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterV2LevelData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterV2LevelData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusFighterV2LevelData(
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
            case 40: {

              levelId_ = input.readUInt32();
              break;
            }
            case 80: {

              isLevelOpen_ = input.readBool();
              break;
            }
            case 112: {

              pHEIGICNDCJ_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.internal_static_FungusFighterV2LevelData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.internal_static_FungusFighterV2LevelData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.class, emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 5;
    private int levelId_;
    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int PHEIGICNDCJ_FIELD_NUMBER = 14;
    private int pHEIGICNDCJ_;
    /**
     * <code>uint32 PHEIGICNDCJ = 14;</code>
     * @return The pHEIGICNDCJ.
     */
    @java.lang.Override
    public int getPHEIGICNDCJ() {
      return pHEIGICNDCJ_;
    }

    public static final int IS_LEVEL_OPEN_FIELD_NUMBER = 10;
    private boolean isLevelOpen_;
    /**
     * <code>bool is_level_open = 10;</code>
     * @return The isLevelOpen.
     */
    @java.lang.Override
    public boolean getIsLevelOpen() {
      return isLevelOpen_;
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
      if (levelId_ != 0) {
        output.writeUInt32(5, levelId_);
      }
      if (isLevelOpen_ != false) {
        output.writeBool(10, isLevelOpen_);
      }
      if (pHEIGICNDCJ_ != 0) {
        output.writeUInt32(14, pHEIGICNDCJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, levelId_);
      }
      if (isLevelOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isLevelOpen_);
      }
      if (pHEIGICNDCJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, pHEIGICNDCJ_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData other = (emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getPHEIGICNDCJ()
          != other.getPHEIGICNDCJ()) return false;
      if (getIsLevelOpen()
          != other.getIsLevelOpen()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + PHEIGICNDCJ_FIELD_NUMBER;
      hash = (53 * hash) + getPHEIGICNDCJ();
      hash = (37 * hash) + IS_LEVEL_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLevelOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData prototype) {
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
     * Name: GEPNCOBIMBD
     * </pre>
     *
     * Protobuf type {@code FungusFighterV2LevelData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterV2LevelData)
        emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.internal_static_FungusFighterV2LevelData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.internal_static_FungusFighterV2LevelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.class, emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.newBuilder()
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
        levelId_ = 0;

        pHEIGICNDCJ_ = 0;

        isLevelOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.internal_static_FungusFighterV2LevelData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData build() {
        emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData buildPartial() {
        emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData result = new emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData(this);
        result.levelId_ = levelId_;
        result.pHEIGICNDCJ_ = pHEIGICNDCJ_;
        result.isLevelOpen_ = isLevelOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData) {
          return mergeFrom((emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData other) {
        if (other == emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getPHEIGICNDCJ() != 0) {
          setPHEIGICNDCJ(other.getPHEIGICNDCJ());
        }
        if (other.getIsLevelOpen() != false) {
          setIsLevelOpen(other.getIsLevelOpen());
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
        emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 5;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int pHEIGICNDCJ_ ;
      /**
       * <code>uint32 PHEIGICNDCJ = 14;</code>
       * @return The pHEIGICNDCJ.
       */
      @java.lang.Override
      public int getPHEIGICNDCJ() {
        return pHEIGICNDCJ_;
      }
      /**
       * <code>uint32 PHEIGICNDCJ = 14;</code>
       * @param value The pHEIGICNDCJ to set.
       * @return This builder for chaining.
       */
      public Builder setPHEIGICNDCJ(int value) {
        
        pHEIGICNDCJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PHEIGICNDCJ = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearPHEIGICNDCJ() {
        
        pHEIGICNDCJ_ = 0;
        onChanged();
        return this;
      }

      private boolean isLevelOpen_ ;
      /**
       * <code>bool is_level_open = 10;</code>
       * @return The isLevelOpen.
       */
      @java.lang.Override
      public boolean getIsLevelOpen() {
        return isLevelOpen_;
      }
      /**
       * <code>bool is_level_open = 10;</code>
       * @param value The isLevelOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsLevelOpen(boolean value) {
        
        isLevelOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_level_open = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLevelOpen() {
        
        isLevelOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:FungusFighterV2LevelData)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterV2LevelData)
    private static final emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData();
    }

    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterV2LevelData>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterV2LevelData>() {
      @java.lang.Override
      public FungusFighterV2LevelData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusFighterV2LevelData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusFighterV2LevelData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterV2LevelData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterV2LevelData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterV2LevelData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036FungusFighterV2LevelData.proto\"X\n\030Fung" +
      "usFighterV2LevelData\022\020\n\010level_id\030\005 \001(\r\022\023" +
      "\n\013PHEIGICNDCJ\030\016 \001(\r\022\025\n\ris_level_open\030\n \001" +
      "(\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusFighterV2LevelData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterV2LevelData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterV2LevelData_descriptor,
        new java.lang.String[] { "LevelId", "PHEIGICNDCJ", "IsLevelOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
