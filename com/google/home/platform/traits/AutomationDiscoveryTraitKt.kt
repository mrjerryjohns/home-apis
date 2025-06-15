// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object AutomationDiscoveryTraitKt {
    @kotlin.jvm.JvmName public final inline fun discoverAutomationCandidates(block: com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidates { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun discoverAutomationCandidatesResponse(block: com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidatesResponse { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationDiscoveryTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationDiscoveryTrait.Builder): com.google.home.platform.traits.AutomationDiscoveryTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.AutomationDiscoveryTrait.Builder /* compiled code */

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationDiscoveryTrait { /* compiled code */ }
    }

    public object DiscoverAutomationCandidatesKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidates.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidates.Builder): com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidates.Builder /* compiled code */

            public final var structureObjectId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var subscriptionAction: com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidates.SubscriptionAction /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidates.SubscriptionAction) {/* compiled code */ }

            public final var subscriptionActionValue: kotlin.Int /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

            public final var compressionConfig: com.google.home.platform.traits.CompressionConfig /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.CompressionConfig) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesKt.Dsl.compressionConfigOrNull: com.google.home.platform.traits.CompressionConfig? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidates { /* compiled code */ }

            public final fun clearStructureObjectId(): kotlin.Unit { /* compiled code */ }

            public final fun clearSubscriptionAction(): kotlin.Unit { /* compiled code */ }

            public final fun clearCompressionConfig(): kotlin.Unit { /* compiled code */ }

            public final fun hasCompressionConfig(): kotlin.Boolean { /* compiled code */ }
        }
    }

    public object DiscoverAutomationCandidatesResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidatesResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidatesResponse.Builder): com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidatesResponse.Builder /* compiled code */

            public final val automationCandidateNodes: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.AutomationCandidateNodesProxy> /* compiled code */
                public final get

            public final val metadataByEntityId: com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.EntityMetadata, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.MetadataByEntityIdProxy> /* compiled code */
                public final get

            public final var nextPageToken: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var compressedResponse: com.google.proto2.contrib.compression.CompressedProto.Compressed /* compiled code */
                public final get
                public final set(value: com.google.proto2.contrib.compression.CompressedProto.Compressed) {/* compiled code */ }

            public final val com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.compressedResponseOrNull: com.google.proto2.contrib.compression.CompressedProto.Compressed? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationDiscoveryTrait.DiscoverAutomationCandidatesResponse { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.AutomationCandidateNodesProxy>.add(value: com.google.home.platform.traits.AutomationCandidateNode): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.AutomationCandidateNodesProxy>.plusAssign(value: com.google.home.platform.traits.AutomationCandidateNode): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.AutomationCandidateNodesProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.AutomationCandidateNode>): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.AutomationCandidateNodesProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.AutomationCandidateNode>): kotlin.Unit { /* compiled code */ }

            public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.AutomationCandidateNodesProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.AutomationCandidateNode): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.AutomationCandidateNode, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.AutomationCandidateNodesProxy>.clear(): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.EntityMetadata, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.MetadataByEntityIdProxy>.put(key: kotlin.String, value: com.google.home.platform.traits.EntityMetadata): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.EntityMetadata, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.MetadataByEntityIdProxy>.set(key: kotlin.String, value: com.google.home.platform.traits.EntityMetadata): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.EntityMetadata, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.MetadataByEntityIdProxy>.remove(key: kotlin.String): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.EntityMetadata, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.MetadataByEntityIdProxy>.putAll(map: kotlin.collections.Map<kotlin.String, com.google.home.platform.traits.EntityMetadata>): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.home.platform.traits.EntityMetadata, com.google.home.platform.traits.AutomationDiscoveryTraitKt.DiscoverAutomationCandidatesResponseKt.Dsl.MetadataByEntityIdProxy>.clear(): kotlin.Unit { /* compiled code */ }

            public final fun clearNextPageToken(): kotlin.Unit { /* compiled code */ }

            public final fun hasNextPageToken(): kotlin.Boolean { /* compiled code */ }

            public final fun clearCompressedResponse(): kotlin.Unit { /* compiled code */ }

            public final fun hasCompressedResponse(): kotlin.Boolean { /* compiled code */ }

            public final class AutomationCandidateNodesProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
            }

            public final class MetadataByEntityIdProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
            }
        }
    }
}
