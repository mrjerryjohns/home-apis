// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public final class HomeException public constructor(error: com.google.home.HomeError, exception: java.lang.Exception? /* from: kotlin.Exception? */ = COMPILED_CODE, subErrors: kotlin.collections.Map<kotlin.String, com.google.home.HomeError> = COMPILED_CODE) : java.lang.Exception /* from: kotlin.Exception */ {
    public companion object {
        public final fun bulkError(subErrors: kotlin.collections.Map<kotlin.String, com.google.home.HomeError>): com.google.home.HomeException { /* compiled code */ }

        public final fun cancelled(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun unknown(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun invalidArgument(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun deadlineExceeded(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun notFound(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun alreadyExists(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun permissionDenied(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun resourceExhausted(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun failedPrecondition(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun outOfRange(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun aborted(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun unimplemented(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun internal(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun unavailable(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun dataLoss(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun unauthenticated(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun apiNotConnected(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }

        public final fun sdkInitializationMissingInfo(message: kotlin.String = COMPILED_CODE, vararg subErrors: com.google.home.HomeError = COMPILED_CODE): com.google.home.HomeException { /* compiled code */ }
    }

    public constructor(code: kotlin.Int, message: kotlin.String, exception: java.lang.Exception? /* from: kotlin.Exception? */ = COMPILED_CODE, subErrors: kotlin.collections.Map<kotlin.String, com.google.home.HomeError> = COMPILED_CODE) { /* compiled code */ }

    public final val error: com.google.home.HomeError /* compiled code */

    public final val subErrors: kotlin.collections.Map<kotlin.String, com.google.home.HomeError> /* compiled code */

    public final fun getSubErrorCodes(): kotlin.collections.List<kotlin.Int> { /* compiled code */ }

    public object Codes {
        public const final val CANCELLED: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val UNKNOWN: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val INVALID_ARGUMENT: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val DEADLINE_EXCEEDED: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val NOT_FOUND: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val ALREADY_EXISTS: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val PERMISSION_DENIED: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val RESOURCE_EXHAUSTED: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val FAILED_PRECONDITION: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val ABORTED: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val OUT_OF_RANGE: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val UNIMPLEMENTED: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val INTERNAL: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val UNAVAILABLE: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val DATA_LOSS: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val UNAUTHENTICATED: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val API_NOT_CONNECTED: kotlin.Int = COMPILED_CODE /* compiled code */

        public const final val SDK_INITIALIZATION_MISSING_INFO: kotlin.Int = COMPILED_CODE /* compiled code */
    }
}

