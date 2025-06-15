// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedFanControlCommandsDefaultImpl : com.google.home.google.ExtendedFanControlCommands {
    public open suspend fun extendedStep(fanSpeedRelativeWeight: kotlin.Long, direction: com.google.home.google.ExtendedFanControlTrait.StepDirection): kotlin.Unit { /* compiled code */ }

    public open suspend fun toggleAirflowDirection(): kotlin.Unit { /* compiled code */ }

    public open fun extendedStepBatchable(fanSpeedRelativeWeight: kotlin.Long, direction: com.google.home.google.ExtendedFanControlTrait.StepDirection): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toggleAirflowDirectionBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

