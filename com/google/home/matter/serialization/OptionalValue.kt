// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public interface OptionalValue<T> {
    public companion object {
        public final fun <T> absent(): com.google.home.matter.serialization.OptionalValue<T> { /* compiled code */ }

        public final fun <T> presentNull(): com.google.home.matter.serialization.OptionalValue<T?> { /* compiled code */ }

        public final fun <T> present(value: T): com.google.home.matter.serialization.OptionalValue<T> { /* compiled code */ }

        public final fun <T> ofNullable(value: T?): com.google.home.matter.serialization.OptionalValue<T?> { /* compiled code */ }
    }

    public abstract val value: T

    public abstract val isPresent: kotlin.Boolean

    public open fun getOrNull(): T? { /* compiled code */ }

    public abstract fun <O> map(fn: (T) -> O): com.google.home.matter.serialization.OptionalValue<O>

    public abstract fun doWhenPresent(fn: (T) -> kotlin.Unit): kotlin.Unit

    public open fun defaultIfNotPresent(defaultValue: T): T { /* compiled code */ }
}
