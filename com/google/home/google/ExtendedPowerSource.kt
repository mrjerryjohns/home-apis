// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedPowerSource : com.google.home.google.ExtendedPowerSourceTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.ExtendedPowerSourceCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.ExtendedPowerSource> {
        public final val energyStorageDistanceUnitForUx: com.google.home.automation.Attribute<com.google.home.google.ExtendedPowerSourceTrait.DistanceUnit?> /* compiled code */
            public final get

        public final val descriptiveCapacityRemaining: com.google.home.automation.Attribute<com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining?> /* compiled code */
            public final get

        public final val capacityRemaining: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>?> /* compiled code */
            public final get

        public final val capacityUntilFull: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>?> /* compiled code */
            public final get

        public final val isPluggedIn: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val chargeSpeed: com.google.home.automation.Attribute<com.google.home.google.ExtendedPowerSourceTrait.ChargeSpeed?> /* compiled code */
            public final get

        public final val batterySaverEnabled: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val energySource: com.google.home.automation.Attribute<com.google.home.google.ExtendedPowerSourceTrait.EnergySource?> /* compiled code */
            public final get

        public final val usingBackupEnergySource: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<kotlin.UInt> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.energyStorageDistanceUnitForUx: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedPowerSourceTrait.DistanceUnit?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.descriptiveCapacityRemaining: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.capacityRemaining: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.capacityUntilFull: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.Capacity>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.isPluggedIn: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.chargeSpeed: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedPowerSourceTrait.ChargeSpeed?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.batterySaverEnabled: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.energySource: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedPowerSourceTrait.EnergySource?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.usingBackupEnergySource: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun startCharging(): com.google.home.automation.Command { /* compiled code */ }

        public final fun stopCharging(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.ExtendedPowerSource> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.ExtendedPowerSource.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.ExtendedPowerSource.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedPowerSource.Attribute> {
        @androidx.annotation.NonNull energyStorageDistanceUnitForUx,

        @androidx.annotation.NonNull descriptiveCapacityRemaining,

        @androidx.annotation.NonNull capacityRemaining,

        @androidx.annotation.NonNull capacityUntilFull,

        @androidx.annotation.NonNull isPluggedIn,

        @androidx.annotation.NonNull chargeSpeed,

        @androidx.annotation.NonNull batterySaverEnabled,

        @androidx.annotation.NonNull energySource,

        @androidx.annotation.NonNull usingBackupEnergySource,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.ExtendedPowerSource.Command> {
        @androidx.annotation.NonNull StartCharging,

        @androidx.annotation.NonNull StopCharging;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class BatteryStateChangeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.ExtendedPowerSourceTrait.BatteryStateChange) : com.google.home.Event, com.google.home.google.ExtendedPowerSourceTrait.BatteryStateChange {
        public companion object : com.google.home.EventFactory<com.google.home.google.ExtendedPowerSource.BatteryStateChangeEvent> {
            public final val priority: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val current: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource.BatteryStateChangeEvent?>.priority: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource.BatteryStateChangeEvent?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining>?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.ExtendedPowerSourceTrait.BatteryStateChange /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.google.ExtendedPowerSourceTrait.DescriptiveCapacityRemaining>? /* compiled code */

        public open val priority: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedPowerSource.BatteryStateChangeEvent.EventFields> {
            @androidx.annotation.NonNull priority,

            @androidx.annotation.NonNull current;

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

    public final class UsingBackUpEnergySourceEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.ExtendedPowerSourceTrait.UsingBackUpEnergySource) : com.google.home.Event, com.google.home.google.ExtendedPowerSourceTrait.UsingBackUpEnergySource {
        public companion object : com.google.home.EventFactory<com.google.home.google.ExtendedPowerSource.UsingBackUpEnergySourceEvent> {
            public final val priority: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedPowerSource.UsingBackUpEnergySourceEvent?>.priority: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.ExtendedPowerSourceTrait.UsingBackUpEnergySource /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val priority: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedPowerSource.UsingBackUpEnergySourceEvent.EventFields> {
            @androidx.annotation.NonNull priority;

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
