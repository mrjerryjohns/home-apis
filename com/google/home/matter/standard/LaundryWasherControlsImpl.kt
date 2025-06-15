// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class LaundryWasherControlsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes) : com.google.home.matter.standard.LaundryWasherControls, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.LaundryWasherControls, com.google.home.matter.standard.LaundryWasherControlsTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.LaundryWasherControlsTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val numberOfRinses: com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum? /* compiled code */

    public open val spinSpeedCurrent: kotlin.UByte? /* compiled code */

    public open val spinSpeeds: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open val supportedRinses: kotlin.collections.List<com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.LaundryWasherControls.Attribute): kotlin.Boolean { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.LaundryWasherControls) -> kotlin.Unit, init: com.google.home.matter.standard.LaundryWasherControlsTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.LaundryWasherControls { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
