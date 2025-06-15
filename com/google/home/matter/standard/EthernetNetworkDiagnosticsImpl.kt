// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class EthernetNetworkDiagnosticsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Attributes) : com.google.home.matter.standard.EthernetNetworkDiagnostics, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val carrierDetect: kotlin.Boolean? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val collisionCount: kotlin.ULong? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature /* compiled code */

    public open val fullDuplex: kotlin.Boolean? /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val overrunCount: kotlin.ULong? /* compiled code */

    public open val packetRxCount: kotlin.ULong? /* compiled code */

    public open val packetTxCount: kotlin.ULong? /* compiled code */

    public open val phyRate: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.PhyRateEnum? /* compiled code */

    public open val timeSinceReset: kotlin.ULong? /* compiled code */

    public open val txErrCount: kotlin.ULong? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.EthernetNetworkDiagnostics.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.EthernetNetworkDiagnostics.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun resetCounts(): kotlin.Unit { /* compiled code */ }

    public open fun resetCountsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
