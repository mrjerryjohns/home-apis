// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface FaultInjectionCommandsDefaultImpl : com.google.home.matter.standard.FaultInjectionCommands {
    public open suspend fun failAtFault(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, numCallsToSkip: kotlin.UInt, numCallsToFail: kotlin.UInt, takeMutex: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public open suspend fun failRandomlyAtFault(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, percentage: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open fun failAtFaultBatchable(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, numCallsToSkip: kotlin.UInt, numCallsToFail: kotlin.UInt, takeMutex: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun failRandomlyAtFaultBatchable(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, percentage: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

