// automatically generated by the FlatBuffers compiler, do not modify

package messages;
import com.skillz.server.Message;
import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class KeepAlive extends Message {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public KeepAlive get(ByteBuffer _bb) { return get(_bb, new KeepAlive()); }
  public KeepAlive get(ByteBuffer _bb, KeepAlive obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public KeepAlive __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public short opcode() { int o = __offset(4); return o != 0 ? bb.getShort(o + bb_pos) : 2; }
  public boolean success() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createKeepAlive(FlatBufferBuilder builder,
      short opcode,
      boolean success) {
    builder.startTable(2);
    KeepAlive.addOpcode(builder, opcode);
    KeepAlive.addSuccess(builder, success);
    return KeepAlive.endKeepAlive(builder);
  }

  public static void startKeepAlive(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addOpcode(FlatBufferBuilder builder, short opcode) { builder.addShort(0, opcode, 2); }
  public static void addSuccess(FlatBufferBuilder builder, boolean success) { builder.addBoolean(1, success, false); }
  public static int endKeepAlive(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public KeepAlive get(int j) { return get(new KeepAlive(), j); }
    public KeepAlive get(KeepAlive obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

