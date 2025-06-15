// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object SmokeCoAlarmTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class AlarmStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum> {
        @androidx.annotation.NonNull Normal,

        @androidx.annotation.NonNull Warning,

        @androidx.annotation.NonNull Critical,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ContaminationStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarmTrait.ContaminationStateEnum> {
        @androidx.annotation.NonNull Normal,

        @androidx.annotation.NonNull Low,

        @androidx.annotation.NonNull Warning,

        @androidx.annotation.NonNull Critical,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.ContaminationStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class EndOfServiceEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfServiceEnum> {
        @androidx.annotation.NonNull Normal,

        @androidx.annotation.NonNull Expired,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfServiceEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ExpressedStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarmTrait.ExpressedStateEnum> {
        @androidx.annotation.NonNull Normal,

        @androidx.annotation.NonNull SmokeAlarm,

        @androidx.annotation.NonNull COAlarm,

        @androidx.annotation.NonNull BatteryAlert,

        @androidx.annotation.NonNull Testing,

        @androidx.annotation.NonNull HardwareFault,

        @androidx.annotation.NonNull EndOfService,

        @androidx.annotation.NonNull InterconnectSmoke,

        @androidx.annotation.NonNull InterconnectCO,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.ExpressedStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class MuteStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarmTrait.MuteStateEnum> {
        @androidx.annotation.NonNull NotMuted,

        @androidx.annotation.NonNull Muted,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.MuteStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class SensitivityEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum> {
        @androidx.annotation.NonNull High,

        @androidx.annotation.NonNull Standard,

        @androidx.annotation.NonNull Low,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(smokeAlarm: kotlin.Boolean = COMPILED_CODE, coAlarm: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.Feature> {
            private const final val SMOKE_ALARM_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CO_ALARM_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.SmokeCoAlarmTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.SmokeCoAlarmTrait.Feature { /* compiled code */ }
        }

        public final val smokeAlarm: kotlin.Boolean /* compiled code */

        public final val coAlarm: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(smokeAlarm: kotlin.Boolean = COMPILED_CODE, coAlarm: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.SmokeCoAlarmTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface SmokeAlarm {
        public abstract val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?
    }

    public final class SmokeAlarmImpl public constructor(alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE) : com.google.home.matter.standard.SmokeCoAlarmTrait.SmokeAlarm {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.SmokeAlarm> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SmokeCoAlarmTrait.SmokeAlarm): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.SmokeAlarm { /* compiled code */ }
        }

        public open val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface CoAlarm {
        public abstract val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?
    }

    public final class CoAlarmImpl public constructor(alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE) : com.google.home.matter.standard.SmokeCoAlarmTrait.CoAlarm {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.CoAlarm> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SmokeCoAlarmTrait.CoAlarm): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.CoAlarm { /* compiled code */ }
        }

        public open val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface LowBattery {
        public abstract val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?
    }

    public final class LowBatteryImpl public constructor(alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE) : com.google.home.matter.standard.SmokeCoAlarmTrait.LowBattery {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.LowBattery> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SmokeCoAlarmTrait.LowBattery): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.LowBattery { /* compiled code */ }
        }

        public open val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface HardwareFault {
    }

    public final class HardwareFaultImpl public constructor() : com.google.home.matter.standard.SmokeCoAlarmTrait.HardwareFault {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.HardwareFault> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.HardwareFaultImpl { /* compiled code */ }
        }
    }

    public interface EndOfService {
    }

    public final class EndOfServiceImpl public constructor() : com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfService {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfService> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfServiceImpl { /* compiled code */ }
        }
    }

    public interface SelfTestComplete {
    }

    public final class SelfTestCompleteImpl public constructor() : com.google.home.matter.standard.SmokeCoAlarmTrait.SelfTestComplete {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.SelfTestComplete> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.SelfTestCompleteImpl { /* compiled code */ }
        }
    }

    public interface AlarmMuted {
    }

    public final class AlarmMutedImpl public constructor() : com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmMuted {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmMuted> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmMutedImpl { /* compiled code */ }
        }
    }

    public interface MuteEnded {
    }

    public final class MuteEndedImpl public constructor() : com.google.home.matter.standard.SmokeCoAlarmTrait.MuteEnded {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.MuteEnded> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.MuteEndedImpl { /* compiled code */ }
        }
    }

    public interface InterconnectSmokeAlarm {
        public abstract val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?
    }

    public final class InterconnectSmokeAlarmImpl public constructor(alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE) : com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectSmokeAlarm {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectSmokeAlarm> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectSmokeAlarm): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectSmokeAlarm { /* compiled code */ }
        }

        public open val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface InterconnectCoAlarm {
        public abstract val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?
    }

    public final class InterconnectCoAlarmImpl public constructor(alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE) : com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectCoAlarm {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectCoAlarm> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectCoAlarm): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.InterconnectCoAlarm { /* compiled code */ }
        }

        public open val alarmSeverityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface AllClear {
    }

    public final class AllClearImpl public constructor() : com.google.home.matter.standard.SmokeCoAlarmTrait.AllClear {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.AllClear> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.AllClearImpl { /* compiled code */ }
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes { /* compiled code */ }
        }

        public abstract val expressedState: com.google.home.matter.standard.SmokeCoAlarmTrait.ExpressedStateEnum?

        public abstract val smokeState: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?

        public abstract val coState: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?

        public abstract val batteryAlert: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?

        public abstract val deviceMuted: com.google.home.matter.standard.SmokeCoAlarmTrait.MuteStateEnum?

        public abstract val testInProgress: kotlin.Boolean?

        public abstract val hardwareFaultAlert: kotlin.Boolean?

        public abstract val endOfServiceAlert: com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfServiceEnum?

        public abstract val interconnectSmokeAlarm: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?

        public abstract val interconnectCoAlarm: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum?

        public abstract val contaminationState: com.google.home.matter.standard.SmokeCoAlarmTrait.ContaminationStateEnum?

        public abstract val smokeSensitivityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum?

        public abstract val expiryDate: kotlin.UInt?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.SmokeCoAlarmTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(expressedState: com.google.home.matter.standard.SmokeCoAlarmTrait.ExpressedStateEnum? = COMPILED_CODE, smokeState: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE, coState: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE, batteryAlert: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE, deviceMuted: com.google.home.matter.standard.SmokeCoAlarmTrait.MuteStateEnum? = COMPILED_CODE, testInProgress: kotlin.Boolean? = COMPILED_CODE, hardwareFaultAlert: kotlin.Boolean? = COMPILED_CODE, endOfServiceAlert: com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfServiceEnum? = COMPILED_CODE, interconnectSmokeAlarm: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE, interconnectCoAlarm: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE, contaminationState: com.google.home.matter.standard.SmokeCoAlarmTrait.ContaminationStateEnum? = COMPILED_CODE, smokeSensitivityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum? = COMPILED_CODE, expiryDate: kotlin.UInt? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.SmokeCoAlarmTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes, com.google.home.matter.standard.SmokeCoAlarmTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes) { /* compiled code */ }

        public open val expressedState: com.google.home.matter.standard.SmokeCoAlarmTrait.ExpressedStateEnum? /* compiled code */

        public open val smokeState: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open val coState: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open val batteryAlert: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open val deviceMuted: com.google.home.matter.standard.SmokeCoAlarmTrait.MuteStateEnum? /* compiled code */

        public open val testInProgress: kotlin.Boolean? /* compiled code */

        public open val hardwareFaultAlert: kotlin.Boolean? /* compiled code */

        public open val endOfServiceAlert: com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfServiceEnum? /* compiled code */

        public open val interconnectSmokeAlarm: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open val interconnectCoAlarm: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? /* compiled code */

        public open val contaminationState: com.google.home.matter.standard.SmokeCoAlarmTrait.ContaminationStateEnum? /* compiled code */

        public open val smokeSensitivityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum? /* compiled code */

        public open val expiryDate: kotlin.UInt? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.SmokeCoAlarmTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.SmokeCoAlarmTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(expressedState: com.google.home.matter.standard.SmokeCoAlarmTrait.ExpressedStateEnum? = COMPILED_CODE, smokeState: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE, coState: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE, batteryAlert: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE, deviceMuted: com.google.home.matter.standard.SmokeCoAlarmTrait.MuteStateEnum? = COMPILED_CODE, testInProgress: kotlin.Boolean? = COMPILED_CODE, hardwareFaultAlert: kotlin.Boolean? = COMPILED_CODE, endOfServiceAlert: com.google.home.matter.standard.SmokeCoAlarmTrait.EndOfServiceEnum? = COMPILED_CODE, interconnectSmokeAlarm: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE, interconnectCoAlarm: com.google.home.matter.standard.SmokeCoAlarmTrait.AlarmStateEnum? = COMPILED_CODE, contaminationState: com.google.home.matter.standard.SmokeCoAlarmTrait.ContaminationStateEnum? = COMPILED_CODE, smokeSensitivityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum? = COMPILED_CODE, expiryDate: kotlin.UInt? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.SmokeCoAlarmTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.SmokeCoAlarmTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.SmokeCoAlarmTrait.Attributes) : com.google.home.matter.standard.SmokeCoAlarmTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SmokeCoAlarmTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _smokeSensitivityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum? /* compiled code */

        public open val smokeSensitivityLevel: com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum? /* compiled code */
            public open get

        public final fun setSmokeSensitivityLevel(value: com.google.home.matter.standard.SmokeCoAlarmTrait.SensitivityEnum): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object SelfTestRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SmokeCoAlarmTrait.SelfTestRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SmokeCoAlarmTrait.SelfTestRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SmokeCoAlarmTrait.SelfTestRequestCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SmokeCoAlarmTrait.SelfTestRequestCommand.Request.CommandFields> {
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
}

