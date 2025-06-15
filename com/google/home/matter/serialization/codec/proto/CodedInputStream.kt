// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization.codec.proto

public final class CodedInputStream public constructor(bytes: kotlin.ByteArray, impl: com.google.protobuf.CodedInputStream = COMPILED_CODE) {
    public companion object {
        public final fun newInstance(bytes: kotlin.ByteArray): com.google.home.matter.serialization.codec.proto.CodedInputStream { /* compiled code */ }
    }

    private final val bytes: kotlin.ByteArray /* compiled code */

    private final val impl: com.google.protobuf.CodedInputStream /* compiled code */

    public final fun pushLimit(byteLimit: kotlin.Int): kotlin.Int { /* compiled code */ }

    public final fun readRawVarint32(): kotlin.Int { /* compiled code */ }

    public final fun checkLastTagWas(value: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public final fun getBytesUntilLimit(): kotlin.Int { /* compiled code */ }

    public final fun popLimit(oldLimit: kotlin.Int): kotlin.Unit { /* compiled code */ }

    public final fun readTag(): kotlin.Int { /* compiled code */ }

    public final fun readUInt64(): kotlin.ULong { /* compiled code */ }

    public final fun readSInt64(): kotlin.Long { /* compiled code */ }

    public final fun readBool(): kotlin.Boolean { /* compiled code */ }

    public final fun readString(): kotlin.String { /* compiled code */ }

    public final fun readByteArray(): kotlin.ByteArray { /* compiled code */ }

    public final fun readFloat(): kotlin.Float { /* compiled code */ }

    public final fun readDouble(): kotlin.Double { /* compiled code */ }

    public final fun isAtEnd(): kotlin.Boolean { /* compiled code */ }

    public final fun skipField(tag: kotlin.Int): kotlin.Boolean { /* compiled code */ }
}
