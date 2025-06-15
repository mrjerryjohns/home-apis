// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedDoorLockImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedDoorLockTrait.Attributes) : com.google.home.google.ExtendedDoorLock, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedDoorLockTrait.Attributes, com.google.home.Updatable<com.google.home.google.ExtendedDoorLock, com.google.home.google.ExtendedDoorLockTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedDoorLockTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val enableLockHomeAwayAssist: kotlin.Boolean? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val ignoreAutoRelockOnStructureMode: kotlin.collections.List<com.google.home.google.ExtendedDoorLockTrait.StructureMode>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedDoorLock.Attribute): kotlin.Boolean { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.google.ExtendedDoorLock) -> kotlin.Unit, init: com.google.home.google.ExtendedDoorLockTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.ExtendedDoorLock { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

