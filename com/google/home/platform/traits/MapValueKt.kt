// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object MapValueKt {
    @kotlin.jvm.JvmName public final inline fun entry(block: com.google.home.platform.traits.MapValueKt.EntryKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.MapValue.Entry { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.MapValue.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.MapValue.Builder): com.google.home.platform.traits.MapValueKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.MapValue.Builder /* compiled code */

        public final val entries: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.MapValue.Entry, com.google.home.platform.traits.MapValueKt.Dsl.EntriesProxy> /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.MapValue { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.MapValue.Entry, com.google.home.platform.traits.MapValueKt.Dsl.EntriesProxy>.add(value: com.google.home.platform.traits.MapValue.Entry): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.MapValue.Entry, com.google.home.platform.traits.MapValueKt.Dsl.EntriesProxy>.plusAssign(value: com.google.home.platform.traits.MapValue.Entry): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.MapValue.Entry, com.google.home.platform.traits.MapValueKt.Dsl.EntriesProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.MapValue.Entry>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.MapValue.Entry, com.google.home.platform.traits.MapValueKt.Dsl.EntriesProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.MapValue.Entry>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.MapValue.Entry, com.google.home.platform.traits.MapValueKt.Dsl.EntriesProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.MapValue.Entry): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.MapValue.Entry, com.google.home.platform.traits.MapValueKt.Dsl.EntriesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final class EntriesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }

    public object EntryKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.MapValue.Entry.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.MapValue.Entry.Builder): com.google.home.platform.traits.MapValueKt.EntryKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.MapValue.Entry.Builder /* compiled code */

            public final var key: com.google.home.platform.traits.Value /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Value) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.MapValueKt.EntryKt.Dsl.keyOrNull: com.google.home.platform.traits.Value? /* compiled code */
                public final get

            public final var value: com.google.home.platform.traits.Value /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Value) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.MapValueKt.EntryKt.Dsl.valueOrNull: com.google.home.platform.traits.Value? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.MapValue.Entry { /* compiled code */ }

            public final fun clearKey(): kotlin.Unit { /* compiled code */ }

            public final fun hasKey(): kotlin.Boolean { /* compiled code */ }

            public final fun clearValue(): kotlin.Unit { /* compiled code */ }

            public final fun hasValue(): kotlin.Boolean { /* compiled code */ }
        }
    }
}
