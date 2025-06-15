// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OccupancySensing : com.google.home.matter.standard.OccupancySensingTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.OccupancySensing, com.google.home.matter.standard.OccupancySensingTrait.MutableAttributes> {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.OccupancySensing> {
        public final val occupancy: com.google.home.automation.Attribute<com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap?> /* compiled code */
            public final get

        public final val occupancySensorType: com.google.home.automation.Attribute<com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeEnum?> /* compiled code */
            public final get

        public final val occupancySensorTypeBitmap: com.google.home.automation.Attribute<com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap?> /* compiled code */
            public final get

        public final val holdTime: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val holdTimeLimits: com.google.home.automation.Attribute<com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct?> /* compiled code */
            public final get

        public final val pirOccupiedToUnoccupiedDelay: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val pirUnoccupiedToOccupiedDelay: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val pirUnoccupiedToOccupiedThreshold: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val ultrasonicOccupiedToUnoccupiedDelay: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val ultrasonicUnoccupiedToOccupiedDelay: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val ultrasonicUnoccupiedToOccupiedThreshold: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val physicalContactOccupiedToUnoccupiedDelay: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val physicalContactUnoccupiedToOccupiedDelay: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val physicalContactUnoccupiedToOccupiedThreshold: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.OccupancySensingTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.occupancy: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.occupancySensorType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.occupancySensorTypeBitmap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.holdTime: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.holdTimeLimits: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.pirOccupiedToUnoccupiedDelay: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.pirUnoccupiedToOccupiedDelay: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.pirUnoccupiedToOccupiedThreshold: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.ultrasonicOccupiedToUnoccupiedDelay: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.ultrasonicUnoccupiedToOccupiedDelay: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.ultrasonicUnoccupiedToOccupiedThreshold: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.physicalContactOccupiedToUnoccupiedDelay: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.physicalContactUnoccupiedToOccupiedDelay: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.physicalContactUnoccupiedToOccupiedThreshold: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OccupancySensingTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OccupancySensing>.setHoldTime(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OccupancySensing>.setPirOccupiedToUnoccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OccupancySensing>.setPirUnoccupiedToOccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OccupancySensing>.setPirUnoccupiedToOccupiedThreshold(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OccupancySensing>.setUltrasonicOccupiedToUnoccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OccupancySensing>.setUltrasonicUnoccupiedToOccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OccupancySensing>.setUltrasonicUnoccupiedToOccupiedThreshold(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OccupancySensing>.setPhysicalContactOccupiedToUnoccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OccupancySensing>.setPhysicalContactUnoccupiedToOccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OccupancySensing>.setPhysicalContactUnoccupiedToOccupiedThreshold(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.OccupancySensing> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.OccupancySensing.Attribute): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OccupancySensing.Attribute> {
        @androidx.annotation.NonNull occupancy,

        @androidx.annotation.NonNull occupancySensorType,

        @androidx.annotation.NonNull occupancySensorTypeBitmap,

        @androidx.annotation.NonNull holdTime,

        @androidx.annotation.NonNull holdTimeLimits,

        @androidx.annotation.NonNull pirOccupiedToUnoccupiedDelay,

        @androidx.annotation.NonNull pirUnoccupiedToOccupiedDelay,

        @androidx.annotation.NonNull pirUnoccupiedToOccupiedThreshold,

        @androidx.annotation.NonNull ultrasonicOccupiedToUnoccupiedDelay,

        @androidx.annotation.NonNull ultrasonicUnoccupiedToOccupiedDelay,

        @androidx.annotation.NonNull ultrasonicUnoccupiedToOccupiedThreshold,

        @androidx.annotation.NonNull physicalContactOccupiedToUnoccupiedDelay,

        @androidx.annotation.NonNull physicalContactUnoccupiedToOccupiedDelay,

        @androidx.annotation.NonNull physicalContactUnoccupiedToOccupiedThreshold,

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

    public final class OccupancyChangedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.OccupancySensingTrait.OccupancyChanged) : com.google.home.Event, com.google.home.matter.standard.OccupancySensingTrait.OccupancyChanged {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.OccupancySensing.OccupancyChangedEvent> {
            public final val occupancy: com.google.home.automation.EventField<com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensing.OccupancyChangedEvent?>.occupancy: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.OccupancySensingTrait.OccupancyChanged /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val occupancy: com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OccupancySensing.OccupancyChangedEvent.EventFields> {
            @androidx.annotation.NonNull occupancy;

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
