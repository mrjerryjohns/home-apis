// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OtaSoftwareUpdateRequestor : com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.OtaSoftwareUpdateRequestor, com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.MutableAttributes>, com.google.home.matter.standard.OtaSoftwareUpdateRequestorCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.OtaSoftwareUpdateRequestor> {
        public final val defaultOtaProviders: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>?> /* compiled code */
            public final get

        public final val updatePossible: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val updateState: com.google.home.automation.Attribute<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum?> /* compiled code */
            public final get

        public final val updateStateProgress: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<kotlin.UInt> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor?>.defaultOtaProviders: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ProviderLocation>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor?>.updatePossible: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor?>.updateState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor?>.updateStateProgress: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun announceOtaProvider(providerNodeId: kotlin.ULong, vendorId: kotlin.UShort, announcementReason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum, endpoint: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.OtaSoftwareUpdateRequestor> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.OtaSoftwareUpdateRequestor.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.OtaSoftwareUpdateRequestor.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateRequestor.Attribute> {
        @androidx.annotation.NonNull defaultOtaProviders,

        @androidx.annotation.NonNull updatePossible,

        @androidx.annotation.NonNull updateState,

        @androidx.annotation.NonNull updateStateProgress,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateRequestor.Command> {
        @androidx.annotation.NonNull AnnounceOtaProvider;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class StateTransitionEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.StateTransition) : com.google.home.Event, com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.StateTransition {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.OtaSoftwareUpdateRequestor.StateTransitionEvent> {
            public final val previousState: com.google.home.automation.EventField<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum?> /* compiled code */
                public final get

            public final val newState: com.google.home.automation.EventField<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum?> /* compiled code */
                public final get

            public final val reason: com.google.home.automation.EventField<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ChangeReasonEnum?> /* compiled code */
                public final get

            public final val targetSoftwareVersion: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor.StateTransitionEvent?>.previousState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor.StateTransitionEvent?>.newState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor.StateTransitionEvent?>.reason: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ChangeReasonEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor.StateTransitionEvent?>.targetSoftwareVersion: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.StateTransition /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val newState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum? /* compiled code */

        public open val previousState: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.UpdateStateEnum? /* compiled code */

        public open val reason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.ChangeReasonEnum? /* compiled code */

        public open val targetSoftwareVersion: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateRequestor.StateTransitionEvent.EventFields> {
            @androidx.annotation.NonNull previousState,

            @androidx.annotation.NonNull newState,

            @androidx.annotation.NonNull reason,

            @androidx.annotation.NonNull targetSoftwareVersion;

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

    public final class VersionAppliedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.VersionApplied) : com.google.home.Event, com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.VersionApplied {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.OtaSoftwareUpdateRequestor.VersionAppliedEvent> {
            public final val softwareVersion: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val productId: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor.VersionAppliedEvent?>.softwareVersion: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor.VersionAppliedEvent?>.productId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.VersionApplied /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val productId: kotlin.UShort? /* compiled code */

        public open val softwareVersion: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateRequestor.VersionAppliedEvent.EventFields> {
            @androidx.annotation.NonNull softwareVersion,

            @androidx.annotation.NonNull productId;

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

    public final class DownloadErrorEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.DownloadError) : com.google.home.Event, com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.DownloadError {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.OtaSoftwareUpdateRequestor.DownloadErrorEvent> {
            public final val softwareVersion: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val bytesDownloaded: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val progressPercent: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val platformCode: com.google.home.automation.EventField<kotlin.Long?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor.DownloadErrorEvent?>.softwareVersion: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor.DownloadErrorEvent?>.bytesDownloaded: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor.DownloadErrorEvent?>.progressPercent: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OtaSoftwareUpdateRequestor.DownloadErrorEvent?>.platformCode: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.DownloadError /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val bytesDownloaded: kotlin.ULong? /* compiled code */

        public open val platformCode: kotlin.Long? /* compiled code */

        public open val progressPercent: kotlin.UByte? /* compiled code */

        public open val softwareVersion: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateRequestor.DownloadErrorEvent.EventFields> {
            @androidx.annotation.NonNull softwareVersion,

            @androidx.annotation.NonNull bytesDownloaded,

            @androidx.annotation.NonNull progressPercent,

            @androidx.annotation.NonNull platformCode;

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
}

