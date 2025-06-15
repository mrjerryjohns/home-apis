// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class NetworkIdentityManagementImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.NetworkIdentityManagementTrait.Attributes) : com.google.home.google.NetworkIdentityManagement, com.google.home.matter.MatterTraitImpl, com.google.home.google.NetworkIdentityManagementTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.NetworkIdentityManagementTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val bleConnectionKey: kotlin.String? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.NetworkIdentityManagement.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.NetworkIdentityManagement.Command): kotlin.Boolean { /* compiled code */ }

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

    public open fun toString(): kotlin.String { /* compiled code */ }
}
