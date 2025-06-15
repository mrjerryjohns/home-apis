// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object StringConstraintKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.StringConstraint.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.StringConstraint.Builder): com.google.home.platform.traits.StringConstraintKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.StringConstraint.Builder /* compiled code */

        public final var maxLength: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final var minLength: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final val disallowedValues: com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringConstraintKt.Dsl.DisallowedValuesProxy> /* compiled code */
            public final get

        public final var disallowedValuesCaseSensitive: kotlin.Boolean /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Boolean) {/* compiled code */ }

        public final var regex: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.StringConstraint { /* compiled code */ }

        public final fun clearMaxLength(): kotlin.Unit { /* compiled code */ }

        public final fun hasMaxLength(): kotlin.Boolean { /* compiled code */ }

        public final fun clearMinLength(): kotlin.Unit { /* compiled code */ }

        public final fun hasMinLength(): kotlin.Boolean { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringConstraintKt.Dsl.DisallowedValuesProxy>.add(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringConstraintKt.Dsl.DisallowedValuesProxy>.plusAssign(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringConstraintKt.Dsl.DisallowedValuesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringConstraintKt.Dsl.DisallowedValuesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringConstraintKt.Dsl.DisallowedValuesProxy>.set(index: kotlin.Int, value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.StringConstraintKt.Dsl.DisallowedValuesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearDisallowedValuesCaseSensitive(): kotlin.Unit { /* compiled code */ }

        public final fun clearRegex(): kotlin.Unit { /* compiled code */ }

        public final fun hasRegex(): kotlin.Boolean { /* compiled code */ }

        public final class DisallowedValuesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}

