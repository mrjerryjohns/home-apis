// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface PlatformTraitClient {
    public abstract suspend fun <T> write(parser: com.google.home.google.Parser<T>, attributes: T, useTimedInteraction: kotlin.Boolean = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun <REQUEST, RESPONSE> sendCommand(commandId: kotlin.String /* from: com.google.home.google.CommandId */, requestPayload: com.google.home.google.PlatformTraitPayload<REQUEST>, responseParser: com.google.home.google.Parser<RESPONSE>): RESPONSE
}

