// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class KeypadInputImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.KeypadInputTrait.Attributes) : com.google.home.matter.standard.KeypadInput, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.KeypadInputTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.KeypadInputTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.KeypadInputTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.KeypadInput.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.KeypadInput.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun sendKey(keyCode: com.google.home.matter.standard.KeypadInputTrait.CecKeyCodeEnum): com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Response { /* compiled code */ }

    public open fun sendKeyBatchable(keyCode: com.google.home.matter.standard.KeypadInputTrait.CecKeyCodeEnum): com.google.home.BatchableCommand<com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

