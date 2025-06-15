// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class NetworkControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.NetworkControlTrait.Attributes) : com.google.home.google.NetworkControl, com.google.home.matter.MatterTraitImpl, com.google.home.google.NetworkControlTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.NetworkControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.google.NetworkControlTrait.NetworkControlFeature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val guestNetworkEnabled: kotlin.Boolean? /* compiled code */

    public open val guestNetworkSettings: com.google.home.google.NetworkControlTrait.GuestNetworkSettings? /* compiled code */

    public open val lastNetworkDownloadSpeedTest: com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest? /* compiled code */

    public open val lastNetworkUploadSpeedTest: com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest? /* compiled code */

    public open val networkEnabled: kotlin.Boolean? /* compiled code */

    public open val networkProfileStates: kotlin.collections.List<com.google.home.google.NetworkControlTrait.NetworkProfileState>? /* compiled code */

    public open val networkProfiles: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open val networkSettings: com.google.home.google.NetworkControlTrait.NetworkSettings? /* compiled code */

    public open val networkSpeedTestInProgress: kotlin.Boolean? /* compiled code */

    public open val networkUsageLimitMb: kotlin.Float? /* compiled code */

    public open val networkUsageMb: kotlin.Float? /* compiled code */

    public open val networkUsageUnlimited: kotlin.Boolean? /* compiled code */

    public open val numConnectedDevices: kotlin.UInt? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.NetworkControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.NetworkControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun enableDisableGuestNetwork(enable: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public open suspend fun enableDisableNetworkProfile(enable: kotlin.Boolean, networkProfileName: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun getGuestNetworkPassword(): com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Response { /* compiled code */ }

    public open suspend fun testNetworkSpeed(testUploadSpeed: kotlin.Boolean, testDownloadSpeed: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public open fun enableDisableGuestNetworkBatchable(enable: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enableDisableNetworkProfileBatchable(enable: kotlin.Boolean, networkProfileName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getGuestNetworkPasswordBatchable(): com.google.home.BatchableCommand<com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Response> { /* compiled code */ }

    public open fun testNetworkSpeedBatchable(testUploadSpeed: kotlin.Boolean, testDownloadSpeed: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

