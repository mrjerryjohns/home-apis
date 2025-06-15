// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public interface StructAdapter<T> {
    public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: T): kotlin.Unit { /* compiled code */ }

    public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): T { /* compiled code */ }
}
