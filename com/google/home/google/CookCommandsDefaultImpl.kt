// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface CookCommandsDefaultImpl : com.google.home.google.CookCommands {
    public open suspend fun cook(start: kotlin.Boolean, cookingMode: com.google.home.google.CookTrait.CookingMode, foodPreset: kotlin.String, quantity: kotlin.Float, unit: com.google.home.google.CookTrait.Unit): com.google.home.google.CookTrait.CookCommand.Response { /* compiled code */ }

    public open fun cookBatchable(start: kotlin.Boolean, cookingMode: com.google.home.google.CookTrait.CookingMode, foodPreset: kotlin.String, quantity: kotlin.Float, unit: com.google.home.google.CookTrait.Unit): com.google.home.BatchableCommand<com.google.home.google.CookTrait.CookCommand.Response> { /* compiled code */ }
}
