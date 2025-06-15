// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface GeneralDiagnosticsCommandsDefaultImpl : com.google.home.matter.standard.GeneralDiagnosticsCommands {
    public open suspend fun testEventTrigger(enableKey: kotlin.ByteArray, eventTrigger: kotlin.ULong): kotlin.Unit { /* compiled code */ }

    public open suspend fun timeSnapshot(): com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Response { /* compiled code */ }

    public open suspend fun payloadTestRequest(enableKey: kotlin.ByteArray, value: kotlin.UByte, count: kotlin.UShort): com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Response { /* compiled code */ }

    public open fun testEventTriggerBatchable(enableKey: kotlin.ByteArray, eventTrigger: kotlin.ULong): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun timeSnapshotBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Response> { /* compiled code */ }

    public open fun payloadTestRequestBatchable(enableKey: kotlin.ByteArray, value: kotlin.UByte, count: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Response> { /* compiled code */ }
}

