// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedKeypadInputImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedKeypadInputTrait.Attributes) : com.google.home.google.ExtendedKeypadInput, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedKeypadInputTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedKeypadInputTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val supportedKeys: kotlin.collections.List<com.google.home.google.ExtendedKeypadInputTrait.Key>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedKeypadInput.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedKeypadInput.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun extendedSendKey(keyCode: com.google.home.google.ExtendedKeypadInputTrait.Key): kotlin.Unit { /* compiled code */ }

    public open fun extendedSendKeyBatchable(keyCode: com.google.home.google.ExtendedKeypadInputTrait.Key): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

