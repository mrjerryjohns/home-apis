// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ElectricalPowerMeasurementTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class MeasurementTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementTypeEnum> {
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
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class PowerModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.PowerModeEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull DC,

        @androidx.annotation.NonNull AC,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.PowerModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(directCurrent: kotlin.Boolean = COMPILED_CODE, alternatingCurrent: kotlin.Boolean = COMPILED_CODE, polyphasePower: kotlin.Boolean = COMPILED_CODE, harmonics: kotlin.Boolean = COMPILED_CODE, powerQuality: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Feature> {
            private const final val DIRECT_CURRENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ALTERNATING_CURRENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val POLYPHASE_POWER_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val HARMONICS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val POWER_QUALITY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Feature { /* compiled code */ }
        }

        public final val directCurrent: kotlin.Boolean /* compiled code */

        public final val alternatingCurrent: kotlin.Boolean /* compiled code */

        public final val polyphasePower: kotlin.Boolean /* compiled code */

        public final val harmonics: kotlin.Boolean /* compiled code */

        public final val powerQuality: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(directCurrent: kotlin.Boolean = COMPILED_CODE, alternatingCurrent: kotlin.Boolean = COMPILED_CODE, polyphasePower: kotlin.Boolean = COMPILED_CODE, harmonics: kotlin.Boolean = COMPILED_CODE, powerQuality: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface MeasurementPeriodRanges {
        public abstract val ranges: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct>?
    }

    public final class MeasurementPeriodRangesImpl public constructor(ranges: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct>? = COMPILED_CODE) : com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementPeriodRanges {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementPeriodRanges> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementPeriodRanges): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementPeriodRanges { /* compiled code */ }
        }

        public open val ranges: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class MeasurementAccuracyRangeStruct public constructor(rangeMin: kotlin.Long = COMPILED_CODE, rangeMax: kotlin.Long = COMPILED_CODE, percentMax: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, percentMin: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, percentTypical: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, fixedMax: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE, fixedMin: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE, fixedTypical: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct?>.rangeMin: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct?>.rangeMax: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct?>.percentMax: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct?>.percentMin: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct?>.percentTypical: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct?>.fixedMax: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct?>.fixedMin: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct?>.fixedTypical: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct { /* compiled code */ }
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

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct.StructFields> {
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

    public final class MeasurementAccuracyStruct public constructor(measurementType: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementTypeEnum = COMPILED_CODE, measured: kotlin.Boolean = COMPILED_CODE, minMeasuredValue: kotlin.Long = COMPILED_CODE, maxMeasuredValue: kotlin.Long = COMPILED_CODE, accuracyRanges: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct?>.measurementType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementTypeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct?>.measured: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct?>.minMeasuredValue: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct?>.maxMeasuredValue: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct?>.accuracyRanges: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct { /* compiled code */ }
        }

        public final val measurementType: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementTypeEnum /* compiled code */

        public final val measured: kotlin.Boolean /* compiled code */

        public final val minMeasuredValue: kotlin.Long /* compiled code */

        public final val maxMeasuredValue: kotlin.Long /* compiled code */

        public final val accuracyRanges: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyRangeStruct> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct.StructFields> {
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

    public final class HarmonicMeasurementStruct public constructor(order: kotlin.UByte = COMPILED_CODE, measurement: kotlin.Long? = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct?>.order: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct?>.measurement: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct { /* compiled code */ }
        }

        public final val order: kotlin.UByte /* compiled code */

        public final val measurement: kotlin.Long? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct.StructFields> {
            @androidx.annotation.NonNull order,

            @androidx.annotation.NonNull measurement;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

        public final class MeasurementRangeStruct public constructor(measurementType: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementTypeEnum = COMPILED_CODE, min: kotlin.Long = COMPILED_CODE, max: kotlin.Long = COMPILED_CODE, startTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, endTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, minTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, maxTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, startSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE, endSystime:
        com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE, minSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE, maxSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.measurementType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementTypeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.min: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.max: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.startTimestamp: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.endTimestamp: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.minTimestamp: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.maxTimestamp: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.startSystime: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.endSystime: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.minSystime: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct?>.maxSystime: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct { /* compiled code */ }
        }

        public final val measurementType: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementTypeEnum /* compiled code */

        public final val min: kotlin.Long /* compiled code */

        public final val max: kotlin.Long /* compiled code */

        public final val startTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val endTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val minTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val maxTimestamp: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val startSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

        public final val endSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

        public final val minSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

        public final val maxSystime: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct.StructFields> {
            @androidx.annotation.NonNull measurementType,

            @androidx.annotation.NonNull min,

            @androidx.annotation.NonNull max,

            @androidx.annotation.NonNull startTimestamp,

            @androidx.annotation.NonNull endTimestamp,

            @androidx.annotation.NonNull minTimestamp,

            @androidx.annotation.NonNull maxTimestamp,

            @androidx.annotation.NonNull startSystime,

            @androidx.annotation.NonNull endSystime,

            @androidx.annotation.NonNull minSystime,

            @androidx.annotation.NonNull maxSystime;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Attributes { /* compiled code */ }
        }

        public abstract val powerMode: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.PowerModeEnum?

        public abstract val numberOfMeasurementTypes: kotlin.UByte?

        public abstract val accuracy: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct>?

        public abstract val ranges: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct>?

        public abstract val voltage: kotlin.Long?

        public abstract val activeCurrent: kotlin.Long?

        public abstract val reactiveCurrent: kotlin.Long?

        public abstract val apparentCurrent: kotlin.Long?

        public abstract val activePower: kotlin.Long?

        public abstract val reactivePower: kotlin.Long?

        public abstract val apparentPower: kotlin.Long?

        public abstract val rmsVoltage: kotlin.Long?

        public abstract val rmsCurrent: kotlin.Long?

        public abstract val rmsPower: kotlin.Long?

        public abstract val frequency: kotlin.Long?

        public abstract val harmonicCurrents: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>?

        public abstract val harmonicPhases: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>?

        public abstract val powerFactor: kotlin.Long?

        public abstract val neutralCurrent: kotlin.Long?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(powerMode: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.PowerModeEnum? = COMPILED_CODE, numberOfMeasurementTypes: kotlin.UByte? = COMPILED_CODE, accuracy: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct>? = COMPILED_CODE, ranges: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct>? = COMPILED_CODE, voltage: kotlin.Long? = COMPILED_CODE, activeCurrent: kotlin.Long? = COMPILED_CODE, reactiveCurrent: kotlin.Long? = COMPILED_CODE, apparentCurrent: kotlin.Long? = COMPILED_CODE, activePower: kotlin.Long? = COMPILED_CODE, reactivePower: kotlin.Long? = COMPILED_CODE, apparentPower: kotlin.Long? =
        COMPILED_CODE, rmsVoltage: kotlin.Long? = COMPILED_CODE, rmsCurrent: kotlin.Long? = COMPILED_CODE, rmsPower: kotlin.Long? = COMPILED_CODE, frequency: kotlin.Long? = COMPILED_CODE, harmonicCurrents: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>? = COMPILED_CODE, harmonicPhases: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>? = COMPILED_CODE, powerFactor: kotlin.Long? = COMPILED_CODE, neutralCurrent: kotlin.Long? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE,
        featureMap: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Attributes) { /* compiled code */ }

        public open val powerMode: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.PowerModeEnum? /* compiled code */

        public open val numberOfMeasurementTypes: kotlin.UByte? /* compiled code */

        public open val accuracy: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct>? /* compiled code */

        public open val ranges: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct>? /* compiled code */

        public open val voltage: kotlin.Long? /* compiled code */

        public open val activeCurrent: kotlin.Long? /* compiled code */

        public open val reactiveCurrent: kotlin.Long? /* compiled code */

        public open val apparentCurrent: kotlin.Long? /* compiled code */

        public open val activePower: kotlin.Long? /* compiled code */

        public open val reactivePower: kotlin.Long? /* compiled code */

        public open val apparentPower: kotlin.Long? /* compiled code */

        public open val rmsVoltage: kotlin.Long? /* compiled code */

        public open val rmsCurrent: kotlin.Long? /* compiled code */

        public open val rmsPower: kotlin.Long? /* compiled code */

        public open val frequency: kotlin.Long? /* compiled code */

        public open val harmonicCurrents: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>? /* compiled code */

        public open val harmonicPhases: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>? /* compiled code */

        public open val powerFactor: kotlin.Long? /* compiled code */

        public open val neutralCurrent: kotlin.Long? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(powerMode: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.PowerModeEnum? = COMPILED_CODE, numberOfMeasurementTypes: kotlin.UByte? = COMPILED_CODE, accuracy: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct>? = COMPILED_CODE, ranges: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct>? = COMPILED_CODE, voltage: kotlin.Long? = COMPILED_CODE, activeCurrent: kotlin.Long? = COMPILED_CODE, reactiveCurrent: kotlin.Long? = COMPILED_CODE, apparentCurrent: kotlin.Long? = COMPILED_CODE, activePower: kotlin.Long? = COMPILED_CODE, reactivePower: kotlin.Long? = COMPILED_CODE, apparentPower: kotlin.Long? = COMPILED_CODE,
            rmsVoltage: kotlin.Long? = COMPILED_CODE, rmsCurrent: kotlin.Long? = COMPILED_CODE, rmsPower: kotlin.Long? = COMPILED_CODE, frequency: kotlin.Long? = COMPILED_CODE, harmonicCurrents: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>? = COMPILED_CODE, harmonicPhases: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>? = COMPILED_CODE, powerFactor: kotlin.Long? = COMPILED_CODE, neutralCurrent: kotlin.Long? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap:
            com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ElectricalPowerMeasurementTrait.AttributesImpl { /* compiled code */ }
    }
}
