// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ObjectDetectionTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ObjectType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ObjectDetectionTrait.ObjectType> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull FaceFamiliar,

        @androidx.annotation.NonNull FaceUnfamiliar,

        @androidx.annotation.NonNull Person,

        @androidx.annotation.NonNull PackageDelivered,

        @androidx.annotation.NonNull Animal,

        @androidx.annotation.NonNull Vehicle,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ObjectDetectionTrait.ObjectType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class ObjectDetectionFeature public constructor(faceDetection: kotlin.Boolean = COMPILED_CODE, personDetection: kotlin.Boolean = COMPILED_CODE, packageDetection: kotlin.Boolean = COMPILED_CODE, animalDetection: kotlin.Boolean = COMPILED_CODE, vehicleDetection: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.ObjectDetectionTrait.ObjectDetectionFeature> {
            private const final val FACE_DETECTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PERSON_DETECTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PACKAGE_DETECTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ANIMAL_DETECTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val VEHICLE_DETECTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.ObjectDetectionTrait.ObjectDetectionFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.ObjectDetectionTrait.ObjectDetectionFeature { /* compiled code */ }
        }

        public final val faceDetection: kotlin.Boolean /* compiled code */

        public final val personDetection: kotlin.Boolean /* compiled code */

        public final val packageDetection: kotlin.Boolean /* compiled code */

        public final val animalDetection: kotlin.Boolean /* compiled code */

        public final val vehicleDetection: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(faceDetection: kotlin.Boolean = COMPILED_CODE, personDetection: kotlin.Boolean = COMPILED_CODE, packageDetection: kotlin.Boolean = COMPILED_CODE, animalDetection: kotlin.Boolean = COMPILED_CODE, vehicleDetection: kotlin.Boolean = COMPILED_CODE): com.google.home.google.ObjectDetectionTrait.ObjectDetectionFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface ObjectDetected {
        public abstract val priority: kotlin.Int?

        public abstract val detectionTimestampMillis: kotlin.Long?

        public abstract val objects: com.google.home.google.ObjectDetectionTrait.Objects?
    }

    public final class ObjectDetectedImpl public constructor(priority: kotlin.Int? = COMPILED_CODE, detectionTimestampMillis: kotlin.Long? = COMPILED_CODE, objects: com.google.home.google.ObjectDetectionTrait.Objects? = COMPILED_CODE) : com.google.home.google.ObjectDetectionTrait.ObjectDetected {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ObjectDetectionTrait.ObjectDetected> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ObjectDetectionTrait.ObjectDetected): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ObjectDetectionTrait.ObjectDetected { /* compiled code */ }
        }

        public open val priority: kotlin.Int? /* compiled code */

        public open val detectionTimestampMillis: kotlin.Long? /* compiled code */

        public open val objects: com.google.home.google.ObjectDetectionTrait.Objects? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class Object public constructor(type: com.google.home.google.ObjectDetectionTrait.ObjectType = COMPILED_CODE, startTimestampMillis: kotlin.Long = COMPILED_CODE, endTimestampMillis: kotlin.Long = COMPILED_CODE, name: kotlin.String = COMPILED_CODE, imageUrl: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ObjectDetectionTrait.Object>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ObjectDetectionTrait.Object?>.type: com.google.home.automation.TypedExpression<com.google.home.google.ObjectDetectionTrait.ObjectType> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ObjectDetectionTrait.Object?>.startTimestampMillis: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ObjectDetectionTrait.Object?>.endTimestampMillis: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ObjectDetectionTrait.Object?>.name: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ObjectDetectionTrait.Object?>.imageUrl: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ObjectDetectionTrait.Object): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ObjectDetectionTrait.Object { /* compiled code */ }
        }

        public final val type: com.google.home.google.ObjectDetectionTrait.ObjectType /* compiled code */

        public final val startTimestampMillis: kotlin.Long /* compiled code */

        public final val endTimestampMillis: kotlin.Long /* compiled code */

        public final val name: kotlin.String /* compiled code */

        public final val imageUrl: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ObjectDetectionTrait.Object.StructFields> {
            @androidx.annotation.NonNull type,

            @androidx.annotation.NonNull startTimestampMillis,

            @androidx.annotation.NonNull endTimestampMillis,

            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull imageUrl;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class Objects public constructor(unfamiliar: kotlin.Int = COMPILED_CODE, named: kotlin.collections.List<kotlin.String> = COMPILED_CODE, unclassified: kotlin.Int = COMPILED_CODE, familiar: kotlin.Int = COMPILED_CODE, objects: kotlin.collections.List<com.google.home.google.ObjectDetectionTrait.Object> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ObjectDetectionTrait.Objects>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ObjectDetectionTrait.Objects?>.unfamiliar: com.google.home.automation.TypedExpression<kotlin.Int> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ObjectDetectionTrait.Objects?>.named: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ObjectDetectionTrait.Objects?>.unclassified: com.google.home.automation.TypedExpression<kotlin.Int> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ObjectDetectionTrait.Objects?>.familiar: com.google.home.automation.TypedExpression<kotlin.Int> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ObjectDetectionTrait.Objects?>.objects: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.ObjectDetectionTrait.Object>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ObjectDetectionTrait.Objects): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ObjectDetectionTrait.Objects { /* compiled code */ }
        }

        public final val unfamiliar: kotlin.Int /* compiled code */

        public final val named: kotlin.collections.List<kotlin.String> /* compiled code */

        public final val unclassified: kotlin.Int /* compiled code */

        public final val familiar: kotlin.Int /* compiled code */

        public final val objects: kotlin.collections.List<com.google.home.google.ObjectDetectionTrait.Object> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ObjectDetectionTrait.Objects.StructFields> {
            @androidx.annotation.NonNull unfamiliar,

            @androidx.annotation.NonNull named,

            @androidx.annotation.NonNull unclassified,

            @androidx.annotation.NonNull familiar,

            @androidx.annotation.NonNull objects;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ObjectDetectionTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ObjectDetectionTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ObjectDetectionTrait.Attributes { /* compiled code */ }
        }

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.google.ObjectDetectionTrait.ObjectDetectionFeature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.ObjectDetectionTrait.ObjectDetectionFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ObjectDetectionTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ObjectDetectionTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ObjectDetectionTrait.Attributes) { /* compiled code */ }

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.google.ObjectDetectionTrait.ObjectDetectionFeature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.ObjectDetectionTrait.ObjectDetectionFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ObjectDetectionTrait.AttributesImpl { /* compiled code */ }
    }
}

