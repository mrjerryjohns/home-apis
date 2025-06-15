// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface MicrowaveOvenControlCommandsDefaultImpl : com.google.home.matter.standard.MicrowaveOvenControlCommands {
    public open suspend fun setCookingParameters(optionalArgs: com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun addMoreTime(timeToAdd: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open fun setCookingParametersBatchable(optionalArgs: com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun addMoreTimeBatchable(timeToAdd: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

