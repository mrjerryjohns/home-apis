// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedPowerSourceTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class DistanceUnit private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedPowerSourceTrait.DistanceUnit> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Kilometers,

        @androidx.annotation.NonNull Miles,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedPowerSourceTrait.DistanceUnit> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DescriptiveCapacityRemaining private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Empty,

        @androidx.annotation.NonNull CriticallyLow,

        @androidx.annotation.NonNull Low,

        @androidx.annotation.NonNull Medium,

        @androidx.annotation.NonNull High,

        @androidx.annotation.NonNull Full,

        @androidx.annotation.NonNull Ok,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class CapacityUnit private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedPowerSourceTrait.CapacityUnit> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Miles,

        @androidx.annotation.NonNull Kilometers,

        @androidx.annotation.NonNull KilowattHours,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedPowerSourceTrait.CapacityUnit> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ChargeSpeed private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedPowerSourceTrait.ChargeSpeed> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Slow,

        @androidx.annotation.NonNull Normal,

        @androidx.annotation.NonNull Rapid,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedPowerSourceTrait.ChargeSpeed> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class EnergySource private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedPowerSourceTrait.EnergySource> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Solar,

        @androidx.annotation.NonNull Battery,

        @androidx.annotation.NonNull Wire,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedPowerSourceTrait.EnergySource> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface BatteryStateChange {
        public abstract val priority: kotlin.UInt?

        public abstract val current: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining>?
    }

    public final class BatteryStateChangeImpl public constructor(priority: kotlin.UInt? = COMPILED_CODE, current: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining>? = COMPILED_CODE) : com.google.home.google.ExtendedPowerSourceTrait.BatteryStateChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedPowerSourceTrait.BatteryStateChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedPowerSourceTrait.BatteryStateChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedPowerSourceTrait.BatteryStateChange { /* compiled code */ }
        }

        public open val priority: kotlin.UInt? /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface UsingBackUpEnergySource {
        public abstract val priority: kotlin.UInt?
    }

    public final class UsingBackUpEnergySourceImpl public constructor(priority: kotlin.UInt? = COMPILED_CODE) : com.google.home.google.ExtendedPowerSourceTrait.UsingBackUpEnergySource {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedPowerSourceTrait.UsingBackUpEnergySource> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedPowerSourceTrait.UsingBackUpEnergySource): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedPowerSourceTrait.UsingBackUpEnergySource { /* compiled code */ }
        }

        public open val priority: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class Capacity public constructor(rawValue: kotlin.Int = COMPILED_CODE, unit: com.google.home.google.ExtendedPowerSourceTrait.CapacityUnit = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedPowerSourceTrait.Capacity>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSourceTrait.Capacity?>.rawValue: com.google.home.automation.TypedExpression<kotlin.Int> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSourceTrait.Capacity?>.unit: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedPowerSourceTrait.CapacityUnit> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedPowerSourceTrait.Capacity): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedPowerSourceTrait.Capacity { /* compiled code */ }
        }

        public final val rawValue: kotlin.Int /* compiled code */

        public final val unit: com.google.home.google.ExtendedPowerSourceTrait.CapacityUnit /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedPowerSourceTrait.Capacity.StructFields> {
            @androidx.annotation.NonNull rawValue,

            @androidx.annotation.NonNull unit;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedPowerSourceTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedPowerSourceTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedPowerSourceTrait.Attributes { /* compiled code */ }
        }

        public abstract val energyStorageDistanceUnitForUx: com.google.home.google.ExtendedPowerSourceTrait.DistanceUnit?

        public abstract val descriptiveCapacityRemaining: com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining?

        public abstract val capacityRemaining: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>?

        public abstract val capacityUntilFull: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>?

        public abstract val isPluggedIn: kotlin.Boolean?

        public abstract val chargeSpeed: com.google.home.google.ExtendedPowerSourceTrait.ChargeSpeed?

        public abstract val batterySaverEnabled: kotlin.Boolean?

        public abstract val energySource: com.google.home.google.ExtendedPowerSourceTrait.EnergySource?

        public abstract val usingBackupEnergySource: kotlin.Boolean?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(energyStorageDistanceUnitForUx: com.google.home.google.ExtendedPowerSourceTrait.DistanceUnit? = COMPILED_CODE, descriptiveCapacityRemaining: com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining? = COMPILED_CODE, capacityRemaining: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>? = COMPILED_CODE, capacityUntilFull: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>? = COMPILED_CODE, isPluggedIn: kotlin.Boolean? = COMPILED_CODE, chargeSpeed: com.google.home.google.ExtendedPowerSourceTrait.ChargeSpeed? = COMPILED_CODE, batterySaverEnabled: kotlin.Boolean? = COMPILED_CODE, energySource: com.google.home.google.ExtendedPowerSourceTrait.EnergySource? = COMPILED_CODE, usingBackupEnergySource: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ExtendedPowerSourceTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedPowerSourceTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedPowerSourceTrait.Attributes) { /* compiled code */ }

        public open val energyStorageDistanceUnitForUx: com.google.home.google.ExtendedPowerSourceTrait.DistanceUnit? /* compiled code */

        public open val descriptiveCapacityRemaining: com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining? /* compiled code */

        public open val capacityRemaining: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>? /* compiled code */

        public open val capacityUntilFull: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>? /* compiled code */

        public open val isPluggedIn: kotlin.Boolean? /* compiled code */

        public open val chargeSpeed: com.google.home.google.ExtendedPowerSourceTrait.ChargeSpeed? /* compiled code */

        public open val batterySaverEnabled: kotlin.Boolean? /* compiled code */

        public open val energySource: com.google.home.google.ExtendedPowerSourceTrait.EnergySource? /* compiled code */

        public open val usingBackupEnergySource: kotlin.Boolean? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(energyStorageDistanceUnitForUx: com.google.home.google.ExtendedPowerSourceTrait.DistanceUnit? = COMPILED_CODE, descriptiveCapacityRemaining: com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining? = COMPILED_CODE, capacityRemaining: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>? = COMPILED_CODE, capacityUntilFull: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>? = COMPILED_CODE, isPluggedIn: kotlin.Boolean? = COMPILED_CODE, chargeSpeed: com.google.home.google.ExtendedPowerSourceTrait.ChargeSpeed? = COMPILED_CODE, batterySaverEnabled: kotlin.Boolean? = COMPILED_CODE, energySource: com.google.home.google.ExtendedPowerSourceTrait.EnergySource? = COMPILED_CODE, usingBackupEnergySource: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ExtendedPowerSourceTrait.AttributesImpl { /* compiled code */ }
    }

    public object StartChargingCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedPowerSourceTrait.StartChargingCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedPowerSourceTrait.StartChargingCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedPowerSourceTrait.StartChargingCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedPowerSourceTrait.StartChargingCommand.Request.CommandFields> {
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

    public object StopChargingCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedPowerSourceTrait.StopChargingCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedPowerSourceTrait.StopChargingCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedPowerSourceTrait.StopChargingCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedPowerSourceTrait.StopChargingCommand.Request.CommandFields> {
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

