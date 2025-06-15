// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface CameraActivationCommands {
    public abstract suspend fun process(request: kotlin.ByteArray): com.google.home.google.CameraActivationTrait.ProcessCommand.Response

    public abstract suspend fun convertMatterTlvToX509(matterTlvBytes: kotlin.ByteArray): com.google.home.google.CameraActivationTrait.ConvertMatterTlvToX509Command.Response

    public abstract fun processBatchable(request: kotlin.ByteArray): com.google.home.BatchableCommand<com.google.home.google.CameraActivationTrait.ProcessCommand.Response>

    public abstract fun convertMatterTlvToX509Batchable(matterTlvBytes: kotlin.ByteArray): com.google.home.BatchableCommand<com.google.home.google.CameraActivationTrait.ConvertMatterTlvToX509Command.Response>
}
