// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object EntityBehaviorKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.EntityBehavior.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.EntityBehavior.Builder): com.google.home.platform.traits.EntityBehaviorKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.EntityBehavior.Builder /* compiled code */

        public final var entity: com.google.home.platform.traits.Entity /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Entity) {/* compiled code */ }

        public final var entityReference: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var entityFilter: com.google.home.platform.traits.Expression /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Expression) {/* compiled code */ }

        public final var traitId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var eventId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var commandId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val parameters: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Parameter, com.google.home.platform.traits.EntityBehaviorKt.Dsl.ParametersProxy> /* compiled code */
            public final get

        public final val targetTypeCase: com.google.home.platform.traits.EntityBehavior.TargetTypeCase /* compiled code */
            public final @kotlin.jvm.JvmName get

        public final val behaviorTypeCase: com.google.home.platform.traits.EntityBehavior.BehaviorTypeCase /* compiled code */
            public final @kotlin.jvm.JvmName get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.EntityBehavior { /* compiled code */ }

        public final fun clearEntity(): kotlin.Unit { /* compiled code */ }

        public final fun hasEntity(): kotlin.Boolean { /* compiled code */ }

        public final fun clearEntityReference(): kotlin.Unit { /* compiled code */ }

        public final fun hasEntityReference(): kotlin.Boolean { /* compiled code */ }

        public final fun clearEntityFilter(): kotlin.Unit { /* compiled code */ }

        public final fun hasEntityFilter(): kotlin.Boolean { /* compiled code */ }

        public final fun clearTraitId(): kotlin.Unit { /* compiled code */ }

        public final fun hasTraitId(): kotlin.Boolean { /* compiled code */ }

        public final fun clearEventId(): kotlin.Unit { /* compiled code */ }

        public final fun hasEventId(): kotlin.Boolean { /* compiled code */ }

        public final fun clearCommandId(): kotlin.Unit { /* compiled code */ }

        public final fun hasCommandId(): kotlin.Boolean { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Parameter, com.google.home.platform.traits.EntityBehaviorKt.Dsl.ParametersProxy>.add(value: com.google.home.platform.traits.Parameter): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Parameter, com.google.home.platform.traits.EntityBehaviorKt.Dsl.ParametersProxy>.plusAssign(value: com.google.home.platform.traits.Parameter): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Parameter, com.google.home.platform.traits.EntityBehaviorKt.Dsl.ParametersProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.Parameter>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Parameter, com.google.home.platform.traits.EntityBehaviorKt.Dsl.ParametersProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.Parameter>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Parameter, com.google.home.platform.traits.EntityBehaviorKt.Dsl.ParametersProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.Parameter): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Parameter, com.google.home.platform.traits.EntityBehaviorKt.Dsl.ParametersProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearTargetType(): kotlin.Unit { /* compiled code */ }

        public final fun clearBehaviorType(): kotlin.Unit { /* compiled code */ }

        public final class ParametersProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}

