// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class WiFiNetworkDiagnosticsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Attributes) : com.google.home.matter.standard.WiFiNetworkDiagnostics, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val beaconLostCount: kotlin.UInt? /* compiled code */

    public open val beaconRxCount: kotlin.UInt? /* compiled code */

    public open val bssid: kotlin.ByteArray? /* compiled code */

    public open val channelNumber: kotlin.UShort? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentMaxRate: kotlin.ULong? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val overrunCount: kotlin.ULong? /* compiled code */

    public open val packetMulticastRxCount: kotlin.UInt? /* compiled code */

    public open val packetMulticastTxCount: kotlin.UInt? /* compiled code */

    public open val packetUnicastRxCount: kotlin.UInt? /* compiled code */

    public open val packetUnicastTxCount: kotlin.UInt? /* compiled code */

    public open val rssi: kotlin.Byte? /* compiled code */

    public open val securityType: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.SecurityTypeEnum? /* compiled code */

    public open val wiFiVersion: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.WiFiVersionEnum? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.WiFiNetworkDiagnostics.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.WiFiNetworkDiagnostics.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun resetCounts(): kotlin.Unit { /* compiled code */ }

    public open fun resetCountsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

