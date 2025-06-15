// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface TimeSynchronization : com.google.home.matter.standard.TimeSynchronizationTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.TimeSynchronizationCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.TimeSynchronization> {
        public final val utcTime: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val granularity: com.google.home.automation.Attribute<com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum?> /* compiled code */
            public final get

        public final val timeSource: com.google.home.automation.Attribute<com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum?> /* compiled code */
            public final get

        public final val trustedTimeSource: com.google.home.automation.Attribute<com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct?> /* compiled code */
            public final get

        public final val defaultNtp: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val timeZone: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>?> /* compiled code */
            public final get

        public final val dstOffset: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>?> /* compiled code */
            public final get

        public final val localTime: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val timeZoneDatabase: com.google.home.automation.Attribute<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneDatabaseEnum?> /* compiled code */
            public final get

        public final val ntpServerAvailable: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val timeZoneListMaxSize: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val dstOffsetListMaxSize: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val supportsDnsResolve: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.TimeSynchronizationTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.utcTime: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.granularity: com.google.home.automation.TypedExpression<com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.timeSource: com.google.home.automation.TypedExpression<com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.trustedTimeSource: com.google.home.automation.TypedExpression<com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.defaultNtp: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.timeZone: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.dstOffset: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.localTime: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.timeZoneDatabase: com.google.home.automation.TypedExpression<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneDatabaseEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.ntpServerAvailable: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.timeZoneListMaxSize: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.dstOffsetListMaxSize: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.supportsDnsResolve: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.TimeSynchronizationTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun setUtcTime(utcTime: kotlin.ULong, granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum, optionalArgs: com.google.home.matter.standard.TimeSynchronizationTrait.SetUtcTimeCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun setDefaultNtp(defaultNtp: kotlin.String?): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.TimeSynchronization> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.TimeSynchronization.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.TimeSynchronization.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronization.Attribute> {
        @androidx.annotation.NonNull utcTime,

        @androidx.annotation.NonNull granularity,

        @androidx.annotation.NonNull timeSource,

        @androidx.annotation.NonNull trustedTimeSource,

        @androidx.annotation.NonNull defaultNtp,

        @androidx.annotation.NonNull timeZone,

        @androidx.annotation.NonNull dstOffset,

        @androidx.annotation.NonNull localTime,

        @androidx.annotation.NonNull timeZoneDatabase,

        @androidx.annotation.NonNull ntpServerAvailable,

        @androidx.annotation.NonNull timeZoneListMaxSize,

        @androidx.annotation.NonNull dstOffsetListMaxSize,

        @androidx.annotation.NonNull supportsDnsResolve,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.TimeSynchronization.Command> {
        @androidx.annotation.NonNull SetUtcTime,

        @androidx.annotation.NonNull SetTrustedTimeSource,

        @androidx.annotation.NonNull SetTimeZone,

        @androidx.annotation.NonNull SetDstOffset,

        @androidx.annotation.NonNull SetDefaultNtp;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class DstTableEmptyEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.TimeSynchronizationTrait.DstTableEmpty) : com.google.home.Event, com.google.home.matter.standard.TimeSynchronizationTrait.DstTableEmpty {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.TimeSynchronization.DstTableEmptyEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.TimeSynchronizationTrait.DstTableEmpty /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronization.DstTableEmptyEvent.EventFields> {
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

    public final class DstStatusEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.TimeSynchronizationTrait.DstStatus) : com.google.home.Event, com.google.home.matter.standard.TimeSynchronizationTrait.DstStatus {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.TimeSynchronization.DstStatusEvent> {
            public final val dstOffsetActive: com.google.home.automation.EventField<kotlin.Boolean?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization.DstStatusEvent?>.dstOffsetActive: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.TimeSynchronizationTrait.DstStatus /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val dstOffsetActive: kotlin.Boolean? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronization.DstStatusEvent.EventFields> {
            @androidx.annotation.NonNull dstOffsetActive;

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

    public final class TimeZoneStatusEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStatus) : com.google.home.Event, com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStatus {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.TimeSynchronization.TimeZoneStatusEvent> {
            public final val offset: com.google.home.automation.EventField<kotlin.Int?> /* compiled code */
                public final get

            public final val name: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization.TimeZoneStatusEvent?>.offset: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronization.TimeZoneStatusEvent?>.name: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStatus /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val name: kotlin.String? /* compiled code */

        public open val offset: kotlin.Int? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronization.TimeZoneStatusEvent.EventFields> {
            @androidx.annotation.NonNull offset,

            @androidx.annotation.NonNull Name;

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

    public final class TimeFailureEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.TimeSynchronizationTrait.TimeFailure) : com.google.home.Event, com.google.home.matter.standard.TimeSynchronizationTrait.TimeFailure {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.TimeSynchronization.TimeFailureEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.TimeSynchronizationTrait.TimeFailure /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronization.TimeFailureEvent.EventFields> {
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

    public final class MissingTrustedTimeSourceEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.TimeSynchronizationTrait.MissingTrustedTimeSource) : com.google.home.Event, com.google.home.matter.standard.TimeSynchronizationTrait.MissingTrustedTimeSource {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.TimeSynchronization.MissingTrustedTimeSourceEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.TimeSynchronizationTrait.MissingTrustedTimeSource /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronization.MissingTrustedTimeSourceEvent.EventFields> {
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
