// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class AutomationExecutionTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.AutomationExecutionTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.AutomationExecutionTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.AutomationExecutionTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }

        public abstract val running: kotlin.Boolean

        public abstract val executionCount: kotlin.Int?
    }

    public final class AttributesImpl public constructor(running: kotlin.Boolean, executionCount: kotlin.Int?) : com.google.home.google.AutomationExecutionTrait.Attributes {
        public open val running: kotlin.Boolean /* compiled code */

        public open val executionCount: kotlin.Int? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }
    }
}
