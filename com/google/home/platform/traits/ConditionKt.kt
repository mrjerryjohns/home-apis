// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object ConditionKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.Condition.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.Condition.Builder): com.google.home.platform.traits.ConditionKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.Condition.Builder /* compiled code */

        @kotlin.Deprecated public final var expressionString: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var expression: com.google.home.platform.traits.Expression /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Expression) {/* compiled code */ }

        public final var reference: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var onExpressionTransitioningToTrue: kotlin.Boolean /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Boolean) {/* compiled code */ }

        public final var forDuration: com.google.protobuf.Duration /* compiled code */
            public final get
            public final set(value: com.google.protobuf.Duration) {/* compiled code */ }

        public final val com.google.home.platform.traits.ConditionKt.Dsl.forDurationOrNull: com.google.protobuf.Duration? /* compiled code */
            public final get

        public final val expressionTypeCase: com.google.home.platform.traits.Condition.ExpressionTypeCase /* compiled code */
            public final @kotlin.jvm.JvmName get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.Condition { /* compiled code */ }

        public final fun clearExpressionString(): kotlin.Unit { /* compiled code */ }

        public final fun hasExpressionString(): kotlin.Boolean { /* compiled code */ }

        public final fun clearExpression(): kotlin.Unit { /* compiled code */ }

        public final fun hasExpression(): kotlin.Boolean { /* compiled code */ }

        public final fun clearReference(): kotlin.Unit { /* compiled code */ }

        public final fun hasReference(): kotlin.Boolean { /* compiled code */ }

        public final fun clearOnExpressionTransitioningToTrue(): kotlin.Unit { /* compiled code */ }

        public final fun hasOnExpressionTransitioningToTrue(): kotlin.Boolean { /* compiled code */ }

        public final fun clearForDuration(): kotlin.Unit { /* compiled code */ }

        public final fun hasForDuration(): kotlin.Boolean { /* compiled code */ }

        public final fun clearExpressionType(): kotlin.Unit { /* compiled code */ }
    }
}

