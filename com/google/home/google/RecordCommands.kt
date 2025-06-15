// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface RecordCommands {
    public abstract suspend fun startRecording(): kotlin.Unit

    public abstract suspend fun stopRecording(): kotlin.Unit

    public abstract suspend fun record(reason: com.google.home.google.RecordTrait.RecordingReason, durationSeconds: kotlin.UInt): com.google.home.google.RecordTrait.RecordCommand.Response

    public abstract fun startRecordingBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stopRecordingBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun recordBatchable(reason: com.google.home.google.RecordTrait.RecordingReason, durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.google.RecordTrait.RecordCommand.Response>
}
