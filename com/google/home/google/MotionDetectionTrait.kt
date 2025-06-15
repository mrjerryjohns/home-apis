// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object MotionDetectionTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class MotionDetectionFeature public constructor(supportsMotionDetectionTimestampSeconds: kotlin.Boolean = COMPILED_CODE, supportsMotionDetectionEventInProgress: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.MotionDetectionTrait.MotionDetectionFeature> {
            private const final val SUPPORTS_MOTION_DETECTION_TIMESTAMP_SECONDS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_MOTION_DETECTION_EVENT_IN_PROGRESS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.MotionDetectionTrait.MotionDetectionFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.MotionDetectionTrait.MotionDetectionFeature { /* compiled code */ }
        }

        public final val supportsMotionDetectionTimestampSeconds: kotlin.Boolean /* compiled code */

        public final val supportsMotionDetectionEventInProgress: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(supportsMotionDetectionTimestampSeconds: kotlin.Boolean = COMPILED_CODE, supportsMotionDetectionEventInProgress: kotlin.Boolean = COMPILED_CODE): com.google.home.google.MotionDetectionTrait.MotionDetectionFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface MotionDetected {
        public abstract val priority: kotlin.UInt?

        public abstract val motionDetectionTimestampSeconds: kotlin.Long?

        public abstract val motionDetectionStartTimestampMillis: kotlin.Long?

        public abstract val motionDetectionEndTimestampMillis: kotlin.Long?
    }

    public final class MotionDetectedImpl public constructor(priority: kotlin.UInt? = COMPILED_CODE, motionDetectionTimestampSeconds: kotlin.Long? = COMPILED_CODE, motionDetectionStartTimestampMillis: kotlin.Long? = COMPILED_CODE, motionDetectionEndTimestampMillis: kotlin.Long? = COMPILED_CODE) : com.google.home.google.MotionDetectionTrait.MotionDetected {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.MotionDetectionTrait.MotionDetected> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.MotionDetectionTrait.MotionDetected): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.MotionDetectionTrait.MotionDetected { /* compiled code */ }
        }

        public open val priority: kotlin.UInt? /* compiled code */

        public open val motionDetectionTimestampSeconds: kotlin.Long? /* compiled code */

        public open val motionDetectionStartTimestampMillis: kotlin.Long? /* compiled code */

        public open val motionDetectionEndTimestampMillis: kotlin.Long? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.MotionDetectionTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.MotionDetectionTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.MotionDetectionTrait.Attributes { /* compiled code */ }
        }

        public abstract val motionDetectionTimestampSeconds: kotlin.Long?

        public abstract val motionDetectionEventInProgress: kotlin.Boolean?

        public abstract val lastMotionDetectionEventStartTimestampSeconds: kotlin.Long?

        public abstract val lastMotionDetectionEventEndTimestampSeconds: kotlin.Long?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.google.MotionDetectionTrait.MotionDetectionFeature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(motionDetectionTimestampSeconds: kotlin.Long? = COMPILED_CODE, motionDetectionEventInProgress: kotlin.Boolean? = COMPILED_CODE, lastMotionDetectionEventStartTimestampSeconds: kotlin.Long? = COMPILED_CODE, lastMotionDetectionEventEndTimestampSeconds: kotlin.Long? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.MotionDetectionTrait.MotionDetectionFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.MotionDetectionTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.MotionDetectionTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.MotionDetectionTrait.Attributes) { /* compiled code */ }

        public open val motionDetectionTimestampSeconds: kotlin.Long? /* compiled code */

        public open val motionDetectionEventInProgress: kotlin.Boolean? /* compiled code */

        public open val lastMotionDetectionEventStartTimestampSeconds: kotlin.Long? /* compiled code */

        public open val lastMotionDetectionEventEndTimestampSeconds: kotlin.Long? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.google.MotionDetectionTrait.MotionDetectionFeature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(motionDetectionTimestampSeconds: kotlin.Long? = COMPILED_CODE, motionDetectionEventInProgress: kotlin.Boolean? = COMPILED_CODE, lastMotionDetectionEventStartTimestampSeconds: kotlin.Long? = COMPILED_CODE, lastMotionDetectionEventEndTimestampSeconds: kotlin.Long? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.MotionDetectionTrait.MotionDetectionFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.MotionDetectionTrait.AttributesImpl { /* compiled code */ }
    }
}

