// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ElectricalEnergyMeasurementTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class MeasurementTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementTypeEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Voltage,

        @androidx.annotation.NonNull ActiveCurrent,

        @androidx.annotation.NonNull ReactiveCurrent,

        @androidx.annotation.NonNull ApparentCurrent,

        @androidx.annotation.NonNull ActivePower,

        @androidx.annotation.NonNull ReactivePower,

        @androidx.annotation.NonNull ApparentPower,

        @androidx.annotation.NonNull RMSVoltage,

        @androidx.annotation.NonNull RMSCurrent,

        @androidx.annotation.NonNull RMSPower,

        @androidx.annotation.NonNull Frequency,

        @androidx.annotation.NonNull PowerFactor,

        @androidx.annotation.NonNull NeutralCurrent,

        @androidx.annotation.NonNull ElectricalEnergy,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(importedEnergy: kotlin.Boolean = COMPILED_CODE, exportedEnergy: kotlin.Boolean = COMPILED_CODE, cumulativeEnergy: kotlin.Boolean = COMPILED_CODE, periodicEnergy: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature> {
            private const final val IMPORTED_ENERGY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val EXPORTED_ENERGY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CUMULATIVE_ENERGY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PERIODIC_ENERGY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature { /* compiled code */ }
        }

        public final val importedEnergy: kotlin.Boolean /* compiled code */

        public final val exportedEnergy: kotlin.Boolean /* compiled code */

        public final val cumulativeEnergy: kotlin.Boolean /* compiled code */

        public final val periodicEnergy: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(importedEnergy: kotlin.Boolean = COMPILED_CODE, exportedEnergy: kotlin.Boolean = COMPILED_CODE, cumulativeEnergy: kotlin.Boolean = COMPILED_CODE, periodicEnergy: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface CumulativeEnergyMeasured {
        public abstract val energyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?

        public abstract val energyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?
    }

    public final class CumulativeEnergyMeasuredImpl public constructor(energyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE, energyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE) : com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyMeasured {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyMeasured> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyMeasured): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyMeasured { /* compiled code */ }
        }

        public open val energyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open val energyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface PeriodicEnergyMeasured {
        public abstract val energyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?

        public abstract val energyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?
    }

    public final class PeriodicEnergyMeasuredImpl public constructor(energyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE, energyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE) : com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.PeriodicEnergyMeasured {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.PeriodicEnergyMeasured> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.PeriodicEnergyMeasured): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.PeriodicEnergyMeasured { /* compiled code */ }
        }

        public open val energyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open val energyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class MeasurementAccuracyRangeStruct public constructor(rangeMin: kotlin.Long = COMPILED_CODE, rangeMax: kotlin.Long = COMPILED_CODE, percentMax: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, percentMin: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, percentTypical: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, fixedMax: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE, fixedMin: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE, fixedTypical: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct?>.rangeMin: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct?>.rangeMax: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct?>.percentMax: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct?>.percentMin: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct?>.percentTypical: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct?>.fixedMax: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct?>.fixedMin: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct?>.fixedTypical: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct { /* compiled code */ }
        }

        public final val rangeMin: kotlin.Long /* compiled code */

        public final val rangeMax: kotlin.Long /* compiled code */

        public final val percentMax: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

        public final val percentMin: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

        public final val percentTypical: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

        public final val fixedMax: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

        public final val fixedMin: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

        public final val fixedTypical: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct.StructFields> {
            @androidx.annotation.NonNull rangeMin,

            @androidx.annotation.NonNull rangeMax,

            @androidx.annotation.NonNull percentMax,

            @androidx.annotation.NonNull percentMin,

            @androidx.annotation.NonNull percentTypical,

            @androidx.annotation.NonNull fixedMax,

            @androidx.annotation.NonNull fixedMin,

            @androidx.annotation.NonNull fixedTypical;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class MeasurementAccuracyStruct public constructor(measurementType: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementTypeEnum = COMPILED_CODE, measured: kotlin.Boolean = COMPILED_CODE, minMeasuredValue: kotlin.Long = COMPILED_CODE, maxMeasuredValue: kotlin.Long = COMPILED_CODE, accuracyRanges: kotlin.collections.List<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct?>.measurementType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementTypeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct?>.measured: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct?>.minMeasuredValue: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct?>.maxMeasuredValue: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct?>.accuracyRanges: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct { /* compiled code */ }
        }

        public final val measurementType: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementTypeEnum /* compiled code */

        public final val measured: kotlin.Boolean /* compiled code */

        public final val minMeasuredValue: kotlin.Long /* compiled code */

        public final val maxMeasuredValue: kotlin.Long /* compiled code */

        public final val accuracyRanges: kotlin.collections.List<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyRangeStruct> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct.StructFields> {
            @androidx.annotation.NonNull measurementType,

            @androidx.annotation.NonNull measured,

            @androidx.annotation.NonNull minMeasuredValue,

            @androidx.annotation.NonNull maxMeasuredValue,

            @androidx.annotation.NonNull accuracyRanges;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class CumulativeEnergyResetStruct public constructor(importedResetTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt?> = COMPILED_CODE, exportedResetTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt?> = COMPILED_CODE, importedResetSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong?> = COMPILED_CODE, exportedResetSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong?> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct?>.importedResetTimestamp: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct?>.exportedResetTimestamp: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct?>.importedResetSystime: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct?>.exportedResetSystime: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong?>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct { /* compiled code */ }
        }

        public final val importedResetTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt?> /* compiled code */

        public final val exportedResetTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt?> /* compiled code */

        public final val importedResetSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong?> /* compiled code */

        public final val exportedResetSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong?> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct.StructFields> {
            @androidx.annotation.NonNull importedResetTimestamp,

            @androidx.annotation.NonNull exportedResetTimestamp,

            @androidx.annotation.NonNull importedResetSystime,

            @androidx.annotation.NonNull exportedResetSystime;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class EnergyMeasurementStruct public constructor(energy: kotlin.Long = COMPILED_CODE, startTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, endTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, startSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE, endSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?>.energy: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?>.startTimestamp: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?>.endTimestamp: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?>.startSystime: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?>.endSystime: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct { /* compiled code */ }
        }

        public final val energy: kotlin.Long /* compiled code */

        public final val startTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val endTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val startSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

        public final val endSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct.StructFields> {
            @androidx.annotation.NonNull energy,

            @androidx.annotation.NonNull startTimestamp,

            @androidx.annotation.NonNull endTimestamp,

            @androidx.annotation.NonNull startSystime,

            @androidx.annotation.NonNull endSystime;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Attributes { /* compiled code */ }
        }

        public abstract val accuracy: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct?

        public abstract val cumulativeEnergyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?

        public abstract val cumulativeEnergyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?

        public abstract val periodicEnergyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?

        public abstract val periodicEnergyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?

        public abstract val cumulativeEnergyReset: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(accuracy: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct? = COMPILED_CODE, cumulativeEnergyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE, cumulativeEnergyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE, periodicEnergyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE, periodicEnergyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE, cumulativeEnergyReset: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Attributes) { /* compiled code */ }

        public open val accuracy: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct? /* compiled code */

        public open val cumulativeEnergyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open val cumulativeEnergyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open val periodicEnergyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open val periodicEnergyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open val cumulativeEnergyReset: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(accuracy: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct? = COMPILED_CODE, cumulativeEnergyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE, cumulativeEnergyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE, periodicEnergyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE, periodicEnergyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? = COMPILED_CODE, cumulativeEnergyReset: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.AttributesImpl { /* compiled code */ }
    }
}

