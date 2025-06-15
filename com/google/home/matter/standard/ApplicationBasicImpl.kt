// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ApplicationBasicImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ApplicationBasicTrait.Attributes) : com.google.home.matter.standard.ApplicationBasic, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ApplicationBasicTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ApplicationBasicTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val allowedVendorList: kotlin.collections.List<kotlin.UShort>? /* compiled code */

    public open val application: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct? /* compiled code */

    public open val applicationName: kotlin.String? /* compiled code */

    public open val applicationVersion: kotlin.String? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val productId: kotlin.UShort? /* compiled code */

    public open val status: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStatusEnum? /* compiled code */

    public open val vendorId: kotlin.UShort? /* compiled code */

    public open val vendorName: kotlin.String? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ApplicationBasic.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

