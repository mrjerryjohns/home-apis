// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object EnumConstraintKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.EnumConstraint.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.EnumConstraint.Builder): com.google.home.platform.traits.EnumConstraintKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.EnumConstraint.Builder /* compiled code */

        public final var typeId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val enumValues: com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, com.google.home.platform.traits.EnumConstraintKt.Dsl.EnumValuesProxy> /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.EnumConstraint { /* compiled code */ }

        public final fun clearTypeId(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, com.google.home.platform.traits.EnumConstraintKt.Dsl.EnumValuesProxy>.put(key: kotlin.String, value: kotlin.Int): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, com.google.home.platform.traits.EnumConstraintKt.Dsl.EnumValuesProxy>.set(key: kotlin.String, value: kotlin.Int): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, com.google.home.platform.traits.EnumConstraintKt.Dsl.EnumValuesProxy>.remove(key: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, com.google.home.platform.traits.EnumConstraintKt.Dsl.EnumValuesProxy>.putAll(map: kotlin.collections.Map<kotlin.String, kotlin.Int>): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, com.google.home.platform.traits.EnumConstraintKt.Dsl.EnumValuesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final class EnumValuesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}

