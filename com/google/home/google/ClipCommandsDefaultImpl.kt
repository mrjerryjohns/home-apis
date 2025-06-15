// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ClipCommandsDefaultImpl : com.google.home.google.ClipCommands {
    public open suspend fun saveScreenshot(): com.google.home.google.ClipTrait.SaveScreenshotCommand.Response { /* compiled code */ }

    public open suspend fun saveVideoClip(durationSeconds: kotlin.ULong): com.google.home.google.ClipTrait.SaveVideoClipCommand.Response { /* compiled code */ }

    public open fun saveScreenshotBatchable(): com.google.home.BatchableCommand<com.google.home.google.ClipTrait.SaveScreenshotCommand.Response> { /* compiled code */ }

    public open fun saveVideoClipBatchable(durationSeconds: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.google.ClipTrait.SaveVideoClipCommand.Response> { /* compiled code */ }
}

