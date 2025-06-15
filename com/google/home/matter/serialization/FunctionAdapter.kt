// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public final class FunctionAdapter<FROM : kotlin.Any, TO : kotlin.Any> public constructor(fromTo: (FROM) -> TO, toFrom: (TO) -> FROM) : com.google.home.matter.serialization.FieldAdapter<FROM, TO> {
    public final val fromTo: (FROM) -> TO /* compiled code */

    public final val toFrom: (TO) -> FROM /* compiled code */

    public open fun toRaw(value: TO): FROM { /* compiled code */ }

    public open fun toRuntime(value: FROM): TO { /* compiled code */ }
}
