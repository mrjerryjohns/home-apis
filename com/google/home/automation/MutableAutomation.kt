// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public interface MutableAutomation : com.google.home.automation.Automation {
    public abstract var name: kotlin.String

    public abstract var description: kotlin.String

    public abstract var isActive: kotlin.Boolean

    public abstract var automationGraph: com.google.home.automation.SequentialFlow?

    public abstract var maxExecutionCount: kotlin.Int?

    @com.google.android.gms.common.internal.ShowFirstParty public abstract fun setFirstPartyMetadata(firstPartyClientMetadata: com.google.home.platform.traits.FirstPartyClientMetadata?): kotlin.Unit
}

