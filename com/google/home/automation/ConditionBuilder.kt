// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

@com.google.home.automation.AutomationDsl public final class ConditionBuilder public constructor() {
    public companion object {
        public final fun <T> constant(value: T): com.google.home.automation.TypedExpression<T> { /* compiled code */ }
    }

    public final lateinit var expression: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */

    public final var forDuration: java.time.Duration? /* compiled code */

    public final fun expression(expression: com.google.home.automation.TypedExpression<kotlin.Boolean>): kotlin.Unit { /* compiled code */ }

    public final fun forDuration(forDuration: java.time.Duration?): kotlin.Unit { /* compiled code */ }

    public final fun build(): com.google.home.automation.Condition { /* compiled code */ }
}
