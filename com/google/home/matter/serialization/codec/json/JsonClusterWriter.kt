// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization.codec.json

public final class JsonClusterWriter public constructor(out: com.google.nest.platform.mesh.serialization.json.JsonWriter = COMPILED_CODE, strictOperationValidation: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterPayloadWriter {
    public companion object {
        public final fun toJson(fn: (com.google.home.matter.serialization.codec.json.JsonClusterWriter) -> kotlin.Unit): kotlin.String { /* compiled code */ }
    }

    private final val out: com.google.nest.platform.mesh.serialization.json.JsonWriter /* compiled code */

    public open val strictOperationValidation: kotlin.Boolean /* compiled code */

    public open val ulong: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.ULong> /* compiled code */

    public open val long: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Long> /* compiled code */

    public open val boolean: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Boolean> /* compiled code */

    public open val float: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Float> /* compiled code */

    public open val double: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Double> /* compiled code */

    public open val string: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.String> /* compiled code */

    public open val bytearray: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.ByteArray> /* compiled code */

    public open val uint: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.UInt> /* compiled code */

    public open val int: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Int> /* compiled code */

    public open val ushort: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.UShort> /* compiled code */

    public open val short: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Short> /* compiled code */

    public open val byte: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Byte> /* compiled code */

    public open val ubyte: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.UByte> /* compiled code */

    public open val bitmap: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<com.google.home.matter.serialization.Bitmap> /* compiled code */

    public open fun toPayload(): com.google.home.matter.serialization.codec.json.JsonPayload { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public open fun wrapPayload(tags: kotlin.collections.List<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */>): kotlin.Unit { /* compiled code */ }

    public open fun <T> write(adapter: com.google.home.matter.serialization.StructAdapter<T>, value: T): kotlin.Unit { /* compiled code */ }

    public final fun <T> toJson(adapter: com.google.home.matter.serialization.StructAdapter<T>, value: T): kotlin.String { /* compiled code */ }

    public final fun name(tag: com.google.home.matter.serialization.codec.json.Tag): kotlin.Unit { /* compiled code */ }

    private final fun <T> nameAndNull(tag: com.google.home.matter.serialization.codec.json.Tag, value: T?): kotlin.Boolean { /* compiled code */ }

    private final fun value(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

    private final fun value(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

    public open fun <T : kotlin.Any> struct(adapter: com.google.home.matter.serialization.StructAdapter<T>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<T> { /* compiled code */ }

    public open fun <T : kotlin.Any> bitmap(adapter: com.google.home.matter.serialization.BitmapAdapter<T>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<T> { /* compiled code */ }

    private abstract class BaseWriter<T : kotlin.Any> public constructor() : com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<T> {
        public open fun <NEWRUNTIME : kotlin.Any> adapt(adapter: com.google.home.matter.serialization.FieldAdapter<T, NEWRUNTIME>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<NEWRUNTIME> { /* compiled code */ }

        public open fun writeList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: com.google.home.matter.serialization.OptionalValue<out kotlin.collections.List<T>?>): kotlin.Unit { /* compiled code */ }
    }

    private final class AdaptedWriter<FROM : kotlin.Any, TO : kotlin.Any> public constructor(writer: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<FROM>, adapter: (TO) -> FROM) : com.google.home.matter.serialization.codec.json.JsonClusterWriter.BaseWriter<TO> {
        public final val writer: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<FROM> /* compiled code */

        public final val adapter: (TO) -> FROM /* compiled code */

        public open fun write(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: TO?): kotlin.Unit { /* compiled code */ }

        public open fun write(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: com.google.home.matter.serialization.OptionalValue<out TO?>): kotlin.Unit { /* compiled code */ }

        public open fun writeList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: kotlin.collections.List<TO>?): kotlin.Unit { /* compiled code */ }
    }

    private open inner class FieldWriterImpl<T : kotlin.Any> public constructor(wireType: com.google.home.matter.serialization.WireType<T>, writerFn: (T) -> kotlin.Unit) : com.google.home.matter.serialization.codec.json.JsonClusterWriter.BaseWriter<T> {
        public final val wireType: com.google.home.matter.serialization.WireType<T> /* compiled code */

        public final val writerFn: (T) -> kotlin.Unit /* compiled code */

        public open fun write(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: T?): kotlin.Unit { /* compiled code */ }

        public open fun write(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: com.google.home.matter.serialization.OptionalValue<out T?>): kotlin.Unit { /* compiled code */ }

        public open fun writeList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: kotlin.collections.List<T>?): kotlin.Unit { /* compiled code */ }
    }
}
