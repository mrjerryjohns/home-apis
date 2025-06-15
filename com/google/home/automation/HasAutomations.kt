// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public interface HasAutomations {
    public abstract suspend fun createAutomation(automation: com.google.home.automation.BaseAutomation /* from: com.google.home.automation.DraftAutomation */): com.google.home.automation.Automation

    @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public abstract suspend fun createAutomation(automation: com.google.home.automation.BaseAutomation /* from: com.google.home.automation.DraftAutomation */, sessionId: kotlin.String): com.google.home.automation.Automation

    public abstract fun automations(): com.google.home.HomeObjectsFlow<com.google.home.automation.Automation>

    public abstract suspend fun deleteAutomation(automationId: com.google.home.Id): kotlin.Unit

    public abstract suspend fun deleteAutomation(automation: com.google.home.automation.Automation): kotlin.Unit

    @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public abstract suspend fun automationFromData(data: kotlin.ByteArray): com.google.home.automation.Automation
}
