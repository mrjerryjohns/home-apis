// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class SelfTestImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.SelfTestTrait.Attributes) : com.google.home.google.SelfTest, com.google.home.matter.MatterTraitImpl, com.google.home.google.SelfTestTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.SelfTestTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val audioTest: com.google.home.google.SelfTestTrait.Test? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val manualTest: com.google.home.google.SelfTestTrait.Test? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.SelfTest.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.SelfTest.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun updateStructureSelfTestStatus(manualTest: com.google.home.google.SelfTestTrait.Test, audioTest: com.google.home.google.SelfTestTrait.Test): kotlin.Unit { /* compiled code */ }

    public open suspend fun setExecutionSummary(warningDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus>, criticalDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus>): kotlin.Unit { /* compiled code */ }

    public open fun updateStructureSelfTestStatusBatchable(manualTest: com.google.home.google.SelfTestTrait.Test, audioTest: com.google.home.google.SelfTestTrait.Test): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setExecutionSummaryBatchable(warningDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus>, criticalDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

