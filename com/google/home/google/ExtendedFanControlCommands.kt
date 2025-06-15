// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedFanControlCommands {
    public abstract suspend fun extendedStep(fanSpeedRelativeWeight: kotlin.Long, direction: com.google.home.google.ExtendedFanControlTrait.StepDirection): kotlin.Unit

    public abstract suspend fun toggleAirflowDirection(): kotlin.Unit

    public abstract fun extendedStepBatchable(fanSpeedRelativeWeight: kotlin.Long, direction: com.google.home.google.ExtendedFanControlTrait.StepDirection): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun toggleAirflowDirectionBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}

