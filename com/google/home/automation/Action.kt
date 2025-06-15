// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public final class Action : com.google.home.automation.Node {
    public constructor(entity: com.google.home.HasId, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>? = COMPILED_CODE, behavior: com.google.home.automation.ActionBehavior) { /* compiled code */ }

    public constructor(entityExpression: com.google.home.automation.Expression, behavior: com.google.home.automation.ActionBehavior) { /* compiled code */ }

    internal constructor(entity: com.google.home.HasId, genericType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>? = COMPILED_CODE, behavior: com.google.home.automation.ActionBehavior, nodeId: kotlin.String) { /* compiled code */ }

    internal constructor(entityExpression: com.google.home.automation.Expression, behavior: com.google.home.automation.ActionBehavior, nodeId: kotlin.String) { /* compiled code */ }

    public final val entity: com.google.home.HasId? /* compiled code */

    public final val deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>? /* compiled code */
        public final get

    private final val genericType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>? /* compiled code */

    public final val entityExpression: com.google.home.automation.Expression /* compiled code */

    public final val behavior: com.google.home.automation.ActionBehavior /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

