// automatically generated, do not modify

package tmgg.me.mygittest.flatbuffer.CustomerResultData;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import tmgg.me.mygittest.flatbuffer.flatbuffers.FlatBufferBuilder;
import tmgg.me.mygittest.flatbuffer.flatbuffers.Table;

public class CustomerItem extends Table {
  public static CustomerItem getRootAsCustomerItem(ByteBuffer _bb) { return getRootAsCustomerItem(_bb, new CustomerItem()); }
  public static CustomerItem getRootAsCustomerItem(ByteBuffer _bb, CustomerItem obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public CustomerItem __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public boolean acceptState() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String brand() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer brandAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String brandImg() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer brandImgAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String chatCount() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer chatCountAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public String city() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer cityAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public long memberId() { int o = __offset(14); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public String memberImg() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer memberImgAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public String memberName() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer memberNameAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public String memberTel() { int o = __offset(20); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer memberTelAsByteBuffer() { return __vector_as_bytebuffer(20, 1); }
  public String mobile() { int o = __offset(22); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer mobileAsByteBuffer() { return __vector_as_bytebuffer(22, 1); }
  public String oracleId() { int o = __offset(24); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer oracleIdAsByteBuffer() { return __vector_as_bytebuffer(24, 1); }
  public String pinyin() { int o = __offset(26); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer pinyinAsByteBuffer() { return __vector_as_bytebuffer(26, 1); }
  public String remarkDes() { int o = __offset(28); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer remarkDesAsByteBuffer() { return __vector_as_bytebuffer(28, 1); }
  public String remarkName() { int o = __offset(30); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer remarkNameAsByteBuffer() { return __vector_as_bytebuffer(30, 1); }
  public boolean isBindCar() { int o = __offset(32); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean isCheck() { int o = __offset(34); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean isSVIP() { int o = __offset(36); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean isStar() { int o = __offset(38); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean isVIP() { int o = __offset(40); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public TagVoListBean tagVoList(int j) { return tagVoList(new TagVoListBean(), j); }
  public TagVoListBean tagVoList(TagVoListBean obj, int j) { int o = __offset(42); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int tagVoListLength() { int o = __offset(42); return o != 0 ? __vector_len(o) : 0; }

  public static int createCustomerItem(FlatBufferBuilder builder,
      boolean acceptState,
      int brand,
      int brandImg,
      int chatCount,
      int city,
      long memberId,
      int memberImg,
      int memberName,
      int memberTel,
      int mobile,
      int oracleId,
      int pinyin,
      int remarkDes,
      int remarkName,
      boolean isBindCar,
      boolean isCheck,
      boolean isSVIP,
      boolean isStar,
      boolean isVIP,
      int tagVoList) {
    builder.startObject(20);
    CustomerItem.addMemberId(builder, memberId);
    CustomerItem.addTagVoList(builder, tagVoList);
    CustomerItem.addRemarkName(builder, remarkName);
    CustomerItem.addRemarkDes(builder, remarkDes);
    CustomerItem.addPinyin(builder, pinyin);
    CustomerItem.addOracleId(builder, oracleId);
    CustomerItem.addMobile(builder, mobile);
    CustomerItem.addMemberTel(builder, memberTel);
    CustomerItem.addMemberName(builder, memberName);
    CustomerItem.addMemberImg(builder, memberImg);
    CustomerItem.addCity(builder, city);
    CustomerItem.addChatCount(builder, chatCount);
    CustomerItem.addBrandImg(builder, brandImg);
    CustomerItem.addBrand(builder, brand);
    CustomerItem.addIsVIP(builder, isVIP);
    CustomerItem.addIsStar(builder, isStar);
    CustomerItem.addIsSVIP(builder, isSVIP);
    CustomerItem.addIsCheck(builder, isCheck);
    CustomerItem.addIsBindCar(builder, isBindCar);
    CustomerItem.addAcceptState(builder, acceptState);
    return CustomerItem.endCustomerItem(builder);
  }

  public static void startCustomerItem(FlatBufferBuilder builder) { builder.startObject(20); }
  public static void addAcceptState(FlatBufferBuilder builder, boolean acceptState) { builder.addBoolean(0, acceptState, false); }
  public static void addBrand(FlatBufferBuilder builder, int brandOffset) { builder.addOffset(1, brandOffset, 0); }
  public static void addBrandImg(FlatBufferBuilder builder, int brandImgOffset) { builder.addOffset(2, brandImgOffset, 0); }
  public static void addChatCount(FlatBufferBuilder builder, int chatCountOffset) { builder.addOffset(3, chatCountOffset, 0); }
  public static void addCity(FlatBufferBuilder builder, int cityOffset) { builder.addOffset(4, cityOffset, 0); }
  public static void addMemberId(FlatBufferBuilder builder, long memberId) { builder.addLong(5, memberId, 0); }
  public static void addMemberImg(FlatBufferBuilder builder, int memberImgOffset) { builder.addOffset(6, memberImgOffset, 0); }
  public static void addMemberName(FlatBufferBuilder builder, int memberNameOffset) { builder.addOffset(7, memberNameOffset, 0); }
  public static void addMemberTel(FlatBufferBuilder builder, int memberTelOffset) { builder.addOffset(8, memberTelOffset, 0); }
  public static void addMobile(FlatBufferBuilder builder, int mobileOffset) { builder.addOffset(9, mobileOffset, 0); }
  public static void addOracleId(FlatBufferBuilder builder, int oracleIdOffset) { builder.addOffset(10, oracleIdOffset, 0); }
  public static void addPinyin(FlatBufferBuilder builder, int pinyinOffset) { builder.addOffset(11, pinyinOffset, 0); }
  public static void addRemarkDes(FlatBufferBuilder builder, int remarkDesOffset) { builder.addOffset(12, remarkDesOffset, 0); }
  public static void addRemarkName(FlatBufferBuilder builder, int remarkNameOffset) { builder.addOffset(13, remarkNameOffset, 0); }
  public static void addIsBindCar(FlatBufferBuilder builder, boolean isBindCar) { builder.addBoolean(14, isBindCar, false); }
  public static void addIsCheck(FlatBufferBuilder builder, boolean isCheck) { builder.addBoolean(15, isCheck, false); }
  public static void addIsSVIP(FlatBufferBuilder builder, boolean isSVIP) { builder.addBoolean(16, isSVIP, false); }
  public static void addIsStar(FlatBufferBuilder builder, boolean isStar) { builder.addBoolean(17, isStar, false); }
  public static void addIsVIP(FlatBufferBuilder builder, boolean isVIP) { builder.addBoolean(18, isVIP, false); }
  public static void addTagVoList(FlatBufferBuilder builder, int tagVoListOffset) { builder.addOffset(19, tagVoListOffset, 0); }
  public static int createTagVoListVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startTagVoListVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endCustomerItem(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

