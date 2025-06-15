// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class TargetNavigatorImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.TargetNavigatorTrait.Attributes) : com.google.home.matter.standard.TargetNavigator, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.TargetNavigatorTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.TargetNavigatorTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentTarget: kotlin.UByte? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val targetList: kotlin.collections.List<com.google.home.matter.standard.TargetNavigatorTrait.TargetInfoStruct>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.TargetNavigator.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.TargetNavigator.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun navigateTarget(target: kotlin.UByte, optionalArgs: com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.Response { /* compiled code */ }

    public open fun navigateTargetBatchable(target: kotlin.UByte, optionalArgs: com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.TargetNavigatorTrait.NavigateTargetCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
