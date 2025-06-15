// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object UnsupportedEntityTypeKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.UnsupportedEntityType.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.UnsupportedEntityType.Builder): com.google.home.platform.traits.UnsupportedEntityTypeKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.UnsupportedEntityType.Builder /* compiled code */

        public final var entityType: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val supportedTypes: com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.UnsupportedEntityTypeKt.Dsl.SupportedTypesProxy> /* compiled code */
            public final get

        public final var entityObjectId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.UnsupportedEntityType { /* compiled code */ }

        public final fun clearEntityType(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.UnsupportedEntityTypeKt.Dsl.SupportedTypesProxy>.add(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.UnsupportedEntityTypeKt.Dsl.SupportedTypesProxy>.plusAssign(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.UnsupportedEntityTypeKt.Dsl.SupportedTypesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.UnsupportedEntityTypeKt.Dsl.SupportedTypesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.UnsupportedEntityTypeKt.Dsl.SupportedTypesProxy>.set(index: kotlin.Int, value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.UnsupportedEntityTypeKt.Dsl.SupportedTypesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearEntityObjectId(): kotlin.Unit { /* compiled code */ }

        public final class SupportedTypesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}

