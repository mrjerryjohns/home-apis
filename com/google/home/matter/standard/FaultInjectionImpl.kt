// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class FaultInjectionImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.FaultInjectionTrait.Attributes) : com.google.home.matter.standard.FaultInjection, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.FaultInjectionTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.FaultInjectionTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.FaultInjection.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.FaultInjection.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun failAtFault(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, numCallsToSkip: kotlin.UInt, numCallsToFail: kotlin.UInt, takeMutex: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public open suspend fun failRandomlyAtFault(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, percentage: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open fun failAtFaultBatchable(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, numCallsToSkip: kotlin.UInt, numCallsToFail: kotlin.UInt, takeMutex: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun failRandomlyAtFaultBatchable(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, percentage: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

