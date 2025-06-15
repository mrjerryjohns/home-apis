// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization.codec.proto

public final class ProtoClusterWriter public constructor(strictOperationValidation: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterPayloadWriter {
    public companion object {
        public const final val MAX_LEVELS: kotlin.Int = COMPILED_CODE /* compiled code */
    }

    public open val strictOperationValidation: kotlin.Boolean /* compiled code */

    private final val levels: kotlin.collections.MutableList<com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.Level> /* compiled code */

    private final val wrapperLevels: kotlin.collections.MutableList<com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.Level> /* compiled code */

    public open val boolean: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.Boolean> /* compiled code */

    public open val byte: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.Byte> /* compiled code */

    public open val short: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.Short> /* compiled code */

    public open val int: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.Int> /* compiled code */

    public open val long: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.Long> /* compiled code */

    public open val ubyte: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.UByte> /* compiled code */

    public open val ushort: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.UShort> /* compiled code */

    public open val uint: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.UInt> /* compiled code */

    public open val ulong: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.ULong> /* compiled code */

    public open val float: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.Float> /* compiled code */

    public open val double: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.PackedFieldWriter<kotlin.Double> /* compiled code */

    public open val string: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.SimpleFieldWriter<kotlin.String> /* compiled code */

    public open val bytearray: com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.SimpleFieldWriter<kotlin.ByteArray> /* compiled code */

    public open val bitmap: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<com.google.home.matter.serialization.Bitmap> /* compiled code */

    private final fun underlying(): com.google.home.matter.serialization.codec.proto.ByteArrayOutputStream { /* compiled code */ }

    private final fun output(): com.google.home.matter.serialization.codec.proto.CodedOutputStream { /* compiled code */ }

    private final fun pushLevel(fieldNumber: kotlin.Int): kotlin.Unit { /* compiled code */ }

    private final fun popLevel(): kotlin.Unit { /* compiled code */ }

    private final fun maybePushLevel(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */): kotlin.Boolean { /* compiled code */ }

    private final fun maybePopLevel(maybe: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    private final fun primaryOutputStream(): com.google.home.matter.serialization.codec.proto.ByteArrayOutputStream { /* compiled code */ }

    private final inline fun <reified T> writePackedField(id: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: kotlin.collections.List<T>, output: com.google.home.matter.serialization.codec.proto.CodedOutputStream): kotlin.Unit { /* compiled code */ }

    private final inline fun <reified T> writeTag(id: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, output: com.google.home.matter.serialization.codec.proto.CodedOutputStream): kotlin.Unit { /* compiled code */ }

    private final inline fun <reified T> writeSize(value: kotlin.collections.List<T>, output: com.google.home.matter.serialization.codec.proto.CodedOutputStream): kotlin.Unit { /* compiled code */ }

    private final inline fun <reified T> writeValue(value: kotlin.collections.List<T>, output: com.google.home.matter.serialization.codec.proto.CodedOutputStream): kotlin.Unit { /* compiled code */ }

    public open fun <T : kotlin.Any> bitmap(adapter: com.google.home.matter.serialization.BitmapAdapter<T>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<T> { /* compiled code */ }

    public open fun <T : kotlin.Any> struct(adapter: com.google.home.matter.serialization.StructAdapter<T>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<T> { /* compiled code */ }

    public open fun wrapPayload(tags: kotlin.collections.List<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */>): kotlin.Unit { /* compiled code */ }

    public open fun <T> write(adapter: com.google.home.matter.serialization.StructAdapter<T>, value: T): kotlin.Unit { /* compiled code */ }

    public open fun toPayload(): com.google.home.matter.serialization.codec.proto.ProtoPayload { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    private final class Level public constructor(fieldNumber: kotlin.Int) {
        public final val fieldNumber: kotlin.Int /* compiled code */

        public final val byteArrayOutputStream: com.google.home.matter.serialization.codec.proto.ByteArrayOutputStream /* compiled code */

        public final val codedOutputStream: com.google.home.matter.serialization.codec.proto.CodedOutputStream /* compiled code */
    }

    public open inner class SimpleFieldWriter<T : kotlin.Any> public constructor(impl: (kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any, kotlin.Boolean) -> kotlin.Unit) : com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<T> {
        private final val impl: (kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any, kotlin.Boolean) -> kotlin.Unit /* compiled code */

        public open fun write(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: T?): kotlin.Unit { /* compiled code */ }

        public open fun write(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: com.google.home.matter.serialization.OptionalValue<out T?>): kotlin.Unit { /* compiled code */ }

        public open fun writeList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: kotlin.collections.List<T>?): kotlin.Unit { /* compiled code */ }

        public open fun writeList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: com.google.home.matter.serialization.OptionalValue<out kotlin.collections.List<T>?>): kotlin.Unit { /* compiled code */ }

        public open fun <NEWTYPE : kotlin.Any> adapt(adapter: com.google.home.matter.serialization.FieldAdapter<T, NEWTYPE>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<NEWTYPE> { /* compiled code */ }
    }

    public final inner class PackedFieldWriter<T : kotlin.Any> public constructor(impl: (kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any, kotlin.Boolean) -> kotlin.Unit) : com.google.home.matter.serialization.codec.proto.ProtoClusterWriter.SimpleFieldWriter<T> {
        private final val impl: (kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any, kotlin.Boolean) -> kotlin.Unit /* compiled code */

        public open fun writeList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: kotlin.collections.List<T>?): kotlin.Unit { /* compiled code */ }

        public open fun <NEWTYPE : kotlin.Any> adapt(adapter: com.google.home.matter.serialization.FieldAdapter<T, NEWTYPE>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<NEWTYPE> { /* compiled code */ }
    }
}

