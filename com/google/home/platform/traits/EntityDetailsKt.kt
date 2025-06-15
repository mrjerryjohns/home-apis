// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object EntityDetailsKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.EntityDetails.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.EntityDetails.Builder): com.google.home.platform.traits.EntityDetailsKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.EntityDetails.Builder /* compiled code */

        public final var entityObjectId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        @kotlin.Deprecated public final var componentObjectId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val types: com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.EntityDetailsKt.Dsl.TypesProxy> /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.EntityDetails { /* compiled code */ }

        public final fun clearEntityObjectId(): kotlin.Unit { /* compiled code */ }

        public final fun clearComponentObjectId(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.EntityDetailsKt.Dsl.TypesProxy>.add(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.EntityDetailsKt.Dsl.TypesProxy>.plusAssign(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.EntityDetailsKt.Dsl.TypesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.EntityDetailsKt.Dsl.TypesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.EntityDetailsKt.Dsl.TypesProxy>.set(index: kotlin.Int, value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.EntityDetailsKt.Dsl.TypesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final class TypesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}
