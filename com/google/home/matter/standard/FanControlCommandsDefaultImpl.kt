// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface FanControlCommandsDefaultImpl : com.google.home.matter.standard.FanControlCommands {
    public open suspend fun step(direction: com.google.home.matter.standard.FanControlTrait.StepDirectionEnum, optionalArgs: com.google.home.matter.standard.FanControlTrait.StepCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun stepBatchable(direction: com.google.home.matter.standard.FanControlTrait.StepDirectionEnum, optionalArgs: com.google.home.matter.standard.FanControlTrait.StepCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
