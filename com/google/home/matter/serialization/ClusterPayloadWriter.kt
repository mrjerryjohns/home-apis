// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public interface ClusterPayloadWriter {
    public abstract val strictOperationValidation: kotlin.Boolean

    public abstract val uint: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.UInt>

    public abstract val ulong: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.ULong>

    public abstract val int: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Int>

    public abstract val long: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Long>

    public abstract val boolean: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Boolean>

    public abstract val float: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Float>

    public abstract val double: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Double>

    public abstract val string: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.String>

    public abstract val ushort: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.UShort>

    public abstract val short: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Short>

    public abstract val byte: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.Byte>

    public abstract val ubyte: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.UByte>

    public abstract val bytearray: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<kotlin.ByteArray>

    public abstract val bitmap: com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<com.google.home.matter.serialization.Bitmap>

    public abstract fun <T : kotlin.Any> bitmap(adapter: com.google.home.matter.serialization.BitmapAdapter<T>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<T>

    public abstract fun <T : kotlin.Any> struct(adapter: com.google.home.matter.serialization.StructAdapter<T>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<T>

    public open fun <T : com.google.home.matter.serialization.ClusterEnum> enum(adapter: com.google.home.matter.serialization.EnumAdapter<T>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<T> { /* compiled code */ }

    public abstract fun wrapPayload(tags: kotlin.collections.List<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */>): kotlin.Unit

    public abstract fun <T> write(adapter: com.google.home.matter.serialization.StructAdapter<T>, value: T): kotlin.Unit

    public abstract fun toPayload(): com.google.home.matter.serialization.SerializedPayload

    public interface FieldWriter<T : kotlin.Any> {
        public abstract fun write(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: T?): kotlin.Unit

        public abstract fun write(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: com.google.home.matter.serialization.OptionalValue<out T?>): kotlin.Unit

        public abstract fun writeList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: kotlin.collections.List<T>?): kotlin.Unit

        public abstract fun writeList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: com.google.home.matter.serialization.OptionalValue<out kotlin.collections.List<T>?>): kotlin.Unit

        public abstract fun <NEWTYPE : kotlin.Any> adapt(adapter: com.google.home.matter.serialization.FieldAdapter<T, NEWTYPE>): com.google.home.matter.serialization.ClusterPayloadWriter.FieldWriter<NEWTYPE>
    }
}
