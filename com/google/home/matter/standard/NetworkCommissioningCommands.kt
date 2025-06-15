// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface NetworkCommissioningCommands {
    public abstract suspend fun scanNetworks(optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Response

    public abstract suspend fun addOrUpdateWiFiNetwork(ssid: kotlin.ByteArray, credentials: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Response

    public abstract suspend fun addOrUpdateThreadNetwork(operationalDataset: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Response

    public abstract suspend fun removeNetwork(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Response

    public abstract suspend fun connectNetwork(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Response

    public abstract suspend fun reorderNetwork(networkId: kotlin.ByteArray, networkIndex: kotlin.UByte, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Response

    public abstract suspend fun queryIdentity(keyIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Response

    public abstract fun scanNetworksBatchable(optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Response>

    public abstract fun addOrUpdateWiFiNetworkBatchable(ssid: kotlin.ByteArray, credentials: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Response>

    public abstract fun addOrUpdateThreadNetworkBatchable(operationalDataset: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Response>

    public abstract fun removeNetworkBatchable(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Response>

    public abstract fun connectNetworkBatchable(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Response>

    public abstract fun reorderNetworkBatchable(networkId: kotlin.ByteArray, networkIndex: kotlin.UByte, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Response>

    public abstract fun queryIdentityBatchable(keyIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Response>
}
