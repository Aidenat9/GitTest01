// automatically generated, do not modify

package tmgg.me.mygittest.flatbuffer.CustomerResultData;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import tmgg.me.mygittest.flatbuffer.flatbuffers.FlatBufferBuilder;
import tmgg.me.mygittest.flatbuffer.flatbuffers.Table;


public class RootType extends Table {
  public static RootType getRootAsRootType(ByteBuffer _bb) { return getRootAsRootType(_bb, new RootType()); }
  public static RootType getRootAsRootType(ByteBuffer _bb, RootType obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public RootType __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String detail() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer detailAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String message() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer messageAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public boolean isSuccess() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public ResultData resultData() { return resultData(new ResultData()); }
  public ResultData resultData(ResultData obj) { int o = __offset(10); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }

  public static int createRootType(FlatBufferBuilder builder,
      int detail,
      int message,
      boolean isSuccess,
      int resultData) {
    builder.startObject(4);
    RootType.addResultData(builder, resultData);
    RootType.addMessage(builder, message);
    RootType.addDetail(builder, detail);
    RootType.addIsSuccess(builder, isSuccess);
    return RootType.endRootType(builder);
  }

  public static void startRootType(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addDetail(FlatBufferBuilder builder, int detailOffset) { builder.addOffset(0, detailOffset, 0); }
  public static void addMessage(FlatBufferBuilder builder, int messageOffset) { builder.addOffset(1, messageOffset, 0); }
  public static void addIsSuccess(FlatBufferBuilder builder, boolean isSuccess) { builder.addBoolean(2, isSuccess, false); }
  public static void addResultData(FlatBufferBuilder builder, int resultDataOffset) { builder.addOffset(3, resultDataOffset, 0); }
  public static int endRootType(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishRootTypeBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
};

