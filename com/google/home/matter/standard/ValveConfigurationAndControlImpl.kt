// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ValveConfigurationAndControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes) : com.google.home.matter.standard.ValveConfigurationAndControl, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.ValveConfigurationAndControl, com.google.home.matter.standard.ValveConfigurationAndControlTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val autoCloseTime: kotlin.ULong? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentLevel: kotlin.UByte? /* compiled code */

    public open val currentState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? /* compiled code */

    public open val defaultOpenDuration: kotlin.UInt? /* compiled code */

    public open val defaultOpenLevel: kotlin.UByte? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val levelStep: kotlin.UByte? /* compiled code */

    public open val openDuration: kotlin.UInt? /* compiled code */

    public open val remainingDuration: kotlin.UInt? /* compiled code */

    public open val targetLevel: kotlin.UByte? /* compiled code */

    public open val targetState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? /* compiled code */

    public open val valveFault: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ValveConfigurationAndControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.ValveConfigurationAndControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun open(optionalArgs: com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun close(): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.ValveConfigurationAndControl) -> kotlin.Unit, init: com.google.home.matter.standard.ValveConfigurationAndControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.ValveConfigurationAndControl { /* compiled code */ }

    public open fun openBatchable(optionalArgs: com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun closeBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

