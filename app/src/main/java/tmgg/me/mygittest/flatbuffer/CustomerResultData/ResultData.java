// automatically generated, do not modify

package tmgg.me.mygittest.flatbuffer.CustomerResultData;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import tmgg.me.mygittest.flatbuffer.flatbuffers.FlatBufferBuilder;
import tmgg.me.mygittest.flatbuffer.flatbuffers.Table;

public class ResultData extends Table {
  public static ResultData getRootAsResultData(ByteBuffer _bb) { return getRootAsResultData(_bb, new ResultData()); }
  public static ResultData getRootAsResultData(ByteBuffer _bb, ResultData obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public ResultData __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public CustomerItem content(int j) { return content(new CustomerItem(), j); }
  public CustomerItem content(CustomerItem obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int contentLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public int offset() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int pageIndex() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int pageSize() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int pageTotal() { int o = __offset(12); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int size() { int o = __offset(14); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int total() { int o = __offset(16); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createResultData(FlatBufferBuilder builder,
      int content,
      int offset,
      int pageIndex,
      int pageSize,
      int pageTotal,
      int size,
      int total) {
    builder.startObject(7);
    ResultData.addTotal(builder, total);
    ResultData.addSize(builder, size);
    ResultData.addPageTotal(builder, pageTotal);
    ResultData.addPageSize(builder, pageSize);
    ResultData.addPageIndex(builder, pageIndex);
    ResultData.addOffset(builder, offset);
    ResultData.addContent(builder, content);
    return ResultData.endResultData(builder);
  }

  public static void startResultData(FlatBufferBuilder builder) { builder.startObject(7); }
  public static void addContent(FlatBufferBuilder builder, int contentOffset) { builder.addOffset(0, contentOffset, 0); }
  public static int createContentVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startContentVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addOffset(FlatBufferBuilder builder, int offset) { builder.addInt(1, offset, 0); }
  public static void addPageIndex(FlatBufferBuilder builder, int pageIndex) { builder.addInt(2, pageIndex, 0); }
  public static void addPageSize(FlatBufferBuilder builder, int pageSize) { builder.addInt(3, pageSize, 0); }
  public static void addPageTotal(FlatBufferBuilder builder, int pageTotal) { builder.addInt(4, pageTotal, 0); }
  public static void addSize(FlatBufferBuilder builder, int size) { builder.addInt(5, size, 0); }
  public static void addTotal(FlatBufferBuilder builder, int total) { builder.addInt(6, total, 0); }
  public static int endResultData(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

