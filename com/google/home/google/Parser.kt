// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface Parser<T> {
    public abstract fun parseFrom(byteArray: kotlin.ByteArray): T

    public abstract fun encode(payload: T): kotlin.ByteArray
}

