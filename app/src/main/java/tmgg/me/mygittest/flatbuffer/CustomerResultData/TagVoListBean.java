// automatically generated, do not modify

package tmgg.me.mygittest.flatbuffer.CustomerResultData;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import tmgg.me.mygittest.flatbuffer.flatbuffers.FlatBufferBuilder;
import tmgg.me.mygittest.flatbuffer.flatbuffers.Table;

public class TagVoListBean extends Table {
  public static TagVoListBean getRootAsTagVoListBean(ByteBuffer _bb) { return getRootAsTagVoListBean(_bb, new TagVoListBean()); }
  public static TagVoListBean getRootAsTagVoListBean(ByteBuffer _bb, TagVoListBean obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public TagVoListBean __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String manangerId() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer manangerIdAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String tagContent() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer tagContentAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String tagId() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer tagIdAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }

  public static int createTagVoListBean(FlatBufferBuilder builder,
      int id,
      int manangerId,
      int tagContent,
      int tagId) {
    builder.startObject(4);
    TagVoListBean.addTagId(builder, tagId);
    TagVoListBean.addTagContent(builder, tagContent);
    TagVoListBean.addManangerId(builder, manangerId);
    TagVoListBean.addId(builder, id);
    return TagVoListBean.endTagVoListBean(builder);
  }

  public static void startTagVoListBean(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addManangerId(FlatBufferBuilder builder, int manangerIdOffset) { builder.addOffset(1, manangerIdOffset, 0); }
  public static void addTagContent(FlatBufferBuilder builder, int tagContentOffset) { builder.addOffset(2, tagContentOffset, 0); }
  public static void addTagId(FlatBufferBuilder builder, int tagIdOffset) { builder.addOffset(3, tagIdOffset, 0); }
  public static int endTagVoListBean(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

