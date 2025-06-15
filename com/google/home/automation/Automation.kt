// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public interface Automation : com.google.home.HasId, com.google.home.automation.BaseAutomation, com.google.home.Updatable<com.google.home.automation.Automation, com.google.home.automation.MutableAutomation> {
    public abstract val isValid: kotlin.Boolean

    public abstract val isRunning: kotlin.Boolean

    public abstract val manuallyExecutable: kotlin.Boolean

    public abstract val compatibleWithSdk: kotlin.Boolean

    public abstract val validationIssues: kotlin.collections.List<com.google.home.automation.ValidationIssue>

    public abstract suspend fun execute(): kotlin.Unit

    public abstract suspend fun stop(): kotlin.Unit

    @com.google.android.gms.common.internal.ShowFirstParty public abstract fun matchesId(id: com.google.home.Id): kotlin.Boolean
}
