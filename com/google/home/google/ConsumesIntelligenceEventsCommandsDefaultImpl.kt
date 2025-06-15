// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ConsumesIntelligenceEventsCommandsDefaultImpl : com.google.home.google.ConsumesIntelligenceEventsCommands {
    public open suspend fun updateHomeAwayState(userPresenceState: com.google.home.google.ConsumesIntelligenceEventsTrait.UserPresenceState): com.google.home.google.ConsumesIntelligenceEventsTrait.UpdateHomeAwayStateCommand.Response { /* compiled code */ }

    public open fun updateHomeAwayStateBatchable(userPresenceState: com.google.home.google.ConsumesIntelligenceEventsTrait.UserPresenceState): com.google.home.BatchableCommand<com.google.home.google.ConsumesIntelligenceEventsTrait.UpdateHomeAwayStateCommand.Response> { /* compiled code */ }
}

