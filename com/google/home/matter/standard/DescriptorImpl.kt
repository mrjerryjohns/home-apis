// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class DescriptorImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.DescriptorTrait.Attributes) : com.google.home.matter.standard.Descriptor, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.DescriptorTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.DescriptorTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clientList: kotlin.collections.List<kotlin.UInt>? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val deviceTypeList: kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct>? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.DescriptorTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val partsList: kotlin.collections.List<kotlin.UShort>? /* compiled code */

    public open val serverList: kotlin.collections.List<kotlin.UInt>? /* compiled code */

    public open val tagList: kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.Descriptor.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
