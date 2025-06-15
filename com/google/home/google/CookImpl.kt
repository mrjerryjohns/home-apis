// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class CookImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.CookTrait.Attributes) : com.google.home.google.Cook, com.google.home.matter.MatterTraitImpl, com.google.home.google.CookTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.CookTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentCookingMode: com.google.home.google.CookTrait.CookingMode? /* compiled code */

    public open val currentFoodPreset: kotlin.String? /* compiled code */

    public open val currentFoodQuantity: kotlin.Float? /* compiled code */

    public open val currentFoodUnit: com.google.home.google.CookTrait.Unit? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val foodPresets: kotlin.collections.List<com.google.home.google.CookTrait.FoodPreset>? /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val supportedCookingModes: kotlin.collections.List<com.google.home.google.CookTrait.CookingMode>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Cook.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Cook.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun cook(start: kotlin.Boolean, cookingMode: com.google.home.google.CookTrait.CookingMode, foodPreset: kotlin.String, quantity: kotlin.Float, unit: com.google.home.google.CookTrait.Unit): com.google.home.google.CookTrait.CookCommand.Response { /* compiled code */ }

    public open fun cookBatchable(start: kotlin.Boolean, cookingMode: com.google.home.google.CookTrait.CookingMode, foodPreset: kotlin.String, quantity: kotlin.Float, unit: com.google.home.google.CookTrait.Unit): com.google.home.BatchableCommand<com.google.home.google.CookTrait.CookCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

