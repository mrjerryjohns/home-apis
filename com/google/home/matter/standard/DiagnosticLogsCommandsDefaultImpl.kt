// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface DiagnosticLogsCommandsDefaultImpl : com.google.home.matter.standard.DiagnosticLogsCommands {
    public open suspend fun retrieveLogsRequest(intent: com.google.home.matter.standard.DiagnosticLogsTrait.IntentEnum, requestedProtocol: com.google.home.matter.standard.DiagnosticLogsTrait.TransferProtocolEnum, optionalArgs: com.google.home.matter.standard.DiagnosticLogsTrait.RetrieveLogsRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.DiagnosticLogsTrait.RetrieveLogsRequestCommand.Response { /* compiled code */ }

    public open fun retrieveLogsRequestBatchable(intent: com.google.home.matter.standard.DiagnosticLogsTrait.IntentEnum, requestedProtocol: com.google.home.matter.standard.DiagnosticLogsTrait.TransferProtocolEnum, optionalArgs: com.google.home.matter.standard.DiagnosticLogsTrait.RetrieveLogsRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.DiagnosticLogsTrait.RetrieveLogsRequestCommand.Response> { /* compiled code */ }
}
