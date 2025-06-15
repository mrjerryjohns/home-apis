// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface CameraStream : com.google.home.google.CameraStreamTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.CameraStreamCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.CameraStream> {
        public final val cameraStreamSupportedProtocols: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>?> /* compiled code */
            public final get

        public final val cameraStreamNeedAuthToken: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val cameraStreamSupportsAudio: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val cameraStreamSupportsPreview: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val cameraStreamNeedDrmEncryption: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val isCurrentlyStreaming: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val activeStreamEvent: com.google.home.automation.Attribute<com.google.home.google.CameraStreamTrait.ActiveStreamEventType?> /* compiled code */
            public final get

        public final val streamUnavailableReason: com.google.home.automation.Attribute<com.google.home.google.CameraStreamTrait.StreamUnavailableReason?> /* compiled code */
            public final get

        public final val preferConfirmationForCameraStream: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.cameraStreamSupportedProtocols: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.cameraStreamNeedAuthToken: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.cameraStreamSupportsAudio: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.cameraStreamSupportsPreview: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.cameraStreamNeedDrmEncryption: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.isCurrentlyStreaming: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.activeStreamEvent: com.google.home.automation.TypedExpression<com.google.home.google.CameraStreamTrait.ActiveStreamEventType?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.streamUnavailableReason: com.google.home.automation.TypedExpression<com.google.home.google.CameraStreamTrait.StreamUnavailableReason?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.preferConfirmationForCameraStream: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun getCameraStream(streamToChromecast: kotlin.Boolean, supportedStreamProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>): com.google.home.automation.Command { /* compiled code */ }

        public final fun getCameraStreamPreviewImage(preferredWidth: kotlin.UInt, preferredHeight: kotlin.UInt): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.CameraStream> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.CameraStream.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.CameraStream.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CameraStream.Attribute> {
        @androidx.annotation.NonNull cameraStreamSupportedProtocols,

        @androidx.annotation.NonNull cameraStreamNeedAuthToken,

        @androidx.annotation.NonNull cameraStreamSupportsAudio,

        @androidx.annotation.NonNull cameraStreamSupportsPreview,

        @androidx.annotation.NonNull cameraStreamNeedDrmEncryption,

        @androidx.annotation.NonNull isCurrentlyStreaming,

        @androidx.annotation.NonNull activeStreamEvent,

        @androidx.annotation.NonNull streamUnavailableReason,

        @androidx.annotation.NonNull preferConfirmationForCameraStream,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.CameraStream.Command> {
        @androidx.annotation.NonNull GetCameraStream,

        @androidx.annotation.NonNull GetCameraStreamPreviewImage;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class CameraStreamUpdateEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.CameraStreamTrait.CameraStreamUpdate) : com.google.home.Event, com.google.home.google.CameraStreamTrait.CameraStreamUpdate {
        public companion object : com.google.home.EventFactory<com.google.home.google.CameraStream.CameraStreamUpdateEvent> {
            public final val priority: com.google.home.automation.EventField<kotlin.Long?> /* compiled code */
                public final get

            public final val cameraStreamAuthToken: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val cameraStreamProtocol: com.google.home.automation.EventField<com.google.home.google.CameraStreamTrait.CameraStreamProtocol?> /* compiled code */
                public final get

            public final val cameraStreamSignalingUrl: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val cameraStreamIceServers: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream.CameraStreamUpdateEvent?>.priority: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream.CameraStreamUpdateEvent?>.cameraStreamAuthToken: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream.CameraStreamUpdateEvent?>.cameraStreamProtocol: com.google.home.automation.TypedExpression<com.google.home.google.CameraStreamTrait.CameraStreamProtocol?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream.CameraStreamUpdateEvent?>.cameraStreamSignalingUrl: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStream.CameraStreamUpdateEvent?>.cameraStreamIceServers: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.CameraStreamTrait.CameraStreamUpdate /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val cameraStreamAuthToken: kotlin.String? /* compiled code */

        public open val cameraStreamIceServers: kotlin.String? /* compiled code */

        public open val cameraStreamPreviewImage: com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage? /* compiled code */

        public open val cameraStreamProtocol: com.google.home.google.CameraStreamTrait.CameraStreamProtocol? /* compiled code */

        public open val cameraStreamSignalingUrl: kotlin.String? /* compiled code */

        public open val priority: kotlin.Long? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CameraStream.CameraStreamUpdateEvent.EventFields> {
            @androidx.annotation.NonNull priority,

            @androidx.annotation.NonNull cameraStreamAuthToken,

            @androidx.annotation.NonNull cameraStreamProtocol,

            @androidx.annotation.NonNull cameraStreamPreviewImage,

            @androidx.annotation.NonNull cameraStreamSignalingUrl,

            @androidx.annotation.NonNull cameraStreamIceServers;

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
