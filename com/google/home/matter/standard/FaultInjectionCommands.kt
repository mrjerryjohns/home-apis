// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface FaultInjectionCommands {
    public abstract suspend fun failAtFault(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, numCallsToSkip: kotlin.UInt, numCallsToFail: kotlin.UInt, takeMutex: kotlin.Boolean): kotlin.Unit

    public abstract suspend fun failRandomlyAtFault(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, percentage: kotlin.UByte): kotlin.Unit

    public abstract fun failAtFaultBatchable(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, numCallsToSkip: kotlin.UInt, numCallsToFail: kotlin.UInt, takeMutex: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun failRandomlyAtFaultBatchable(type: com.google.home.matter.standard.FaultInjectionTrait.FaultType, id: kotlin.UInt, percentage: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>
}

