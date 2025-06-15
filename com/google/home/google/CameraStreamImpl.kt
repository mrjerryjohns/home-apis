// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class CameraStreamImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.CameraStreamTrait.Attributes) : com.google.home.google.CameraStream, com.google.home.matter.MatterTraitImpl, com.google.home.google.CameraStreamTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.CameraStreamTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activeStreamEvent: com.google.home.google.CameraStreamTrait.ActiveStreamEventType? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val cameraStreamNeedAuthToken: kotlin.Boolean? /* compiled code */

    public open val cameraStreamNeedDrmEncryption: kotlin.Boolean? /* compiled code */

    public open val cameraStreamSupportedProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>? /* compiled code */

    public open val cameraStreamSupportsAudio: kotlin.Boolean? /* compiled code */

    public open val cameraStreamSupportsPreview: kotlin.Boolean? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val isCurrentlyStreaming: kotlin.Boolean? /* compiled code */

    public open val preferConfirmationForCameraStream: kotlin.Boolean? /* compiled code */

    public open val streamUnavailableReason: com.google.home.google.CameraStreamTrait.StreamUnavailableReason? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.CameraStream.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.CameraStream.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun getCameraStream(streamToChromecast: kotlin.Boolean, supportedStreamProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>): com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Response { /* compiled code */ }

    public open suspend fun getCameraStreamPreviewImage(preferredWidth: kotlin.UInt, preferredHeight: kotlin.UInt): com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Response { /* compiled code */ }

    public open fun getCameraStreamBatchable(streamToChromecast: kotlin.Boolean, supportedStreamProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>): com.google.home.BatchableCommand<com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Response> { /* compiled code */ }

    public open fun getCameraStreamPreviewImageBatchable(preferredWidth: kotlin.UInt, preferredHeight: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
