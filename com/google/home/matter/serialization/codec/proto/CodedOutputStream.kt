// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization.codec.proto

public final class CodedOutputStream public constructor(byteStream: com.google.home.matter.serialization.codec.proto.ByteArrayOutputStream) {
    public companion object {
        public final fun newInstance(output: com.google.home.matter.serialization.codec.proto.ByteArrayOutputStream): com.google.home.matter.serialization.codec.proto.CodedOutputStream { /* compiled code */ }
    }

    private final val byteStream: com.google.home.matter.serialization.codec.proto.ByteArrayOutputStream /* compiled code */

    private final val byteStreamImpl: java.io.ByteArrayOutputStream /* compiled code */

    private final val codedStreamImpl: com.google.protobuf.CodedOutputStream /* compiled code */

    public final fun flush(): kotlin.Unit { /* compiled code */ }

    public final fun writeTag(fieldNumber: kotlin.Int, wireType: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public final fun writeByteArray(fieldNumber: kotlin.Int, value: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

    public final fun writeBool(fieldNumber: kotlin.Int, value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public final fun writeSInt32(fieldNumber: kotlin.Int, value: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public final fun writeSInt64(fieldNumber: kotlin.Int, value: kotlin.Long): kotlin.Unit { /* compiled code */ }

    public final fun writeUInt32(fieldNumber: kotlin.Int, value: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public final fun writeUInt64(fieldNumber: kotlin.Int, value: kotlin.Long): kotlin.Unit { /* compiled code */ }

    public final fun writeFloat(fieldNumber: kotlin.Int, value: kotlin.Float): kotlin.Unit { /* compiled code */ }

    public final fun writeDouble(fieldNumber: kotlin.Int, value: kotlin.Double): kotlin.Unit { /* compiled code */ }

    public final fun writeString(fieldNumber: kotlin.Int, value: kotlin.String): kotlin.Unit { /* compiled code */ }

    public final fun writeBoolNoTag(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public final fun writeSInt32NoTag(value: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public final fun writeSInt64NoTag(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

    public final fun writeUInt32NoTag(value: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public final fun writeUInt64NoTag(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

    public final fun writeFloatNoTag(value: kotlin.Float): kotlin.Unit { /* compiled code */ }

    public final fun writeDoubleNoTag(value: kotlin.Double): kotlin.Unit { /* compiled code */ }

    public final fun computeUInt32SizeNoTag(value: kotlin.Int): kotlin.Int { /* compiled code */ }

    public final fun computeSInt32SizeNoTag(value: kotlin.Int): kotlin.Int { /* compiled code */ }

    public final fun computeInt64SizeNoTag(value: kotlin.Long): kotlin.Int { /* compiled code */ }

    public final fun computeUInt64SizeNoTag(value: kotlin.Long): kotlin.Int { /* compiled code */ }

    public final fun computeSInt64SizeNoTag(value: kotlin.Long): kotlin.Int { /* compiled code */ }

    public final fun computeFloatSizeNoTag(value: kotlin.Float): kotlin.Int { /* compiled code */ }

    public final fun computeDoubleSizeNoTag(value: kotlin.Double): kotlin.Int { /* compiled code */ }

    public final fun computeBoolSizeNoTag(value: kotlin.Boolean): kotlin.Int { /* compiled code */ }
}
