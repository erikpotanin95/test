// automatically generated by the FlatBuffers compiler, do not modify

package messages;
import com.skillz.server.Message;
import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class OpponentResumed extends Message {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public OpponentResumed get(ByteBuffer _bb) { return get(_bb, new OpponentResumed()); }
  public OpponentResumed get(ByteBuffer _bb, OpponentResumed obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public OpponentResumed __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public short opcode() { int o = __offset(4); return o != 0 ? bb.getShort(o + bb_pos) : 8; }

  public static int createOpponentResumed(FlatBufferBuilder builder,
      short opcode) {
    builder.startTable(1);
    OpponentResumed.addOpcode(builder, opcode);
    return OpponentResumed.endOpponentResumed(builder);
  }

  public static void startOpponentResumed(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addOpcode(FlatBufferBuilder builder, short opcode) { builder.addShort(0, opcode, 8); }
  public static int endOpponentResumed(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public OpponentResumed get(int j) { return get(new OpponentResumed(), j); }
    public OpponentResumed get(OpponentResumed obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

