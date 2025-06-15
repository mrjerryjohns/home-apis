// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ArmDisarmImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ArmDisarmTrait.Attributes) : com.google.home.google.ArmDisarm, com.google.home.matter.MatterTraitImpl, com.google.home.google.ArmDisarmTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ArmDisarmTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val armState: com.google.home.google.ArmDisarmTrait.ArmState? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val availableArmLevels: com.google.home.google.ArmDisarmTrait.AvailableArmLevels? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentArmLevel: kotlin.String? /* compiled code */

    public open val entryAllowanceEndTimeSeconds: kotlin.Long? /* compiled code */

    public open val exitAllowanceEndTimeSeconds: kotlin.Long? /* compiled code */

    public open val exitAllowanceSeconds: kotlin.UInt? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val isArmed: kotlin.Boolean? /* compiled code */

    public open val targetArmLevel: kotlin.String? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ArmDisarm.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ArmDisarm.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun armDisarm(arm: kotlin.Boolean, optionalArgs: com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun armDisarmBatchable(arm: kotlin.Boolean, optionalArgs: com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

