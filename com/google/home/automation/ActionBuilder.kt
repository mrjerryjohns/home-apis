// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

@com.google.home.automation.AutomationDsl public final class ActionBuilder public constructor(entity: com.google.home.HasId? = COMPILED_CODE, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>? = COMPILED_CODE, entityExpression: com.google.home.automation.Expression) {
    internal constructor(entity: com.google.home.HasId, deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>? = COMPILED_CODE) { /* compiled code */ }

    internal constructor(entityExpression: com.google.home.automation.Expression) { /* compiled code */ }

    public final val entity: com.google.home.HasId? /* compiled code */

    public final val deviceType: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>? /* compiled code */

    public final val entityExpression: com.google.home.automation.Expression /* compiled code */

    public final lateinit var actionBehavior: com.google.home.automation.ActionBehavior /* compiled code */

    public final fun command(command: com.google.home.automation.Command): kotlin.Unit { /* compiled code */ }

    public final fun <T : com.google.home.Trait> update(trait: com.google.home.TraitFactory<T>, block: com.google.home.automation.Updater<T>.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public final fun build(): com.google.home.automation.Action { /* compiled code */ }
}
