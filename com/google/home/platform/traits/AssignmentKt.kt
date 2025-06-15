// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object AssignmentKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.Assignment.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.Assignment.Builder): com.google.home.platform.traits.AssignmentKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.Assignment.Builder /* compiled code */

        public final var constant: com.google.home.platform.traits.Value /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Value) {/* compiled code */ }

        public final var reference: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var expression: com.google.home.platform.traits.Expression /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Expression) {/* compiled code */ }

        public final val assignmentTypeCase: com.google.home.platform.traits.Assignment.AssignmentTypeCase /* compiled code */
            public final @kotlin.jvm.JvmName get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.Assignment { /* compiled code */ }

        public final fun clearConstant(): kotlin.Unit { /* compiled code */ }

        public final fun hasConstant(): kotlin.Boolean { /* compiled code */ }

        public final fun clearReference(): kotlin.Unit { /* compiled code */ }

        public final fun hasReference(): kotlin.Boolean { /* compiled code */ }

        public final fun clearExpression(): kotlin.Unit { /* compiled code */ }

        public final fun hasExpression(): kotlin.Boolean { /* compiled code */ }

        public final fun clearAssignmentType(): kotlin.Unit { /* compiled code */ }
    }
}
