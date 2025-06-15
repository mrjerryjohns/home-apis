// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object PowerSourceTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class BatApprovedChemistryEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.BatApprovedChemistryEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Alkaline,

        @androidx.annotation.NonNull LithiumCarbonFluoride,

        @androidx.annotation.NonNull LithiumChromiumOxide,

        @androidx.annotation.NonNull LithiumCopperOxide,

        @androidx.annotation.NonNull LithiumIronDisulfide,

        @androidx.annotation.NonNull LithiumManganeseDioxide,

        @androidx.annotation.NonNull LithiumThionylChloride,

        @androidx.annotation.NonNull Magnesium,

        @androidx.annotation.NonNull MercuryOxide,

        @androidx.annotation.NonNull NickelOxyhydride,

        @androidx.annotation.NonNull SilverOxide,

        @androidx.annotation.NonNull ZincAir,

        @androidx.annotation.NonNull ZincCarbon,

        @androidx.annotation.NonNull ZincChloride,

        @androidx.annotation.NonNull ZincManganeseDioxide,

        @androidx.annotation.NonNull LeadAcid,

        @androidx.annotation.NonNull LithiumCobaltOxide,

        @androidx.annotation.NonNull LithiumIon,

        @androidx.annotation.NonNull LithiumIonPolymer,

        @androidx.annotation.NonNull LithiumIronPhosphate,

        @androidx.annotation.NonNull LithiumSulfur,

        @androidx.annotation.NonNull LithiumTitanate,

        @androidx.annotation.NonNull NickelCadmium,

        @androidx.annotation.NonNull NickelHydrogen,

        @androidx.annotation.NonNull NickelIron,

        @androidx.annotation.NonNull NickelMetalHydride,

        @androidx.annotation.NonNull NickelZinc,

        @androidx.annotation.NonNull SilverZinc,

        @androidx.annotation.NonNull SodiumIon,

        @androidx.annotation.NonNull SodiumSulfur,

        @androidx.annotation.NonNull ZincBromide,

        @androidx.annotation.NonNull ZincCerium,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PowerSourceTrait.BatApprovedChemistryEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class BatChargeFaultEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull AmbientTooHot,

        @androidx.annotation.NonNull AmbientTooCold,

        @androidx.annotation.NonNull BatteryTooHot,

        @androidx.annotation.NonNull BatteryTooCold,

        @androidx.annotation.NonNull BatteryAbsent,

        @androidx.annotation.NonNull BatteryOverVoltage,

        @androidx.annotation.NonNull BatteryUnderVoltage,

        @androidx.annotation.NonNull ChargerOverVoltage,

        @androidx.annotation.NonNull ChargerUnderVoltage,

        @androidx.annotation.NonNull SafetyTimeout,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class BatChargeLevelEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.BatChargeLevelEnum> {
        @androidx.annotation.NonNull OK,

        @androidx.annotation.NonNull Warning,

        @androidx.annotation.NonNull Critical,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PowerSourceTrait.BatChargeLevelEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class BatChargeStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.BatChargeStateEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull IsCharging,

        @androidx.annotation.NonNull IsAtFullCharge,

        @androidx.annotation.NonNull IsNotCharging,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PowerSourceTrait.BatChargeStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class BatCommonDesignationEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.BatCommonDesignationEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull AAA,

        @androidx.annotation.NonNull AA,

        @androidx.annotation.NonNull C,

        @androidx.annotation.NonNull D,

        @androidx.annotation.NonNull Num4v5,

        @androidx.annotation.NonNull Num6v0,

        @androidx.annotation.NonNull Num9v0,

        @androidx.annotation.NonNull Num12AA,

        @androidx.annotation.NonNull AAAA,

        @androidx.annotation.NonNull A,

        @androidx.annotation.NonNull B,

        @androidx.annotation.NonNull F,

        @androidx.annotation.NonNull N,

        @androidx.annotation.NonNull No6,

        @androidx.annotation.NonNull SubC,

        @androidx.annotation.NonNull A23,

        @androidx.annotation.NonNull A27,

        @androidx.annotation.NonNull BA5800,

        @androidx.annotation.NonNull Duplex,

        @androidx.annotation.NonNull Num4SR44,

        @androidx.annotation.NonNull Num523,

        @androidx.annotation.NonNull Num531,

        @androidx.annotation.NonNull Num15v0,

        @androidx.annotation.NonNull Num22v5,

        @androidx.annotation.NonNull Num30v0,

        @androidx.annotation.NonNull Num45v0,

        @androidx.annotation.NonNull Num67v5,

        @androidx.annotation.NonNull J,

        @androidx.annotation.NonNull CR123A,

        @androidx.annotation.NonNull CR2,

        @androidx.annotation.NonNull Num2CR5,

        @androidx.annotation.NonNull CRP2,

        @androidx.annotation.NonNull CRV3,

        @androidx.annotation.NonNull SR41,

        @androidx.annotation.NonNull SR43,

        @androidx.annotation.NonNull SR44,

        @androidx.annotation.NonNull SR45,

        @androidx.annotation.NonNull SR48,

        @androidx.annotation.NonNull SR54,

        @androidx.annotation.NonNull SR55,

        @androidx.annotation.NonNull SR57,

        @androidx.annotation.NonNull SR58,

        @androidx.annotation.NonNull SR59,

        @androidx.annotation.NonNull SR60,

        @androidx.annotation.NonNull SR63,

        @androidx.annotation.NonNull SR64,

        @androidx.annotation.NonNull SR65,

        @androidx.annotation.NonNull SR66,

        @androidx.annotation.NonNull SR67,

        @androidx.annotation.NonNull SR68,

        @androidx.annotation.NonNull SR69,

        @androidx.annotation.NonNull SR516,

        @androidx.annotation.NonNull SR731,

        @androidx.annotation.NonNull SR712,

        @androidx.annotation.NonNull LR932,

        @androidx.annotation.NonNull A5,

        @androidx.annotation.NonNull A10,

        @androidx.annotation.NonNull A13,

        @androidx.annotation.NonNull A312,

        @androidx.annotation.NonNull A675,

        @androidx.annotation.NonNull AC41E,

        @androidx.annotation.NonNull Num10180,

        @androidx.annotation.NonNull Num10280,

        @androidx.annotation.NonNull Num10440,

        @androidx.annotation.NonNull Num14250,

        @androidx.annotation.NonNull Num14430,

        @androidx.annotation.NonNull Num14500,

        @androidx.annotation.NonNull Num14650,

        @androidx.annotation.NonNull Num15270,

        @androidx.annotation.NonNull Num16340,

        @androidx.annotation.NonNull RCR123A,

        @androidx.annotation.NonNull Num17500,

        @androidx.annotation.NonNull Num17670,

        @androidx.annotation.NonNull Num18350,

        @androidx.annotation.NonNull Num18500,

        @androidx.annotation.NonNull Num18650,

        @androidx.annotation.NonNull Num19670,

        @androidx.annotation.NonNull Num25500,

        @androidx.annotation.NonNull Num26650,

        @androidx.annotation.NonNull Num32600,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PowerSourceTrait.BatCommonDesignationEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class BatFaultEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull OverTemp,

        @androidx.annotation.NonNull UnderTemp,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class BatReplaceabilityEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.BatReplaceabilityEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull NotReplaceable,

        @androidx.annotation.NonNull UserReplaceable,

        @androidx.annotation.NonNull FactoryReplaceable,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PowerSourceTrait.BatReplaceabilityEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class PowerSourceStatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.PowerSourceStatusEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Active,

        @androidx.annotation.NonNull Standby,

        @androidx.annotation.NonNull Unavailable,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PowerSourceTrait.PowerSourceStatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class WiredCurrentTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.WiredCurrentTypeEnum> {
        @androidx.annotation.NonNull AC,

        @androidx.annotation.NonNull DC,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PowerSourceTrait.WiredCurrentTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class WiredFaultEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull OverVoltage,

        @androidx.annotation.NonNull UnderVoltage,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(wired: kotlin.Boolean = COMPILED_CODE, battery: kotlin.Boolean = COMPILED_CODE, rechargeable: kotlin.Boolean = COMPILED_CODE, replaceable: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.PowerSourceTrait.Feature> {
            private const final val WIRED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val BATTERY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RECHARGEABLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val REPLACEABLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.PowerSourceTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.PowerSourceTrait.Feature { /* compiled code */ }
        }

        public final val wired: kotlin.Boolean /* compiled code */

        public final val battery: kotlin.Boolean /* compiled code */

        public final val rechargeable: kotlin.Boolean /* compiled code */

        public final val replaceable: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(wired: kotlin.Boolean = COMPILED_CODE, battery: kotlin.Boolean = COMPILED_CODE, rechargeable: kotlin.Boolean = COMPILED_CODE, replaceable: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.PowerSourceTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface WiredFaultChange {
        public abstract val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>?

        public abstract val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>?
    }

    public final class WiredFaultChangeImpl public constructor(current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>? = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>? = COMPILED_CODE) : com.google.home.matter.standard.PowerSourceTrait.WiredFaultChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PowerSourceTrait.WiredFaultChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PowerSourceTrait.WiredFaultChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PowerSourceTrait.WiredFaultChange { /* compiled code */ }
        }

        public open val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface BatFaultChange {
        public abstract val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>?

        public abstract val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>?
    }

    public final class BatFaultChangeImpl public constructor(current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>? = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>? = COMPILED_CODE) : com.google.home.matter.standard.PowerSourceTrait.BatFaultChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PowerSourceTrait.BatFaultChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PowerSourceTrait.BatFaultChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PowerSourceTrait.BatFaultChange { /* compiled code */ }
        }

        public open val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface BatChargeFaultChange {
        public abstract val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>?

        public abstract val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>?
    }

    public final class BatChargeFaultChangeImpl public constructor(current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>? = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>? = COMPILED_CODE) : com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChange { /* compiled code */ }
        }

        public open val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class BatChargeFaultChangeType public constructor(current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum> = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChangeType>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChangeType?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChangeType?>.previous: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChangeType): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChangeType { /* compiled code */ }
        }

        public final val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum> /* compiled code */

        public final val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChangeType.StructFields> {
            @androidx.annotation.NonNull current,

            @androidx.annotation.NonNull previous;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class BatFaultChangeType public constructor(current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum> = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PowerSourceTrait.BatFaultChangeType>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSourceTrait.BatFaultChangeType?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSourceTrait.BatFaultChangeType?>.previous: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PowerSourceTrait.BatFaultChangeType): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PowerSourceTrait.BatFaultChangeType { /* compiled code */ }
        }

        public final val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum> /* compiled code */

        public final val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.BatFaultChangeType.StructFields> {
            @androidx.annotation.NonNull current,

            @androidx.annotation.NonNull previous;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class WiredFaultChangeType public constructor(current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum> = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PowerSourceTrait.WiredFaultChangeType>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSourceTrait.WiredFaultChangeType?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSourceTrait.WiredFaultChangeType?>.previous: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PowerSourceTrait.WiredFaultChangeType): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PowerSourceTrait.WiredFaultChangeType { /* compiled code */ }
        }

        public final val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum> /* compiled code */

        public final val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.PowerSourceTrait.WiredFaultChangeType.StructFields> {
            @androidx.annotation.NonNull current,

            @androidx.annotation.NonNull previous;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PowerSourceTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PowerSourceTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PowerSourceTrait.Attributes { /* compiled code */ }
        }

        public abstract val status: com.google.home.matter.standard.PowerSourceTrait.PowerSourceStatusEnum?

        public abstract val order: kotlin.UByte?

        public abstract val description: kotlin.String?

        public abstract val wiredAssessedInputVoltage: kotlin.UInt?

        public abstract val wiredAssessedInputFrequency: kotlin.UShort?

        public abstract val wiredCurrentType: com.google.home.matter.standard.PowerSourceTrait.WiredCurrentTypeEnum?

        public abstract val wiredAssessedCurrent: kotlin.UInt?

        public abstract val wiredNominalVoltage: kotlin.UInt?

        public abstract val wiredMaximumCurrent: kotlin.UInt?

        public abstract val wiredPresent: kotlin.Boolean?

        public abstract val activeWiredFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>?

        public abstract val batVoltage: kotlin.UInt?

        public abstract val batPercentRemaining: kotlin.UByte?

        public abstract val batTimeRemaining: kotlin.UInt?

        public abstract val batChargeLevel: com.google.home.matter.standard.PowerSourceTrait.BatChargeLevelEnum?

        public abstract val batReplacementNeeded: kotlin.Boolean?

        public abstract val batReplaceability: com.google.home.matter.standard.PowerSourceTrait.BatReplaceabilityEnum?

        public abstract val batPresent: kotlin.Boolean?

        public abstract val activeBatFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>?

        public abstract val batReplacementDescription: kotlin.String?

        public abstract val batCommonDesignation: com.google.home.matter.standard.PowerSourceTrait.BatCommonDesignationEnum?

        public abstract val batAnsiDesignation: kotlin.String?

        public abstract val batIecDesignation: kotlin.String?

        public abstract val batApprovedChemistry: com.google.home.matter.standard.PowerSourceTrait.BatApprovedChemistryEnum?

        public abstract val batCapacity: kotlin.UInt?

        public abstract val batQuantity: kotlin.UByte?

        public abstract val batChargeState: com.google.home.matter.standard.PowerSourceTrait.BatChargeStateEnum?

        public abstract val batTimeToFullCharge: kotlin.UInt?

        public abstract val batFunctionalWhileCharging: kotlin.Boolean?

        public abstract val batChargingCurrent: kotlin.UInt?

        public abstract val activeBatChargeFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>?

        public abstract val endpointList: kotlin.collections.List<kotlin.UShort>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.PowerSourceTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(status: com.google.home.matter.standard.PowerSourceTrait.PowerSourceStatusEnum? = COMPILED_CODE, order: kotlin.UByte? = COMPILED_CODE, description: kotlin.String? = COMPILED_CODE, wiredAssessedInputVoltage: kotlin.UInt? = COMPILED_CODE, wiredAssessedInputFrequency: kotlin.UShort? = COMPILED_CODE, wiredCurrentType: com.google.home.matter.standard.PowerSourceTrait.WiredCurrentTypeEnum? = COMPILED_CODE, wiredAssessedCurrent: kotlin.UInt? = COMPILED_CODE, wiredNominalVoltage: kotlin.UInt? = COMPILED_CODE, wiredMaximumCurrent: kotlin.UInt? = COMPILED_CODE, wiredPresent: kotlin.Boolean? = COMPILED_CODE, activeWiredFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>? = COMPILED_CODE, batVoltage: kotlin.UInt? = COMPILED_CODE, batPercentRemaining: kotlin.UByte? = COMPILED_CODE, batTimeRemaining: kotlin.UInt? = COMPILED_CODE, batChargeLevel: com.google.home.matter.standard.PowerSourceTrait.BatChargeLevelEnum? = COMPILED_CODE, batReplacementNeeded: kotlin.Boolean? = COMPILED_CODE, batReplaceability: com.google.home.matter.standard.PowerSourceTrait.BatReplaceabilityEnum? = COMPILED_CODE, batPresent: kotlin.Boolean? = COMPILED_CODE, activeBatFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>? = COMPILED_CODE, batReplacementDescription: kotlin.String? = COMPILED_CODE, batCommonDesignation: com.google.home.matter.standard.PowerSourceTrait.BatCommonDesignationEnum? = COMPILED_CODE, batAnsiDesignation: kotlin.String? = COMPILED_CODE, batIecDesignation: kotlin.String? = COMPILED_CODE, batApprovedChemistry: com.google.home.matter.standard.PowerSourceTrait.BatApprovedChemistryEnum? = COMPILED_CODE, batCapacity: kotlin.UInt? = COMPILED_CODE, batQuantity: kotlin.UByte? = COMPILED_CODE, batChargeState: com.google.home.matter.standard.PowerSourceTrait.BatChargeStateEnum? = COMPILED_CODE, batTimeToFullCharge: kotlin.UInt? = COMPILED_CODE, batFunctionalWhileCharging: kotlin.Boolean? = COMPILED_CODE, batChargingCurrent: kotlin.UInt? = COMPILED_CODE, activeBatChargeFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>? = COMPILED_CODE, endpointList: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.PowerSourceTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.PowerSourceTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.PowerSourceTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.PowerSourceTrait.Attributes) { /* compiled code */ }

        public open val status: com.google.home.matter.standard.PowerSourceTrait.PowerSourceStatusEnum? /* compiled code */

        public open val order: kotlin.UByte? /* compiled code */

        public open val description: kotlin.String? /* compiled code */

        public open val wiredAssessedInputVoltage: kotlin.UInt? /* compiled code */

        public open val wiredAssessedInputFrequency: kotlin.UShort? /* compiled code */

        public open val wiredCurrentType: com.google.home.matter.standard.PowerSourceTrait.WiredCurrentTypeEnum? /* compiled code */

        public open val wiredAssessedCurrent: kotlin.UInt? /* compiled code */

        public open val wiredNominalVoltage: kotlin.UInt? /* compiled code */

        public open val wiredMaximumCurrent: kotlin.UInt? /* compiled code */

        public open val wiredPresent: kotlin.Boolean? /* compiled code */

        public open val activeWiredFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>? /* compiled code */

        public open val batVoltage: kotlin.UInt? /* compiled code */

        public open val batPercentRemaining: kotlin.UByte? /* compiled code */

        public open val batTimeRemaining: kotlin.UInt? /* compiled code */

        public open val batChargeLevel: com.google.home.matter.standard.PowerSourceTrait.BatChargeLevelEnum? /* compiled code */

        public open val batReplacementNeeded: kotlin.Boolean? /* compiled code */

        public open val batReplaceability: com.google.home.matter.standard.PowerSourceTrait.BatReplaceabilityEnum? /* compiled code */

        public open val batPresent: kotlin.Boolean? /* compiled code */

        public open val activeBatFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>? /* compiled code */

        public open val batReplacementDescription: kotlin.String? /* compiled code */

        public open val batCommonDesignation: com.google.home.matter.standard.PowerSourceTrait.BatCommonDesignationEnum? /* compiled code */

        public open val batAnsiDesignation: kotlin.String? /* compiled code */

        public open val batIecDesignation: kotlin.String? /* compiled code */

        public open val batApprovedChemistry: com.google.home.matter.standard.PowerSourceTrait.BatApprovedChemistryEnum? /* compiled code */

        public open val batCapacity: kotlin.UInt? /* compiled code */

        public open val batQuantity: kotlin.UByte? /* compiled code */

        public open val batChargeState: com.google.home.matter.standard.PowerSourceTrait.BatChargeStateEnum? /* compiled code */

        public open val batTimeToFullCharge: kotlin.UInt? /* compiled code */

        public open val batFunctionalWhileCharging: kotlin.Boolean? /* compiled code */

        public open val batChargingCurrent: kotlin.UInt? /* compiled code */

        public open val activeBatChargeFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>? /* compiled code */

        public open val endpointList: kotlin.collections.List<kotlin.UShort>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.PowerSourceTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(status: com.google.home.matter.standard.PowerSourceTrait.PowerSourceStatusEnum? = COMPILED_CODE, order: kotlin.UByte? = COMPILED_CODE, description: kotlin.String? = COMPILED_CODE, wiredAssessedInputVoltage: kotlin.UInt? = COMPILED_CODE, wiredAssessedInputFrequency: kotlin.UShort? = COMPILED_CODE, wiredCurrentType: com.google.home.matter.standard.PowerSourceTrait.WiredCurrentTypeEnum? = COMPILED_CODE, wiredAssessedCurrent: kotlin.UInt? = COMPILED_CODE, wiredNominalVoltage: kotlin.UInt? = COMPILED_CODE, wiredMaximumCurrent: kotlin.UInt? = COMPILED_CODE, wiredPresent: kotlin.Boolean? = COMPILED_CODE, activeWiredFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>? = COMPILED_CODE, batVoltage: kotlin.UInt? = COMPILED_CODE, batPercentRemaining: kotlin.UByte? = COMPILED_CODE, batTimeRemaining: kotlin.UInt? = COMPILED_CODE, batChargeLevel: com.google.home.matter.standard.PowerSourceTrait.BatChargeLevelEnum? = COMPILED_CODE, batReplacementNeeded: kotlin.Boolean? = COMPILED_CODE, batReplaceability: com.google.home.matter.standard.PowerSourceTrait.BatReplaceabilityEnum? = COMPILED_CODE, batPresent: kotlin.Boolean? = COMPILED_CODE, activeBatFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>? = COMPILED_CODE, batReplacementDescription: kotlin.String? = COMPILED_CODE, batCommonDesignation: com.google.home.matter.standard.PowerSourceTrait.BatCommonDesignationEnum? = COMPILED_CODE, batAnsiDesignation: kotlin.String? = COMPILED_CODE, batIecDesignation: kotlin.String? = COMPILED_CODE, batApprovedChemistry: com.google.home.matter.standard.PowerSourceTrait.BatApprovedChemistryEnum? = COMPILED_CODE, batCapacity: kotlin.UInt? = COMPILED_CODE, batQuantity: kotlin.UByte? = COMPILED_CODE, batChargeState: com.google.home.matter.standard.PowerSourceTrait.BatChargeStateEnum? = COMPILED_CODE, batTimeToFullCharge: kotlin.UInt? = COMPILED_CODE, batFunctionalWhileCharging: kotlin.Boolean? = COMPILED_CODE, batChargingCurrent: kotlin.UInt? = COMPILED_CODE, activeBatChargeFaults: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>? = COMPILED_CODE, endpointList: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.PowerSourceTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.PowerSourceTrait.AttributesImpl { /* compiled code */ }
    }
}

