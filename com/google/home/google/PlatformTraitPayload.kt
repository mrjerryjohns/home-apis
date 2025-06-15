// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface PlatformTraitPayload<T> {
    public abstract val payload: T

    public abstract val payloadParser: com.google.home.google.Parser<T>

    public open fun encode(): kotlin.ByteArray { /* compiled code */ }
}
