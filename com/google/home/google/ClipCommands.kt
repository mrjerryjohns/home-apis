// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ClipCommands {
    public abstract suspend fun saveScreenshot(): com.google.home.google.ClipTrait.SaveScreenshotCommand.Response

    public abstract suspend fun saveVideoClip(durationSeconds: kotlin.ULong): com.google.home.google.ClipTrait.SaveVideoClipCommand.Response

    public abstract fun saveScreenshotBatchable(): com.google.home.BatchableCommand<com.google.home.google.ClipTrait.SaveScreenshotCommand.Response>

    public abstract fun saveVideoClipBatchable(durationSeconds: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.google.ClipTrait.SaveVideoClipCommand.Response>
}
