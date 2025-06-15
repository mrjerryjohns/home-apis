// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface FanControlCommands {
    public abstract suspend fun step(direction: com.google.home.matter.standard.FanControlTrait.StepDirectionEnum, optionalArgs: com.google.home.matter.standard.FanControlTrait.StepCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract fun stepBatchable(direction: com.google.home.matter.standard.FanControlTrait.StepDirectionEnum, optionalArgs: com.google.home.matter.standard.FanControlTrait.StepCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>
}

