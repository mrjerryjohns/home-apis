// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface EnergyProgramsCommandsDefaultImpl : com.google.home.google.EnergyProgramsCommands {
    public open suspend fun scheduleEnergyProgramEvent(eventId: kotlin.String, eventType: com.google.home.google.EnergyProgramsTrait.EventType, programName: kotlin.String, segments: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.Segment>): kotlin.Unit { /* compiled code */ }

    public open suspend fun cancelEnergyProgramEvent(eventId: kotlin.String, programName: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun scheduleEnergyProgramEventBatchable(eventId: kotlin.String, eventType: com.google.home.google.EnergyProgramsTrait.EventType, programName: kotlin.String, segments: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.Segment>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun cancelEnergyProgramEventBatchable(eventId: kotlin.String, programName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

