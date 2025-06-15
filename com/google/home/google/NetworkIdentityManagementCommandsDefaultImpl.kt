// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface NetworkIdentityManagementCommandsDefaultImpl : com.google.home.google.NetworkIdentityManagementCommands {
    public open suspend fun setBleConnectionKey(bleConnectionKey: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun getMacAddress(): com.google.home.google.NetworkIdentityManagementTrait.GetMacAddressCommand.Response { /* compiled code */ }

    public open suspend fun getWeaveAccessToken(): com.google.home.google.NetworkIdentityManagementTrait.GetWeaveAccessTokenCommand.Response { /* compiled code */ }

    public open suspend fun getUniqueDeviceIdentifier(): com.google.home.google.NetworkIdentityManagementTrait.GetUniqueDeviceIdentifierCommand.Response { /* compiled code */ }

    public open suspend fun getNetworkIdentityInformation(): com.google.home.google.NetworkIdentityManagementTrait.GetNetworkIdentityInformationCommand.Response { /* compiled code */ }

    public open fun setBleConnectionKeyBatchable(bleConnectionKey: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getMacAddressBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkIdentityManagementTrait.GetMacAddressCommand.Response> { /* compiled code */ }

    public open fun getWeaveAccessTokenBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkIdentityManagementTrait.GetWeaveAccessTokenCommand.Response> { /* compiled code */ }

    public open fun getUniqueDeviceIdentifierBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkIdentityManagementTrait.GetUniqueDeviceIdentifierCommand.Response> { /* compiled code */ }

    public open fun getNetworkIdentityInformationBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkIdentityManagementTrait.GetNetworkIdentityInformationCommand.Response> { /* compiled code */ }
}
