// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ModeSelectImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ModeSelectTrait.Attributes) : com.google.home.matter.standard.ModeSelect, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ModeSelectTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.ModeSelect, com.google.home.matter.standard.ModeSelectTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ModeSelectTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentMode: kotlin.UByte? /* compiled code */

    public open val description: kotlin.String? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ModeSelectTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val onMode: kotlin.UByte? /* compiled code */

    public open val standardNamespace: kotlin.UShort? /* compiled code */

    public open val startUpMode: kotlin.UByte? /* compiled code */

    public open val supportedModes: kotlin.collections.List<com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ModeSelect.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.ModeSelect.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun changeToMode(newMode: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.ModeSelect) -> kotlin.Unit, init: com.google.home.matter.standard.ModeSelectTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.ModeSelect { /* compiled code */ }

    public open fun changeToModeBatchable(newMode: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
