// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface PowerSource : com.google.home.matter.standard.PowerSourceTrait.Attributes, com.google.home.matter.MatterTrait {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.PowerSource> {
        public final val status: com.google.home.automation.Attribute<com.google.home.matter.standard.PowerSourceTrait.PowerSourceStatusEnum?> /* compiled code */
            public final get

        public final val order: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val description: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val wiredAssessedInputVoltage: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val wiredAssessedInputFrequency: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val wiredCurrentType: com.google.home.automation.Attribute<com.google.home.matter.standard.PowerSourceTrait.WiredCurrentTypeEnum?> /* compiled code */
            public final get

        public final val wiredAssessedCurrent: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val wiredNominalVoltage: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val wiredMaximumCurrent: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val wiredPresent: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val activeWiredFaults: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>?> /* compiled code */
            public final get

        public final val batVoltage: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val batPercentRemaining: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val batTimeRemaining: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val batChargeLevel: com.google.home.automation.Attribute<com.google.home.matter.standard.PowerSourceTrait.BatChargeLevelEnum?> /* compiled code */
            public final get

        public final val batReplacementNeeded: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val batReplaceability: com.google.home.automation.Attribute<com.google.home.matter.standard.PowerSourceTrait.BatReplaceabilityEnum?> /* compiled code */
            public final get

        public final val batPresent: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val activeBatFaults: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>?> /* compiled code */
            public final get

        public final val batReplacementDescription: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val batCommonDesignation: com.google.home.automation.Attribute<com.google.home.matter.standard.PowerSourceTrait.BatCommonDesignationEnum?> /* compiled code */
            public final get

        public final val batAnsiDesignation: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val batIecDesignation: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val batApprovedChemistry: com.google.home.automation.Attribute<com.google.home.matter.standard.PowerSourceTrait.BatApprovedChemistryEnum?> /* compiled code */
            public final get

        public final val batCapacity: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val batQuantity: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val batChargeState: com.google.home.automation.Attribute<com.google.home.matter.standard.PowerSourceTrait.BatChargeStateEnum?> /* compiled code */
            public final get

        public final val batTimeToFullCharge: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val batFunctionalWhileCharging: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val batChargingCurrent: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val activeBatChargeFaults: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>?> /* compiled code */
            public final get

        public final val endpointList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UShort>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.PowerSourceTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.status: com.google.home.automation.TypedExpression<com.google.home.matter.standard.PowerSourceTrait.PowerSourceStatusEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.order: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.description: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.wiredAssessedInputVoltage: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.wiredAssessedInputFrequency: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.wiredCurrentType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.PowerSourceTrait.WiredCurrentTypeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.wiredAssessedCurrent: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.wiredNominalVoltage: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.wiredMaximumCurrent: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.wiredPresent: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.activeWiredFaults: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batVoltage: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batPercentRemaining: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batTimeRemaining: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batChargeLevel: com.google.home.automation.TypedExpression<com.google.home.matter.standard.PowerSourceTrait.BatChargeLevelEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batReplacementNeeded: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batReplaceability: com.google.home.automation.TypedExpression<com.google.home.matter.standard.PowerSourceTrait.BatReplaceabilityEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batPresent: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.activeBatFaults: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batReplacementDescription: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batCommonDesignation: com.google.home.automation.TypedExpression<com.google.home.matter.standard.PowerSourceTrait.BatCommonDesignationEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batAnsiDesignation: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batIecDesignation: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batApprovedChemistry: com.google.home.automation.TypedExpression<com.google.home.matter.standard.PowerSourceTrait.BatApprovedChemistryEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batCapacity: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batQuantity: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batChargeState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.PowerSourceTrait.BatChargeStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batTimeToFullCharge: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batFunctionalWhileCharging: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.batChargingCurrent: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.activeBatChargeFaults: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.endpointList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UShort>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.PowerSourceTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.PowerSource> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.PowerSource.Attribute): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.PowerSource.Attribute> {
        @androidx.annotation.NonNull status,

        @androidx.annotation.NonNull order,

        @androidx.annotation.NonNull description,

        @androidx.annotation.NonNull wiredAssessedInputVoltage,

        @androidx.annotation.NonNull wiredAssessedInputFrequency,

        @androidx.annotation.NonNull wiredCurrentType,

        @androidx.annotation.NonNull wiredAssessedCurrent,

        @androidx.annotation.NonNull wiredNominalVoltage,

        @androidx.annotation.NonNull wiredMaximumCurrent,

        @androidx.annotation.NonNull wiredPresent,

        @androidx.annotation.NonNull activeWiredFaults,

        @androidx.annotation.NonNull batVoltage,

        @androidx.annotation.NonNull batPercentRemaining,

        @androidx.annotation.NonNull batTimeRemaining,

        @androidx.annotation.NonNull batChargeLevel,

        @androidx.annotation.NonNull batReplacementNeeded,

        @androidx.annotation.NonNull batReplaceability,

        @androidx.annotation.NonNull batPresent,

        @androidx.annotation.NonNull activeBatFaults,

        @androidx.annotation.NonNull batReplacementDescription,

        @androidx.annotation.NonNull batCommonDesignation,

        @androidx.annotation.NonNull batAnsiDesignation,

        @androidx.annotation.NonNull batIecDesignation,

        @androidx.annotation.NonNull batApprovedChemistry,

        @androidx.annotation.NonNull batCapacity,

        @androidx.annotation.NonNull batQuantity,

        @androidx.annotation.NonNull batChargeState,

        @androidx.annotation.NonNull batTimeToFullCharge,

        @androidx.annotation.NonNull batFunctionalWhileCharging,

        @androidx.annotation.NonNull batChargingCurrent,

        @androidx.annotation.NonNull activeBatChargeFaults,

        @androidx.annotation.NonNull endpointList,

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

    public final class WiredFaultChangeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.PowerSourceTrait.WiredFaultChange) : com.google.home.Event, com.google.home.matter.standard.PowerSourceTrait.WiredFaultChange {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.PowerSource.WiredFaultChangeEvent> {
            public final val current: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>?> /* compiled code */
                public final get

            public final val previous: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource.WiredFaultChangeEvent?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource.WiredFaultChangeEvent?>.previous: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.PowerSourceTrait.WiredFaultChange /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.WiredFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.PowerSource.WiredFaultChangeEvent.EventFields> {
            @androidx.annotation.NonNull current,

            @androidx.annotation.NonNull previous;

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

    public final class BatFaultChangeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.PowerSourceTrait.BatFaultChange) : com.google.home.Event, com.google.home.matter.standard.PowerSourceTrait.BatFaultChange {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.PowerSource.BatFaultChangeEvent> {
            public final val current: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>?> /* compiled code */
                public final get

            public final val previous: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource.BatFaultChangeEvent?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource.BatFaultChangeEvent?>.previous: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.PowerSourceTrait.BatFaultChange /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.PowerSource.BatFaultChangeEvent.EventFields> {
            @androidx.annotation.NonNull current,

            @androidx.annotation.NonNull previous;

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

    public final class BatChargeFaultChangeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChange) : com.google.home.Event, com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChange {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.PowerSource.BatChargeFaultChangeEvent> {
            public final val current: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>?> /* compiled code */
                public final get

            public final val previous: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource.BatChargeFaultChangeEvent?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.PowerSource.BatChargeFaultChangeEvent?>.previous: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultChange /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.PowerSourceTrait.BatChargeFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.PowerSource.BatChargeFaultChangeEvent.EventFields> {
            @androidx.annotation.NonNull current,

            @androidx.annotation.NonNull previous;

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

