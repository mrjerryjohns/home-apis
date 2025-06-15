// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface Updatable<IMMUTABLE, MUTABLE> {
    public abstract suspend fun update(optimisticReturn: (IMMUTABLE) -> kotlin.Unit = COMPILED_CODE, init: MUTABLE.() -> kotlin.Unit): IMMUTABLE
}

