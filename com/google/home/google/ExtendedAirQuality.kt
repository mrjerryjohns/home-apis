// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedAirQuality : com.google.home.google.ExtendedAirQualityTrait.Attributes, com.google.home.matter.MatterTrait {
    public companion object : com.google.home.TraitFactory<com.google.home.google.ExtendedAirQuality> {
        public final val measuredValue: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val indoorMeasuredValue: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val outdoorMeasuredValue: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val indoorAirQuality: com.google.home.automation.Attribute<com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel?> /* compiled code */
            public final get

        public final val outdoorAirQuality: com.google.home.automation.Attribute<com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel?> /* compiled code */
            public final get

        public final val minMeasuredValue: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val maxMeasuredValue: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val tolerance: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.measuredValue: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.indoorMeasuredValue: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.outdoorMeasuredValue: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.indoorAirQuality: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.outdoorAirQuality: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.minMeasuredValue: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.maxMeasuredValue: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.tolerance: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.ExtendedAirQuality> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.ExtendedAirQuality.Attribute): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedAirQuality.Attribute> {
        @androidx.annotation.NonNull measuredValue,

        @androidx.annotation.NonNull indoorMeasuredValue,

        @androidx.annotation.NonNull outdoorMeasuredValue,

        @androidx.annotation.NonNull indoorAirQuality,

        @androidx.annotation.NonNull outdoorAirQuality,

        @androidx.annotation.NonNull minMeasuredValue,

        @androidx.annotation.NonNull maxMeasuredValue,

        @androidx.annotation.NonNull tolerance,

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

    public final class AirQualityEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.ExtendedAirQualityTrait.AirQuality) : com.google.home.Event, com.google.home.google.ExtendedAirQualityTrait.AirQuality {
        public companion object : com.google.home.EventFactory<com.google.home.google.ExtendedAirQuality.AirQualityEvent> {
            public final val priority: com.google.home.automation.EventField<kotlin.Int?> /* compiled code */
                public final get

            public final val triggeredDeviceId: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val levelValue: com.google.home.automation.EventField<com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel?> /* compiled code */
                public final get

            public final val location: com.google.home.automation.EventField<com.google.home.google.ExtendedAirQualityTrait.MeasurementLocation?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality.AirQualityEvent?>.priority: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality.AirQualityEvent?>.triggeredDeviceId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality.AirQualityEvent?>.levelValue: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality.AirQualityEvent?>.location: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedAirQualityTrait.MeasurementLocation?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.ExtendedAirQualityTrait.AirQuality /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val levelValue: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? /* compiled code */

        public open val location: com.google.home.google.ExtendedAirQualityTrait.MeasurementLocation? /* compiled code */

        public open val priority: kotlin.Int? /* compiled code */

        public open val triggeredDeviceId: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedAirQuality.AirQualityEvent.EventFields> {
            @androidx.annotation.NonNull priority,

            @androidx.annotation.NonNull triggeredDeviceId,

            @androidx.annotation.NonNull levelValue,

            @androidx.annotation.NonNull location;

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

    public final class AirQualitySensorErrorEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.ExtendedAirQualityTrait.AirQualitySensorError) : com.google.home.Event, com.google.home.google.ExtendedAirQualityTrait.AirQualitySensorError {
        public companion object : com.google.home.EventFactory<com.google.home.google.ExtendedAirQuality.AirQualitySensorErrorEvent> {
            public final val priority: com.google.home.automation.EventField<kotlin.Int?> /* compiled code */
                public final get

            public final val errorCode: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality.AirQualitySensorErrorEvent?>.priority: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedAirQuality.AirQualitySensorErrorEvent?>.errorCode: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.ExtendedAirQualityTrait.AirQualitySensorError /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val errorCode: kotlin.String? /* compiled code */

        public open val priority: kotlin.Int? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedAirQuality.AirQualitySensorErrorEvent.EventFields> {
            @androidx.annotation.NonNull priority,

            @androidx.annotation.NonNull errorCode;

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

