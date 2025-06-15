// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface RecordCommandsDefaultImpl : com.google.home.google.RecordCommands {
    public open suspend fun startRecording(): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopRecording(): kotlin.Unit { /* compiled code */ }

    public open suspend fun record(reason: com.google.home.google.RecordTrait.RecordingReason, durationSeconds: kotlin.UInt): com.google.home.google.RecordTrait.RecordCommand.Response { /* compiled code */ }

    public open fun startRecordingBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopRecordingBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun recordBatchable(reason: com.google.home.google.RecordTrait.RecordingReason, durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.google.RecordTrait.RecordCommand.Response> { /* compiled code */ }
}

