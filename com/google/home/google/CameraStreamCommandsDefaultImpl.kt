// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface CameraStreamCommandsDefaultImpl : com.google.home.google.CameraStreamCommands {
    public open suspend fun getCameraStream(streamToChromecast: kotlin.Boolean, supportedStreamProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>): com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Response { /* compiled code */ }

    public open suspend fun getCameraStreamPreviewImage(preferredWidth: kotlin.UInt, preferredHeight: kotlin.UInt): com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Response { /* compiled code */ }

    public open fun getCameraStreamBatchable(streamToChromecast: kotlin.Boolean, supportedStreamProtocols: kotlin.collections.List<com.google.home.google.CameraStreamTrait.CameraStreamProtocol>): com.google.home.BatchableCommand<com.google.home.google.CameraStreamTrait.GetCameraStreamCommand.Response> { /* compiled code */ }

    public open fun getCameraStreamPreviewImageBatchable(preferredWidth: kotlin.UInt, preferredHeight: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.google.CameraStreamTrait.GetCameraStreamPreviewImageCommand.Response> { /* compiled code */ }
}

