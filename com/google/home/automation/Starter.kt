// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public final class Starter : com.google.home.automation.Node, com.google.home.automation.HasOutput {
    public constructor(entity: com.google.home.HasId, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>? = COMPILED_CODE, trait: com.google.home.TraitFactory<out com.google.home.Trait>, output: kotlin.String) { /* compiled code */ }

    public constructor(entity: com.google.home.HasId, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>? = COMPILED_CODE, event: com.google.home.EventFactory<out com.google.home.Event>, parameters: kotlin.collections.List<com.google.home.automation.Parameter> = COMPILED_CODE, output: kotlin.String) { /* compiled code */ }

    public constructor(entityExpression: com.google.home.automation.Expression, trait: com.google.home.TraitFactory<out com.google.home.Trait>, output: kotlin.String) { /* compiled code */ }

    public constructor(entityExpression: com.google.home.automation.Expression, event: com.google.home.EventFactory<out com.google.home.Event>, parameters: kotlin.collections.List<com.google.home.automation.Parameter> = COMPILED_CODE, output: kotlin.String) { /* compiled code */ }

    internal constructor(entity: com.google.home.HasId, genericType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>? = COMPILED_CODE, trait: com.google.home.TraitFactory<out com.google.home.Trait>, output: kotlin.String, nodeId: kotlin.String? = COMPILED_CODE) { /* compiled code */ }

    internal constructor(entity: com.google.home.HasId, genericType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>? = COMPILED_CODE, event: com.google.home.EventFactory<out com.google.home.Event>, parameters: kotlin.collections.List<com.google.home.automation.Parameter> = COMPILED_CODE, output: kotlin.String, nodeId: kotlin.String? = COMPILED_CODE) { /* compiled code */ }

    internal constructor(entityExpression: com.google.home.automation.Expression, trait: com.google.home.TraitFactory<out com.google.home.Trait>, output: kotlin.String, nodeId: kotlin.String? = COMPILED_CODE) { /* compiled code */ }

    internal constructor(entityExpression: com.google.home.automation.Expression, event: com.google.home.EventFactory<out com.google.home.Event>, parameters: kotlin.collections.List<com.google.home.automation.Parameter> = COMPILED_CODE, output: kotlin.String, nodeId: kotlin.String? = COMPILED_CODE) { /* compiled code */ }

    public final val entity: com.google.home.HasId? /* compiled code */

    public final val deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>? /* compiled code */
        public final get

    private final val genericType: com.google.home.TypeFactory<out com.google.home.HomeObjectType>? /* compiled code */

    public final val entityExpression: com.google.home.automation.Expression /* compiled code */

    public final val trait: com.google.home.TraitFactory<out com.google.home.Trait>? /* compiled code */

    public final val event: com.google.home.EventFactory<out com.google.home.Event>? /* compiled code */

    public final val parameters: kotlin.collections.List<com.google.home.automation.Parameter> /* compiled code */

    public open val output: kotlin.String /* compiled code */

    public final val traitId: kotlin.String /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
