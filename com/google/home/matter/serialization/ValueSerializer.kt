// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public interface ValueSerializer<T : kotlin.Any> {
    public abstract fun serialize(value: T): com.google.home.platform.traits.Value

    public abstract fun deserialize(valueProto: com.google.home.platform.traits.Value): T
}
