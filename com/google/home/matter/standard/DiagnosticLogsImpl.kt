// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class DiagnosticLogsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.DiagnosticLogsTrait.Attributes) : com.google.home.matter.standard.DiagnosticLogs, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.DiagnosticLogsTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.DiagnosticLogsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.DiagnosticLogs.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.DiagnosticLogs.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun retrieveLogsRequest(intent: com.google.home.matter.standard.DiagnosticLogsTrait.IntentEnum, requestedProtocol: com.google.home.matter.standard.DiagnosticLogsTrait.TransferProtocolEnum, optionalArgs: com.google.home.matter.standard.DiagnosticLogsTrait.RetrieveLogsRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.DiagnosticLogsTrait.RetrieveLogsRequestCommand.Response { /* compiled code */ }

    public open fun retrieveLogsRequestBatchable(intent: com.google.home.matter.standard.DiagnosticLogsTrait.IntentEnum, requestedProtocol: com.google.home.matter.standard.DiagnosticLogsTrait.TransferProtocolEnum, optionalArgs: com.google.home.matter.standard.DiagnosticLogsTrait.RetrieveLogsRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.DiagnosticLogsTrait.RetrieveLogsRequestCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
