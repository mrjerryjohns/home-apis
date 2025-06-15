// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class BridgedDeviceBasicInformationImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes) : com.google.home.matter.standard.BridgedDeviceBasicInformation, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.BridgedDeviceBasicInformation, com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val hardwareVersion: kotlin.UShort? /* compiled code */

    public open val hardwareVersionString: kotlin.String? /* compiled code */

    public open val manufacturingDate: kotlin.String? /* compiled code */

    public open val nodeLabel: kotlin.String? /* compiled code */

    public open val partNumber: kotlin.String? /* compiled code */

    public open val productAppearance: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct? /* compiled code */

    public open val productId: kotlin.UShort? /* compiled code */

    public open val productLabel: kotlin.String? /* compiled code */

    public open val productName: kotlin.String? /* compiled code */

    public open val productUrl: kotlin.String? /* compiled code */

    public open val reachable: kotlin.Boolean? /* compiled code */

    public open val serialNumber: kotlin.String? /* compiled code */

    public open val softwareVersion: kotlin.UInt? /* compiled code */

    public open val softwareVersionString: kotlin.String? /* compiled code */

    public open val uniqueId: kotlin.String? /* compiled code */

    public open val vendorId: kotlin.UShort? /* compiled code */

    public open val vendorName: kotlin.String? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.BridgedDeviceBasicInformation.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.BridgedDeviceBasicInformation.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun keepActive(stayActiveDuration: kotlin.UInt, timeoutMs: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.BridgedDeviceBasicInformation) -> kotlin.Unit, init: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.BridgedDeviceBasicInformation { /* compiled code */ }

    public open fun keepActiveBatchable(stayActiveDuration: kotlin.UInt, timeoutMs: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
