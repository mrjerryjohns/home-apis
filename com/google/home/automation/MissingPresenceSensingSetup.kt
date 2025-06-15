// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public final class MissingPresenceSensingSetup public constructor(type: com.google.home.automation.MissingPresenceSensingSetup.SetupType = COMPILED_CODE, reason: kotlin.String = COMPILED_CODE) : com.google.home.automation.UnsupportedCandidateReason {
    public final val type: com.google.home.automation.MissingPresenceSensingSetup.SetupType /* compiled code */

    public open val reason: kotlin.String /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final enum class SetupType private constructor() : kotlin.Enum<com.google.home.automation.MissingPresenceSensingSetup.SetupType> {
        @androidx.annotation.NonNull UNSPECIFIED,

        @androidx.annotation.NonNull STRUCTURE_PRESENCE,

        @androidx.annotation.NonNull USER_PRESENCE;
    }
}

