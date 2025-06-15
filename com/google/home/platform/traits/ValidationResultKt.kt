// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object ValidationResultKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.ValidationResult.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.ValidationResult.Builder): com.google.home.platform.traits.ValidationResultKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.ValidationResult.Builder /* compiled code */

        public final var severity: com.google.home.platform.traits.ValidationResult.Severity /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.ValidationResult.Severity) {/* compiled code */ }

        public final var severityValue: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final var issueType: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var issue: com.google.home.platform.traits.ValidationIssue /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.ValidationIssue) {/* compiled code */ }

        public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.ValidationResultKt.Dsl.issueOrNull: com.google.home.platform.traits.ValidationIssue? /* compiled code */
            public final get

        public final var nodeId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var expressionId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.ValidationResult { /* compiled code */ }

        public final fun clearSeverity(): kotlin.Unit { /* compiled code */ }

        public final fun clearIssueType(): kotlin.Unit { /* compiled code */ }

        public final fun clearIssue(): kotlin.Unit { /* compiled code */ }

        public final fun hasIssue(): kotlin.Boolean { /* compiled code */ }

        public final fun clearNodeId(): kotlin.Unit { /* compiled code */ }

        public final fun hasNodeId(): kotlin.Boolean { /* compiled code */ }

        public final fun clearExpressionId(): kotlin.Unit { /* compiled code */ }

        public final fun hasExpressionId(): kotlin.Boolean { /* compiled code */ }
    }
}

