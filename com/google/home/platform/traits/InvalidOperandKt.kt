// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object InvalidOperandKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.InvalidOperand.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.InvalidOperand.Builder): com.google.home.platform.traits.InvalidOperandKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.InvalidOperand.Builder /* compiled code */

        public final var operator: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var operandIndex: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final var operandType: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val validOperandTypes: com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.InvalidOperandKt.Dsl.ValidOperandTypesProxy> /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.InvalidOperand { /* compiled code */ }

        public final fun clearOperator(): kotlin.Unit { /* compiled code */ }

        public final fun clearOperandIndex(): kotlin.Unit { /* compiled code */ }

        public final fun clearOperandType(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.InvalidOperandKt.Dsl.ValidOperandTypesProxy>.add(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.InvalidOperandKt.Dsl.ValidOperandTypesProxy>.plusAssign(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.InvalidOperandKt.Dsl.ValidOperandTypesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.InvalidOperandKt.Dsl.ValidOperandTypesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.InvalidOperandKt.Dsl.ValidOperandTypesProxy>.set(index: kotlin.Int, value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.InvalidOperandKt.Dsl.ValidOperandTypesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final class ValidOperandTypesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}

