// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object AutomationCandidateNodeKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationCandidateNode.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationCandidateNode.Builder): com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.AutomationCandidateNode.Builder /* compiled code */

        public final var entityDetails: com.google.home.platform.traits.EntityDetails /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.EntityDetails) {/* compiled code */ }

        public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.entityDetailsOrNull: com.google.home.platform.traits.EntityDetails? /* compiled code */
            public final get

        public final val nodeTypes: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode.NodeType, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.NodeTypesProxy> /* compiled code */
            public final get

        public final val parameterDetails: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ParameterDetails, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.ParameterDetailsProxy> /* compiled code */
            public final get

        public final val unsupportedReasons: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.UnsupportedReasonsProxy> /* compiled code */
            public final get

        public final var traitId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var eventId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var commandId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val behaviorTypeCase: com.google.home.platform.traits.AutomationCandidateNode.BehaviorTypeCase /* compiled code */
            public final @kotlin.jvm.JvmName get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationCandidateNode { /* compiled code */ }

        public final fun clearEntityDetails(): kotlin.Unit { /* compiled code */ }

        public final fun hasEntityDetails(): kotlin.Boolean { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode.NodeType, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.NodeTypesProxy>.add(value: com.google.home.platform.traits.AutomationCandidateNode.NodeType): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode.NodeType, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.NodeTypesProxy>.plusAssign(value: com.google.home.platform.traits.AutomationCandidateNode.NodeType): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode.NodeType, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.NodeTypesProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.AutomationCandidateNode.NodeType>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode.NodeType, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.NodeTypesProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.AutomationCandidateNode.NodeType>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode.NodeType, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.NodeTypesProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.AutomationCandidateNode.NodeType): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode.NodeType, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.NodeTypesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ParameterDetails, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.ParameterDetailsProxy>.add(value: com.google.home.platform.traits.ParameterDetails): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ParameterDetails, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.ParameterDetailsProxy>.plusAssign(value: com.google.home.platform.traits.ParameterDetails): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ParameterDetails, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.ParameterDetailsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.ParameterDetails>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ParameterDetails, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.ParameterDetailsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.ParameterDetails>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ParameterDetails, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.ParameterDetailsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.ParameterDetails): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ParameterDetails, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.ParameterDetailsProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.UnsupportedReasonsProxy>.add(value: com.google.home.platform.traits.UnsupportedCandidateReason): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.UnsupportedReasonsProxy>.plusAssign(value: com.google.home.platform.traits.UnsupportedCandidateReason): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.UnsupportedReasonsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.UnsupportedCandidateReason>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.UnsupportedReasonsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.UnsupportedCandidateReason>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.UnsupportedReasonsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.UnsupportedCandidateReason): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.UnsupportedCandidateReason, com.google.home.platform.traits.AutomationCandidateNodeKt.Dsl.UnsupportedReasonsProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearTraitId(): kotlin.Unit { /* compiled code */ }

        public final fun hasTraitId(): kotlin.Boolean { /* compiled code */ }

        public final fun clearEventId(): kotlin.Unit { /* compiled code */ }

        public final fun hasEventId(): kotlin.Boolean { /* compiled code */ }

        public final fun clearCommandId(): kotlin.Unit { /* compiled code */ }

        public final fun hasCommandId(): kotlin.Boolean { /* compiled code */ }

        public final fun clearBehaviorType(): kotlin.Unit { /* compiled code */ }

        public final class NodeTypesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }

        public final class ParameterDetailsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }

        public final class UnsupportedReasonsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }
}

