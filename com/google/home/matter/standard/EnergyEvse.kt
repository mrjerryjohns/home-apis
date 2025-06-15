// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface EnergyEvse : com.google.home.matter.standard.EnergyEvseTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.EnergyEvse, com.google.home.matter.standard.EnergyEvseTrait.MutableAttributes>, com.google.home.matter.standard.EnergyEvseCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.EnergyEvse> {
        public final val state: com.google.home.automation.Attribute<com.google.home.matter.standard.EnergyEvseTrait.StateEnum?> /* compiled code */
            public final get

        public final val supplyState: com.google.home.automation.Attribute<com.google.home.matter.standard.EnergyEvseTrait.SupplyStateEnum?> /* compiled code */
            public final get

        public final val faultState: com.google.home.automation.Attribute<com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum?> /* compiled code */
            public final get

        public final val chargingEnabledUntil: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val dischargingEnabledUntil: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val circuitCapacity: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val minimumChargeCurrent: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val maximumChargeCurrent: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val maximumDischargeCurrent: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val userMaximumChargeCurrent: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val randomizationDelayWindow: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val nextChargeStartTime: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val nextChargeTargetTime: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val nextChargeRequiredEnergy: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val nextChargeTargetSoC: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val approximateEvEfficiency: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val stateOfCharge: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val batteryCapacity: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val vehicleId: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val sessionId: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val sessionDuration: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val sessionEnergyCharged: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val sessionEnergyDischarged: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.EnergyEvseTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.state: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.StateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.supplyState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.SupplyStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.faultState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.chargingEnabledUntil: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.dischargingEnabledUntil: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.circuitCapacity: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.minimumChargeCurrent: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.maximumChargeCurrent: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.maximumDischargeCurrent: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.userMaximumChargeCurrent: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.randomizationDelayWindow: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.nextChargeStartTime: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.nextChargeTargetTime: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.nextChargeRequiredEnergy: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.nextChargeTargetSoC: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.approximateEvEfficiency: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.stateOfCharge: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.batteryCapacity: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.vehicleId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.sessionId: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.sessionDuration: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.sessionEnergyCharged: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.sessionEnergyDischarged: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.EnergyEvse>.setUserMaximumChargeCurrent(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.EnergyEvse>.setRandomizationDelayWindow(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.EnergyEvse>.setApproximateEvEfficiency(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun disable(): com.google.home.automation.Command { /* compiled code */ }

        public final fun enableCharging(chargingEnabledUntil: kotlin.UInt?, minimumChargeCurrent: kotlin.Long, maximumChargeCurrent: kotlin.Long): com.google.home.automation.Command { /* compiled code */ }

        public final fun enableDischarging(dischargingEnabledUntil: kotlin.UInt?, maximumDischargeCurrent: kotlin.Long): com.google.home.automation.Command { /* compiled code */ }

        public final fun startDiagnostics(): com.google.home.automation.Command { /* compiled code */ }

        public final fun getTargets(): com.google.home.automation.Command { /* compiled code */ }

        public final fun clearTargets(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.EnergyEvse> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.EnergyEvse.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.EnergyEvse.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvse.Attribute> {
        @androidx.annotation.NonNull state,

        @androidx.annotation.NonNull supplyState,

        @androidx.annotation.NonNull faultState,

        @androidx.annotation.NonNull chargingEnabledUntil,

        @androidx.annotation.NonNull dischargingEnabledUntil,

        @androidx.annotation.NonNull circuitCapacity,

        @androidx.annotation.NonNull minimumChargeCurrent,

        @androidx.annotation.NonNull maximumChargeCurrent,

        @androidx.annotation.NonNull maximumDischargeCurrent,

        @androidx.annotation.NonNull userMaximumChargeCurrent,

        @androidx.annotation.NonNull randomizationDelayWindow,

        @androidx.annotation.NonNull nextChargeStartTime,

        @androidx.annotation.NonNull nextChargeTargetTime,

        @androidx.annotation.NonNull nextChargeRequiredEnergy,

        @androidx.annotation.NonNull nextChargeTargetSoC,

        @androidx.annotation.NonNull approximateEvEfficiency,

        @androidx.annotation.NonNull stateOfCharge,

        @androidx.annotation.NonNull batteryCapacity,

        @androidx.annotation.NonNull vehicleId,

        @androidx.annotation.NonNull sessionId,

        @androidx.annotation.NonNull sessionDuration,

        @androidx.annotation.NonNull sessionEnergyCharged,

        @androidx.annotation.NonNull sessionEnergyDischarged,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.EnergyEvse.Command> {
        @androidx.annotation.NonNull Disable,

        @androidx.annotation.NonNull EnableCharging,

        @androidx.annotation.NonNull EnableDischarging,

        @androidx.annotation.NonNull StartDiagnostics,

        @androidx.annotation.NonNull SetTargets,

        @androidx.annotation.NonNull GetTargets,

        @androidx.annotation.NonNull ClearTargets;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class EvConnectedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.EnergyEvseTrait.EvConnected) : com.google.home.Event, com.google.home.matter.standard.EnergyEvseTrait.EvConnected {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.EnergyEvse.EvConnectedEvent> {
            public final val sessionId: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EvConnectedEvent?>.sessionId: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.EnergyEvseTrait.EvConnected /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvse.EvConnectedEvent.EventFields> {
            @androidx.annotation.NonNull sessionId;

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

    public final class EvNotDetectedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.EnergyEvseTrait.EvNotDetected) : com.google.home.Event, com.google.home.matter.standard.EnergyEvseTrait.EvNotDetected {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.EnergyEvse.EvNotDetectedEvent> {
            public final val sessionId: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val state: com.google.home.automation.EventField<com.google.home.matter.standard.EnergyEvseTrait.StateEnum?> /* compiled code */
                public final get

            public final val sessionDuration: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val sessionEnergyCharged: com.google.home.automation.EventField<kotlin.Long?> /* compiled code */
                public final get

            public final val sessionEnergyDischarged: com.google.home.automation.EventField<kotlin.Long?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EvNotDetectedEvent?>.sessionId: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EvNotDetectedEvent?>.state: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.StateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EvNotDetectedEvent?>.sessionDuration: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EvNotDetectedEvent?>.sessionEnergyCharged: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EvNotDetectedEvent?>.sessionEnergyDischarged: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.EnergyEvseTrait.EvNotDetected /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val sessionDuration: kotlin.UInt? /* compiled code */

        public open val sessionEnergyCharged: kotlin.Long? /* compiled code */

        public open val sessionEnergyDischarged: kotlin.Long? /* compiled code */

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvse.EvNotDetectedEvent.EventFields> {
            @androidx.annotation.NonNull sessionId,

            @androidx.annotation.NonNull state,

            @androidx.annotation.NonNull sessionDuration,

            @androidx.annotation.NonNull sessionEnergyCharged,

            @androidx.annotation.NonNull sessionEnergyDischarged;

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

    public final class EnergyTransferStartedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStarted) : com.google.home.Event, com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStarted {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.EnergyEvse.EnergyTransferStartedEvent> {
            public final val sessionId: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val state: com.google.home.automation.EventField<com.google.home.matter.standard.EnergyEvseTrait.StateEnum?> /* compiled code */
                public final get

            public final val maximumCurrent: com.google.home.automation.EventField<kotlin.Long?> /* compiled code */
                public final get

            public final val maximumDischargeCurrent: com.google.home.automation.EventField<kotlin.Long?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EnergyTransferStartedEvent?>.sessionId: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EnergyTransferStartedEvent?>.state: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.StateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EnergyTransferStartedEvent?>.maximumCurrent: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EnergyTransferStartedEvent?>.maximumDischargeCurrent: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStarted /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val maximumCurrent: kotlin.Long? /* compiled code */

        public open val maximumDischargeCurrent: kotlin.Long? /* compiled code */

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvse.EnergyTransferStartedEvent.EventFields> {
            @androidx.annotation.NonNull sessionId,

            @androidx.annotation.NonNull state,

            @androidx.annotation.NonNull maximumCurrent,

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

    public final class EnergyTransferStoppedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStopped) : com.google.home.Event, com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStopped {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.EnergyEvse.EnergyTransferStoppedEvent> {
            public final val sessionId: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val state: com.google.home.automation.EventField<com.google.home.matter.standard.EnergyEvseTrait.StateEnum?> /* compiled code */
                public final get

            public final val reason: com.google.home.automation.EventField<com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStoppedReasonEnum?> /* compiled code */
                public final get

            public final val energyTransferred: com.google.home.automation.EventField<kotlin.Long?> /* compiled code */
                public final get

            public final val energyDischarged: com.google.home.automation.EventField<kotlin.Long?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EnergyTransferStoppedEvent?>.sessionId: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EnergyTransferStoppedEvent?>.state: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.StateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EnergyTransferStoppedEvent?>.reason: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStoppedReasonEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EnergyTransferStoppedEvent?>.energyTransferred: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.EnergyTransferStoppedEvent?>.energyDischarged: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStopped /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val energyDischarged: kotlin.Long? /* compiled code */

        public open val energyTransferred: kotlin.Long? /* compiled code */

        public open val reason: com.google.home.matter.standard.EnergyEvseTrait.EnergyTransferStoppedReasonEnum? /* compiled code */

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvse.EnergyTransferStoppedEvent.EventFields> {
            @androidx.annotation.NonNull sessionId,

            @androidx.annotation.NonNull state,

            @androidx.annotation.NonNull reason,

            @androidx.annotation.NonNull energyTransferred,

            @androidx.annotation.NonNull energyDischarged;

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

    public final class FaultEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.EnergyEvseTrait.Fault) : com.google.home.Event, com.google.home.matter.standard.EnergyEvseTrait.Fault {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.EnergyEvse.FaultEvent> {
            public final val sessionId: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val state: com.google.home.automation.EventField<com.google.home.matter.standard.EnergyEvseTrait.StateEnum?> /* compiled code */
                public final get

            public final val faultStatePreviousState: com.google.home.automation.EventField<com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum?> /* compiled code */
                public final get

            public final val faultStateCurrentState: com.google.home.automation.EventField<com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.FaultEvent?>.sessionId: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.FaultEvent?>.state: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.StateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.FaultEvent?>.faultStatePreviousState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.FaultEvent?>.faultStateCurrentState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.EnergyEvseTrait.Fault /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val faultStateCurrentState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum? /* compiled code */

        public open val faultStatePreviousState: com.google.home.matter.standard.EnergyEvseTrait.FaultStateEnum? /* compiled code */

        public open val sessionId: kotlin.UInt? /* compiled code */

        public open val state: com.google.home.matter.standard.EnergyEvseTrait.StateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvse.FaultEvent.EventFields> {
            @androidx.annotation.NonNull sessionId,

            @androidx.annotation.NonNull state,

            @androidx.annotation.NonNull faultStatePreviousState,

            @androidx.annotation.NonNull faultStateCurrentState;

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

    public final class RfidEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.EnergyEvseTrait.Rfid) : com.google.home.Event, com.google.home.matter.standard.EnergyEvseTrait.Rfid {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.EnergyEvse.RfidEvent> {
            public final val uid: com.google.home.automation.EventField<kotlin.ByteArray?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvse.RfidEvent?>.uid: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.EnergyEvseTrait.Rfid /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val uid: kotlin.ByteArray? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvse.RfidEvent.EventFields> {
            @androidx.annotation.NonNull uid;

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
