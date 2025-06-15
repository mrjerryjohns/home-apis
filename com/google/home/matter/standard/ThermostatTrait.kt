// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ThermostatTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class AcCapacityFormatEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum> {
        @androidx.annotation.NonNull BTUh,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class AcCompressorTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull T1,

        @androidx.annotation.NonNull T2,

        @androidx.annotation.NonNull T3,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class AcLouverPositionEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum> {
        @androidx.annotation.NonNull Closed,

        @androidx.annotation.NonNull Open,

        @androidx.annotation.NonNull Quarter,

        @androidx.annotation.NonNull Half,

        @androidx.annotation.NonNull ThreeQuarters,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class AcRefrigerantTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull R22,

        @androidx.annotation.NonNull R410a,

        @androidx.annotation.NonNull R407c,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class AcTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.AcTypeEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull CoolingFixed,

        @androidx.annotation.NonNull HeatPumpFixed,

        @androidx.annotation.NonNull CoolingInverter,

        @androidx.annotation.NonNull HeatPumpInverter,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.AcTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ControlSequenceOfOperationEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum> {
        @androidx.annotation.NonNull CoolingOnly,

        @androidx.annotation.NonNull CoolingWithReheat,

        @androidx.annotation.NonNull HeatingOnly,

        @androidx.annotation.NonNull HeatingWithReheat,

        @androidx.annotation.NonNull CoolingAndHeating,

        @androidx.annotation.NonNull CoolingAndHeatingWithReheat,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class PresetScenarioEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.PresetScenarioEnum> {
        @androidx.annotation.NonNull Occupied,

        @androidx.annotation.NonNull Unoccupied,

        @androidx.annotation.NonNull Sleep,

        @androidx.annotation.NonNull Wake,

        @androidx.annotation.NonNull Vacation,

        @androidx.annotation.NonNull GoingToSleep,

        @androidx.annotation.NonNull UserDefined,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.PresetScenarioEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class SetpointChangeSourceEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.SetpointChangeSourceEnum> {
        @androidx.annotation.NonNull Manual,

        @androidx.annotation.NonNull Schedule,

        @androidx.annotation.NonNull External,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.SetpointChangeSourceEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class SetpointRaiseLowerModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum> {
        @androidx.annotation.NonNull Heat,

        @androidx.annotation.NonNull Cool,

        @androidx.annotation.NonNull Both,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StartOfWeekEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.StartOfWeekEnum> {
        @androidx.annotation.NonNull Sunday,

        @androidx.annotation.NonNull Monday,

        @androidx.annotation.NonNull Tuesday,

        @androidx.annotation.NonNull Wednesday,

        @androidx.annotation.NonNull Thursday,

        @androidx.annotation.NonNull Friday,

        @androidx.annotation.NonNull Saturday,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.StartOfWeekEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class SystemModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.SystemModeEnum> {
        @androidx.annotation.NonNull Off,

        @androidx.annotation.NonNull Auto,

        @androidx.annotation.NonNull Cool,

        @androidx.annotation.NonNull Heat,

        @androidx.annotation.NonNull EmergencyHeat,

        @androidx.annotation.NonNull Precooling,

        @androidx.annotation.NonNull FanOnly,

        @androidx.annotation.NonNull Dry,

        @androidx.annotation.NonNull Sleep,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.SystemModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class TemperatureSetpointHoldEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum> {
        @androidx.annotation.NonNull SetpointHoldOff,

        @androidx.annotation.NonNull SetpointHoldOn,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ThermostatRunningModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.ThermostatRunningModeEnum> {
        @androidx.annotation.NonNull Off,

        @androidx.annotation.NonNull Cool,

        @androidx.annotation.NonNull Heat,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.ThermostatRunningModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class AtomicRequestTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum> {
        @androidx.annotation.NonNull BeginWrite,

        @androidx.annotation.NonNull CommitWrite,

        @androidx.annotation.NonNull RollbackWrite,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class AcErrorCodeBitmap public constructor(compressorFail: kotlin.Boolean = COMPILED_CODE, roomSensorFail: kotlin.Boolean = COMPILED_CODE, outdoorSensorFail: kotlin.Boolean = COMPILED_CODE, coilSensorFail: kotlin.Boolean = COMPILED_CODE, fanFail: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap> {
            private const final val COMPRESSOR_FAIL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ROOM_SENSOR_FAIL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val OUTDOOR_SENSOR_FAIL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COIL_SENSOR_FAIL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FAN_FAIL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap { /* compiled code */ }
        }

        public final val compressorFail: kotlin.Boolean /* compiled code */

        public final val roomSensorFail: kotlin.Boolean /* compiled code */

        public final val outdoorSensorFail: kotlin.Boolean /* compiled code */

        public final val coilSensorFail: kotlin.Boolean /* compiled code */

        public final val fanFail: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(compressorFail: kotlin.Boolean = COMPILED_CODE, roomSensorFail: kotlin.Boolean = COMPILED_CODE, outdoorSensorFail: kotlin.Boolean = COMPILED_CODE, coilSensorFail: kotlin.Boolean = COMPILED_CODE, fanFail: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class Feature public constructor(heating: kotlin.Boolean = COMPILED_CODE, cooling: kotlin.Boolean = COMPILED_CODE, occupancy: kotlin.Boolean = COMPILED_CODE, scheduleConfiguration: kotlin.Boolean = COMPILED_CODE, setback: kotlin.Boolean = COMPILED_CODE, autoMode: kotlin.Boolean = COMPILED_CODE, localTemperatureNotExposed: kotlin.Boolean = COMPILED_CODE, matterScheduleConfiguration: kotlin.Boolean = COMPILED_CODE, presets: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.Feature> {
            private const final val HEATING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COOLING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val OCCUPANCY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SCHEDULE_CONFIGURATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SETBACK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AUTO_MODE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCAL_TEMPERATURE_NOT_EXPOSED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MATTER_SCHEDULE_CONFIGURATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PRESETS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.Feature { /* compiled code */ }
        }

        public final val heating: kotlin.Boolean /* compiled code */

        public final val cooling: kotlin.Boolean /* compiled code */

        public final val occupancy: kotlin.Boolean /* compiled code */

        public final val scheduleConfiguration: kotlin.Boolean /* compiled code */

        public final val setback: kotlin.Boolean /* compiled code */

        public final val autoMode: kotlin.Boolean /* compiled code */

        public final val localTemperatureNotExposed: kotlin.Boolean /* compiled code */

        public final val matterScheduleConfiguration: kotlin.Boolean /* compiled code */

        public final val presets: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component8(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component9(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(heating: kotlin.Boolean = COMPILED_CODE, cooling: kotlin.Boolean = COMPILED_CODE, occupancy: kotlin.Boolean = COMPILED_CODE, scheduleConfiguration: kotlin.Boolean = COMPILED_CODE, setback: kotlin.Boolean = COMPILED_CODE, autoMode: kotlin.Boolean = COMPILED_CODE, localTemperatureNotExposed: kotlin.Boolean = COMPILED_CODE, matterScheduleConfiguration: kotlin.Boolean = COMPILED_CODE, presets: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class HvacSystemTypeBitmap public constructor(coolingStage: kotlin.Boolean = COMPILED_CODE, heatingStage: kotlin.Boolean = COMPILED_CODE, heatingIsHeatPump: kotlin.Boolean = COMPILED_CODE, heatingUsesFuel: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap> {
            private const final val COOLING_STAGE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val HEATING_STAGE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val HEATING_IS_HEAT_PUMP_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val HEATING_USES_FUEL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap { /* compiled code */ }
        }

        public final val coolingStage: kotlin.Boolean /* compiled code */

        public final val heatingStage: kotlin.Boolean /* compiled code */

        public final val heatingIsHeatPump: kotlin.Boolean /* compiled code */

        public final val heatingUsesFuel: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(coolingStage: kotlin.Boolean = COMPILED_CODE, heatingStage: kotlin.Boolean = COMPILED_CODE, heatingIsHeatPump: kotlin.Boolean = COMPILED_CODE, heatingUsesFuel: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class OccupancyBitmap public constructor(occupied: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap> {
            private const final val OCCUPIED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap { /* compiled code */ }
        }

        public final val occupied: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(occupied: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class PresetTypeFeaturesBitmap public constructor(automatic: kotlin.Boolean = COMPILED_CODE, supportsNames: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.PresetTypeFeaturesBitmap> {
            private const final val AUTOMATIC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_NAMES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.PresetTypeFeaturesBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.PresetTypeFeaturesBitmap { /* compiled code */ }
        }

        public final val automatic: kotlin.Boolean /* compiled code */

        public final val supportsNames: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(automatic: kotlin.Boolean = COMPILED_CODE, supportsNames: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.PresetTypeFeaturesBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class ProgrammingOperationModeBitmap public constructor(scheduleActive: kotlin.Boolean = COMPILED_CODE, autoRecovery: kotlin.Boolean = COMPILED_CODE, economy: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap> {
            private const final val SCHEDULE_ACTIVE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AUTO_RECOVERY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ECONOMY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap { /* compiled code */ }
        }

        public final val scheduleActive: kotlin.Boolean /* compiled code */

        public final val autoRecovery: kotlin.Boolean /* compiled code */

        public final val economy: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(scheduleActive: kotlin.Boolean = COMPILED_CODE, autoRecovery: kotlin.Boolean = COMPILED_CODE, economy: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class RelayStateBitmap public constructor(heat: kotlin.Boolean = COMPILED_CODE, cool: kotlin.Boolean = COMPILED_CODE, fan: kotlin.Boolean = COMPILED_CODE, heatStage2: kotlin.Boolean = COMPILED_CODE, coolStage2: kotlin.Boolean = COMPILED_CODE, fanStage2: kotlin.Boolean = COMPILED_CODE, fanStage3: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap> {
            private const final val HEAT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COOL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FAN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val HEAT_STAGE2_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COOL_STAGE2_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FAN_STAGE2_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FAN_STAGE3_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap { /* compiled code */ }
        }

        public final val heat: kotlin.Boolean /* compiled code */

        public final val cool: kotlin.Boolean /* compiled code */

        public final val fan: kotlin.Boolean /* compiled code */

        public final val heatStage2: kotlin.Boolean /* compiled code */

        public final val coolStage2: kotlin.Boolean /* compiled code */

        public final val fanStage2: kotlin.Boolean /* compiled code */

        public final val fanStage3: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(heat: kotlin.Boolean = COMPILED_CODE, cool: kotlin.Boolean = COMPILED_CODE, fan: kotlin.Boolean = COMPILED_CODE, heatStage2: kotlin.Boolean = COMPILED_CODE, coolStage2: kotlin.Boolean = COMPILED_CODE, fanStage2: kotlin.Boolean = COMPILED_CODE, fanStage3: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class RemoteSensingBitmap public constructor(localTemperature: kotlin.Boolean = COMPILED_CODE, outdoorTemperature: kotlin.Boolean = COMPILED_CODE, occupancy: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap> {
            private const final val LOCAL_TEMPERATURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val OUTDOOR_TEMPERATURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val OCCUPANCY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap { /* compiled code */ }
        }

        public final val localTemperature: kotlin.Boolean /* compiled code */

        public final val outdoorTemperature: kotlin.Boolean /* compiled code */

        public final val occupancy: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(localTemperature: kotlin.Boolean = COMPILED_CODE, outdoorTemperature: kotlin.Boolean = COMPILED_CODE, occupancy: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class ScheduleDayOfWeekBitmap public constructor(sunday: kotlin.Boolean = COMPILED_CODE, monday: kotlin.Boolean = COMPILED_CODE, tuesday: kotlin.Boolean = COMPILED_CODE, wednesday: kotlin.Boolean = COMPILED_CODE, thursday: kotlin.Boolean = COMPILED_CODE, friday: kotlin.Boolean = COMPILED_CODE, saturday: kotlin.Boolean = COMPILED_CODE, away: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap> {
            private const final val SUNDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MONDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TUESDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WEDNESDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val THURSDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FRIDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SATURDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AWAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap { /* compiled code */ }
        }

        public final val sunday: kotlin.Boolean /* compiled code */

        public final val monday: kotlin.Boolean /* compiled code */

        public final val tuesday: kotlin.Boolean /* compiled code */

        public final val wednesday: kotlin.Boolean /* compiled code */

        public final val thursday: kotlin.Boolean /* compiled code */

        public final val friday: kotlin.Boolean /* compiled code */

        public final val saturday: kotlin.Boolean /* compiled code */

        public final val away: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component8(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(sunday: kotlin.Boolean = COMPILED_CODE, monday: kotlin.Boolean = COMPILED_CODE, tuesday: kotlin.Boolean = COMPILED_CODE, wednesday: kotlin.Boolean = COMPILED_CODE, thursday: kotlin.Boolean = COMPILED_CODE, friday: kotlin.Boolean = COMPILED_CODE, saturday: kotlin.Boolean = COMPILED_CODE, away: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class ScheduleModeBitmap public constructor(heatSetpointPresent: kotlin.Boolean = COMPILED_CODE, coolSetpointPresent: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap> {
            private const final val HEAT_SETPOINT_PRESENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COOL_SETPOINT_PRESENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap { /* compiled code */ }
        }

        public final val heatSetpointPresent: kotlin.Boolean /* compiled code */

        public final val coolSetpointPresent: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(heatSetpointPresent: kotlin.Boolean = COMPILED_CODE, coolSetpointPresent: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class ScheduleTypeFeaturesBitmap public constructor(supportsPresets: kotlin.Boolean = COMPILED_CODE, supportsSetpoints: kotlin.Boolean = COMPILED_CODE, supportsNames: kotlin.Boolean = COMPILED_CODE, supportsOff: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeFeaturesBitmap> {
            private const final val SUPPORTS_PRESETS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_SETPOINTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_NAMES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_OFF_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThermostatTrait.ScheduleTypeFeaturesBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThermostatTrait.ScheduleTypeFeaturesBitmap { /* compiled code */ }
        }

        public final val supportsPresets: kotlin.Boolean /* compiled code */

        public final val supportsSetpoints: kotlin.Boolean /* compiled code */

        public final val supportsNames: kotlin.Boolean /* compiled code */

        public final val supportsOff: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(supportsPresets: kotlin.Boolean = COMPILED_CODE, supportsSetpoints: kotlin.Boolean = COMPILED_CODE, supportsNames: kotlin.Boolean = COMPILED_CODE, supportsOff: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.ScheduleTypeFeaturesBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class ScheduleTransitionStruct public constructor(dayOfWeek: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, presetHandle: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE, systemMode: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ThermostatTrait.SystemModeEnum> = COMPILED_CODE, coolingSetpoint: com.google.home.matter.serialization.OptionalValue<kotlin.Short> = COMPILED_CODE, heatingSetpoint: com.google.home.matter.serialization.OptionalValue<kotlin.Short> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct?>.dayOfWeek: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct?>.transitionTime: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct?>.presetHandle: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct?>.systemMode: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ThermostatTrait.SystemModeEnum>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct?>.coolingSetpoint: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.Short>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct?>.heatingSetpoint: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.Short>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct { /* compiled code */ }
        }

        public final val dayOfWeek: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap /* compiled code */

        public final val transitionTime: kotlin.UShort /* compiled code */

        public final val presetHandle: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

        public final val systemMode: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.ThermostatTrait.SystemModeEnum> /* compiled code */

        public final val coolingSetpoint: com.google.home.matter.serialization.OptionalValue<kotlin.Short> /* compiled code */

        public final val heatingSetpoint: com.google.home.matter.serialization.OptionalValue<kotlin.Short> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct.StructFields> {
            @androidx.annotation.NonNull dayOfWeek,

            @androidx.annotation.NonNull transitionTime,

            @androidx.annotation.NonNull presetHandle,

            @androidx.annotation.NonNull systemMode,

            @androidx.annotation.NonNull coolingSetpoint,

            @androidx.annotation.NonNull heatingSetpoint;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ScheduleStruct public constructor(scheduleHandle: kotlin.ByteArray? = COMPILED_CODE, systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum = COMPILED_CODE, name: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, presetHandle: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE, transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct> = COMPILED_CODE, builtIn: kotlin.Boolean? = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleStruct?>.scheduleHandle: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleStruct?>.systemMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.SystemModeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleStruct?>.name: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleStruct?>.presetHandle: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleStruct?>.transitions: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleStruct?>.builtIn: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.ScheduleStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.ScheduleStruct { /* compiled code */ }
        }

        public final val scheduleHandle: kotlin.ByteArray? /* compiled code */

        public final val systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum /* compiled code */

        public final val name: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val presetHandle: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

        public final val transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleTransitionStruct> /* compiled code */

        public final val builtIn: kotlin.Boolean? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct.StructFields> {
            @androidx.annotation.NonNull scheduleHandle,

            @androidx.annotation.NonNull systemMode,

            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull presetHandle,

            @androidx.annotation.NonNull transitions,

            @androidx.annotation.NonNull builtIn;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class PresetStruct public constructor(presetHandle: kotlin.ByteArray? = COMPILED_CODE, presetScenario: com.google.home.matter.standard.ThermostatTrait.PresetScenarioEnum = COMPILED_CODE, name: com.google.home.matter.serialization.OptionalValue<kotlin.String?> = COMPILED_CODE, coolingSetpoint: com.google.home.matter.serialization.OptionalValue<kotlin.Short> = COMPILED_CODE, heatingSetpoint: com.google.home.matter.serialization.OptionalValue<kotlin.Short> = COMPILED_CODE, builtIn: kotlin.Boolean? = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.PresetStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.PresetStruct?>.presetHandle: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.PresetStruct?>.presetScenario: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.PresetScenarioEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.PresetStruct?>.name: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.PresetStruct?>.coolingSetpoint: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.Short>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.PresetStruct?>.heatingSetpoint: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.Short>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.PresetStruct?>.builtIn: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.PresetStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.PresetStruct { /* compiled code */ }
        }

        public final val presetHandle: kotlin.ByteArray? /* compiled code */

        public final val presetScenario: com.google.home.matter.standard.ThermostatTrait.PresetScenarioEnum /* compiled code */

        public final val name: com.google.home.matter.serialization.OptionalValue<kotlin.String?> /* compiled code */

        public final val coolingSetpoint: com.google.home.matter.serialization.OptionalValue<kotlin.Short> /* compiled code */

        public final val heatingSetpoint: com.google.home.matter.serialization.OptionalValue<kotlin.Short> /* compiled code */

        public final val builtIn: kotlin.Boolean? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.PresetStruct.StructFields> {
            @androidx.annotation.NonNull presetHandle,

            @androidx.annotation.NonNull presetScenario,

            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull coolingSetpoint,

            @androidx.annotation.NonNull heatingSetpoint,

            @androidx.annotation.NonNull builtIn;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class PresetTypeStruct public constructor(presetScenario: com.google.home.matter.standard.ThermostatTrait.PresetScenarioEnum = COMPILED_CODE, numberOfPresets: kotlin.UByte = COMPILED_CODE, presetTypeFeatures: com.google.home.matter.standard.ThermostatTrait.PresetTypeFeaturesBitmap = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct?>.presetScenario: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.PresetScenarioEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct?>.numberOfPresets: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct?>.presetTypeFeatures: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.PresetTypeFeaturesBitmap> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct { /* compiled code */ }
        }

        public final val presetScenario: com.google.home.matter.standard.ThermostatTrait.PresetScenarioEnum /* compiled code */

        public final val numberOfPresets: kotlin.UByte /* compiled code */

        public final val presetTypeFeatures: com.google.home.matter.standard.ThermostatTrait.PresetTypeFeaturesBitmap /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct.StructFields> {
            @androidx.annotation.NonNull presetScenario,

            @androidx.annotation.NonNull numberOfPresets,

            @androidx.annotation.NonNull presetTypeFeatures;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ScheduleTypeStruct public constructor(systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum = COMPILED_CODE, numberOfSchedules: kotlin.UByte = COMPILED_CODE, scheduleTypeFeatures: com.google.home.matter.standard.ThermostatTrait.ScheduleTypeFeaturesBitmap = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct?>.systemMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.SystemModeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct?>.numberOfSchedules: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct?>.scheduleTypeFeatures: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeFeaturesBitmap> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct { /* compiled code */ }
        }

        public final val systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum /* compiled code */

        public final val numberOfSchedules: kotlin.UByte /* compiled code */

        public final val scheduleTypeFeatures: com.google.home.matter.standard.ThermostatTrait.ScheduleTypeFeaturesBitmap /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct.StructFields> {
            @androidx.annotation.NonNull systemMode,

            @androidx.annotation.NonNull numberOfSchedules,

            @androidx.annotation.NonNull scheduleTypeFeatures;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class WeeklyScheduleTransitionStruct public constructor(transitionTime: kotlin.UShort = COMPILED_CODE, heatSetpoint: kotlin.Short? = COMPILED_CODE, coolSetpoint: kotlin.Short? = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct?>.transitionTime: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct?>.heatSetpoint: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct?>.coolSetpoint: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct { /* compiled code */ }
        }

        public final val transitionTime: kotlin.UShort /* compiled code */

        public final val heatSetpoint: kotlin.Short? /* compiled code */

        public final val coolSetpoint: kotlin.Short? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct.StructFields> {
            @androidx.annotation.NonNull transitionTime,

            @androidx.annotation.NonNull heatSetpoint,

            @androidx.annotation.NonNull coolSetpoint;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class AtomicAttributeStatusStruct public constructor(attributeId: kotlin.UInt = COMPILED_CODE, statusCode: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.AtomicAttributeStatusStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.AtomicAttributeStatusStruct?>.attributeId: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatTrait.AtomicAttributeStatusStruct?>.statusCode: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.AtomicAttributeStatusStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.AtomicAttributeStatusStruct { /* compiled code */ }
        }

        public final val attributeId: kotlin.UInt /* compiled code */

        public final val statusCode: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.AtomicAttributeStatusStruct.StructFields> {
            @androidx.annotation.NonNull attributeId,

            @androidx.annotation.NonNull statusCode;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.Attributes { /* compiled code */ }
        }

        public abstract val localTemperature: kotlin.Short?

        public abstract val outdoorTemperature: kotlin.Short?

        public abstract val occupancy: com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap?

        public abstract val absMinHeatSetpointLimit: kotlin.Short?

        public abstract val absMaxHeatSetpointLimit: kotlin.Short?

        public abstract val absMinCoolSetpointLimit: kotlin.Short?

        public abstract val absMaxCoolSetpointLimit: kotlin.Short?

        public abstract val piCoolingDemand: kotlin.UByte?

        public abstract val piHeatingDemand: kotlin.UByte?

        public abstract val hvacSystemTypeConfiguration: com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap?

        public abstract val localTemperatureCalibration: kotlin.Byte?

        public abstract val occupiedCoolingSetpoint: kotlin.Short?

        public abstract val occupiedHeatingSetpoint: kotlin.Short?

        public abstract val unoccupiedCoolingSetpoint: kotlin.Short?

        public abstract val unoccupiedHeatingSetpoint: kotlin.Short?

        public abstract val minHeatSetpointLimit: kotlin.Short?

        public abstract val maxHeatSetpointLimit: kotlin.Short?

        public abstract val minCoolSetpointLimit: kotlin.Short?

        public abstract val maxCoolSetpointLimit: kotlin.Short?

        public abstract val minSetpointDeadBand: kotlin.Byte?

        public abstract val remoteSensing: com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap?

        public abstract val controlSequenceOfOperation: com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum?

        public abstract val systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum?

        public abstract val thermostatRunningMode: com.google.home.matter.standard.ThermostatTrait.ThermostatRunningModeEnum?

        public abstract val startOfWeek: com.google.home.matter.standard.ThermostatTrait.StartOfWeekEnum?

        public abstract val numberOfWeeklyTransitions: kotlin.UByte?

        public abstract val numberOfDailyTransitions: kotlin.UByte?

        public abstract val temperatureSetpointHold: com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum?

        public abstract val temperatureSetpointHoldDuration: kotlin.UShort?

        public abstract val thermostatProgrammingOperationMode: com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap?

        public abstract val thermostatRunningState: com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap?

        public abstract val setpointChangeSource: com.google.home.matter.standard.ThermostatTrait.SetpointChangeSourceEnum?

        public abstract val setpointChangeAmount: kotlin.Short?

        public abstract val setpointChangeSourceTimestamp: kotlin.UInt?

        public abstract val occupiedSetback: kotlin.UByte?

        public abstract val occupiedSetbackMin: kotlin.UByte?

        public abstract val occupiedSetbackMax: kotlin.UByte?

        public abstract val unoccupiedSetback: kotlin.UByte?

        public abstract val unoccupiedSetbackMin: kotlin.UByte?

        public abstract val unoccupiedSetbackMax: kotlin.UByte?

        public abstract val emergencyHeatDelta: kotlin.UByte?

        public abstract val acType: com.google.home.matter.standard.ThermostatTrait.AcTypeEnum?

        public abstract val acCapacity: kotlin.UShort?

        public abstract val acRefrigerantType: com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum?

        public abstract val acCompressorType: com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum?

        public abstract val acErrorCode: com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap?

        public abstract val acLouverPosition: com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum?

        public abstract val acCoilTemperature: kotlin.Short?

        public abstract val acCapacityformat: com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum?

        public abstract val presetTypes: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct>?

        public abstract val scheduleTypes: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct>?

        public abstract val numberOfPresets: kotlin.UByte?

        public abstract val numberOfSchedules: kotlin.UByte?

        public abstract val numberOfScheduleTransitions: kotlin.UByte?

        public abstract val numberOfScheduleTransitionPerDay: kotlin.UByte?

        public abstract val activePresetHandle: kotlin.ByteArray?

        public abstract val activeScheduleHandle: kotlin.ByteArray?

        public abstract val presets: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetStruct>?

        public abstract val schedules: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>?

        public abstract val setpointHoldExpiryTimestamp: kotlin.UInt?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.ThermostatTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(localTemperature: kotlin.Short? = COMPILED_CODE, outdoorTemperature: kotlin.Short? = COMPILED_CODE, occupancy: com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap? = COMPILED_CODE, absMinHeatSetpointLimit: kotlin.Short? = COMPILED_CODE, absMaxHeatSetpointLimit: kotlin.Short? = COMPILED_CODE, absMinCoolSetpointLimit: kotlin.Short? = COMPILED_CODE, absMaxCoolSetpointLimit: kotlin.Short? = COMPILED_CODE, piCoolingDemand: kotlin.UByte? = COMPILED_CODE, piHeatingDemand: kotlin.UByte? = COMPILED_CODE, hvacSystemTypeConfiguration: com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap? = COMPILED_CODE, localTemperatureCalibration: kotlin.Byte? = COMPILED_CODE, occupiedCoolingSetpoint: kotlin.Short? = COMPILED_CODE, occupiedHeatingSetpoint: kotlin.Short? = COMPILED_CODE, unoccupiedCoolingSetpoint: kotlin.Short? = COMPILED_CODE, unoccupiedHeatingSetpoint: kotlin.Short? = COMPILED_CODE, minHeatSetpointLimit: kotlin.Short? = COMPILED_CODE, maxHeatSetpointLimit: kotlin.Short? = COMPILED_CODE, minCoolSetpointLimit: kotlin.Short? = COMPILED_CODE, maxCoolSetpointLimit: kotlin.Short? = COMPILED_CODE, minSetpointDeadBand: kotlin.Byte? = COMPILED_CODE, remoteSensing: com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap? = COMPILED_CODE, controlSequenceOfOperation: com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum? = COMPILED_CODE, systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum? = COMPILED_CODE, thermostatRunningMode: com.google.home.matter.standard.ThermostatTrait.ThermostatRunningModeEnum? = COMPILED_CODE, startOfWeek: com.google.home.matter.standard.ThermostatTrait.StartOfWeekEnum? = COMPILED_CODE, numberOfWeeklyTransitions: kotlin.UByte? = COMPILED_CODE, numberOfDailyTransitions: kotlin.UByte? = COMPILED_CODE, temperatureSetpointHold: com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum? = COMPILED_CODE, temperatureSetpointHoldDuration: kotlin.UShort? = COMPILED_CODE, thermostatProgrammingOperationMode: com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap? = COMPILED_CODE, thermostatRunningState: com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap? = COMPILED_CODE, setpointChangeSource: com.google.home.matter.standard.ThermostatTrait.SetpointChangeSourceEnum? = COMPILED_CODE, setpointChangeAmount: kotlin.Short? = COMPILED_CODE, setpointChangeSourceTimestamp: kotlin.UInt? = COMPILED_CODE, occupiedSetback: kotlin.UByte? = COMPILED_CODE, occupiedSetbackMin: kotlin.UByte? = COMPILED_CODE, occupiedSetbackMax: kotlin.UByte? = COMPILED_CODE, unoccupiedSetback: kotlin.UByte? = COMPILED_CODE, unoccupiedSetbackMin: kotlin.UByte? = COMPILED_CODE, unoccupiedSetbackMax: kotlin.UByte? = COMPILED_CODE, emergencyHeatDelta: kotlin.UByte? = COMPILED_CODE, acType: com.google.home.matter.standard.ThermostatTrait.AcTypeEnum? = COMPILED_CODE, acCapacity: kotlin.UShort? = COMPILED_CODE, acRefrigerantType: com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum? = COMPILED_CODE, acCompressorType: com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum? = COMPILED_CODE, acErrorCode: com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap? = COMPILED_CODE, acLouverPosition: com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum? = COMPILED_CODE, acCoilTemperature: kotlin.Short? = COMPILED_CODE, acCapacityformat: com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum? = COMPILED_CODE, presetTypes: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct>? = COMPILED_CODE, scheduleTypes: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct>? = COMPILED_CODE, numberOfPresets: kotlin.UByte? = COMPILED_CODE, numberOfSchedules: kotlin.UByte? = COMPILED_CODE, numberOfScheduleTransitions: kotlin.UByte? = COMPILED_CODE, numberOfScheduleTransitionPerDay: kotlin.UByte? = COMPILED_CODE, activePresetHandle: kotlin.ByteArray? = COMPILED_CODE, activeScheduleHandle: kotlin.ByteArray? = COMPILED_CODE, presets: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetStruct>? = COMPILED_CODE, schedules: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>? = COMPILED_CODE, setpointHoldExpiryTimestamp: kotlin.UInt? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ThermostatTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ThermostatTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.ThermostatTrait.Attributes, com.google.home.matter.standard.ThermostatTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ThermostatTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ThermostatTrait.Attributes) { /* compiled code */ }

        public open val localTemperature: kotlin.Short? /* compiled code */

        public open val outdoorTemperature: kotlin.Short? /* compiled code */

        public open val occupancy: com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap? /* compiled code */

        public open val absMinHeatSetpointLimit: kotlin.Short? /* compiled code */

        public open val absMaxHeatSetpointLimit: kotlin.Short? /* compiled code */

        public open val absMinCoolSetpointLimit: kotlin.Short? /* compiled code */

        public open val absMaxCoolSetpointLimit: kotlin.Short? /* compiled code */

        public open val piCoolingDemand: kotlin.UByte? /* compiled code */

        public open val piHeatingDemand: kotlin.UByte? /* compiled code */

        public open val hvacSystemTypeConfiguration: com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap? /* compiled code */

        public open val localTemperatureCalibration: kotlin.Byte? /* compiled code */

        public open val occupiedCoolingSetpoint: kotlin.Short? /* compiled code */

        public open val occupiedHeatingSetpoint: kotlin.Short? /* compiled code */

        public open val unoccupiedCoolingSetpoint: kotlin.Short? /* compiled code */

        public open val unoccupiedHeatingSetpoint: kotlin.Short? /* compiled code */

        public open val minHeatSetpointLimit: kotlin.Short? /* compiled code */

        public open val maxHeatSetpointLimit: kotlin.Short? /* compiled code */

        public open val minCoolSetpointLimit: kotlin.Short? /* compiled code */

        public open val maxCoolSetpointLimit: kotlin.Short? /* compiled code */

        public open val minSetpointDeadBand: kotlin.Byte? /* compiled code */

        public open val remoteSensing: com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap? /* compiled code */

        public open val controlSequenceOfOperation: com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum? /* compiled code */

        public open val systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum? /* compiled code */

        public open val thermostatRunningMode: com.google.home.matter.standard.ThermostatTrait.ThermostatRunningModeEnum? /* compiled code */

        public open val startOfWeek: com.google.home.matter.standard.ThermostatTrait.StartOfWeekEnum? /* compiled code */

        public open val numberOfWeeklyTransitions: kotlin.UByte? /* compiled code */

        public open val numberOfDailyTransitions: kotlin.UByte? /* compiled code */

        public open val temperatureSetpointHold: com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum? /* compiled code */

        public open val temperatureSetpointHoldDuration: kotlin.UShort? /* compiled code */

        public open val thermostatProgrammingOperationMode: com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap? /* compiled code */

        public open val thermostatRunningState: com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap? /* compiled code */

        public open val setpointChangeSource: com.google.home.matter.standard.ThermostatTrait.SetpointChangeSourceEnum? /* compiled code */

        public open val setpointChangeAmount: kotlin.Short? /* compiled code */

        public open val setpointChangeSourceTimestamp: kotlin.UInt? /* compiled code */

        public open val occupiedSetback: kotlin.UByte? /* compiled code */

        public open val occupiedSetbackMin: kotlin.UByte? /* compiled code */

        public open val occupiedSetbackMax: kotlin.UByte? /* compiled code */

        public open val unoccupiedSetback: kotlin.UByte? /* compiled code */

        public open val unoccupiedSetbackMin: kotlin.UByte? /* compiled code */

        public open val unoccupiedSetbackMax: kotlin.UByte? /* compiled code */

        public open val emergencyHeatDelta: kotlin.UByte? /* compiled code */

        public open val acType: com.google.home.matter.standard.ThermostatTrait.AcTypeEnum? /* compiled code */

        public open val acCapacity: kotlin.UShort? /* compiled code */

        public open val acRefrigerantType: com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum? /* compiled code */

        public open val acCompressorType: com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum? /* compiled code */

        public open val acErrorCode: com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap? /* compiled code */

        public open val acLouverPosition: com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum? /* compiled code */

        public open val acCoilTemperature: kotlin.Short? /* compiled code */

        public open val acCapacityformat: com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum? /* compiled code */

        public open val presetTypes: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct>? /* compiled code */

        public open val scheduleTypes: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct>? /* compiled code */

        public open val numberOfPresets: kotlin.UByte? /* compiled code */

        public open val numberOfSchedules: kotlin.UByte? /* compiled code */

        public open val numberOfScheduleTransitions: kotlin.UByte? /* compiled code */

        public open val numberOfScheduleTransitionPerDay: kotlin.UByte? /* compiled code */

        public open val activePresetHandle: kotlin.ByteArray? /* compiled code */

        public open val activeScheduleHandle: kotlin.ByteArray? /* compiled code */

        public open val presets: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetStruct>? /* compiled code */

        public open val schedules: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>? /* compiled code */

        public open val setpointHoldExpiryTimestamp: kotlin.UInt? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.ThermostatTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.ThermostatTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.ThermostatTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(localTemperature: kotlin.Short? = COMPILED_CODE, outdoorTemperature: kotlin.Short? = COMPILED_CODE, occupancy: com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap? = COMPILED_CODE, absMinHeatSetpointLimit: kotlin.Short? = COMPILED_CODE, absMaxHeatSetpointLimit: kotlin.Short? = COMPILED_CODE, absMinCoolSetpointLimit: kotlin.Short? = COMPILED_CODE, absMaxCoolSetpointLimit: kotlin.Short? = COMPILED_CODE, piCoolingDemand: kotlin.UByte? = COMPILED_CODE, piHeatingDemand: kotlin.UByte? = COMPILED_CODE, hvacSystemTypeConfiguration: com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap? = COMPILED_CODE, localTemperatureCalibration: kotlin.Byte? = COMPILED_CODE, occupiedCoolingSetpoint: kotlin.Short? = COMPILED_CODE, occupiedHeatingSetpoint: kotlin.Short? = COMPILED_CODE, unoccupiedCoolingSetpoint: kotlin.Short? = COMPILED_CODE, unoccupiedHeatingSetpoint: kotlin.Short? = COMPILED_CODE, minHeatSetpointLimit: kotlin.Short? = COMPILED_CODE, maxHeatSetpointLimit: kotlin.Short? = COMPILED_CODE, minCoolSetpointLimit: kotlin.Short? = COMPILED_CODE, maxCoolSetpointLimit: kotlin.Short? = COMPILED_CODE, minSetpointDeadBand: kotlin.Byte? = COMPILED_CODE, remoteSensing: com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap? = COMPILED_CODE, controlSequenceOfOperation: com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum? = COMPILED_CODE, systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum? = COMPILED_CODE, thermostatRunningMode: com.google.home.matter.standard.ThermostatTrait.ThermostatRunningModeEnum? = COMPILED_CODE, startOfWeek: com.google.home.matter.standard.ThermostatTrait.StartOfWeekEnum? = COMPILED_CODE, numberOfWeeklyTransitions: kotlin.UByte? = COMPILED_CODE, numberOfDailyTransitions: kotlin.UByte? = COMPILED_CODE, temperatureSetpointHold: com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum? = COMPILED_CODE, temperatureSetpointHoldDuration: kotlin.UShort? = COMPILED_CODE, thermostatProgrammingOperationMode: com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap? = COMPILED_CODE, thermostatRunningState: com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap? = COMPILED_CODE, setpointChangeSource: com.google.home.matter.standard.ThermostatTrait.SetpointChangeSourceEnum? = COMPILED_CODE, setpointChangeAmount: kotlin.Short? = COMPILED_CODE, setpointChangeSourceTimestamp: kotlin.UInt? = COMPILED_CODE, occupiedSetback: kotlin.UByte? = COMPILED_CODE, occupiedSetbackMin: kotlin.UByte? = COMPILED_CODE, occupiedSetbackMax: kotlin.UByte? = COMPILED_CODE, unoccupiedSetback: kotlin.UByte? = COMPILED_CODE, unoccupiedSetbackMin: kotlin.UByte? = COMPILED_CODE, unoccupiedSetbackMax: kotlin.UByte? = COMPILED_CODE, emergencyHeatDelta: kotlin.UByte? = COMPILED_CODE, acType: com.google.home.matter.standard.ThermostatTrait.AcTypeEnum? = COMPILED_CODE, acCapacity: kotlin.UShort? = COMPILED_CODE, acRefrigerantType: com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum? = COMPILED_CODE, acCompressorType: com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum? = COMPILED_CODE, acErrorCode: com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap? = COMPILED_CODE, acLouverPosition: com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum? = COMPILED_CODE, acCoilTemperature: kotlin.Short? = COMPILED_CODE, acCapacityformat: com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum? = COMPILED_CODE, presetTypes: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct>? = COMPILED_CODE, scheduleTypes: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct>? = COMPILED_CODE, numberOfPresets: kotlin.UByte? = COMPILED_CODE, numberOfSchedules: kotlin.UByte? = COMPILED_CODE, numberOfScheduleTransitions: kotlin.UByte? = COMPILED_CODE, numberOfScheduleTransitionPerDay: kotlin.UByte? = COMPILED_CODE, activePresetHandle: kotlin.ByteArray? = COMPILED_CODE, activeScheduleHandle: kotlin.ByteArray? = COMPILED_CODE, presets: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetStruct>? = COMPILED_CODE, schedules: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>? = COMPILED_CODE, setpointHoldExpiryTimestamp: kotlin.UInt? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ThermostatTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.ThermostatTrait.Attributes) : com.google.home.matter.standard.ThermostatTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _hvacSystemTypeConfiguration: com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap? /* compiled code */

        public open val hvacSystemTypeConfiguration: com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap? /* compiled code */
            public open get

        internal final var _localTemperatureCalibration: kotlin.Byte? /* compiled code */

        public open val localTemperatureCalibration: kotlin.Byte? /* compiled code */
            public open get

        internal final var _occupiedCoolingSetpoint: kotlin.Short? /* compiled code */

        public open val occupiedCoolingSetpoint: kotlin.Short? /* compiled code */
            public open get

        internal final var _occupiedHeatingSetpoint: kotlin.Short? /* compiled code */

        public open val occupiedHeatingSetpoint: kotlin.Short? /* compiled code */
            public open get

        internal final var _unoccupiedCoolingSetpoint: kotlin.Short? /* compiled code */

        public open val unoccupiedCoolingSetpoint: kotlin.Short? /* compiled code */
            public open get

        internal final var _unoccupiedHeatingSetpoint: kotlin.Short? /* compiled code */

        public open val unoccupiedHeatingSetpoint: kotlin.Short? /* compiled code */
            public open get

        internal final var _minHeatSetpointLimit: kotlin.Short? /* compiled code */

        public open val minHeatSetpointLimit: kotlin.Short? /* compiled code */
            public open get

        internal final var _maxHeatSetpointLimit: kotlin.Short? /* compiled code */

        public open val maxHeatSetpointLimit: kotlin.Short? /* compiled code */
            public open get

        internal final var _minCoolSetpointLimit: kotlin.Short? /* compiled code */

        public open val minCoolSetpointLimit: kotlin.Short? /* compiled code */
            public open get

        internal final var _maxCoolSetpointLimit: kotlin.Short? /* compiled code */

        public open val maxCoolSetpointLimit: kotlin.Short? /* compiled code */
            public open get

        internal final var _minSetpointDeadBand: kotlin.Byte? /* compiled code */

        public open val minSetpointDeadBand: kotlin.Byte? /* compiled code */
            public open get

        internal final var _remoteSensing: com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap? /* compiled code */

        public open val remoteSensing: com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap? /* compiled code */
            public open get

        internal final var _controlSequenceOfOperation: com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum? /* compiled code */

        public open val controlSequenceOfOperation: com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum? /* compiled code */
            public open get

        internal final var _systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum? /* compiled code */

        public open val systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum? /* compiled code */
            public open get

        internal final var _temperatureSetpointHold: com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum? /* compiled code */

        public open val temperatureSetpointHold: com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum? /* compiled code */
            public open get

        internal final var _temperatureSetpointHoldDuration: kotlin.UShort? /* compiled code */

        internal final var _isTemperatureSetpointHoldDurationSet: kotlin.Boolean /* compiled code */

        public open val temperatureSetpointHoldDuration: kotlin.UShort? /* compiled code */
            public open get

        internal final var _thermostatProgrammingOperationMode: com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap? /* compiled code */

        public open val thermostatProgrammingOperationMode: com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap? /* compiled code */
            public open get

        internal final var _occupiedSetback: kotlin.UByte? /* compiled code */

        internal final var _isOccupiedSetbackSet: kotlin.Boolean /* compiled code */

        public open val occupiedSetback: kotlin.UByte? /* compiled code */
            public open get

        internal final var _unoccupiedSetback: kotlin.UByte? /* compiled code */

        internal final var _isUnoccupiedSetbackSet: kotlin.Boolean /* compiled code */

        public open val unoccupiedSetback: kotlin.UByte? /* compiled code */
            public open get

        internal final var _emergencyHeatDelta: kotlin.UByte? /* compiled code */

        public open val emergencyHeatDelta: kotlin.UByte? /* compiled code */
            public open get

        internal final var _acType: com.google.home.matter.standard.ThermostatTrait.AcTypeEnum? /* compiled code */

        public open val acType: com.google.home.matter.standard.ThermostatTrait.AcTypeEnum? /* compiled code */
            public open get

        internal final var _acCapacity: kotlin.UShort? /* compiled code */

        public open val acCapacity: kotlin.UShort? /* compiled code */
            public open get

        internal final var _acRefrigerantType: com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum? /* compiled code */

        public open val acRefrigerantType: com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum? /* compiled code */
            public open get

        internal final var _acCompressorType: com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum? /* compiled code */

        public open val acCompressorType: com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum? /* compiled code */
            public open get

        internal final var _acErrorCode: com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap? /* compiled code */

        public open val acErrorCode: com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap? /* compiled code */
            public open get

        internal final var _acLouverPosition: com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum? /* compiled code */

        public open val acLouverPosition: com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum? /* compiled code */
            public open get

        internal final var _acCapacityformat: com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum? /* compiled code */

        public open val acCapacityformat: com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum? /* compiled code */
            public open get

        internal final var _presets: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetStruct>? /* compiled code */

        public open val presets: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetStruct>? /* compiled code */
            public open get

        internal final var _schedules: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>? /* compiled code */

        public open val schedules: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>? /* compiled code */
            public open get

        public final fun setHvacSystemTypeConfiguration(value: com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap): kotlin.Unit { /* compiled code */ }

        public final fun setLocalTemperatureCalibration(value: kotlin.Byte): kotlin.Unit { /* compiled code */ }

        public final fun setOccupiedCoolingSetpoint(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun setOccupiedHeatingSetpoint(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun setUnoccupiedCoolingSetpoint(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun setUnoccupiedHeatingSetpoint(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun setMinHeatSetpointLimit(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun setMaxHeatSetpointLimit(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun setMinCoolSetpointLimit(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun setMaxCoolSetpointLimit(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun setMinSetpointDeadBand(value: kotlin.Byte): kotlin.Unit { /* compiled code */ }

        public final fun setRemoteSensing(value: com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap): kotlin.Unit { /* compiled code */ }

        public final fun setControlSequenceOfOperation(value: com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum): kotlin.Unit { /* compiled code */ }

        public final fun setSystemMode(value: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum): kotlin.Unit { /* compiled code */ }

        public final fun setTemperatureSetpointHold(value: com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum): kotlin.Unit { /* compiled code */ }

        public final fun setTemperatureSetpointHoldDuration(value: kotlin.UShort?): kotlin.Unit { /* compiled code */ }

        public final fun setThermostatProgrammingOperationMode(value: com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap): kotlin.Unit { /* compiled code */ }

        public final fun setOccupiedSetback(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setUnoccupiedSetback(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setEmergencyHeatDelta(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setAcType(value: com.google.home.matter.standard.ThermostatTrait.AcTypeEnum): kotlin.Unit { /* compiled code */ }

        public final fun setAcCapacity(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setAcRefrigerantType(value: com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum): kotlin.Unit { /* compiled code */ }

        public final fun setAcCompressorType(value: com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum): kotlin.Unit { /* compiled code */ }

        public final fun setAcErrorCode(value: com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap): kotlin.Unit { /* compiled code */ }

        public final fun setAcLouverPosition(value: com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum): kotlin.Unit { /* compiled code */ }

        public final fun setAcCapacityformat(value: com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum): kotlin.Unit { /* compiled code */ }

        public final fun setPresets(value: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetStruct>): kotlin.Unit { /* compiled code */ }

        public final fun setSchedules(value: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object SetpointRaiseLowerCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(mode: com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum = COMPILED_CODE, amount: kotlin.Byte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerCommand.Request { /* compiled code */ }
            }

            public final val mode: com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum /* compiled code */

            public final val amount: kotlin.Byte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerCommand.Request.CommandFields> {
                @androidx.annotation.NonNull mode,

                @androidx.annotation.NonNull amount;

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

    public object SetWeeklyScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(numberOfTransitionsForSequence: kotlin.UByte = COMPILED_CODE, dayOfWeekForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap = COMPILED_CODE, modeForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap = COMPILED_CODE, transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.SetWeeklyScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.SetWeeklyScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.SetWeeklyScheduleCommand.Request { /* compiled code */ }
            }

            public final val numberOfTransitionsForSequence: kotlin.UByte /* compiled code */

            public final val dayOfWeekForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap /* compiled code */

            public final val modeForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap /* compiled code */

            public final val transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.SetWeeklyScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull numberOfTransitionsForSequence,

                @androidx.annotation.NonNull dayOfWeekForSequence,

                @androidx.annotation.NonNull modeForSequence,

                @androidx.annotation.NonNull transitions;

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

    public object GetWeeklyScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(daysToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap = COMPILED_CODE, modeToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Request { /* compiled code */ }
            }

            public final val daysToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap /* compiled code */

            public final val modeToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Request.CommandFields> {
                @androidx.annotation.NonNull daysToReturn,

                @androidx.annotation.NonNull modeToReturn;

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

        public final class Response public constructor(numberOfTransitionsForSequence: kotlin.UByte = COMPILED_CODE, dayOfWeekForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap = COMPILED_CODE, modeForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap = COMPILED_CODE, transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Response { /* compiled code */ }
            }

            public final val numberOfTransitionsForSequence: kotlin.UByte /* compiled code */

            public final val dayOfWeekForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap /* compiled code */

            public final val modeForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap /* compiled code */

            public final val transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Response.CommandFields> {
                @androidx.annotation.NonNull numberOfTransitionsForSequence,

                @androidx.annotation.NonNull dayOfWeekForSequence,

                @androidx.annotation.NonNull modeForSequence,

                @androidx.annotation.NonNull transitions;

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

    public object ClearWeeklyScheduleCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.ClearWeeklyScheduleCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.ClearWeeklyScheduleCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.ClearWeeklyScheduleCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.ClearWeeklyScheduleCommand.Request.CommandFields> {
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

    public object SetActiveScheduleRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(scheduleHandle: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.SetActiveScheduleRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.SetActiveScheduleRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.SetActiveScheduleRequestCommand.Request { /* compiled code */ }
            }

            public final val scheduleHandle: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.SetActiveScheduleRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull scheduleHandle;

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

    public object SetActivePresetRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(presetHandle: kotlin.ByteArray? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.SetActivePresetRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.SetActivePresetRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.SetActivePresetRequestCommand.Request { /* compiled code */ }
            }

            public final val presetHandle: kotlin.ByteArray? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.SetActivePresetRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull presetHandle;

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

    public object AtomicRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(requestType: com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum = COMPILED_CODE, attributeRequests: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, timeout: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Request { /* compiled code */ }
            }

            public final val requestType: com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum /* compiled code */

            public final val attributeRequests: kotlin.collections.List<kotlin.UInt> /* compiled code */

            public final val timeout: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull requestType,

                @androidx.annotation.NonNull attributeRequests,

                @androidx.annotation.NonNull timeout;

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
            public abstract var timeout: kotlin.UShort
        }

        public final class Response public constructor(statusCode: kotlin.UByte = COMPILED_CODE, attributeStatus: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.AtomicAttributeStatusStruct> = COMPILED_CODE, timeout: kotlin.UShort? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Response { /* compiled code */ }
            }

            public final val statusCode: kotlin.UByte /* compiled code */

            public final val attributeStatus: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.AtomicAttributeStatusStruct> /* compiled code */

            public final val timeout: kotlin.UShort? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull statusCode,

                @androidx.annotation.NonNull attributeStatus,

                @androidx.annotation.NonNull timeout;

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

