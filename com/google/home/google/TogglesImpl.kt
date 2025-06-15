// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class TogglesImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.TogglesTrait.Attributes) : com.google.home.google.Toggles, com.google.home.matter.MatterTraitImpl, com.google.home.google.TogglesTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.TogglesTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val supportedToggles: kotlin.collections.List<com.google.home.google.TogglesTrait.Toggle>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Toggles.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Toggles.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun changeToggleSettings(updatedToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>): kotlin.Unit { /* compiled code */ }

    public open fun changeToggleSettingsBatchable(updatedToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
