// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object VoiceStarterTraitKt {
    @kotlin.jvm.JvmName public final inline fun okGoogleEvent(block: com.google.home.platform.traits.VoiceStarterTraitKt.OkGoogleEventKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.VoiceStarterTrait.OkGoogleEvent { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.VoiceStarterTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.VoiceStarterTrait.Builder): com.google.home.platform.traits.VoiceStarterTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.VoiceStarterTrait.Builder /* compiled code */

        public final val reservedQueries: com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.VoiceStarterTraitKt.Dsl.ReservedQueriesProxy> /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.VoiceStarterTrait { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.VoiceStarterTraitKt.Dsl.ReservedQueriesProxy>.add(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.VoiceStarterTraitKt.Dsl.ReservedQueriesProxy>.plusAssign(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.VoiceStarterTraitKt.Dsl.ReservedQueriesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.VoiceStarterTraitKt.Dsl.ReservedQueriesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.VoiceStarterTraitKt.Dsl.ReservedQueriesProxy>.set(index: kotlin.Int, value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.VoiceStarterTraitKt.Dsl.ReservedQueriesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final class ReservedQueriesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }

    public object OkGoogleEventKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.VoiceStarterTrait.OkGoogleEvent.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.VoiceStarterTrait.OkGoogleEvent.Builder): com.google.home.platform.traits.VoiceStarterTraitKt.OkGoogleEventKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.VoiceStarterTrait.OkGoogleEvent.Builder /* compiled code */

            public final var query: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.VoiceStarterTrait.OkGoogleEvent { /* compiled code */ }

            public final fun clearQuery(): kotlin.Unit { /* compiled code */ }
        }
    }
}
