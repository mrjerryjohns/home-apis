// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public final class HomeError public constructor(code: kotlin.Int, message: kotlin.String) : com.google.home.BaseHomeError {
    public companion object {
        private final val errorCodeRegex: kotlin.text.Regex /* compiled code */

        private final fun getCodeFromMessage(message: kotlin.String): kotlin.Int { /* compiled code */ }
    }

    public constructor(message: kotlin.String) { /* compiled code */ }

    public open val code: kotlin.Int /* compiled code */

    public open val message: kotlin.String /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }
}
