// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public final class StringConstraint private constructor(allowedSet: kotlin.collections.Set<kotlin.String>? = COMPILED_CODE, disallowedSet: kotlin.collections.Set<kotlin.String> = COMPILED_CODE, minLength: kotlin.Int = COMPILED_CODE, maxLength: kotlin.Int = COMPILED_CODE, isCaseSensitive: kotlin.Boolean = COMPILED_CODE, regex: kotlin.text.Regex? = COMPILED_CODE) : com.google.home.automation.Constraint {
    public companion object {
        public const final val MIN_STRING_LENGTH: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val MAX_STRING_LENGTH: kotlin.Int = COMPILED_CODE /* compiled code */
    }

    public constructor(disallowedSet: kotlin.collections.Set<kotlin.String>, minLength: kotlin.Int = COMPILED_CODE, maxLength: kotlin.Int = COMPILED_CODE, isCaseSensitive: kotlin.Boolean = COMPILED_CODE, regex: kotlin.text.Regex? = COMPILED_CODE) { /* compiled code */ }

    public constructor(allowedSet: kotlin.collections.Set<kotlin.String>, isCaseSensitive: kotlin.Boolean = COMPILED_CODE) { /* compiled code */ }

    public final val allowedSet: kotlin.collections.Set<kotlin.String>? /* compiled code */

    public final val disallowedSet: kotlin.collections.Set<kotlin.String> /* compiled code */

    public final val minLength: kotlin.Int /* compiled code */

    public final val maxLength: kotlin.Int /* compiled code */

    public final val isCaseSensitive: kotlin.Boolean /* compiled code */

    public final val regex: kotlin.text.Regex? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
