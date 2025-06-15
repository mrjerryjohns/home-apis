// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface NetworkControlCommands {
    public abstract suspend fun enableDisableGuestNetwork(enable: kotlin.Boolean): kotlin.Unit

    public abstract suspend fun enableDisableNetworkProfile(enable: kotlin.Boolean, networkProfileName: kotlin.String): kotlin.Unit

    public abstract suspend fun getGuestNetworkPassword(): com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Response

    public abstract suspend fun testNetworkSpeed(testUploadSpeed: kotlin.Boolean, testDownloadSpeed: kotlin.Boolean): kotlin.Unit

    public abstract fun enableDisableGuestNetworkBatchable(enable: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun enableDisableNetworkProfileBatchable(enable: kotlin.Boolean, networkProfileName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun getGuestNetworkPasswordBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Response>

    public abstract fun testNetworkSpeedBatchable(testUploadSpeed: kotlin.Boolean, testDownloadSpeed: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit>
}
