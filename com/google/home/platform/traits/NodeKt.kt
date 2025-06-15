// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object NodeKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.Node.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.Node.Builder): com.google.home.platform.traits.NodeKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.Node.Builder /* compiled code */

        public final var nodeId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var output: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var sequential: com.google.home.platform.traits.SequentialFlow /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.SequentialFlow) {/* compiled code */ }

        public final var parallel: com.google.home.platform.traits.ParallelFlow /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.ParallelFlow) {/* compiled code */ }

        public final var select: com.google.home.platform.traits.SelectFlow /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.SelectFlow) {/* compiled code */ }

        public final var manualStarter: com.google.home.platform.traits.ManualStarter /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.ManualStarter) {/* compiled code */ }

        public final var starter: com.google.home.platform.traits.EntityBehavior /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.EntityBehavior) {/* compiled code */ }

        public final var stateReader: com.google.home.platform.traits.EntityBehavior /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.EntityBehavior) {/* compiled code */ }

        public final var condition: com.google.home.platform.traits.Condition /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Condition) {/* compiled code */ }

        public final var action: com.google.home.platform.traits.EntityBehavior /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.EntityBehavior) {/* compiled code */ }

        public final var delay: com.google.protobuf.Duration /* compiled code */
            public final get
            public final set(value: com.google.protobuf.Duration) {/* compiled code */ }

        public final var suppression: com.google.protobuf.Duration /* compiled code */
            public final get
            public final set(value: com.google.protobuf.Duration) {/* compiled code */ }

        public final var assignment: com.google.home.platform.traits.Assignment /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Assignment) {/* compiled code */ }

        public final val nodeCase: com.google.home.platform.traits.Node.NodeCase /* compiled code */
            public final @kotlin.jvm.JvmName get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.Node { /* compiled code */ }

        public final fun clearNodeId(): kotlin.Unit { /* compiled code */ }

        public final fun hasNodeId(): kotlin.Boolean { /* compiled code */ }

        public final fun clearOutput(): kotlin.Unit { /* compiled code */ }

        public final fun hasOutput(): kotlin.Boolean { /* compiled code */ }

        public final fun clearSequential(): kotlin.Unit { /* compiled code */ }

        public final fun hasSequential(): kotlin.Boolean { /* compiled code */ }

        public final fun clearParallel(): kotlin.Unit { /* compiled code */ }

        public final fun hasParallel(): kotlin.Boolean { /* compiled code */ }

        public final fun clearSelect(): kotlin.Unit { /* compiled code */ }

        public final fun hasSelect(): kotlin.Boolean { /* compiled code */ }

        public final fun clearManualStarter(): kotlin.Unit { /* compiled code */ }

        public final fun hasManualStarter(): kotlin.Boolean { /* compiled code */ }

        public final fun clearStarter(): kotlin.Unit { /* compiled code */ }

        public final fun hasStarter(): kotlin.Boolean { /* compiled code */ }

        public final fun clearStateReader(): kotlin.Unit { /* compiled code */ }

        public final fun hasStateReader(): kotlin.Boolean { /* compiled code */ }

        public final fun clearCondition(): kotlin.Unit { /* compiled code */ }

        public final fun hasCondition(): kotlin.Boolean { /* compiled code */ }

        public final fun clearAction(): kotlin.Unit { /* compiled code */ }

        public final fun hasAction(): kotlin.Boolean { /* compiled code */ }

        public final fun clearDelay(): kotlin.Unit { /* compiled code */ }

        public final fun hasDelay(): kotlin.Boolean { /* compiled code */ }

        public final fun clearSuppression(): kotlin.Unit { /* compiled code */ }

        public final fun hasSuppression(): kotlin.Boolean { /* compiled code */ }

        public final fun clearAssignment(): kotlin.Unit { /* compiled code */ }

        public final fun hasAssignment(): kotlin.Boolean { /* compiled code */ }

        public final fun clearNode(): kotlin.Unit { /* compiled code */ }
    }
}

