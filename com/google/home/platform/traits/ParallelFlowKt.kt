// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object ParallelFlowKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.ParallelFlow.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.ParallelFlow.Builder): com.google.home.platform.traits.ParallelFlowKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.ParallelFlow.Builder /* compiled code */

        public final val nodes: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Node, com.google.home.platform.traits.ParallelFlowKt.Dsl.NodesProxy> /* compiled code */
            public final get

        public final var joinSemantic: com.google.home.platform.traits.ParallelFlow.JoinSemantic /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.ParallelFlow.JoinSemantic) {/* compiled code */ }

        public final var joinSemanticValue: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.ParallelFlow { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Node, com.google.home.platform.traits.ParallelFlowKt.Dsl.NodesProxy>.add(value: com.google.home.platform.traits.Node): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Node, com.google.home.platform.traits.ParallelFlowKt.Dsl.NodesProxy>.plusAssign(value: com.google.home.platform.traits.Node): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Node, com.google.home.platform.traits.ParallelFlowKt.Dsl.NodesProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.Node>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Node, com.google.home.platform.traits.ParallelFlowKt.Dsl.NodesProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.Node>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Node, com.google.home.platform.traits.ParallelFlowKt.Dsl.NodesProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.Node): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Node, com.google.home.platform.traits.ParallelFlowKt.Dsl.NodesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearJoinSemantic(): kotlin.Unit { /* compiled code */ }

        public final class NodesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}
