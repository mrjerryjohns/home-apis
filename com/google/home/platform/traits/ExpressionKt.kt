// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object ExpressionKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.Expression.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.Expression.Builder): com.google.home.platform.traits.ExpressionKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.Expression.Builder /* compiled code */

        public final var op: com.google.home.platform.traits.Expression.Operator /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Expression.Operator) {/* compiled code */ }

        public final var opValue: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final val operands: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Operand, com.google.home.platform.traits.ExpressionKt.Dsl.OperandsProxy> /* compiled code */
            public final get

        public final var expressionId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.Expression { /* compiled code */ }

        public final fun clearOp(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Operand, com.google.home.platform.traits.ExpressionKt.Dsl.OperandsProxy>.add(value: com.google.home.platform.traits.Operand): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Operand, com.google.home.platform.traits.ExpressionKt.Dsl.OperandsProxy>.plusAssign(value: com.google.home.platform.traits.Operand): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Operand, com.google.home.platform.traits.ExpressionKt.Dsl.OperandsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.Operand>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Operand, com.google.home.platform.traits.ExpressionKt.Dsl.OperandsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.Operand>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Operand, com.google.home.platform.traits.ExpressionKt.Dsl.OperandsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.Operand): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Operand, com.google.home.platform.traits.ExpressionKt.Dsl.OperandsProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearExpressionId(): kotlin.Unit { /* compiled code */ }

        public final fun hasExpressionId(): kotlin.Boolean { /* compiled code */ }

        public final class OperandsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}
