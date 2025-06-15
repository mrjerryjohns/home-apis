// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object UIntSetConstraintKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.UIntSetConstraint.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.UIntSetConstraint.Builder): com.google.home.platform.traits.UIntSetConstraintKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.UIntSetConstraint.Builder /* compiled code */

        public final val values: com.google.protobuf.kotlin.DslList<kotlin.Long, com.google.home.platform.traits.UIntSetConstraintKt.Dsl.ValuesProxy> /* compiled code */
            public final get

        public final var dataType: com.google.home.platform.traits.UIntDataType /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.UIntDataType) {/* compiled code */ }

        public final var dataTypeValue: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.UIntSetConstraint { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.Long, com.google.home.platform.traits.UIntSetConstraintKt.Dsl.ValuesProxy>.add(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, com.google.home.platform.traits.UIntSetConstraintKt.Dsl.ValuesProxy>.plusAssign(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.Long, com.google.home.platform.traits.UIntSetConstraintKt.Dsl.ValuesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, com.google.home.platform.traits.UIntSetConstraintKt.Dsl.ValuesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, com.google.home.platform.traits.UIntSetConstraintKt.Dsl.ValuesProxy>.set(index: kotlin.Int, value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.Long, com.google.home.platform.traits.UIntSetConstraintKt.Dsl.ValuesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearDataType(): kotlin.Unit { /* compiled code */ }

        public final fun hasDataType(): kotlin.Boolean { /* compiled code */ }

        public final class ValuesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}
