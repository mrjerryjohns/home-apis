// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public object OptionalAbsent : com.google.home.matter.serialization.OptionalValue<kotlin.Any> {
    public open val value: kotlin.Any /* compiled code */
        public open get

    public open val isPresent: kotlin.Boolean /* compiled code */
        public open get

    public open fun doWhenPresent(fn: (kotlin.Any) -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun <O> map(fn: (kotlin.Any) -> O): com.google.home.matter.serialization.OptionalValue<O> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final fun <T> constrain(): com.google.home.matter.serialization.OptionalValue<T> { /* compiled code */ }
}
