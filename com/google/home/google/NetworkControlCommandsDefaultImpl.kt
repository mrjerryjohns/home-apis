// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface NetworkControlCommandsDefaultImpl : com.google.home.google.NetworkControlCommands {
    public open suspend fun enableDisableGuestNetwork(enable: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public open suspend fun enableDisableNetworkProfile(enable: kotlin.Boolean, networkProfileName: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun getGuestNetworkPassword(): com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Response { /* compiled code */ }

    public open suspend fun testNetworkSpeed(testUploadSpeed: kotlin.Boolean, testDownloadSpeed: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public open fun enableDisableGuestNetworkBatchable(enable: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enableDisableNetworkProfileBatchable(enable: kotlin.Boolean, networkProfileName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getGuestNetworkPasswordBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Response> { /* compiled code */ }

    public open fun testNetworkSpeedBatchable(testUploadSpeed: kotlin.Boolean, testDownloadSpeed: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
