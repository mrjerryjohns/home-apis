// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedModeSelectImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedModeSelectTrait.Attributes) : com.google.home.google.ExtendedModeSelect, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedModeSelectTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedModeSelectTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentModeSettings: kotlin.collections.List<com.google.home.google.ExtendedModeSelectTrait.ModeSetting>? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val supportedModes: kotlin.collections.List<com.google.home.google.ExtendedModeSelectTrait.Mode>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedModeSelect.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedModeSelect.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun changeModeSettings(updateModeSettings: kotlin.collections.List<com.google.home.google.ExtendedModeSelectTrait.ModeSetting>): kotlin.Unit { /* compiled code */ }

    public open fun changeModeSettingsBatchable(updateModeSettings: kotlin.collections.List<com.google.home.google.ExtendedModeSelectTrait.ModeSetting>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

