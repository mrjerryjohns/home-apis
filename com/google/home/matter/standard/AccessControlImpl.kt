// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class AccessControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.AccessControlTrait.Attributes) : com.google.home.matter.standard.AccessControl, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.AccessControlTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.AccessControl, com.google.home.matter.standard.AccessControlTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.AccessControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val accessControlEntriesPerFabric: kotlin.UShort? /* compiled code */

    public open val acl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>? /* compiled code */

    public open val arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct>? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val commissioningArl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>? /* compiled code */

    public open val extension: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.AccessControlTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val subjectsPerAccessControlEntry: kotlin.UShort? /* compiled code */

    public open val targetsPerAccessControlEntry: kotlin.UShort? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.AccessControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.AccessControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun reviewFabricRestrictions(arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>): com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Response { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.AccessControl) -> kotlin.Unit, init: com.google.home.matter.standard.AccessControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.AccessControl { /* compiled code */ }

    public open fun reviewFabricRestrictionsBatchable(arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>): com.google.home.BatchableCommand<com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

