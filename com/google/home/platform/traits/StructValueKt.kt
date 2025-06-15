// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object StructValueKt {
    @kotlin.jvm.JvmName public final inline fun field(block: com.google.home.platform.traits.StructValueKt.FieldKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.StructValue.Field { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.StructValue.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.StructValue.Builder): com.google.home.platform.traits.StructValueKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.StructValue.Builder /* compiled code */

        public final var typeId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val fields: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructValue.Field, com.google.home.platform.traits.StructValueKt.Dsl.FieldsProxy> /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.StructValue { /* compiled code */ }

        public final fun clearTypeId(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructValue.Field, com.google.home.platform.traits.StructValueKt.Dsl.FieldsProxy>.add(value: com.google.home.platform.traits.StructValue.Field): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructValue.Field, com.google.home.platform.traits.StructValueKt.Dsl.FieldsProxy>.plusAssign(value: com.google.home.platform.traits.StructValue.Field): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructValue.Field, com.google.home.platform.traits.StructValueKt.Dsl.FieldsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.StructValue.Field>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructValue.Field, com.google.home.platform.traits.StructValueKt.Dsl.FieldsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.StructValue.Field>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructValue.Field, com.google.home.platform.traits.StructValueKt.Dsl.FieldsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.StructValue.Field): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructValue.Field, com.google.home.platform.traits.StructValueKt.Dsl.FieldsProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final class FieldsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }

    public object FieldKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.StructValue.Field.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.StructValue.Field.Builder): com.google.home.platform.traits.StructValueKt.FieldKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.StructValue.Field.Builder /* compiled code */

            public final var id: kotlin.Int /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

            public final var name: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var value: com.google.home.platform.traits.Value /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Value) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.StructValueKt.FieldKt.Dsl.valueOrNull: com.google.home.platform.traits.Value? /* compiled code */
                public final get

            public final val fieldIdentifierCase: com.google.home.platform.traits.StructValue.Field.FieldIdentifierCase /* compiled code */
                public final @kotlin.jvm.JvmName get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.StructValue.Field { /* compiled code */ }

            public final fun clearId(): kotlin.Unit { /* compiled code */ }

            public final fun hasId(): kotlin.Boolean { /* compiled code */ }

            public final fun clearName(): kotlin.Unit { /* compiled code */ }

            public final fun hasName(): kotlin.Boolean { /* compiled code */ }

            public final fun clearValue(): kotlin.Unit { /* compiled code */ }

            public final fun hasValue(): kotlin.Boolean { /* compiled code */ }

            public final fun clearFieldIdentifier(): kotlin.Unit { /* compiled code */ }
        }
    }
}
