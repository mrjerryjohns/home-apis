// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object OtaSoftwareUpdateRequestorTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class AnnouncementReasonEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum> {
        @androidx.annotation.NonNull SimpleAnnouncement,

        @androidx.annotation.NonNull UpdateAvailable,

        @androidx.annotation.NonNull UrgentUpdateAvailable,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ChangeReasonEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ChangeReasonEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull Failure,

        @androidx.annotation.NonNull TimeOut,

        @androidx.annotation.NonNull DelayByProvider,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ChangeReasonEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class UpdateStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull Idle,

        @androidx.annotation.NonNull Querying,

        @androidx.annotation.NonNull DelayedOnQuery,

        @androidx.annotation.NonNull Downloading,

        @androidx.annotation.NonNull Applying,

        @androidx.annotation.NonNull DelayedOnApply,

        @androidx.annotation.NonNull RollingBack,

        @androidx.annotation.NonNull DelayedOnUserConsent,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface StateTransition {
        public abstract val previousState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum?

        public abstract val newState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum?

        public abstract val reason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ChangeReasonEnum?

        public abstract val targetSoftwareVersion: kotlin.UInt?
    }

    public final class StateTransitionImpl public constructor(previousState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum? = COMPILED_CODE, newState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum? = COMPILED_CODE, reason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ChangeReasonEnum? = COMPILED_CODE, targetSoftwareVersion: kotlin.UInt? = COMPILED_CODE) : com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.StateTransition {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.StateTransition> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.StateTransition): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.StateTransition { /* compiled code */ }
        }

        public open val previousState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum? /* compiled code */

        public open val newState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum? /* compiled code */

        public open val reason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ChangeReasonEnum? /* compiled code */

        public open val targetSoftwareVersion: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface VersionApplied {
        public abstract val softwareVersion: kotlin.UInt?

        public abstract val productId: kotlin.UShort?
    }

    public final class VersionAppliedImpl public constructor(softwareVersion: kotlin.UInt? = COMPILED_CODE, productId: kotlin.UShort? = COMPILED_CODE) : com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.VersionApplied {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.VersionApplied> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.VersionApplied): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.VersionApplied { /* compiled code */ }
        }

        public open val softwareVersion: kotlin.UInt? /* compiled code */

        public open val productId: kotlin.UShort? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface DownloadError {
        public abstract val softwareVersion: kotlin.UInt?

        public abstract val bytesDownloaded: kotlin.ULong?

        public abstract val progressPercent: kotlin.UByte?

        public abstract val platformCode: kotlin.Long?
    }

    public final class DownloadErrorImpl public constructor(softwareVersion: kotlin.UInt? = COMPILED_CODE, bytesDownloaded: kotlin.ULong? = COMPILED_CODE, progressPercent: kotlin.UByte? = COMPILED_CODE, platformCode: kotlin.Long? = COMPILED_CODE) : com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.DownloadError {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.DownloadError> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.DownloadError): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.DownloadError { /* compiled code */ }
        }

        public open val softwareVersion: kotlin.UInt? /* compiled code */

        public open val bytesDownloaded: kotlin.ULong? /* compiled code */

        public open val progressPercent: kotlin.UByte? /* compiled code */

        public open val platformCode: kotlin.Long? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class ProviderLocation public constructor(providerNodeId: kotlin.ULong = COMPILED_CODE, endpoint: kotlin.UShort = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation?>.providerNodeId: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation?>.endpoint: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation { /* compiled code */ }
        }

        public final val providerNodeId: kotlin.ULong /* compiled code */

        public final val endpoint: kotlin.UShort /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation.StructFields> {
            @androidx.annotation.NonNull providerNodeId,

            @androidx.annotation.NonNull endpoint,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes { /* compiled code */ }
        }

        public abstract val defaultOtaProviders: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>?

        public abstract val updatePossible: kotlin.Boolean?

        public abstract val updateState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum?

        public abstract val updateStateProgress: kotlin.UByte?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(defaultOtaProviders: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>? = COMPILED_CODE, updatePossible: kotlin.Boolean? = COMPILED_CODE, updateState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum? = COMPILED_CODE, updateStateProgress: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes, com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes) { /* compiled code */ }

        public open val defaultOtaProviders: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>? /* compiled code */

        public open val updatePossible: kotlin.Boolean? /* compiled code */

        public open val updateState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum? /* compiled code */

        public open val updateStateProgress: kotlin.UByte? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(defaultOtaProviders: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>? = COMPILED_CODE, updatePossible: kotlin.Boolean? = COMPILED_CODE, updateState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum? = COMPILED_CODE, updateStateProgress: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes) : com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _defaultOtaProviders: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>? /* compiled code */

        public open val defaultOtaProviders: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>? /* compiled code */
            public open get

        public final fun setDefaultOtaProviders(value: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object AnnounceOtaProviderCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(providerNodeId: kotlin.ULong = COMPILED_CODE, vendorId: kotlin.UShort = COMPILED_CODE, announcementReason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum = COMPILED_CODE, metadataForNode: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE, endpoint: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.Request { /* compiled code */ }
            }

            public final val providerNodeId: kotlin.ULong /* compiled code */

            public final val vendorId: kotlin.UShort /* compiled code */

            public final val announcementReason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum /* compiled code */

            public final val metadataForNode: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public final val endpoint: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.Request.CommandFields> {
                @androidx.annotation.NonNull providerNodeId,

                @androidx.annotation.NonNull vendorId,

                @androidx.annotation.NonNull announcementReason,

                @androidx.annotation.NonNull metadataForNode,

                @androidx.annotation.NonNull endpoint;

                public companion object {
                    public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
                }

                public open val fieldName: kotlin.String /* compiled code */

                public open val tag: kotlin.UInt /* compiled code */

                public open val typeName: kotlin.String /* compiled code */

                public open val typeEnum: com.google.home.Type /* compiled code */

                public open val descriptor: com.google.home.Descriptor /* compiled code */

                public final val isNullable: kotlin.Boolean /* compiled code */
            }
        }

        public interface OptionalArgs {
            public abstract var metadataForNode: kotlin.ByteArray
        }
    }
}

