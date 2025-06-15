// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class LockUnlockImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.LockUnlockTrait.Attributes) : com.google.home.google.LockUnlock, com.google.home.matter.MatterTraitImpl, com.google.home.google.LockUnlockTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.LockUnlockTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val lockState: com.google.home.google.LockUnlockTrait.LockState? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.LockUnlock.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.LockUnlock.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun lock(followUpToken: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun unlock(followUpToken: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun lockBatchable(followUpToken: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun unlockBatchable(followUpToken: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

