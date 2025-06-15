// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization.codec.proto

public final class ProtoClusterReader public constructor(strictOperationValidation: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterPayloadReader {
    public open val strictOperationValidation: kotlin.Boolean /* compiled code */

    private final var codedInputStream: com.google.home.matter.serialization.codec.proto.CodedInputStream /* compiled code */

    private final fun input(): com.google.home.matter.serialization.codec.proto.CodedInputStream { /* compiled code */ }

    public open fun init(payload: com.google.home.matter.serialization.SerializedPayload): kotlin.Unit { /* compiled code */ }

    public open fun <T> read(adapter: com.google.home.matter.serialization.StructAdapter<T>): T { /* compiled code */ }

    private final fun readVendorContents(adapters: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, com.google.home.matter.serialization.StructAdapter<out kotlin.Any>>, map: kotlin.collections.MutableMap<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?>, protoFieldNumber: kotlin.Int): kotlin.Unit { /* compiled code */ }

    private final fun addListValue(map: kotlin.collections.MutableMap<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?>, id: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: kotlin.Any?): kotlin.Unit { /* compiled code */ }

    private final fun addSingleValue(map: kotlin.collections.MutableMap<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?>, id: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, value: kotlin.Any?): kotlin.Unit { /* compiled code */ }

    private final fun readStructContents(adapters: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, com.google.home.matter.serialization.StructAdapter<out kotlin.Any>>): kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, kotlin.Any?> { /* compiled code */ }

    private final fun getValue(fieldNumber: kotlin.Int, adapters: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, com.google.home.matter.serialization.StructAdapter<out kotlin.Any>>): com.google.home.matter.serialization.OptionalValue<out kotlin.Any?> { /* compiled code */ }

    public open fun readPayload(adapters: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, com.google.home.matter.serialization.StructAdapter<out kotlin.Any>>): com.google.home.matter.serialization.ClusterPayload { /* compiled code */ }

    public open fun unwrapPayload(tags: kotlin.collections.List<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */>): kotlin.Unit { /* compiled code */ }

    public final fun <T> @receiver:androidx.annotation.NonNull com.google.home.matter.serialization.codec.proto.CodedInputStream.readStruct(adapter: com.google.home.matter.serialization.StructAdapter<T>?, reader: com.google.home.matter.serialization.codec.proto.ProtoClusterReader): T { /* compiled code */ }
}

