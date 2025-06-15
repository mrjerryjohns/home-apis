// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class LocalInteractionDiscoveryTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */

        public final fun @receiver:androidx.annotation.NonNull com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature.toObject(): com.google.home.google.LocalInteractionDiscoveryTrait.Feature { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.google.LocalInteractionDiscoveryTrait.Feature.toProto(): com.google.home.platform.traits.LocalInteractionDiscoveryTrait.Feature { /* compiled code */ }
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.LocalInteractionDiscoveryTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.LocalInteractionDiscoveryTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.LocalInteractionDiscoveryTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }

        public abstract val automationCandidateNodes: kotlin.collections.List<kotlin.ByteArray>

        public abstract val structureObjectId: kotlin.String

        public abstract val compressedResponse: kotlin.ByteArray

        public abstract val lastUpdatedTimestampSeconds: kotlin.Long
    }

    private final data class AttributesImpl public constructor(automationCandidateNodes: kotlin.collections.List<kotlin.ByteArray>, structureObjectId: kotlin.String, compressedResponse: kotlin.ByteArray, lastUpdatedTimestampSeconds: kotlin.Long) : com.google.home.google.LocalInteractionDiscoveryTrait.Attributes {
        public open val automationCandidateNodes: kotlin.collections.List<kotlin.ByteArray> /* compiled code */

        public open val structureObjectId: kotlin.String /* compiled code */

        public open val compressedResponse: kotlin.ByteArray /* compiled code */

        public open val lastUpdatedTimestampSeconds: kotlin.Long /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final operator fun component1(): kotlin.collections.List<kotlin.ByteArray> { /* compiled code */ }

        public final operator fun component2(): kotlin.String { /* compiled code */ }

        public final operator fun component3(): kotlin.ByteArray { /* compiled code */ }

        public final operator fun component4(): kotlin.Long { /* compiled code */ }

        public final fun copy(automationCandidateNodes: kotlin.collections.List<kotlin.ByteArray> = COMPILED_CODE, structureObjectId: kotlin.String = COMPILED_CODE, compressedResponse: kotlin.ByteArray = COMPILED_CODE, lastUpdatedTimestampSeconds: kotlin.Long = COMPILED_CODE): com.google.home.google.LocalInteractionDiscoveryTrait.AttributesImpl { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final enum class Feature private constructor(id: kotlin.ULong, value: kotlin.String) : com.google.home.google.PlatformEnum, kotlin.Enum<com.google.home.google.LocalInteractionDiscoveryTrait.Feature> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Compression,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.google.PlatformEnumAdapter<com.google.home.google.LocalInteractionDiscoveryTrait.Feature> /* compiled code */
        }

        public open val id: kotlin.ULong /* compiled code */

        public open val value: kotlin.String /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public object InitializeCommand : com.google.home.CommandDescriptor {
        public open val commandId: kotlin.String /* compiled code */

        public final data class InitializeCommandRequest public constructor(enabledFeatures: kotlin.collections.List<com.google.home.google.LocalInteractionDiscoveryTrait.Feature>) {
            public final val enabledFeatures: kotlin.collections.List<com.google.home.google.LocalInteractionDiscoveryTrait.Feature> /* compiled code */

            public final operator fun component1(): kotlin.collections.List<com.google.home.google.LocalInteractionDiscoveryTrait.Feature> { /* compiled code */ }

            public final fun copy(enabledFeatures: kotlin.collections.List<com.google.home.google.LocalInteractionDiscoveryTrait.Feature> = COMPILED_CODE): com.google.home.google.LocalInteractionDiscoveryTrait.InitializeCommand.InitializeCommandRequest { /* compiled code */ }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor) : com.google.home.Field, kotlin.Enum<com.google.home.google.LocalInteractionDiscoveryTrait.InitializeCommand.InitializeCommandRequest.CommandFields> {
                @androidx.annotation.NonNull enabledFeatures;

                public open val fieldName: kotlin.String /* compiled code */

                public open val tag: kotlin.UInt /* compiled code */

                public open val typeName: kotlin.String /* compiled code */

                public open val typeEnum: com.google.home.Type /* compiled code */

                public open val descriptor: com.google.home.Descriptor /* compiled code */
            }
        }

        public final class RequestPayload public constructor(enabledFeatures: kotlin.collections.List<com.google.home.google.LocalInteractionDiscoveryTrait.Feature>) : com.google.home.google.PlatformTraitPayload<com.google.home.google.LocalInteractionDiscoveryTrait.InitializeCommand.InitializeCommandRequest> {
            public final val enabledFeatures: kotlin.collections.List<com.google.home.google.LocalInteractionDiscoveryTrait.Feature> /* compiled code */

            public open val payload: com.google.home.google.LocalInteractionDiscoveryTrait.InitializeCommand.InitializeCommandRequest /* compiled code */

            public open val payloadParser: com.google.home.google.LocalInteractionDiscoveryTrait.InitializeCommand.RequestPayload.PayloadParser /* compiled code */

            public final class PayloadParser public constructor() : com.google.home.google.Parser<com.google.home.google.LocalInteractionDiscoveryTrait.InitializeCommand.InitializeCommandRequest> {
                public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.LocalInteractionDiscoveryTrait.InitializeCommand.InitializeCommandRequest { /* compiled code */ }

                public open fun encode(payload: com.google.home.google.LocalInteractionDiscoveryTrait.InitializeCommand.InitializeCommandRequest): kotlin.ByteArray { /* compiled code */ }
            }
        }
    }
}

