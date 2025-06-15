// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object EnergyEvseTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class EnergyTransferStoppedReasonEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStoppedReasonEnum> {
        @androidx.annotation.NonNull EVStopped,

        @androidx.annotation.NonNull EVSEStopped,

        @androidx.annotation.NonNull Other,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStoppedReasonEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class FaultStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum> {
        @androidx.annotation.NonNull NoError,

        @androidx.annotation.NonNull MeterFailure,

        @androidx.annotation.NonNull OverVoltage,

        @androidx.annotation.NonNull UnderVoltage,

        @androidx.annotation.NonNull OverCurrent,

        @androidx.annotation.NonNull ContactWetFailure,

        @androidx.annotation.NonNull ContactDryFailure,

        @androidx.annotation.NonNull GroundFault,

        @androidx.annotation.NonNull PowerLoss,

        @androidx.annotation.NonNull PowerQuality,

        @androidx.annotation.NonNull PilotShortCircuit,

        @androidx.annotation.NonNull EmergencyStop,

        @androidx.annotation.NonNull EVDisconnected,

        @androidx.annotation.NonNull WrongPowerSupply,

        @androidx.annotation.NonNull LiveNeutralSwap,

        @androidx.annotation.NonNull OverTemperature,

        @androidx.annotation.NonNull Other,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.StateEnum> {
        @androidx.annotation.NonNull NotPluggedIn,

        @androidx.annotation.NonNull PluggedInNoDemand,

        @androidx.annotation.NonNull PluggedInDemand,

        @androidx.annotation.NonNull PluggedInCharging,

        @androidx.annotation.NonNull PluggedInDischarging,

        @androidx.annotation.NonNull SessionEnding,

        @androidx.annotation.NonNull Fault,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.EnergyEvseTrait.StateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class SupplyStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.SupplyStateEnum> {
        @androidx.annotation.NonNull Disabled,

        @androidx.annotation.NonNull ChargingEnabled,

        @androidx.annotation.NonNull DischargingEnabled,

        @androidx.annotation.NonNull DisabledError,

        @androidx.annotation.NonNull DisabledDiagnostics,

        @androidx.annotation.NonNull Enabled,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.EnergyEvseTrait.SupplyStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(chargingPreferences: kotlin.Boolean = COMPILED_CODE, soCReporting: kotlin.Boolean = COMPILED_CODE, plugAndCharge: kotlin.Boolean = COMPILED_CODE, rfid: kotlin.Boolean = COMPILED_CODE, v2x: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.EnergyEvseTrait.Feature> {
            private const final val CHARGING_PREFERENCES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SO_C_REPORTING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PLUG_AND_CHARGE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RFID_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val V2_X_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.EnergyEvseTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.EnergyEvseTrait.Feature { /* compiled code */ }
        }

        public final val chargingPreferences: kotlin.Boolean /* compiled code */

        public final val soCReporting: kotlin.Boolean /* compiled code */

        public final val plugAndCharge: kotlin.Boolean /* compiled code */

        public final val rfid: kotlin.Boolean /* compiled code */

        public final val v2x: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(chargingPreferences: kotlin.Boolean = COMPILED_CODE, soCReporting: kotlin.Boolean = COMPILED_CODE, plugAndCharge: kotlin.Boolean = COMPILED_CODE, rfid: kotlin.Boolean = COMPILED_CODE, v2x: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.EnergyEvseTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class TargetDayOfWeekBitmap public constructor(sunday: kotlin.Boolean = COMPILED_CODE, monday: kotlin.Boolean = COMPILED_CODE, tuesday: kotlin.Boolean = COMPILED_CODE, wednesday: kotlin.Boolean = COMPILED_CODE, thursday: kotlin.Boolean = COMPILED_CODE, friday: kotlin.Boolean = COMPILED_CODE, saturday: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.EnergyEvseTrait.TargetDayOfWeekBitmap> {
            private const final val SUNDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MONDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TUESDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WEDNESDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val THURSDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FRIDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SATURDAY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.EnergyEvseTrait.TargetDayOfWeekBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.EnergyEvseTrait.TargetDayOfWeekBitmap { /* compiled code */ }
        }

        public final val sunday: kotlin.Boolean /* compiled code */

        public final val monday: kotlin.Boolean /* compiled code */

        public final val tuesday: kotlin.Boolean /* compiled code */

        public final val wednesday: kotlin.Boolean /* compiled code */

        public final val thursday: kotlin.Boolean /* compiled code */

        public final val friday: kotlin.Boolean /* compiled code */

        public final val saturday: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(sunday: kotlin.Boolean = COMPILED_CODE, monday: kotlin.Boolean = COMPILED_CODE, tuesday: kotlin.Boolean = COMPILED_CODE, wednesday: kotlin.Boolean = COMPILED_CODE, thursday: kotlin.Boolean = COMPILED_CODE, friday: kotlin.Boolean = COMPILED_CODE, saturday: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.EnergyEvseTrait.TargetDayOfWeekBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface EvConnected {
        public abstract val sessionId: kotlin.UInt?
    }

    public final class EvConnectedImpl public constructor(sessionId: kotlin.UInt? = COMPILED_CODE) : com.google.home.matter.standard.EnergyEvseTrait.EvConnected {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.EvConnected> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.EvConnected): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.EvConnected { /* compiled code */ }
        }

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface EvNotDetected {
        public abstract val sessionId: kotlin.UInt?

        public abstract val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum?

        public abstract val sessionDuration: kotlin.UInt?

        public abstract val sessionEnergyCharged: kotlin.Long?

        public abstract val sessionEnergyDischarged: kotlin.Long?
    }

    public final class EvNotDetectedImpl public constructor(sessionId: kotlin.UInt? = COMPILED_CODE, state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? = COMPILED_CODE, sessionDuration: kotlin.UInt? = COMPILED_CODE, sessionEnergyCharged: kotlin.Long? = COMPILED_CODE, sessionEnergyDischarged: kotlin.Long? = COMPILED_CODE) : com.google.home.matter.standard.EnergyEvseTrait.EvNotDetected {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.EvNotDetected> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.EvNotDetected): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.EvNotDetected { /* compiled code */ }
        }

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? /* compiled code */

        public open val sessionDuration: kotlin.UInt? /* compiled code */

        public open val sessionEnergyCharged: kotlin.Long? /* compiled code */

        public open val sessionEnergyDischarged: kotlin.Long? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface EnergyTransferStarted {
        public abstract val sessionId: kotlin.UInt?

        public abstract val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum?

        public abstract val maximumCurrent: kotlin.Long?

        public abstract val maximumDischargeCurrent: kotlin.Long?
    }

    public final class EnergyTransferStartedImpl public constructor(sessionId: kotlin.UInt? = COMPILED_CODE, state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? = COMPILED_CODE, maximumCurrent: kotlin.Long? = COMPILED_CODE, maximumDischargeCurrent: kotlin.Long? = COMPILED_CODE) : com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStarted {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStarted> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStarted): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStarted { /* compiled code */ }
        }

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? /* compiled code */

        public open val maximumCurrent: kotlin.Long? /* compiled code */

        public open val maximumDischargeCurrent: kotlin.Long? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface EnergyTransferStopped {
        public abstract val sessionId: kotlin.UInt?

        public abstract val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum?

        public abstract val reason: com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStoppedReasonEnum?

        public abstract val energyTransferred: kotlin.Long?

        public abstract val energyDischarged: kotlin.Long?
    }

    public final class EnergyTransferStoppedImpl public constructor(sessionId: kotlin.UInt? = COMPILED_CODE, state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? = COMPILED_CODE, reason: com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStoppedReasonEnum? = COMPILED_CODE, energyTransferred: kotlin.Long? = COMPILED_CODE, energyDischarged: kotlin.Long? = COMPILED_CODE) : com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStopped {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStopped> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStopped): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStopped { /* compiled code */ }
        }

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? /* compiled code */

        public open val reason: com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStoppedReasonEnum? /* compiled code */

        public open val energyTransferred: kotlin.Long? /* compiled code */

        public open val energyDischarged: kotlin.Long? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Fault {
        public abstract val sessionId: kotlin.UInt?

        public abstract val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum?

        public abstract val faultStatePreviousState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum?

        public abstract val faultStateCurrentState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum?
    }

    public final class FaultImpl public constructor(sessionId: kotlin.UInt? = COMPILED_CODE, state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? = COMPILED_CODE, faultStatePreviousState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum? = COMPILED_CODE, faultStateCurrentState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum? = COMPILED_CODE) : com.google.home.matter.standard.EnergyEvseTrait.Fault {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.Fault> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.Fault): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.Fault { /* compiled code */ }
        }

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? /* compiled code */

        public open val faultStatePreviousState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum? /* compiled code */

        public open val faultStateCurrentState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Rfid {
        public abstract val uid: kotlin.ByteArray?
    }

    public final class RfidImpl public constructor(uid: kotlin.ByteArray? = COMPILED_CODE) : com.google.home.matter.standard.EnergyEvseTrait.Rfid {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.Rfid> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.Rfid): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.Rfid { /* compiled code */ }
        }

        public open val uid: kotlin.ByteArray? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class ChargingTargetStruct public constructor(targetTimeMinutesPastMidnight: kotlin.UShort = COMPILED_CODE, targetSoC: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> = COMPILED_CODE, addedEnergy: com.google.home.matter.serialization.OptionalValue<kotlin.Long> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetStruct?>.targetTimeMinutesPastMidnight: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetStruct?>.targetSoC: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UByte>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetStruct?>.addedEnergy: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.Long>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetStruct { /* compiled code */ }
        }

        public final val targetTimeMinutesPastMidnight: kotlin.UShort /* compiled code */

        public final val targetSoC: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> /* compiled code */

        public final val addedEnergy: com.google.home.matter.serialization.OptionalValue<kotlin.Long> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetStruct.StructFields> {
            @androidx.annotation.NonNull targetTimeMinutesPastMidnight,

            @androidx.annotation.NonNull targetSoC,

            @androidx.annotation.NonNull addedEnergy;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ChargingTargetScheduleStruct public constructor(dayOfWeekForSequence: com.google.home.matter.standard.EnergyEvseTrait.TargetDayOfWeekBitmap = COMPILED_CODE, chargingTargets: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetStruct> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct?>.dayOfWeekForSequence: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.TargetDayOfWeekBitmap> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct?>.chargingTargets: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetStruct>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct { /* compiled code */ }
        }

        public final val dayOfWeekForSequence: com.google.home.matter.standard.EnergyEvseTrait.TargetDayOfWeekBitmap /* compiled code */

        public final val chargingTargets: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetStruct> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct.StructFields> {
            @androidx.annotation.NonNull dayOfWeekForSequence,

            @androidx.annotation.NonNull chargingTargets;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.Attributes { /* compiled code */ }
        }

        public abstract val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum?

        public abstract val supplyState: com.google.home.matter.standard.EnergyEvseTrait.SupplyStateEnum?

        public abstract val faultState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum?

        public abstract val chargingEnabledUntil: kotlin.UInt?

        public abstract val dischargingEnabledUntil: kotlin.UInt?

        public abstract val circuitCapacity: kotlin.Long?

        public abstract val minimumChargeCurrent: kotlin.Long?

        public abstract val maximumChargeCurrent: kotlin.Long?

        public abstract val maximumDischargeCurrent: kotlin.Long?

        public abstract val userMaximumChargeCurrent: kotlin.Long?

        public abstract val randomizationDelayWindow: kotlin.UInt?

        public abstract val nextChargeStartTime: kotlin.UInt?

        public abstract val nextChargeTargetTime: kotlin.UInt?

        public abstract val nextChargeRequiredEnergy: kotlin.Long?

        public abstract val nextChargeTargetSoC: kotlin.UByte?

        public abstract val approximateEvEfficiency: kotlin.UShort?

        public abstract val stateOfCharge: kotlin.UByte?

        public abstract val batteryCapacity: kotlin.Long?

        public abstract val vehicleId: kotlin.String?

        public abstract val sessionId: kotlin.UInt?

        public abstract val sessionDuration: kotlin.UInt?

        public abstract val sessionEnergyCharged: kotlin.Long?

        public abstract val sessionEnergyDischarged: kotlin.Long?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.EnergyEvseTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? = COMPILED_CODE, supplyState: com.google.home.matter.standard.EnergyEvseTrait.SupplyStateEnum? = COMPILED_CODE, faultState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum? = COMPILED_CODE, chargingEnabledUntil: kotlin.UInt? = COMPILED_CODE, dischargingEnabledUntil: kotlin.UInt? = COMPILED_CODE, circuitCapacity: kotlin.Long? = COMPILED_CODE, minimumChargeCurrent: kotlin.Long? = COMPILED_CODE, maximumChargeCurrent: kotlin.Long? = COMPILED_CODE, maximumDischargeCurrent: kotlin.Long? = COMPILED_CODE, userMaximumChargeCurrent: kotlin.Long? = COMPILED_CODE, randomizationDelayWindow: kotlin.UInt? = COMPILED_CODE, nextChargeStartTime: kotlin.UInt? =
        COMPILED_CODE, nextChargeTargetTime: kotlin.UInt? = COMPILED_CODE, nextChargeRequiredEnergy: kotlin.Long? = COMPILED_CODE, nextChargeTargetSoC: kotlin.UByte? = COMPILED_CODE, approximateEvEfficiency: kotlin.UShort? = COMPILED_CODE, stateOfCharge: kotlin.UByte? = COMPILED_CODE, batteryCapacity: kotlin.Long? = COMPILED_CODE, vehicleId: kotlin.String? = COMPILED_CODE, sessionId: kotlin.UInt? = COMPILED_CODE, sessionDuration: kotlin.UInt? = COMPILED_CODE, sessionEnergyCharged: kotlin.Long? = COMPILED_CODE, sessionEnergyDischarged: kotlin.Long? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE,
        featureMap: com.google.home.matter.standard.EnergyEvseTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.EnergyEvseTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.EnergyEvseTrait.Attributes, com.google.home.matter.standard.EnergyEvseTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.EnergyEvseTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.EnergyEvseTrait.Attributes) { /* compiled code */ }

        public open val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? /* compiled code */

        public open val supplyState: com.google.home.matter.standard.EnergyEvseTrait.SupplyStateEnum? /* compiled code */

        public open val faultState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum? /* compiled code */

        public open val chargingEnabledUntil: kotlin.UInt? /* compiled code */

        public open val dischargingEnabledUntil: kotlin.UInt? /* compiled code */

        public open val circuitCapacity: kotlin.Long? /* compiled code */

        public open val minimumChargeCurrent: kotlin.Long? /* compiled code */

        public open val maximumChargeCurrent: kotlin.Long? /* compiled code */

        public open val maximumDischargeCurrent: kotlin.Long? /* compiled code */

        public open val userMaximumChargeCurrent: kotlin.Long? /* compiled code */

        public open val randomizationDelayWindow: kotlin.UInt? /* compiled code */

        public open val nextChargeStartTime: kotlin.UInt? /* compiled code */

        public open val nextChargeTargetTime: kotlin.UInt? /* compiled code */

        public open val nextChargeRequiredEnergy: kotlin.Long? /* compiled code */

        public open val nextChargeTargetSoC: kotlin.UByte? /* compiled code */

        public open val approximateEvEfficiency: kotlin.UShort? /* compiled code */

        public open val stateOfCharge: kotlin.UByte? /* compiled code */

        public open val batteryCapacity: kotlin.Long? /* compiled code */

        public open val vehicleId: kotlin.String? /* compiled code */

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open val sessionDuration: kotlin.UInt? /* compiled code */

        public open val sessionEnergyCharged: kotlin.Long? /* compiled code */

        public open val sessionEnergyDischarged: kotlin.Long? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.EnergyEvseTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.EnergyEvseTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.EnergyEvseTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? = COMPILED_CODE, supplyState: com.google.home.matter.standard.EnergyEvseTrait.SupplyStateEnum? = COMPILED_CODE, faultState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum? = COMPILED_CODE, chargingEnabledUntil: kotlin.UInt? = COMPILED_CODE, dischargingEnabledUntil: kotlin.UInt? = COMPILED_CODE, circuitCapacity: kotlin.Long? = COMPILED_CODE, minimumChargeCurrent: kotlin.Long? = COMPILED_CODE, maximumChargeCurrent: kotlin.Long? = COMPILED_CODE, maximumDischargeCurrent: kotlin.Long? = COMPILED_CODE, userMaximumChargeCurrent: kotlin.Long? = COMPILED_CODE, randomizationDelayWindow: kotlin.UInt? = COMPILED_CODE, nextChargeStartTime: kotlin.UInt? = COMPILED_CODE,
            nextChargeTargetTime: kotlin.UInt? = COMPILED_CODE, nextChargeRequiredEnergy: kotlin.Long? = COMPILED_CODE, nextChargeTargetSoC: kotlin.UByte? = COMPILED_CODE, approximateEvEfficiency: kotlin.UShort? = COMPILED_CODE, stateOfCharge: kotlin.UByte? = COMPILED_CODE, batteryCapacity: kotlin.Long? = COMPILED_CODE, vehicleId: kotlin.String? = COMPILED_CODE, sessionId: kotlin.UInt? = COMPILED_CODE, sessionDuration: kotlin.UInt? = COMPILED_CODE, sessionEnergyCharged: kotlin.Long? = COMPILED_CODE, sessionEnergyDischarged: kotlin.Long? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap:
            com.google.home.matter.standard.EnergyEvseTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.EnergyEvseTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.EnergyEvseTrait.Attributes) : com.google.home.matter.standard.EnergyEvseTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _userMaximumChargeCurrent: kotlin.Long? /* compiled code */

        public open val userMaximumChargeCurrent: kotlin.Long? /* compiled code */
            public open get

        internal final var _randomizationDelayWindow: kotlin.UInt? /* compiled code */

        public open val randomizationDelayWindow: kotlin.UInt? /* compiled code */
            public open get

        internal final var _approximateEvEfficiency: kotlin.UShort? /* compiled code */

        internal final var _isApproximateEvEfficiencySet: kotlin.Boolean /* compiled code */

        public open val approximateEvEfficiency: kotlin.UShort? /* compiled code */
            public open get

        public final fun setUserMaximumChargeCurrent(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun setRandomizationDelayWindow(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun setApproximateEvEfficiency(value: kotlin.UShort?): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object DisableCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.DisableCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.DisableCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.DisableCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.DisableCommand.Request.CommandFields> {
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

    public object EnableChargingCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(chargingEnabledUntil: kotlin.UInt? = COMPILED_CODE, minimumChargeCurrent: kotlin.Long = COMPILED_CODE, maximumChargeCurrent: kotlin.Long = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.EnableChargingCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.EnableChargingCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.EnableChargingCommand.Request { /* compiled code */ }
            }

            public final val chargingEnabledUntil: kotlin.UInt? /* compiled code */

            public final val minimumChargeCurrent: kotlin.Long /* compiled code */

            public final val maximumChargeCurrent: kotlin.Long /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.EnableChargingCommand.Request.CommandFields> {
                @androidx.annotation.NonNull chargingEnabledUntil,

                @androidx.annotation.NonNull minimumChargeCurrent,

                @androidx.annotation.NonNull maximumChargeCurrent;

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

    public object EnableDischargingCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(dischargingEnabledUntil: kotlin.UInt? = COMPILED_CODE, maximumDischargeCurrent: kotlin.Long = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.EnableDischargingCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.EnableDischargingCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.EnableDischargingCommand.Request { /* compiled code */ }
            }

            public final val dischargingEnabledUntil: kotlin.UInt? /* compiled code */

            public final val maximumDischargeCurrent: kotlin.Long /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.EnableDischargingCommand.Request.CommandFields> {
                @androidx.annotation.NonNull dischargingEnabledUntil,

                @androidx.annotation.NonNull maximumDischargeCurrent;

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

    public object StartDiagnosticsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.StartDiagnosticsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.StartDiagnosticsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.StartDiagnosticsCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.StartDiagnosticsCommand.Request.CommandFields> {
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

    public object SetTargetsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(chargingTargetSchedules: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.SetTargetsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.SetTargetsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.SetTargetsCommand.Request { /* compiled code */ }
            }

            public final val chargingTargetSchedules: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.SetTargetsCommand.Request.CommandFields> {
                @androidx.annotation.NonNull chargingTargetSchedules;

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

    public object GetTargetsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Request.CommandFields> {
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

        public final class Response public constructor(chargingTargetSchedules: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Response { /* compiled code */ }
            }

            public final val chargingTargetSchedules: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseTrait.ChargingTargetScheduleStruct> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.GetTargetsCommand.Response.CommandFields> {
                @androidx.annotation.NonNull chargingTargetSchedules;

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

    public object ClearTargetsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseTrait.ClearTargetsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseTrait.ClearTargetsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseTrait.ClearTargetsCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseTrait.ClearTargetsCommand.Request.CommandFields> {
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
