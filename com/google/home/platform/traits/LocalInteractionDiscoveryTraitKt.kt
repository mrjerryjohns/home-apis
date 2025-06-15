// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object LocalInteractionDiscoveryTraitKt {
    @kotlin.jvm.JvmName public final inline fun initializeCommand(block: com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.InitializeCommandKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.LocalInteractionDiscoveryTrait.InitializeCommand { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Builder): com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Builder /* compiled code */

        public final var lastUpdatedTimestampSeconds: kotlin.Long /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Long) {/* compiled code */ }

        public final val automationCandidateNodes: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.Dsl.AutomationCandidateNodesProxy> /* compiled code */
            public final get

        public final var compressedResponse: com.google.proto2.contrib.compression.CompressedProto.Compressed /* compiled code */
            public final get
            public final set(value: com.google.proto2.contrib.compression.CompressedProto.Compressed) {/* compiled code */ }

        public final val com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.Dsl.compressedResponseOrNull: com.google.proto2.contrib.compression.CompressedProto.Compressed? /* compiled code */
            public final get

        public final var structureObjectId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.LocalInteractionDiscoveryTrait { /* compiled code */ }

        public final fun clearLastUpdatedTimestampSeconds(): kotlin.Unit { /* compiled code */ }

        public final fun hasLastUpdatedTimestampSeconds(): kotlin.Boolean { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.Dsl.AutomationCandidateNodesProxy>.add(value: com.google.home.platform.traits.AutomationCandidateNode): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.Dsl.AutomationCandidateNodesProxy>.plusAssign(value: com.google.home.platform.traits.AutomationCandidateNode): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.Dsl.AutomationCandidateNodesProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.AutomationCandidateNode>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.Dsl.AutomationCandidateNodesProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.AutomationCandidateNode>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.Dsl.AutomationCandidateNodesProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.AutomationCandidateNode): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.Dsl.AutomationCandidateNodesProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearCompressedResponse(): kotlin.Unit { /* compiled code */ }

        public final fun hasCompressedResponse(): kotlin.Boolean { /* compiled code */ }

        public final fun clearStructureObjectId(): kotlin.Unit { /* compiled code */ }

        public final fun hasStructureObjectId(): kotlin.Boolean { /* compiled code */ }

        public final class AutomationCandidateNodesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }

    public object InitializeCommandKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.LocalInteractionDiscoveryTrait.InitializeCommand.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.LocalInteractionDiscoveryTrait.InitializeCommand.Builder): com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.InitializeCommandKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.LocalInteractionDiscoveryTrait.InitializeCommand.Builder /* compiled code */

            public final val enableFeatures: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.InitializeCommandKt.Dsl.EnableFeaturesProxy> /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.LocalInteractionDiscoveryTrait.InitializeCommand { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.InitializeCommandKt.Dsl.EnableFeaturesProxy>.add(value: com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.InitializeCommandKt.Dsl.EnableFeaturesProxy>.plusAssign(value: com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.InitializeCommandKt.Dsl.EnableFeaturesProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature>): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.InitializeCommandKt.Dsl.EnableFeaturesProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature>): kotlin.Unit { /* compiled code */ }

            public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.InitializeCommandKt.Dsl.EnableFeaturesProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature, com.google.home.platform.traits.LocalInteractionDiscoveryTraitKt.InitializeCommandKt.Dsl.EnableFeaturesProxy>.clear(): kotlin.Unit { /* compiled code */ }

            public final class EnableFeaturesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
            }
        }
    }
}
