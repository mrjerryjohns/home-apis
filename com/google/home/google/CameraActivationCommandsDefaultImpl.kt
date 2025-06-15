// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface CameraActivationCommandsDefaultImpl : com.google.home.google.CameraActivationCommands {
    public open suspend fun process(request: kotlin.ByteArray): com.google.home.google.CameraActivationTrait.ProcessCommand.Response { /* compiled code */ }

    public open suspend fun convertMatterTlvToX509(matterTlvBytes: kotlin.ByteArray): com.google.home.google.CameraActivationTrait.ConvertMatterTlvToX509Command.Response { /* compiled code */ }

    public open fun processBatchable(request: kotlin.ByteArray): com.google.home.BatchableCommand<com.google.home.google.CameraActivationTrait.ProcessCommand.Response> { /* compiled code */ }

    public open fun convertMatterTlvToX509Batchable(matterTlvBytes: kotlin.ByteArray): com.google.home.BatchableCommand<com.google.home.google.CameraActivationTrait.ConvertMatterTlvToX509Command.Response> { /* compiled code */ }
}
