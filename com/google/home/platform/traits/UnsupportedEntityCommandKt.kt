// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object UnsupportedEntityCommandKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.UnsupportedEntityCommand.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.UnsupportedEntityCommand.Builder): com.google.home.platform.traits.UnsupportedEntityCommandKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.UnsupportedEntityCommand.Builder /* compiled code */

        public final var commandId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val unsupportedReasons: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityCommandKt.Dsl.UnsupportedReasonsProxy> /* compiled code */
            public final get

        public final var entityObjectId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var entityType: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.UnsupportedEntityCommand { /* compiled code */ }

        public final fun clearCommandId(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityCommandKt.Dsl.UnsupportedReasonsProxy>.add(value: com.google.home.platform.traits.UnsupportedCandidateReason): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityCommandKt.Dsl.UnsupportedReasonsProxy>.plusAssign(value: com.google.home.platform.traits.UnsupportedCandidateReason): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityCommandKt.Dsl.UnsupportedReasonsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.UnsupportedCandidateReason>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityCommandKt.Dsl.UnsupportedReasonsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.UnsupportedCandidateReason>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityCommandKt.Dsl.UnsupportedReasonsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.UnsupportedCandidateReason): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.UnsupportedEntityCommandKt.Dsl.UnsupportedReasonsProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearEntityObjectId(): kotlin.Unit { /* compiled code */ }

        public final fun clearEntityType(): kotlin.Unit { /* compiled code */ }

        public final class UnsupportedReasonsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}
