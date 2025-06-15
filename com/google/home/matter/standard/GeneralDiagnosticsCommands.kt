// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface GeneralDiagnosticsCommands {
    public abstract suspend fun testEventTrigger(enableKey: kotlin.ByteArray, eventTrigger: kotlin.ULong): kotlin.Unit

    public abstract suspend fun timeSnapshot(): com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Response

    public abstract suspend fun payloadTestRequest(enableKey: kotlin.ByteArray, value: kotlin.UByte, count: kotlin.UShort): com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Response

    public abstract fun testEventTriggerBatchable(enableKey: kotlin.ByteArray, eventTrigger: kotlin.ULong): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun timeSnapshotBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Response>

    public abstract fun payloadTestRequestBatchable(enableKey: kotlin.ByteArray, value: kotlin.UByte, count: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Response>
}
