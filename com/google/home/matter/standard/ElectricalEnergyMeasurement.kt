// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ElectricalEnergyMeasurement : com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Attributes, com.google.home.matter.MatterTrait {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.ElectricalEnergyMeasurement> {
        public final val accuracy: com.google.home.automation.Attribute<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct?> /* compiled code */
            public final get

        public final val cumulativeEnergyImported: com.google.home.automation.Attribute<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?> /* compiled code */
            public final get

        public final val cumulativeEnergyExported: com.google.home.automation.Attribute<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?> /* compiled code */
            public final get

        public final val periodicEnergyImported: com.google.home.automation.Attribute<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?> /* compiled code */
            public final get

        public final val periodicEnergyExported: com.google.home.automation.Attribute<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?> /* compiled code */
            public final get

        public final val cumulativeEnergyReset: com.google.home.automation.Attribute<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.accuracy: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.cumulativeEnergyImported: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.cumulativeEnergyExported: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.periodicEnergyImported: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.periodicEnergyExported: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.cumulativeEnergyReset: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ElectricalEnergyMeasurement?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.ElectricalEnergyMeasurement> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.ElectricalEnergyMeasurement.Attribute): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalEnergyMeasurement.Attribute> {
        @androidx.annotation.NonNull accuracy,

        @androidx.annotation.NonNull cumulativeEnergyImported,

        @androidx.annotation.NonNull cumulativeEnergyExported,

        @androidx.annotation.NonNull periodicEnergyImported,

        @androidx.annotation.NonNull periodicEnergyExported,

        @androidx.annotation.NonNull cumulativeEnergyReset,

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

    public final class CumulativeEnergyMeasuredEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyMeasured) : com.google.home.Event, com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyMeasured {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.ElectricalEnergyMeasurement.CumulativeEnergyMeasuredEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyMeasured /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val energyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open val energyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalEnergyMeasurement.CumulativeEnergyMeasuredEvent.EventFields> {
            @androidx.annotation.NonNull energyImported,

            @androidx.annotation.NonNull energyExported;

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

    public final class PeriodicEnergyMeasuredEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.PeriodicEnergyMeasured) : com.google.home.Event, com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.PeriodicEnergyMeasured {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.ElectricalEnergyMeasurement.PeriodicEnergyMeasuredEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.PeriodicEnergyMeasured /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val energyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open val energyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ElectricalEnergyMeasurement.PeriodicEnergyMeasuredEvent.EventFields> {
            @androidx.annotation.NonNull energyImported,

            @androidx.annotation.NonNull energyExported;

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

