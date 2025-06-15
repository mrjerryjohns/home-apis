// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object StringAllowListConstraintKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.StringAllowListConstraint.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.StringAllowListConstraint.Builder): com.google.home.platform.traits.StringAllowListConstraintKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.StringAllowListConstraint.Builder /* compiled code */

        public final val values: com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringAllowListConstraintKt.Dsl.ValuesProxy> /* compiled code */
            public final get

        public final var caseSensitive: kotlin.Boolean /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Boolean) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.StringAllowListConstraint { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringAllowListConstraintKt.Dsl.ValuesProxy>.add(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringAllowListConstraintKt.Dsl.ValuesProxy>.plusAssign(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringAllowListConstraintKt.Dsl.ValuesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringAllowListConstraintKt.Dsl.ValuesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringAllowListConstraintKt.Dsl.ValuesProxy>.set(index: kotlin.Int, value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringAllowListConstraintKt.Dsl.ValuesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearCaseSensitive(): kotlin.Unit { /* compiled code */ }

        public final class ValuesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}
