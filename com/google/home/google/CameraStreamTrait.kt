// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object CameraStreamTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class CameraStreamProtocol private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.CameraStreamTrait.CameraStreamProtocol> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Hls,

        @androidx.annotation.NonNull Dash,

        @androidx.annotation.NonNull SmoothStream,

        @androidx.annotation.NonNull ProgressiveMP4,

        @androidx.annotation.NonNull WebRTC,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.CameraStreamTrait.CameraStreamProtocol> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ActiveStreamEventType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.CameraStreamTrait.ActiveStreamEventType> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull GenericEvent,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.CameraStreamTrait.ActiveStreamEventType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StreamUnavailableReason private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.CameraStreamTrait.StreamUnavailableReason> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull CameraTurnedOff,

        @androidx.annotation.NonNull DeviceOffline,

        @androidx.annotation.NonNull DeviceTurnedOff,

        @androidx.annotation.NonNull DeviceBusy,

        @androidx.annotation.NonNull DeviceAtExtremeTemperature,

        @androidx.annotation.NonNull DeviceThermalShutdown,

        @androidx.annotation.NonNull LowBattery,

        @androidx.annotation.NonNull DeadBattery,

        @androidx.annotation.NonNull FaultyBattery,

        @androidx.annotation.NonNull DeviceNotMounted,

        @androidx.annotation.NonNull ChargerIssue,

        @androidx.annotation.NonNull DeviceCharging,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.CameraStreamTrait.StreamUnavailableReason> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface CameraStreamUpdate {
        public abstract val priority: kotlin.Long?

        public abstract val cameraStreamAuthToken: kotlin.String?

        public abstract val cameraStreamProtocol: com.google.home.google.CameraStreamTrait.CameraStreamProtocol?

        public abstract val cameraStreamPreviewImage: com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage?

        public abstract val cameraStreamSignalingUrl: kotlin.String?

        public abstract val cameraStreamIceServers: kotlin.String?
    }

    public final class CameraStreamUpdateImpl public constructor(priority: kotlin.Long? = COMPILED_CODE, cameraStreamAuthToken: kotlin.String? = COMPILED_CODE, cameraStreamProtocol: com.google.home.google.CameraStreamTrait.CameraStreamProtocol? = COMPILED_CODE, cameraStreamPreviewImage: com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage? = COMPILED_CODE, cameraStreamSignalingUrl: kotlin.String? = COMPILED_CODE, cameraStreamIceServers: kotlin.String? = COMPILED_CODE) : com.google.home.google.CameraStreamTrait.CameraStreamUpdate {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CameraStreamTrait.CameraStreamUpdate> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CameraStreamTrait.CameraStreamUpdate): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CameraStreamTrait.CameraStreamUpdate { /* compiled code */ }
        }

        public open val priority: kotlin.Long? /* compiled code */

        public open val cameraStreamAuthToken: kotlin.String? /* compiled code */

        public open val cameraStreamProtocol: com.google.home.google.CameraStreamTrait.CameraStreamProtocol? /* compiled code */

        public open val cameraStreamPreviewImage: com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage? /* compiled code */

        public open val cameraStreamSignalingUrl: kotlin.String? /* compiled code */

        public open val cameraStreamIceServers: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class CameraStreamPreviewImage public constructor(imageUrl: kotlin.String = COMPILED_CODE, width: kotlin.UInt = COMPILED_CODE, height: kotlin.UInt = COMPILED_CODE, timestampSeconds: kotlin.Long = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage?>.imageUrl: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage?>.width: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage?>.height: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage?>.timestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage { /* compiled code */ }
        }

        public final val imageUrl: kotlin.String /* compiled code */

        public final val width: kotlin.UInt /* compiled code */

        public final val height: kotlin.UInt /* compiled code */

        public final val timestampSeconds: kotlin.Long /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage.StructFields> {
            @androidx.annotation.NonNull imageUrl,

            @androidx.annotation.NonNull width,

            @androidx.annotation.NonNull height,

            @androidx.annotation.NonNull timestampSeconds;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CameraStreamTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CameraStreamTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CameraStreamTrait.Attributes { /* compiled code */ }
        }

        public abstract val cameraStreamSupportedProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>?

        public abstract val cameraStreamNeedAuthToken: kotlin.Boolean?

        public abstract val cameraStreamSupportsAudio: kotlin.Boolean?

        public abstract val cameraStreamSupportsPreview: kotlin.Boolean?

        public abstract val cameraStreamNeedDrmEncryption: kotlin.Boolean?

        public abstract val isCurrentlyStreaming: kotlin.Boolean?

        public abstract val activeStreamEvent: com.google.home.google.CameraStreamTrait.ActiveStreamEventType?

        public abstract val streamUnavailableReason: com.google.home.google.CameraStreamTrait.StreamUnavailableReason?

        public abstract val preferConfirmationForCameraStream: kotlin.Boolean?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(cameraStreamSupportedProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>? = COMPILED_CODE, cameraStreamNeedAuthToken: kotlin.Boolean? = COMPILED_CODE, cameraStreamSupportsAudio: kotlin.Boolean? = COMPILED_CODE, cameraStreamSupportsPreview: kotlin.Boolean? = COMPILED_CODE, cameraStreamNeedDrmEncryption: kotlin.Boolean? = COMPILED_CODE, isCurrentlyStreaming: kotlin.Boolean? = COMPILED_CODE, activeStreamEvent: com.google.home.google.CameraStreamTrait.ActiveStreamEventType? = COMPILED_CODE, streamUnavailableReason: com.google.home.google.CameraStreamTrait.StreamUnavailableReason? = COMPILED_CODE, preferConfirmationForCameraStream: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.CameraStreamTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.CameraStreamTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.CameraStreamTrait.Attributes) { /* compiled code */ }

        public open val cameraStreamSupportedProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>? /* compiled code */

        public open val cameraStreamNeedAuthToken: kotlin.Boolean? /* compiled code */

        public open val cameraStreamSupportsAudio: kotlin.Boolean? /* compiled code */

        public open val cameraStreamSupportsPreview: kotlin.Boolean? /* compiled code */

        public open val cameraStreamNeedDrmEncryption: kotlin.Boolean? /* compiled code */

        public open val isCurrentlyStreaming: kotlin.Boolean? /* compiled code */

        public open val activeStreamEvent: com.google.home.google.CameraStreamTrait.ActiveStreamEventType? /* compiled code */

        public open val streamUnavailableReason: com.google.home.google.CameraStreamTrait.StreamUnavailableReason? /* compiled code */

        public open val preferConfirmationForCameraStream: kotlin.Boolean? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(cameraStreamSupportedProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>? = COMPILED_CODE, cameraStreamNeedAuthToken: kotlin.Boolean? = COMPILED_CODE, cameraStreamSupportsAudio: kotlin.Boolean? = COMPILED_CODE, cameraStreamSupportsPreview: kotlin.Boolean? = COMPILED_CODE, cameraStreamNeedDrmEncryption: kotlin.Boolean? = COMPILED_CODE, isCurrentlyStreaming: kotlin.Boolean? = COMPILED_CODE, activeStreamEvent: com.google.home.google.CameraStreamTrait.ActiveStreamEventType? = COMPILED_CODE, streamUnavailableReason: com.google.home.google.CameraStreamTrait.StreamUnavailableReason? = COMPILED_CODE, preferConfirmationForCameraStream: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.CameraStreamTrait.AttributesImpl { /* compiled code */ }
    }

    public object GetCameraStreamCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(streamToChromecast: kotlin.Boolean = COMPILED_CODE, supportedStreamProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Request { /* compiled code */ }
            }

            public final val streamToChromecast: kotlin.Boolean /* compiled code */

            public final val supportedStreamProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Request.CommandFields> {
                @androidx.annotation.NonNull streamToChromecast,

                @androidx.annotation.NonNull supportedStreamProtocols;

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

        public final class Response public constructor(cameraStreamAuthToken: kotlin.String? = COMPILED_CODE, cameraStreamProtocol: com.google.home.google.CameraStreamTrait.CameraStreamProtocol = COMPILED_CODE, cameraStreamPreviewImage: com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage? = COMPILED_CODE, cameraStreamAccessUrl: kotlin.String? = COMPILED_CODE, cameraStreamReceiverAppId: kotlin.String? = COMPILED_CODE, cameraStreamSignalingUrl: kotlin.String? = COMPILED_CODE, cameraStreamOffer: kotlin.String? = COMPILED_CODE, cameraStreamIceServers: kotlin.String? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Response { /* compiled code */ }
            }

            public final val cameraStreamAuthToken: kotlin.String? /* compiled code */

            public final val cameraStreamProtocol: com.google.home.google.CameraStreamTrait.CameraStreamProtocol /* compiled code */

            public final val cameraStreamPreviewImage: com.google.home.google.CameraStreamTrait.CameraStreamPreviewImage? /* compiled code */

            public final val cameraStreamAccessUrl: kotlin.String? /* compiled code */

            public final val cameraStreamReceiverAppId: kotlin.String? /* compiled code */

            public final val cameraStreamSignalingUrl: kotlin.String? /* compiled code */

            public final val cameraStreamOffer: kotlin.String? /* compiled code */

            public final val cameraStreamIceServers: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Response.CommandFields> {
                @androidx.annotation.NonNull cameraStreamAuthToken,

                @androidx.annotation.NonNull cameraStreamProtocol,

                @androidx.annotation.NonNull cameraStreamPreviewImage,

                @androidx.annotation.NonNull cameraStreamAccessUrl,

                @androidx.annotation.NonNull cameraStreamReceiverAppId,

                @androidx.annotation.NonNull cameraStreamSignalingUrl,

                @androidx.annotation.NonNull cameraStreamOffer,

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

    public object GetCameraStreamPreviewImageCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(preferredWidth: kotlin.UInt = COMPILED_CODE, preferredHeight: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Request { /* compiled code */ }
            }

            public final val preferredWidth: kotlin.UInt /* compiled code */

            public final val preferredHeight: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Request.CommandFields> {
                @androidx.annotation.NonNull preferredWidth,

                @androidx.annotation.NonNull preferredHeight;

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

        public final class Response public constructor(imageUrl: kotlin.String = COMPILED_CODE, width: kotlin.UInt = COMPILED_CODE, height: kotlin.UInt = COMPILED_CODE, timestampSeconds: kotlin.Long = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Response { /* compiled code */ }
            }

            public final val imageUrl: kotlin.String /* compiled code */

            public final val width: kotlin.UInt /* compiled code */

            public final val height: kotlin.UInt /* compiled code */

            public final val timestampSeconds: kotlin.Long /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Response.CommandFields> {
                @androidx.annotation.NonNull imageUrl,

                @androidx.annotation.NonNull width,

                @androidx.annotation.NonNull height,

                @androidx.annotation.NonNull timestampSeconds;

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
}

