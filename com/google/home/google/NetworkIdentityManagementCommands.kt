// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface NetworkIdentityManagementCommands {
    public abstract suspend fun setBleConnectionKey(bleConnectionKey: kotlin.String): kotlin.Unit

    public abstract suspend fun getMacAddress(): com.google.home.google.NetworkIdentityManagementTrait.GetMacAddressCommand.Response

    public abstract suspend fun getWeaveAccessToken(): com.google.home.google.NetworkIdentityManagementTrait.GetWeaveAccessTokenCommand.Response

    public abstract suspend fun getUniqueDeviceIdentifier(): com.google.home.google.NetworkIdentityManagementTrait.GetUniqueDeviceIdentifierCommand.Response

    public abstract suspend fun getNetworkIdentityInformation(): com.google.home.google.NetworkIdentityManagementTrait.GetNetworkIdentityInformationCommand.Response

    public abstract fun setBleConnectionKeyBatchable(bleConnectionKey: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun getMacAddressBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkIdentityManagementTrait.GetMacAddressCommand.Response>

    public abstract fun getWeaveAccessTokenBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkIdentityManagementTrait.GetWeaveAccessTokenCommand.Response>

    public abstract fun getUniqueDeviceIdentifierBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkIdentityManagementTrait.GetUniqueDeviceIdentifierCommand.Response>

    public abstract fun getNetworkIdentityInformationBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkIdentityManagementTrait.GetNetworkIdentityInformationCommand.Response>
}

