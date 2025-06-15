// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface NetworkCommissioningCommandsDefaultImpl : com.google.home.matter.standard.NetworkCommissioningCommands {
    public open suspend fun scanNetworks(optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Response { /* compiled code */ }

    public open suspend fun addOrUpdateWiFiNetwork(ssid: kotlin.ByteArray, credentials: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Response { /* compiled code */ }

    public open suspend fun addOrUpdateThreadNetwork(operationalDataset: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Response { /* compiled code */ }

    public open suspend fun removeNetwork(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Response { /* compiled code */ }

    public open suspend fun connectNetwork(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Response { /* compiled code */ }

    public open suspend fun reorderNetwork(networkId: kotlin.ByteArray, networkIndex: kotlin.UByte, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Response { /* compiled code */ }

    public open suspend fun queryIdentity(keyIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Response { /* compiled code */ }

    public open fun scanNetworksBatchable(optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Response> { /* compiled code */ }

    public open fun addOrUpdateWiFiNetworkBatchable(ssid: kotlin.ByteArray, credentials: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Response> { /* compiled code */ }

    public open fun addOrUpdateThreadNetworkBatchable(operationalDataset: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Response> { /* compiled code */ }

    public open fun removeNetworkBatchable(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Response> { /* compiled code */ }

    public open fun connectNetworkBatchable(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Response> { /* compiled code */ }

    public open fun reorderNetworkBatchable(networkId: kotlin.ByteArray, networkIndex: kotlin.UByte, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Response> { /* compiled code */ }

    public open fun queryIdentityBatchable(keyIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Response> { /* compiled code */ }
}

