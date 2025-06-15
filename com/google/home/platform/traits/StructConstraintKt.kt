// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object StructConstraintKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.StructConstraint.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.StructConstraint.Builder): com.google.home.platform.traits.StructConstraintKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.StructConstraint.Builder /* compiled code */

        @kotlin.Deprecated public final val fieldConstraints: com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.ValueTypeConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.FieldConstraintsProxy> /* compiled code */
            public final get

        public final val structFieldConstraints: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructFieldConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.StructFieldConstraintsProxy> /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.StructConstraint { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.ValueTypeConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.FieldConstraintsProxy>.put(key: kotlin.String, value: com.google.home.platform.traits.ValueTypeConstraint): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.ValueTypeConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.FieldConstraintsProxy>.set(key: kotlin.String, value: com.google.home.platform.traits.ValueTypeConstraint): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.ValueTypeConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.FieldConstraintsProxy>.remove(key: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.ValueTypeConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.FieldConstraintsProxy>.putAll(map: kotlin.collections.Map<kotlin.String, com.google.home.platform.traits.ValueTypeConstraint>): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.ValueTypeConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.FieldConstraintsProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructFieldConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.StructFieldConstraintsProxy>.add(value: com.google.home.platform.traits.StructFieldConstraint): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructFieldConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.StructFieldConstraintsProxy>.plusAssign(value: com.google.home.platform.traits.StructFieldConstraint): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructFieldConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.StructFieldConstraintsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.StructFieldConstraint>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructFieldConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.StructFieldConstraintsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.StructFieldConstraint>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructFieldConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.StructFieldConstraintsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.StructFieldConstraint): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.StructFieldConstraint, com.google.home.platform.traits.StructConstraintKt.Dsl.StructFieldConstraintsProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final class FieldConstraintsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }

        public final class StructFieldConstraintsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}
