// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface SmokeCoAlarm : com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.SmokeCoAlarm, com.google.home.matter.standard.SmokeCoAlarmTrait.MutableAttributes>, com.google.home.matter.standard.SmokeCoAlarmCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.SmokeCoAlarm> {
        public final val expressedState: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.ExpressedStateEnum?> /* compiled code */
            public final get

        public final val smokeState: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
            public final get

        public final val coState: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
            public final get

        public final val batteryAlert: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
            public final get

        public final val deviceMuted: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.MuteStateEnum?> /* compiled code */
            public final get

        public final val testInProgress: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val hardwareFaultAlert: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val endOfServiceAlert: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfServiceEnum?> /* compiled code */
            public final get

        public final val interconnectSmokeAlarm: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
            public final get

        public final val interconnectCoAlarm: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
            public final get

        public final val contaminationState: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.ContaminationStateEnum?> /* compiled code */
            public final get

        public final val smokeSensitivityLevel: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum?> /* compiled code */
            public final get

        public final val expiryDate: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.SmokeCoAlarmTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.expressedState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.ExpressedStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.smokeState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.coState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.batteryAlert: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.deviceMuted: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.MuteStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.testInProgress: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.hardwareFaultAlert: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.endOfServiceAlert: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfServiceEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.interconnectSmokeAlarm: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.interconnectCoAlarm: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.contaminationState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.ContaminationStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.smokeSensitivityLevel: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.expiryDate: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.SmokeCoAlarm>.setSmokeSensitivityLevel(value: com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum): kotlin.Unit { /* compiled code */ }

        public final fun selfTestRequest(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.SmokeCoAlarm> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.SmokeCoAlarm.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.SmokeCoAlarm.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.Attribute> {
        @androidx.annotation.NonNull expressedState,

        @androidx.annotation.NonNull smokeState,

        @androidx.annotation.NonNull coState,

        @androidx.annotation.NonNull batteryAlert,

        @androidx.annotation.NonNull deviceMuted,

        @androidx.annotation.NonNull testInProgress,

        @androidx.annotation.NonNull hardwareFaultAlert,

        @androidx.annotation.NonNull endOfServiceAlert,

        @androidx.annotation.NonNull interconnectSmokeAlarm,

        @androidx.annotation.NonNull interconnectCoAlarm,

        @androidx.annotation.NonNull contaminationState,

        @androidx.annotation.NonNull smokeSensitivityLevel,

        @androidx.annotation.NonNull expiryDate,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.Command> {
        @androidx.annotation.NonNull SelfTestRequest;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class SmokeAlarmEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.SmokeAlarm) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.SmokeAlarm {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.SmokeAlarmEvent> {
            public final val alarmSeverityLevel: com.google.home.automation.EventField<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm.SmokeAlarmEvent?>.alarmSeverityLevel: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.SmokeAlarm /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.SmokeAlarmEvent.EventFields> {
            @androidx.annotation.NonNull alarmSeverityLevel;

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

    public final class CoAlarmEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.CoAlarm) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.CoAlarm {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.CoAlarmEvent> {
            public final val alarmSeverityLevel: com.google.home.automation.EventField<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm.CoAlarmEvent?>.alarmSeverityLevel: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.CoAlarm /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.CoAlarmEvent.EventFields> {
            @androidx.annotation.NonNull alarmSeverityLevel;

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

    public final class LowBatteryEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.LowBattery) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.LowBattery {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.LowBatteryEvent> {
            public final val alarmSeverityLevel: com.google.home.automation.EventField<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm.LowBatteryEvent?>.alarmSeverityLevel: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.LowBattery /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.LowBatteryEvent.EventFields> {
            @androidx.annotation.NonNull alarmSeverityLevel;

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

    public final class HardwareFaultEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.HardwareFault) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.HardwareFault {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.HardwareFaultEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.HardwareFault /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.HardwareFaultEvent.EventFields> {
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

    public final class EndOfServiceEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfService) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfService {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.EndOfServiceEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfService /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.EndOfServiceEvent.EventFields> {
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

    public final class SelfTestCompleteEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.SelfTestComplete) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.SelfTestComplete {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.SelfTestCompleteEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.SelfTestComplete /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.SelfTestCompleteEvent.EventFields> {
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

    public final class AlarmMutedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmMuted) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmMuted {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.AlarmMutedEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmMuted /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.AlarmMutedEvent.EventFields> {
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

    public final class MuteEndedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.MuteEnded) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.MuteEnded {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.MuteEndedEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.MuteEnded /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.MuteEndedEvent.EventFields> {
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

    public final class InterconnectSmokeAlarmEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectSmokeAlarm) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectSmokeAlarm {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.InterconnectSmokeAlarmEvent> {
            public final val alarmSeverityLevel: com.google.home.automation.EventField<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm.InterconnectSmokeAlarmEvent?>.alarmSeverityLevel: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectSmokeAlarm /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.InterconnectSmokeAlarmEvent.EventFields> {
            @androidx.annotation.NonNull alarmSeverityLevel;

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

    public final class InterconnectCoAlarmEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectCoAlarm) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectCoAlarm {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.InterconnectCoAlarmEvent> {
            public final val alarmSeverityLevel: com.google.home.automation.EventField<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SmokeCoAlarm.InterconnectCoAlarmEvent?>.alarmSeverityLevel: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectCoAlarm /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.InterconnectCoAlarmEvent.EventFields> {
            @androidx.annotation.NonNull alarmSeverityLevel;

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

    public final class AllClearEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.AllClear) : com.google.home.Event, com.google.home.matter.standard.SmokeCoAlarmTrait.AllClear {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SmokeCoAlarm.AllClearEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SmokeCoAlarmTrait.AllClear /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarm.AllClearEvent.EventFields> {
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
