// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedThermostatTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ExtendedThermostatMode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode> {
        @androidx.annotation.NonNull Standard,

        @androidx.annotation.NonNull On,

        @androidx.annotation.NonNull Purifier,

        @androidx.annotation.NonNull Eco,

        @androidx.annotation.NonNull SmarthomeAuto,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ExtendedRunningMode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedThermostatTrait.ExtendedRunningMode> {
        @androidx.annotation.NonNull Standard,

        @androidx.annotation.NonNull FanOnly,

        @androidx.annotation.NonNull Purifier,

        @androidx.annotation.NonNull Dry,

        @androidx.annotation.NonNull Auto,

        @androidx.annotation.NonNull On,

        @androidx.annotation.NonNull HeatCool,

        @androidx.annotation.NonNull Eco,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedThermostatTrait.ExtendedRunningMode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class PresetScenario private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedThermostatTrait.PresetScenario> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Comfort,

        @androidx.annotation.NonNull Eco,

        @androidx.annotation.NonNull Sleep,

        @androidx.annotation.NonNull Wake,

        @androidx.annotation.NonNull Home,

        @androidx.annotation.NonNull Away,

        @androidx.annotation.NonNull Occupied,

        @androidx.annotation.NonNull Unoccupied,

        @androidx.annotation.NonNull Vacation,

        @androidx.annotation.NonNull UserDefined,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedThermostatTrait.PresetScenario> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ExtendedSetpointChangeSource private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedThermostatTrait.ExtendedSetpointChangeSource> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull EnergyProgram,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedThermostatTrait.ExtendedSetpointChangeSource> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class SensorType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedThermostatTrait.SensorType> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Smoke,

        @androidx.annotation.NonNull CarbonMonoxide,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedThermostatTrait.SensorType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class AlarmType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedThermostatTrait.AlarmType> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Ok,

        @androidx.annotation.NonNull Warning,

        @androidx.annotation.NonNull Critical,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedThermostatTrait.AlarmType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class ExtendedThermostatFeature public constructor(presets: kotlin.Boolean = COMPILED_CODE, remoteTemperatureSensing: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature> {
            private const final val PRESETS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val REMOTE_TEMPERATURE_SENSING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature { /* compiled code */ }
        }

        public final val presets: kotlin.Boolean /* compiled code */

        public final val remoteTemperatureSensing: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(presets: kotlin.Boolean = COMPILED_CODE, remoteTemperatureSensing: kotlin.Boolean = COMPILED_CODE): com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class ExtendedProgrammingOperationMode public constructor(safetyOverride: kotlin.Boolean = COMPILED_CODE, preconditioningSchedule: kotlin.Boolean = COMPILED_CODE, preconditioningEnergyProgram: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.ExtendedThermostatTrait.ExtendedProgrammingOperationMode> {
            private const final val SAFETY_OVERRIDE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PRECONDITIONING_SCHEDULE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PRECONDITIONING_ENERGY_PROGRAM_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.ExtendedThermostatTrait.ExtendedProgrammingOperationMode): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.ExtendedThermostatTrait.ExtendedProgrammingOperationMode { /* compiled code */ }
        }

        public final val safetyOverride: kotlin.Boolean /* compiled code */

        public final val preconditioningSchedule: kotlin.Boolean /* compiled code */

        public final val preconditioningEnergyProgram: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(safetyOverride: kotlin.Boolean = COMPILED_CODE, preconditioningSchedule: kotlin.Boolean = COMPILED_CODE, preconditioningEnergyProgram: kotlin.Boolean = COMPILED_CODE): com.google.home.google.ExtendedThermostatTrait.ExtendedProgrammingOperationMode { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class PresetSynonyms public constructor(language: kotlin.String = COMPILED_CODE, synonyms: kotlin.collections.List<kotlin.String> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedThermostatTrait.PresetSynonyms>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostatTrait.PresetSynonyms?>.language: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostatTrait.PresetSynonyms?>.synonyms: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedThermostatTrait.PresetSynonyms): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedThermostatTrait.PresetSynonyms { /* compiled code */ }
        }

        public final val language: kotlin.String /* compiled code */

        public final val synonyms: kotlin.collections.List<kotlin.String> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedThermostatTrait.PresetSynonyms.StructFields> {
            @androidx.annotation.NonNull language,

            @androidx.annotation.NonNull synonyms;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class Preset public constructor(presetHandle: kotlin.String = COMPILED_CODE, presetScenario: com.google.home.google.ExtendedThermostatTrait.PresetScenario = COMPILED_CODE, presetMaxHoldSeconds: kotlin.Int = COMPILED_CODE, names: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.PresetSynonyms> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedThermostatTrait.Preset>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostatTrait.Preset?>.presetHandle: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostatTrait.Preset?>.presetScenario: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedThermostatTrait.PresetScenario> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostatTrait.Preset?>.presetMaxHoldSeconds: com.google.home.automation.TypedExpression<kotlin.Int> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostatTrait.Preset?>.names: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.PresetSynonyms>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedThermostatTrait.Preset): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedThermostatTrait.Preset { /* compiled code */ }
        }

        public final val presetHandle: kotlin.String /* compiled code */

        public final val presetScenario: com.google.home.google.ExtendedThermostatTrait.PresetScenario /* compiled code */

        public final val presetMaxHoldSeconds: kotlin.Int /* compiled code */

        public final val names: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.PresetSynonyms> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedThermostatTrait.Preset.StructFields> {
            @androidx.annotation.NonNull presetHandle,

            @androidx.annotation.NonNull presetScenario,

            @androidx.annotation.NonNull presetMaxHoldSeconds,

            @androidx.annotation.NonNull names;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedThermostatTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedThermostatTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedThermostatTrait.Attributes { /* compiled code */ }
        }

        public abstract val minHeatSafetySetpointLimit: kotlin.Short?

        public abstract val maxHeatSafetySetpointLimit: kotlin.Short?

        public abstract val minCoolSafetySetpointLimit: kotlin.Short?

        public abstract val maxCoolSafetySetpointLimit: kotlin.Short?

        public abstract val extendedSupportedModes: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode>?

        public abstract val extendedRunningMode: com.google.home.google.ExtendedThermostatTrait.ExtendedRunningMode?

        public abstract val presets: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.Preset>?

        public abstract val maxSetpointHoldSeconds: kotlin.Int?

        public abstract val targetTemperatureTimestampSeconds: kotlin.Long?

        public abstract val activePresetHandle: kotlin.String?

        public abstract val averageLocalTemperature: kotlin.Short?

        public abstract val remoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>?

        public abstract val maxSettableThermostatTemperatureSensors: kotlin.UInt?

        public abstract val activeRemoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>?

        public abstract val temperatureSetpointHoldExpiryTimestampSeconds: kotlin.Long?

        public abstract val extendedSetpointChangeSource: com.google.home.google.ExtendedThermostatTrait.ExtendedSetpointChangeSource?

        public abstract val extendedProgrammingOperationMode: kotlin.UInt?

        public abstract val extendedSystemMode: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(minHeatSafetySetpointLimit: kotlin.Short? = COMPILED_CODE, maxHeatSafetySetpointLimit: kotlin.Short? = COMPILED_CODE, minCoolSafetySetpointLimit: kotlin.Short? = COMPILED_CODE, maxCoolSafetySetpointLimit: kotlin.Short? = COMPILED_CODE, extendedSupportedModes: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode>? = COMPILED_CODE, extendedRunningMode: com.google.home.google.ExtendedThermostatTrait.ExtendedRunningMode? = COMPILED_CODE, presets: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.Preset>? = COMPILED_CODE, maxSetpointHoldSeconds: kotlin.Int? = COMPILED_CODE, targetTemperatureTimestampSeconds: kotlin.Long? = COMPILED_CODE, activePresetHandle: kotlin.String? =
        COMPILED_CODE, averageLocalTemperature: kotlin.Short? = COMPILED_CODE, remoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, maxSettableThermostatTemperatureSensors: kotlin.UInt? = COMPILED_CODE, activeRemoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, temperatureSetpointHoldExpiryTimestampSeconds: kotlin.Long? = COMPILED_CODE, extendedSetpointChangeSource: com.google.home.google.ExtendedThermostatTrait.ExtendedSetpointChangeSource? = COMPILED_CODE, extendedProgrammingOperationMode: kotlin.UInt? = COMPILED_CODE, extendedSystemMode: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList:
        kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ExtendedThermostatTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.google.ExtendedThermostatTrait.Attributes, com.google.home.google.ExtendedThermostatTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedThermostatTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedThermostatTrait.Attributes) { /* compiled code */ }

        public open val minHeatSafetySetpointLimit: kotlin.Short? /* compiled code */

        public open val maxHeatSafetySetpointLimit: kotlin.Short? /* compiled code */

        public open val minCoolSafetySetpointLimit: kotlin.Short? /* compiled code */

        public open val maxCoolSafetySetpointLimit: kotlin.Short? /* compiled code */

        public open val extendedSupportedModes: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode>? /* compiled code */

        public open val extendedRunningMode: com.google.home.google.ExtendedThermostatTrait.ExtendedRunningMode? /* compiled code */

        public open val presets: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.Preset>? /* compiled code */

        public open val maxSetpointHoldSeconds: kotlin.Int? /* compiled code */

        public open val targetTemperatureTimestampSeconds: kotlin.Long? /* compiled code */

        public open val activePresetHandle: kotlin.String? /* compiled code */

        public open val averageLocalTemperature: kotlin.Short? /* compiled code */

        public open val remoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val maxSettableThermostatTemperatureSensors: kotlin.UInt? /* compiled code */

        public open val activeRemoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val temperatureSetpointHoldExpiryTimestampSeconds: kotlin.Long? /* compiled code */

        public open val extendedSetpointChangeSource: com.google.home.google.ExtendedThermostatTrait.ExtendedSetpointChangeSource? /* compiled code */

        public open val extendedProgrammingOperationMode: kotlin.UInt? /* compiled code */

        public open val extendedSystemMode: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.google.ExtendedThermostatTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.ExtendedThermostatTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(minHeatSafetySetpointLimit: kotlin.Short? = COMPILED_CODE, maxHeatSafetySetpointLimit: kotlin.Short? = COMPILED_CODE, minCoolSafetySetpointLimit: kotlin.Short? = COMPILED_CODE, maxCoolSafetySetpointLimit: kotlin.Short? = COMPILED_CODE, extendedSupportedModes: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode>? = COMPILED_CODE, extendedRunningMode: com.google.home.google.ExtendedThermostatTrait.ExtendedRunningMode? = COMPILED_CODE, presets: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.Preset>? = COMPILED_CODE, maxSetpointHoldSeconds: kotlin.Int? = COMPILED_CODE, targetTemperatureTimestampSeconds: kotlin.Long? = COMPILED_CODE, activePresetHandle: kotlin.String? = COMPILED_CODE,
            averageLocalTemperature: kotlin.Short? = COMPILED_CODE, remoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, maxSettableThermostatTemperatureSensors: kotlin.UInt? = COMPILED_CODE, activeRemoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, temperatureSetpointHoldExpiryTimestampSeconds: kotlin.Long? = COMPILED_CODE, extendedSetpointChangeSource: com.google.home.google.ExtendedThermostatTrait.ExtendedSetpointChangeSource? = COMPILED_CODE, extendedProgrammingOperationMode: kotlin.UInt? = COMPILED_CODE, extendedSystemMode: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList:
            kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ExtendedThermostatTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.google.ExtendedThermostatTrait.Attributes) : com.google.home.google.ExtendedThermostatTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedThermostatTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedThermostatTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedThermostatTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _activePresetHandle: kotlin.String? /* compiled code */

        public open val activePresetHandle: kotlin.String? /* compiled code */
            public open get

        internal final var _activeRemoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val activeRemoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>? /* compiled code */
            public open get

        internal final var _extendedSystemMode: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode? /* compiled code */

        public open val extendedSystemMode: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode? /* compiled code */
            public open get

        public final fun setActivePresetHandle(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun setActiveRemoteTemperatureSensorIds(value: kotlin.collections.List<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final fun setExtendedSystemMode(value: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object NotifySensorStateChangeCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(sensorType: com.google.home.google.ExtendedThermostatTrait.SensorType = COMPILED_CODE, alarmType: com.google.home.google.ExtendedThermostatTrait.AlarmType = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedThermostatTrait.NotifySensorStateChangeCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedThermostatTrait.NotifySensorStateChangeCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedThermostatTrait.NotifySensorStateChangeCommand.Request { /* compiled code */ }
            }

            public final val sensorType: com.google.home.google.ExtendedThermostatTrait.SensorType /* compiled code */

            public final val alarmType: com.google.home.google.ExtendedThermostatTrait.AlarmType /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedThermostatTrait.NotifySensorStateChangeCommand.Request.CommandFields> {
                @androidx.annotation.NonNull sensorType,

                @androidx.annotation.NonNull alarmType;

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
