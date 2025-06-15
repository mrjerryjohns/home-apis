// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public final class ClusterPayload public constructor(payload: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?>) {
    private final val payload: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?> /* compiled code */

    public final val ulong: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.ULong> /* compiled code */

    public final val long: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.Long> /* compiled code */

    public final val boolean: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.Boolean> /* compiled code */

    public final val float: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.Float> /* compiled code */

    public final val double: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.Double> /* compiled code */

    public final val string: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.String> /* compiled code */

    public final val bytearray: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.ByteArray> /* compiled code */

    public final val uint: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.UInt> /* compiled code */

    public final val ushort: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.UShort> /* compiled code */

    public final val ubyte: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.UByte> /* compiled code */

    public final val int: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.Int> /* compiled code */

    public final val short: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.Short> /* compiled code */

    public final val byte: com.google.home.matter.serialization.ClusterPayload.FieldReader<kotlin.Byte> /* compiled code */

    public final val bitmap: com.google.home.matter.serialization.ClusterPayload.FieldReader<com.google.home.matter.serialization.Bitmap> /* compiled code */

    public final inline fun <reified T : kotlin.Any> struct(noinline defaultValueGenerator: () -> T): com.google.home.matter.serialization.ClusterPayload.FieldReader<T> { /* compiled code */ }

    public final inline fun <reified T : kotlin.Any> struct(adapter: com.google.home.matter.serialization.StructAdapter<T>, noinline defaultValueGenerator: () -> T): com.google.home.matter.serialization.ClusterPayload.FieldReader<T> { /* compiled code */ }

    public final fun <T : com.google.home.matter.serialization.ClusterEnum> enum(adapter: com.google.home.matter.serialization.EnumAdapter<T>): com.google.home.matter.serialization.ClusterPayload.FieldReader<T> { /* compiled code */ }

    public final fun <T : kotlin.Any> bitmap(adapter: com.google.home.matter.serialization.BitmapAdapter<T>): com.google.home.matter.serialization.ClusterPayload.FieldReader<T> { /* compiled code */ }

    private final fun <T : kotlin.Any> kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?>.getOptionalList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, type: kotlin.reflect.KClass<T>): com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<T>?> { /* compiled code */ }

    private final fun <T : kotlin.Any> kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?>.getOptional(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, type: kotlin.reflect.KClass<T>): com.google.home.matter.serialization.OptionalValue<T?> { /* compiled code */ }

    private final fun <T : kotlin.Any> kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?>.getOrThrow(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String, defaultValue: () -> T, type: kotlin.reflect.KClass<T>): T { /* compiled code */ }

    private final fun <T : kotlin.Any> kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?>.getListOrThrow(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String, defaultValue: () -> kotlin.collections.List<T>, type: kotlin.reflect.KClass<T>): kotlin.collections.List<T> { /* compiled code */ }

    private final fun <T> kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?>.getNullOrThrow(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): T? { /* compiled code */ }

    public final fun <T> @receiver:androidx.annotation.NonNull com.google.home.matter.serialization.OptionalValue<T?>.notNull(fieldName: kotlin.String): com.google.home.matter.serialization.OptionalValue<T> { /* compiled code */ }

    public abstract inner class FieldReader<T : kotlin.Any> public constructor() {
        public abstract val defaultValueGenerator: () -> T

        public final fun <TO : kotlin.Any> adapt(adapter: com.google.home.matter.serialization.FieldAdapter<T, TO>): com.google.home.matter.serialization.ClusterPayload.FieldReader<TO> { /* compiled code */ }

        public abstract fun getOptionalNullableList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String = COMPILED_CODE): com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<T>?>

        public final fun getOptionalList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String = COMPILED_CODE): com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<T>> { /* compiled code */ }

        public final fun getOptional(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String = COMPILED_CODE): com.google.home.matter.serialization.OptionalValue<T> { /* compiled code */ }

        public abstract fun getOptionalNullable(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String = COMPILED_CODE): com.google.home.matter.serialization.OptionalValue<T?>

        public abstract fun get(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String = COMPILED_CODE): T

        public abstract fun getNullable(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String = COMPILED_CODE): T?

        public abstract fun getList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String = COMPILED_CODE): kotlin.collections.List<T>

        public abstract fun getNullableList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String = COMPILED_CODE): kotlin.collections.List<T>?
    }

    private final inner class AdaptedReader<FROM : kotlin.Any, TO : kotlin.Any> public constructor(field: com.google.home.matter.serialization.ClusterPayload.FieldReader<FROM>, adapter: com.google.home.matter.serialization.FieldAdapter<FROM, TO>, defaultValueGenerator: () -> TO = COMPILED_CODE) : com.google.home.matter.serialization.ClusterPayload.FieldReader<TO> {
        public final val field: com.google.home.matter.serialization.ClusterPayload.FieldReader<FROM> /* compiled code */

        public final val adapter: com.google.home.matter.serialization.FieldAdapter<FROM, TO> /* compiled code */

        public open val defaultValueGenerator: () -> TO /* compiled code */

        public open fun getOptionalNullableList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<TO>?> { /* compiled code */ }

        public open fun getOptionalNullable(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): com.google.home.matter.serialization.OptionalValue<TO?> { /* compiled code */ }

        public open fun get(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): TO { /* compiled code */ }

        public open fun getNullable(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): TO? { /* compiled code */ }

        public open fun getList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): kotlin.collections.List<TO> { /* compiled code */ }

        public open fun getNullableList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): kotlin.collections.List<TO>? { /* compiled code */ }
    }

    public final inner class RawFieldReader<T : kotlin.Any> public constructor(defaultValueGenerator: () -> T, type: kotlin.reflect.KClass<T>) : com.google.home.matter.serialization.ClusterPayload.RawFieldReaderNoDefault<T> {
        public constructor(value: T, type: kotlin.reflect.KClass<T>) { /* compiled code */ }

        public open val defaultValueGenerator: () -> T /* compiled code */
    }

    public open inner class RawFieldReaderNoDefault<T : kotlin.Any> public constructor(type: kotlin.reflect.KClass<T>) : com.google.home.matter.serialization.ClusterPayload.FieldReader<T> {
        public final val type: kotlin.reflect.KClass<T> /* compiled code */

        public open val defaultValueGenerator: () -> T /* compiled code */
            public open get

        public open fun getOptionalNullableList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<T>?> { /* compiled code */ }

        public open fun getOptionalNullable(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): com.google.home.matter.serialization.OptionalValue<T?> { /* compiled code */ }

        public open fun get(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): T { /* compiled code */ }

        public open fun getNullable(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): T? { /* compiled code */ }

        public open fun getList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): kotlin.collections.List<T> { /* compiled code */ }

        public open fun getNullableList(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, name: kotlin.String): kotlin.collections.List<T>? { /* compiled code */ }
    }
}

