// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public interface ClusterPayloadReader {
    public abstract val strictOperationValidation: kotlin.Boolean

    public abstract fun init(payload: com.google.home.matter.serialization.SerializedPayload): kotlin.Unit

    public abstract fun unwrapPayload(tags: kotlin.collections.List<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */>): kotlin.Unit

    public abstract fun readPayload(adapters: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, com.google.home.matter.serialization.StructAdapter<out kotlin.Any>> = COMPILED_CODE): com.google.home.matter.serialization.ClusterPayload

    public abstract fun <T> read(adapter: com.google.home.matter.serialization.StructAdapter<T>): T
}
