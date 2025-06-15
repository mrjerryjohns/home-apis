// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object PumpConfigurationAndControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ControlModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum> {
        @androidx.annotation.NonNull ConstantSpeed,

        @androidx.annotation.NonNull ConstantPressure,

        @androidx.annotation.NonNull ProportionalPressure,

        @androidx.annotation.NonNull ConstantFlow,

        @androidx.annotation.NonNull ConstantTemperature,

        @androidx.annotation.NonNull Automatic,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class OperationModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum> {
        @androidx.annotation.NonNull Normal,

        @androidx.annotation.NonNull Minimum,

        @androidx.annotation.NonNull Maximum,

        @androidx.annotation.NonNull Local,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(constantPressure: kotlin.Boolean = COMPILED_CODE, compensatedPressure: kotlin.Boolean = COMPILED_CODE, constantFlow: kotlin.Boolean = COMPILED_CODE, constantSpeed: kotlin.Boolean = COMPILED_CODE, constantTemperature: kotlin.Boolean = COMPILED_CODE, automatic: kotlin.Boolean = COMPILED_CODE, localOperation: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.Feature> {
            private const final val CONSTANT_PRESSURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COMPENSATED_PRESSURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CONSTANT_FLOW_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CONSTANT_SPEED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CONSTANT_TEMPERATURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AUTOMATIC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCAL_OPERATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.PumpConfigurationAndControlTrait.Feature { /* compiled code */ }
        }

        public final val constantPressure: kotlin.Boolean /* compiled code */

        public final val compensatedPressure: kotlin.Boolean /* compiled code */

        public final val constantFlow: kotlin.Boolean /* compiled code */

        public final val constantSpeed: kotlin.Boolean /* compiled code */

        public final val constantTemperature: kotlin.Boolean /* compiled code */

        public final val automatic: kotlin.Boolean /* compiled code */

        public final val localOperation: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(constantPressure: kotlin.Boolean = COMPILED_CODE, compensatedPressure: kotlin.Boolean = COMPILED_CODE, constantFlow: kotlin.Boolean = COMPILED_CODE, constantSpeed: kotlin.Boolean = COMPILED_CODE, constantTemperature: kotlin.Boolean = COMPILED_CODE, automatic: kotlin.Boolean = COMPILED_CODE, localOperation: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.PumpConfigurationAndControlTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class PumpStatusBitmap public constructor(deviceFault: kotlin.Boolean = COMPILED_CODE, supplyFault: kotlin.Boolean = COMPILED_CODE, speedLow: kotlin.Boolean = COMPILED_CODE, speedHigh: kotlin.Boolean = COMPILED_CODE, localOverride: kotlin.Boolean = COMPILED_CODE, running: kotlin.Boolean = COMPILED_CODE, remotePressure: kotlin.Boolean = COMPILED_CODE, remoteFlow: kotlin.Boolean = COMPILED_CODE, remoteTemperature: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpStatusBitmap> {
            private const final val DEVICE_FAULT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPLY_FAULT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SPEED_LOW_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SPEED_HIGH_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LOCAL_OVERRIDE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RUNNING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val REMOTE_PRESSURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val REMOTE_FLOW_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val REMOTE_TEMPERATURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpStatusBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpStatusBitmap { /* compiled code */ }
        }

        public final val deviceFault: kotlin.Boolean /* compiled code */

        public final val supplyFault: kotlin.Boolean /* compiled code */

        public final val speedLow: kotlin.Boolean /* compiled code */

        public final val speedHigh: kotlin.Boolean /* compiled code */

        public final val localOverride: kotlin.Boolean /* compiled code */

        public final val running: kotlin.Boolean /* compiled code */

        public final val remotePressure: kotlin.Boolean /* compiled code */

        public final val remoteFlow: kotlin.Boolean /* compiled code */

        public final val remoteTemperature: kotlin.Boolean /* compiled code */

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

        public final fun copy(deviceFault: kotlin.Boolean = COMPILED_CODE, supplyFault: kotlin.Boolean = COMPILED_CODE, speedLow: kotlin.Boolean = COMPILED_CODE, speedHigh: kotlin.Boolean = COMPILED_CODE, localOverride: kotlin.Boolean = COMPILED_CODE, running: kotlin.Boolean = COMPILED_CODE, remotePressure: kotlin.Boolean = COMPILED_CODE, remoteFlow: kotlin.Boolean = COMPILED_CODE, remoteTemperature: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpStatusBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface SupplyVoltageLow {
    }

    public final class SupplyVoltageLowImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.SupplyVoltageLow {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.SupplyVoltageLow> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.SupplyVoltageLowImpl { /* compiled code */ }
        }
    }

    public interface SupplyVoltageHigh {
    }

    public final class SupplyVoltageHighImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.SupplyVoltageHigh {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.SupplyVoltageHigh> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.SupplyVoltageHighImpl { /* compiled code */ }
        }
    }

    public interface PowerMissingPhase {
    }

    public final class PowerMissingPhaseImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.PowerMissingPhase {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.PowerMissingPhase> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.PowerMissingPhaseImpl { /* compiled code */ }
        }
    }

    public interface SystemPressureLow {
    }

    public final class SystemPressureLowImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.SystemPressureLow {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.SystemPressureLow> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.SystemPressureLowImpl { /* compiled code */ }
        }
    }

    public interface SystemPressureHigh {
    }

    public final class SystemPressureHighImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.SystemPressureHigh {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.SystemPressureHigh> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.SystemPressureHighImpl { /* compiled code */ }
        }
    }

    public interface DryRunning {
    }

    public final class DryRunningImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.DryRunning {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.DryRunning> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.DryRunningImpl { /* compiled code */ }
        }
    }

    public interface MotorTemperatureHigh {
    }

    public final class MotorTemperatureHighImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.MotorTemperatureHigh {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.MotorTemperatureHigh> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.MotorTemperatureHighImpl { /* compiled code */ }
        }
    }

    public interface PumpMotorFatalFailure {
    }

    public final class PumpMotorFatalFailureImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpMotorFatalFailure {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpMotorFatalFailure> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpMotorFatalFailureImpl { /* compiled code */ }
        }
    }

    public interface ElectronicTemperatureHigh {
    }

    public final class ElectronicTemperatureHighImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.ElectronicTemperatureHigh {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.ElectronicTemperatureHigh> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.ElectronicTemperatureHighImpl { /* compiled code */ }
        }
    }

    public interface PumpBlocked {
    }

    public final class PumpBlockedImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpBlocked {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpBlocked> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpBlockedImpl { /* compiled code */ }
        }
    }

    public interface SensorFailure {
    }

    public final class SensorFailureImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.SensorFailure {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.SensorFailure> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.SensorFailureImpl { /* compiled code */ }
        }
    }

    public interface ElectronicNonFatalFailure {
    }

    public final class ElectronicNonFatalFailureImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.ElectronicNonFatalFailure {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.ElectronicNonFatalFailure> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.ElectronicNonFatalFailureImpl { /* compiled code */ }
        }
    }

    public interface ElectronicFatalFailure {
    }

    public final class ElectronicFatalFailureImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.ElectronicFatalFailure {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.ElectronicFatalFailure> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.ElectronicFatalFailureImpl { /* compiled code */ }
        }
    }

    public interface GeneralFault {
    }

    public final class GeneralFaultImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.GeneralFault {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.GeneralFault> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.GeneralFaultImpl { /* compiled code */ }
        }
    }

    public interface Leakage {
    }

    public final class LeakageImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.Leakage {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.Leakage> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.LeakageImpl { /* compiled code */ }
        }
    }

    public interface AirDetection {
    }

    public final class AirDetectionImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.AirDetection {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.AirDetection> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.AirDetectionImpl { /* compiled code */ }
        }
    }

    public interface TurbineOperation {
    }

    public final class TurbineOperationImpl public constructor() : com.google.home.matter.standard.PumpConfigurationAndControlTrait.TurbineOperation {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.TurbineOperation> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.TurbineOperationImpl { /* compiled code */ }
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val maxPressure: kotlin.Short?

        public abstract val maxSpeed: kotlin.UShort?

        public abstract val maxFlow: kotlin.UShort?

        public abstract val minConstPressure: kotlin.Short?

        public abstract val maxConstPressure: kotlin.Short?

        public abstract val minCompPressure: kotlin.Short?

        public abstract val maxCompPressure: kotlin.Short?

        public abstract val minConstSpeed: kotlin.UShort?

        public abstract val maxConstSpeed: kotlin.UShort?

        public abstract val minConstFlow: kotlin.UShort?

        public abstract val maxConstFlow: kotlin.UShort?

        public abstract val minConstTemp: kotlin.Short?

        public abstract val maxConstTemp: kotlin.Short?

        public abstract val pumpStatus: com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpStatusBitmap?

        public abstract val effectiveOperationMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum?

        public abstract val effectiveControlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum?

        public abstract val capacity: kotlin.Short?

        public abstract val speed: kotlin.UShort?

        public abstract val lifetimeRunningHours: kotlin.UInt?

        public abstract val power: kotlin.UInt?

        public abstract val lifetimeEnergyConsumed: kotlin.UInt?

        public abstract val operationMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum?

        public abstract val controlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(maxPressure: kotlin.Short? = COMPILED_CODE, maxSpeed: kotlin.UShort? = COMPILED_CODE, maxFlow: kotlin.UShort? = COMPILED_CODE, minConstPressure: kotlin.Short? = COMPILED_CODE, maxConstPressure: kotlin.Short? = COMPILED_CODE, minCompPressure: kotlin.Short? = COMPILED_CODE, maxCompPressure: kotlin.Short? = COMPILED_CODE, minConstSpeed: kotlin.UShort? = COMPILED_CODE, maxConstSpeed: kotlin.UShort? = COMPILED_CODE, minConstFlow: kotlin.UShort? = COMPILED_CODE, maxConstFlow: kotlin.UShort? = COMPILED_CODE, minConstTemp: kotlin.Short? = COMPILED_CODE, maxConstTemp: kotlin.Short? = COMPILED_CODE, pumpStatus: com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpStatusBitmap? = COMPILED_CODE, effectiveOperationMode:
        com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum? = COMPILED_CODE, effectiveControlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum? = COMPILED_CODE, capacity: kotlin.Short? = COMPILED_CODE, speed: kotlin.UShort? = COMPILED_CODE, lifetimeRunningHours: kotlin.UInt? = COMPILED_CODE, power: kotlin.UInt? = COMPILED_CODE, lifetimeEnergyConsumed: kotlin.UInt? = COMPILED_CODE, operationMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum? = COMPILED_CODE, controlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList:
        kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes, com.google.home.matter.standard.PumpConfigurationAndControlTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes) { /* compiled code */ }

        public open val maxPressure: kotlin.Short? /* compiled code */

        public open val maxSpeed: kotlin.UShort? /* compiled code */

        public open val maxFlow: kotlin.UShort? /* compiled code */

        public open val minConstPressure: kotlin.Short? /* compiled code */

        public open val maxConstPressure: kotlin.Short? /* compiled code */

        public open val minCompPressure: kotlin.Short? /* compiled code */

        public open val maxCompPressure: kotlin.Short? /* compiled code */

        public open val minConstSpeed: kotlin.UShort? /* compiled code */

        public open val maxConstSpeed: kotlin.UShort? /* compiled code */

        public open val minConstFlow: kotlin.UShort? /* compiled code */

        public open val maxConstFlow: kotlin.UShort? /* compiled code */

        public open val minConstTemp: kotlin.Short? /* compiled code */

        public open val maxConstTemp: kotlin.Short? /* compiled code */

        public open val pumpStatus: com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpStatusBitmap? /* compiled code */

        public open val effectiveOperationMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum? /* compiled code */

        public open val effectiveControlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum? /* compiled code */

        public open val capacity: kotlin.Short? /* compiled code */

        public open val speed: kotlin.UShort? /* compiled code */

        public open val lifetimeRunningHours: kotlin.UInt? /* compiled code */

        public open val power: kotlin.UInt? /* compiled code */

        public open val lifetimeEnergyConsumed: kotlin.UInt? /* compiled code */

        public open val operationMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum? /* compiled code */

        public open val controlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.PumpConfigurationAndControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(maxPressure: kotlin.Short? = COMPILED_CODE, maxSpeed: kotlin.UShort? = COMPILED_CODE, maxFlow: kotlin.UShort? = COMPILED_CODE, minConstPressure: kotlin.Short? = COMPILED_CODE, maxConstPressure: kotlin.Short? = COMPILED_CODE, minCompPressure: kotlin.Short? = COMPILED_CODE, maxCompPressure: kotlin.Short? = COMPILED_CODE, minConstSpeed: kotlin.UShort? = COMPILED_CODE, maxConstSpeed: kotlin.UShort? = COMPILED_CODE, minConstFlow: kotlin.UShort? = COMPILED_CODE, maxConstFlow: kotlin.UShort? = COMPILED_CODE, minConstTemp: kotlin.Short? = COMPILED_CODE, maxConstTemp: kotlin.Short? = COMPILED_CODE, pumpStatus: com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpStatusBitmap? = COMPILED_CODE, effectiveOperationMode:
            com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum? = COMPILED_CODE, effectiveControlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum? = COMPILED_CODE, capacity: kotlin.Short? = COMPILED_CODE, speed: kotlin.UShort? = COMPILED_CODE, lifetimeRunningHours: kotlin.UInt? = COMPILED_CODE, power: kotlin.UInt? = COMPILED_CODE, lifetimeEnergyConsumed: kotlin.UInt? = COMPILED_CODE, operationMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum? = COMPILED_CODE, controlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList:
            kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.PumpConfigurationAndControlTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes) : com.google.home.matter.standard.PumpConfigurationAndControlTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PumpConfigurationAndControlTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PumpConfigurationAndControlTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PumpConfigurationAndControlTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _lifetimeRunningHours: kotlin.UInt? /* compiled code */

        internal final var _isLifetimeRunningHoursSet: kotlin.Boolean /* compiled code */

        public open val lifetimeRunningHours: kotlin.UInt? /* compiled code */
            public open get

        internal final var _lifetimeEnergyConsumed: kotlin.UInt? /* compiled code */

        internal final var _isLifetimeEnergyConsumedSet: kotlin.Boolean /* compiled code */

        public open val lifetimeEnergyConsumed: kotlin.UInt? /* compiled code */
            public open get

        internal final var _operationMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum? /* compiled code */

        public open val operationMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum? /* compiled code */
            public open get

        internal final var _controlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum? /* compiled code */

        public open val controlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum? /* compiled code */
            public open get

        public final fun setLifetimeRunningHours(value: kotlin.UInt?): kotlin.Unit { /* compiled code */ }

        public final fun setLifetimeEnergyConsumed(value: kotlin.UInt?): kotlin.Unit { /* compiled code */ }

        public final fun setOperationMode(value: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum): kotlin.Unit { /* compiled code */ }

        public final fun setControlMode(value: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}
