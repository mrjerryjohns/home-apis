// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public final class OptionalPresent<T> public constructor(value: T) : com.google.home.matter.serialization.OptionalValue<T> {
    public open val value: T /* compiled code */

    public open val isPresent: kotlin.Boolean /* compiled code */
        public open get

    public open fun doWhenPresent(fn: (T) -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun <O> map(fn: (T) -> O): com.google.home.matter.serialization.OptionalValue<O> { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }
}
