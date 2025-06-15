// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object UnsupportedEntityEventKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.UnsupportedEntityEvent.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.UnsupportedEntityEvent.Builder): com.google.home.platform.traits.UnsupportedEntityEventKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.UnsupportedEntityEvent.Builder /* compiled code */

        public final var eventId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val unsupportedReasons: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityEventKt.Dsl.UnsupportedReasonsProxy> /* compiled code */
            public final get

        public final var entityObjectId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var entityType: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.UnsupportedEntityEvent { /* compiled code */ }

        public final fun clearEventId(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityEventKt.Dsl.UnsupportedReasonsProxy>.add(value: com.google.home.platform.traits.UnsupportedCandidateReason): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityEventKt.Dsl.UnsupportedReasonsProxy>.plusAssign(value: com.google.home.platform.traits.UnsupportedCandidateReason): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityEventKt.Dsl.UnsupportedReasonsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.UnsupportedCandidateReason>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityEventKt.Dsl.UnsupportedReasonsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.UnsupportedCandidateReason>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityEventKt.Dsl.UnsupportedReasonsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.UnsupportedCandidateReason): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityEventKt.Dsl.UnsupportedReasonsProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearEntityObjectId(): kotlin.Unit { /* compiled code */ }

        public final fun clearEntityType(): kotlin.Unit { /* compiled code */ }

        public final class UnsupportedReasonsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}
