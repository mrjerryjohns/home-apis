// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class GeneralDiagnosticsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.GeneralDiagnosticsTrait.Attributes) : com.google.home.matter.standard.GeneralDiagnostics, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.GeneralDiagnosticsTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.GeneralDiagnosticsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activeHardwareFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>? /* compiled code */

    public open val activeNetworkFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

    public open val activeRadioFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val bootReason: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val networkInterfaces: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface>? /* compiled code */

    public open val rebootCount: kotlin.UShort? /* compiled code */

    public open val testEventTriggersEnabled: kotlin.Boolean? /* compiled code */

    public open val totalOperationalHours: kotlin.UInt? /* compiled code */

    public open val upTime: kotlin.ULong? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.GeneralDiagnostics.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.GeneralDiagnostics.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun testEventTrigger(enableKey: kotlin.ByteArray, eventTrigger: kotlin.ULong): kotlin.Unit { /* compiled code */ }

    public open suspend fun timeSnapshot(): com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Response { /* compiled code */ }

    public open suspend fun payloadTestRequest(enableKey: kotlin.ByteArray, value: kotlin.UByte, count: kotlin.UShort): com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Response { /* compiled code */ }

    public open fun testEventTriggerBatchable(enableKey: kotlin.ByteArray, eventTrigger: kotlin.ULong): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun timeSnapshotBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Response> { /* compiled code */ }

    public open fun payloadTestRequestBatchable(enableKey: kotlin.ByteArray, value: kotlin.UByte, count: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
