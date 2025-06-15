// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedColorControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedColorControlTrait.Attributes) : com.google.home.google.ExtendedColorControl, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedColorControlTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedColorControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val colorLoopEndTimestampSeconds: kotlin.ULong? /* compiled code */

    public open val currentBlue: kotlin.UByte? /* compiled code */

    public open val currentGreen: kotlin.UByte? /* compiled code */

    public open val currentHue: kotlin.Float? /* compiled code */

    public open val currentName: kotlin.String? /* compiled code */

    public open val currentRed: kotlin.UByte? /* compiled code */

    public open val currentSaturation: kotlin.Float? /* compiled code */

    public open val currentValue: kotlin.Float? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedColorControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedColorControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun moveToColorName(colorName: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToColorRgb(red: kotlin.UByte, green: kotlin.UByte, blue: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToColorHsv(hue: kotlin.Float, saturation: kotlin.Float, value: kotlin.Float): kotlin.Unit { /* compiled code */ }

    public open fun moveToColorNameBatchable(colorName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToColorRgbBatchable(red: kotlin.UByte, green: kotlin.UByte, blue: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToColorHsvBatchable(hue: kotlin.Float, saturation: kotlin.Float, value: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

