// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization.codec.json

public final class JsonClusterReader public constructor(json: kotlin.String = COMPILED_CODE, reader: com.google.nest.platform.mesh.serialization.json.JsonReader = COMPILED_CODE, strictOperationValidation: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterPayloadReader {
    public companion object {
        public final fun fromJson(json: kotlin.String, adapters: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, com.google.home.matter.serialization.StructAdapter<out kotlin.Any>> = COMPILED_CODE): com.google.home.matter.serialization.ClusterPayload { /* compiled code */ }
    }

    public final val json: kotlin.String /* compiled code */

    private final var reader: com.google.nest.platform.mesh.serialization.json.JsonReader /* compiled code */

    public open val strictOperationValidation: kotlin.Boolean /* compiled code */

    public open fun init(payload: com.google.home.matter.serialization.SerializedPayload): kotlin.Unit { /* compiled code */ }

    public open fun unwrapPayload(tags: kotlin.collections.List<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */>): kotlin.Unit { /* compiled code */ }

    public open fun readPayload(adapters: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, com.google.home.matter.serialization.StructAdapter<out kotlin.Any>>): com.google.home.matter.serialization.ClusterPayload { /* compiled code */ }

    public open fun <T> read(adapter: com.google.home.matter.serialization.StructAdapter<T>): T { /* compiled code */ }

    private final fun hasNext(): kotlin.Boolean { /* compiled code */ }

    private final fun nextArray(tag: com.google.home.matter.serialization.codec.json.Tag, adapter: com.google.home.matter.serialization.StructAdapter<out kotlin.Any>? = COMPILED_CODE): kotlin.collections.List<*>? { /* compiled code */ }

    private final fun readAll(adapters: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, com.google.home.matter.serialization.StructAdapter<out kotlin.Any>>): kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?> { /* compiled code */ }

    private final fun nextValue(tag: com.google.home.matter.serialization.codec.json.Tag, adapter: com.google.home.matter.serialization.StructAdapter<out kotlin.Any>? = COMPILED_CODE): kotlin.Any? { /* compiled code */ }

    private final fun nextUInt(): kotlin.ULong { /* compiled code */ }

    private final fun nextInt(): kotlin.Long { /* compiled code */ }

    private final fun nextBoolean(): kotlin.Boolean { /* compiled code */ }

    private final fun nextFloat(): kotlin.Float { /* compiled code */ }

    private final fun nextDouble(): kotlin.Double { /* compiled code */ }

    private final fun nextByteArray(): kotlin.ByteArray { /* compiled code */ }

    private final fun nextString(): kotlin.String { /* compiled code */ }

    private final fun nextNull(): kotlin.Any? { /* compiled code */ }

    private final fun <T> nextObject(adapter: com.google.home.matter.serialization.StructAdapter<T>): T { /* compiled code */ }

    private final fun skipValue(): kotlin.Unit { /* compiled code */ }
}

