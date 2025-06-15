// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object CommunicationVideoCallTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class CommunicationVideoCallState private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallState> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull InCall,

        @androidx.annotation.NonNull OnHold,

        @androidx.annotation.NonNull Inactive,

        @androidx.annotation.NonNull CallIncoming,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallState> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class CommunicationVideoCallFeature public constructor(pickup: kotlin.Boolean = COMPILED_CODE, hangup: kotlin.Boolean = COMPILED_CODE, reject: kotlin.Boolean = COMPILED_CODE, muteMic: kotlin.Boolean = COMPILED_CODE, turnOffCamera: kotlin.Boolean = COMPILED_CODE, swapPicture: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallFeature> {
            private const final val PICKUP_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val HANGUP_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val REJECT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MUTE_MIC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TURN_OFF_CAMERA_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SWAP_PICTURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallFeature { /* compiled code */ }
        }

        public final val pickup: kotlin.Boolean /* compiled code */

        public final val hangup: kotlin.Boolean /* compiled code */

        public final val reject: kotlin.Boolean /* compiled code */

        public final val muteMic: kotlin.Boolean /* compiled code */

        public final val turnOffCamera: kotlin.Boolean /* compiled code */

        public final val swapPicture: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(pickup: kotlin.Boolean = COMPILED_CODE, hangup: kotlin.Boolean = COMPILED_CODE, reject: kotlin.Boolean = COMPILED_CODE, muteMic: kotlin.Boolean = COMPILED_CODE, turnOffCamera: kotlin.Boolean = COMPILED_CODE, swapPicture: kotlin.Boolean = COMPILED_CODE): com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CommunicationVideoCallTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CommunicationVideoCallTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CommunicationVideoCallTrait.Attributes { /* compiled code */ }
        }

        public abstract val communicationVideoCallState: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallState?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallFeature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(communicationVideoCallState: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallState? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.CommunicationVideoCallTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.CommunicationVideoCallTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.CommunicationVideoCallTrait.Attributes) { /* compiled code */ }

        public open val communicationVideoCallState: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallState? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallFeature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(communicationVideoCallState: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallState? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.CommunicationVideoCallTrait.AttributesImpl { /* compiled code */ }
    }
}
