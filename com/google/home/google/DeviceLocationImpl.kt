// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class DeviceLocationImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.DeviceLocationTrait.Attributes) : com.google.home.google.DeviceLocation, com.google.home.matter.MatterTraitImpl, com.google.home.google.DeviceLocationTrait.Attributes, com.google.home.Updatable<com.google.home.google.DeviceLocation, com.google.home.google.DeviceLocationTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.DeviceLocationTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val presenceEnabledStructureIdList: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open val spokenLocation: com.google.home.google.DeviceLocationTrait.Location? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.DeviceLocation.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.DeviceLocation.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun setSpokenLocation(spokenLocation: com.google.home.google.DeviceLocationTrait.Location): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.google.DeviceLocation) -> kotlin.Unit, init: com.google.home.google.DeviceLocationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.DeviceLocation { /* compiled code */ }

    public open fun setSpokenLocationBatchable(spokenLocation: com.google.home.google.DeviceLocationTrait.Location): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

