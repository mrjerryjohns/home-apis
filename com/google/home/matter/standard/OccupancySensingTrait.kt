// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object OccupancySensingTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class OccupancySensorTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeEnum> {
        @androidx.annotation.NonNull Pir,

        @androidx.annotation.NonNull Ultrasonic,

        @androidx.annotation.NonNull PirAndUltrasonic,

        @androidx.annotation.NonNull PhysicalContact,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(other: kotlin.Boolean = COMPILED_CODE, passiveInfrared: kotlin.Boolean = COMPILED_CODE, ultrasonic: kotlin.Boolean = COMPILED_CODE, physicalContact: kotlin.Boolean = COMPILED_CODE, activeInfrared: kotlin.Boolean = COMPILED_CODE, radar: kotlin.Boolean = COMPILED_CODE, rfSensing: kotlin.Boolean = COMPILED_CODE, vision: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.OccupancySensingTrait.Feature> {
            private const final val OTHER_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PASSIVE_INFRARED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ULTRASONIC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PHYSICAL_CONTACT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ACTIVE_INFRARED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RADAR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RF_SENSING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val VISION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.OccupancySensingTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.OccupancySensingTrait.Feature { /* compiled code */ }
        }

        public final val other: kotlin.Boolean /* compiled code */

        public final val passiveInfrared: kotlin.Boolean /* compiled code */

        public final val ultrasonic: kotlin.Boolean /* compiled code */

        public final val physicalContact: kotlin.Boolean /* compiled code */

        public final val activeInfrared: kotlin.Boolean /* compiled code */

        public final val radar: kotlin.Boolean /* compiled code */

        public final val rfSensing: kotlin.Boolean /* compiled code */

        public final val vision: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component8(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(other: kotlin.Boolean = COMPILED_CODE, passiveInfrared: kotlin.Boolean = COMPILED_CODE, ultrasonic: kotlin.Boolean = COMPILED_CODE, physicalContact: kotlin.Boolean = COMPILED_CODE, activeInfrared: kotlin.Boolean = COMPILED_CODE, radar: kotlin.Boolean = COMPILED_CODE, rfSensing: kotlin.Boolean = COMPILED_CODE, vision: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.OccupancySensingTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class OccupancyBitmap public constructor(occupied: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap> {
            private const final val OCCUPIED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap { /* compiled code */ }
        }

        public final val occupied: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(occupied: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class OccupancySensorTypeBitmap public constructor(pir: kotlin.Boolean = COMPILED_CODE, ultrasonic: kotlin.Boolean = COMPILED_CODE, physicalContact: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap> {
            private const final val PIR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ULTRASONIC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PHYSICAL_CONTACT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap { /* compiled code */ }
        }

        public final val pir: kotlin.Boolean /* compiled code */

        public final val ultrasonic: kotlin.Boolean /* compiled code */

        public final val physicalContact: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(pir: kotlin.Boolean = COMPILED_CODE, ultrasonic: kotlin.Boolean = COMPILED_CODE, physicalContact: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface OccupancyChanged {
        public abstract val occupancy: com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap?
    }

    public final class OccupancyChangedImpl public constructor(occupancy: com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap? = COMPILED_CODE) : com.google.home.matter.standard.OccupancySensingTrait.OccupancyChanged {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OccupancySensingTrait.OccupancyChanged> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OccupancySensingTrait.OccupancyChanged): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OccupancySensingTrait.OccupancyChanged { /* compiled code */ }
        }

        public open val occupancy: com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class HoldTimeLimitsStruct public constructor(holdTimeMin: kotlin.UShort = COMPILED_CODE, holdTimeMax: kotlin.UShort = COMPILED_CODE, holdTimeDefault: kotlin.UShort = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct?>.holdTimeMin: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct?>.holdTimeMax: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct?>.holdTimeDefault: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct { /* compiled code */ }
        }

        public final val holdTimeMin: kotlin.UShort /* compiled code */

        public final val holdTimeMax: kotlin.UShort /* compiled code */

        public final val holdTimeDefault: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct.StructFields> {
            @androidx.annotation.NonNull holdTimeMin,

            @androidx.annotation.NonNull holdTimeMax,

            @androidx.annotation.NonNull holdTimeDefault;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OccupancySensingTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OccupancySensingTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OccupancySensingTrait.Attributes { /* compiled code */ }
        }

        public abstract val occupancy: com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap?

        public abstract val occupancySensorType: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeEnum?

        public abstract val occupancySensorTypeBitmap: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap?

        public abstract val holdTime: kotlin.UShort?

        public abstract val holdTimeLimits: com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct?

        public abstract val pirOccupiedToUnoccupiedDelay: kotlin.UShort?

        public abstract val pirUnoccupiedToOccupiedDelay: kotlin.UShort?

        public abstract val pirUnoccupiedToOccupiedThreshold: kotlin.UByte?

        public abstract val ultrasonicOccupiedToUnoccupiedDelay: kotlin.UShort?

        public abstract val ultrasonicUnoccupiedToOccupiedDelay: kotlin.UShort?

        public abstract val ultrasonicUnoccupiedToOccupiedThreshold: kotlin.UByte?

        public abstract val physicalContactOccupiedToUnoccupiedDelay: kotlin.UShort?

        public abstract val physicalContactUnoccupiedToOccupiedDelay: kotlin.UShort?

        public abstract val physicalContactUnoccupiedToOccupiedThreshold: kotlin.UByte?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.OccupancySensingTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(occupancy: com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap? = COMPILED_CODE, occupancySensorType: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeEnum? = COMPILED_CODE, occupancySensorTypeBitmap: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap? = COMPILED_CODE, holdTime: kotlin.UShort? = COMPILED_CODE, holdTimeLimits: com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct? = COMPILED_CODE, pirOccupiedToUnoccupiedDelay: kotlin.UShort? = COMPILED_CODE, pirUnoccupiedToOccupiedDelay: kotlin.UShort? = COMPILED_CODE, pirUnoccupiedToOccupiedThreshold: kotlin.UByte? = COMPILED_CODE, ultrasonicOccupiedToUnoccupiedDelay: kotlin.UShort? =
        COMPILED_CODE, ultrasonicUnoccupiedToOccupiedDelay: kotlin.UShort? = COMPILED_CODE, ultrasonicUnoccupiedToOccupiedThreshold: kotlin.UByte? = COMPILED_CODE, physicalContactOccupiedToUnoccupiedDelay: kotlin.UShort? = COMPILED_CODE, physicalContactUnoccupiedToOccupiedDelay: kotlin.UShort? = COMPILED_CODE, physicalContactUnoccupiedToOccupiedThreshold: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.OccupancySensingTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) :
        com.google.home.matter.standard.OccupancySensingTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.OccupancySensingTrait.Attributes, com.google.home.matter.standard.OccupancySensingTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.OccupancySensingTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.OccupancySensingTrait.Attributes) { /* compiled code */ }

        public open val occupancy: com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap? /* compiled code */

        public open val occupancySensorType: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeEnum? /* compiled code */

        public open val occupancySensorTypeBitmap: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap? /* compiled code */

        public open val holdTime: kotlin.UShort? /* compiled code */

        public open val holdTimeLimits: com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct? /* compiled code */

        public open val pirOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */

        public open val pirUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */

        public open val pirUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */

        public open val ultrasonicOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */

        public open val ultrasonicUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */

        public open val ultrasonicUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */

        public open val physicalContactOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */

        public open val physicalContactUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */

        public open val physicalContactUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.OccupancySensingTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.OccupancySensingTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.OccupancySensingTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(occupancy: com.google.home.matter.standard.OccupancySensingTrait.OccupancyBitmap? = COMPILED_CODE, occupancySensorType: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeEnum? = COMPILED_CODE, occupancySensorTypeBitmap: com.google.home.matter.standard.OccupancySensingTrait.OccupancySensorTypeBitmap? = COMPILED_CODE, holdTime: kotlin.UShort? = COMPILED_CODE, holdTimeLimits: com.google.home.matter.standard.OccupancySensingTrait.HoldTimeLimitsStruct? = COMPILED_CODE, pirOccupiedToUnoccupiedDelay: kotlin.UShort? = COMPILED_CODE, pirUnoccupiedToOccupiedDelay: kotlin.UShort? = COMPILED_CODE, pirUnoccupiedToOccupiedThreshold: kotlin.UByte? = COMPILED_CODE, ultrasonicOccupiedToUnoccupiedDelay: kotlin.UShort? = COMPILED_CODE,
            ultrasonicUnoccupiedToOccupiedDelay: kotlin.UShort? = COMPILED_CODE, ultrasonicUnoccupiedToOccupiedThreshold: kotlin.UByte? = COMPILED_CODE, physicalContactOccupiedToUnoccupiedDelay: kotlin.UShort? = COMPILED_CODE, physicalContactUnoccupiedToOccupiedDelay: kotlin.UShort? = COMPILED_CODE, physicalContactUnoccupiedToOccupiedThreshold: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.OccupancySensingTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE):
            com.google.home.matter.standard.OccupancySensingTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.OccupancySensingTrait.Attributes) : com.google.home.matter.standard.OccupancySensingTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OccupancySensingTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OccupancySensingTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OccupancySensingTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _holdTime: kotlin.UShort? /* compiled code */

        public open val holdTime: kotlin.UShort? /* compiled code */
            public open get

        internal final var _pirOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */

        public open val pirOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */
            public open get

        internal final var _pirUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */

        public open val pirUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */
            public open get

        internal final var _pirUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */

        public open val pirUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */
            public open get

        internal final var _ultrasonicOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */

        public open val ultrasonicOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */
            public open get

        internal final var _ultrasonicUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */

        public open val ultrasonicUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */
            public open get

        internal final var _ultrasonicUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */

        public open val ultrasonicUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */
            public open get

        internal final var _physicalContactOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */

        public open val physicalContactOccupiedToUnoccupiedDelay: kotlin.UShort? /* compiled code */
            public open get

        internal final var _physicalContactUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */

        public open val physicalContactUnoccupiedToOccupiedDelay: kotlin.UShort? /* compiled code */
            public open get

        internal final var _physicalContactUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */

        public open val physicalContactUnoccupiedToOccupiedThreshold: kotlin.UByte? /* compiled code */
            public open get

        public final fun setHoldTime(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setPirOccupiedToUnoccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setPirUnoccupiedToOccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setPirUnoccupiedToOccupiedThreshold(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setUltrasonicOccupiedToUnoccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setUltrasonicUnoccupiedToOccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setUltrasonicUnoccupiedToOccupiedThreshold(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setPhysicalContactOccupiedToUnoccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setPhysicalContactUnoccupiedToOccupiedDelay(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setPhysicalContactUnoccupiedToOccupiedThreshold(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}
