// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object OperandKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.Operand.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.Operand.Builder): com.google.home.platform.traits.OperandKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.Operand.Builder /* compiled code */

        public final var constant: com.google.home.platform.traits.Value /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Value) {/* compiled code */ }

        public final var reference: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var expression: com.google.home.platform.traits.Expression /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Expression) {/* compiled code */ }

        public final var fieldId: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final var fieldName: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var referenceDeclaration: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val typeCase: com.google.home.platform.traits.Operand.TypeCase /* compiled code */
            public final @kotlin.jvm.JvmName get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.Operand { /* compiled code */ }

        public final fun clearConstant(): kotlin.Unit { /* compiled code */ }

        public final fun hasConstant(): kotlin.Boolean { /* compiled code */ }

        public final fun clearReference(): kotlin.Unit { /* compiled code */ }

        public final fun hasReference(): kotlin.Boolean { /* compiled code */ }

        public final fun clearExpression(): kotlin.Unit { /* compiled code */ }

        public final fun hasExpression(): kotlin.Boolean { /* compiled code */ }

        public final fun clearFieldId(): kotlin.Unit { /* compiled code */ }

        public final fun hasFieldId(): kotlin.Boolean { /* compiled code */ }

        public final fun clearFieldName(): kotlin.Unit { /* compiled code */ }

        public final fun hasFieldName(): kotlin.Boolean { /* compiled code */ }

        public final fun clearReferenceDeclaration(): kotlin.Unit { /* compiled code */ }

        public final fun hasReferenceDeclaration(): kotlin.Boolean { /* compiled code */ }

        public final fun clearType(): kotlin.Unit { /* compiled code */ }
    }
}

