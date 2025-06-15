// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class NetworkCommissioningImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.NetworkCommissioningTrait.Attributes) : com.google.home.matter.standard.NetworkCommissioning, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.NetworkCommissioningTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.NetworkCommissioning, com.google.home.matter.standard.NetworkCommissioningTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.NetworkCommissioningTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val connectMaxTimeSeconds: kotlin.UByte? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.NetworkCommissioningTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val interfaceEnabled: kotlin.Boolean? /* compiled code */

    public open val lastConnectErrorValue: kotlin.Int? /* compiled code */

    public open val lastNetworkId: kotlin.ByteArray? /* compiled code */

    public open val lastNetworkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum? /* compiled code */

    public open val maxNetworks: kotlin.UByte? /* compiled code */

    public open val networks: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct>? /* compiled code */

    public open val scanMaxTimeSeconds: kotlin.UByte? /* compiled code */

    public open val supportedThreadFeatures: com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap? /* compiled code */

    public open val supportedWiFiBands: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum>? /* compiled code */

    public open val threadVersion: kotlin.UShort? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.NetworkCommissioning.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.NetworkCommissioning.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun scanNetworks(optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Response { /* compiled code */ }

    public open suspend fun addOrUpdateWiFiNetwork(ssid: kotlin.ByteArray, credentials: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Response { /* compiled code */ }

    public open suspend fun addOrUpdateThreadNetwork(operationalDataset: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Response { /* compiled code */ }

    public open suspend fun removeNetwork(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Response { /* compiled code */ }

    public open suspend fun connectNetwork(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Response { /* compiled code */ }

    public open suspend fun reorderNetwork(networkId: kotlin.ByteArray, networkIndex: kotlin.UByte, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Response { /* compiled code */ }

    public open suspend fun queryIdentity(keyIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Response { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.NetworkCommissioning) -> kotlin.Unit, init: com.google.home.matter.standard.NetworkCommissioningTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioning { /* compiled code */ }

    public open fun scanNetworksBatchable(optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Response> { /* compiled code */ }

    public open fun addOrUpdateWiFiNetworkBatchable(ssid: kotlin.ByteArray, credentials: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Response> { /* compiled code */ }

    public open fun addOrUpdateThreadNetworkBatchable(operationalDataset: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Response> { /* compiled code */ }

    public open fun removeNetworkBatchable(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Response> { /* compiled code */ }

    public open fun connectNetworkBatchable(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Response> { /* compiled code */ }

    public open fun reorderNetworkBatchable(networkId: kotlin.ByteArray, networkIndex: kotlin.UByte, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Response> { /* compiled code */ }

    public open fun queryIdentityBatchable(keyIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

