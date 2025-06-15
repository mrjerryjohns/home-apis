// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

internal object TypedExpressions {
    private final val registeredExpressions: kotlinx.coroutines.flow.MutableStateFlow<kotlin.collections.List<(com.google.home.automation.TypedExpression<*>) -> com.google.home.automation.Expression?>> /* compiled code */

    public final inline fun <reified T : com.google.home.automation.TypedExpression<*>> register(crossinline body: T.() -> com.google.home.automation.Expression): kotlin.Unit { /* compiled code */ }

    public final fun getExpression(expression: com.google.home.automation.TypedExpression<*>): com.google.home.automation.Expression? { /* compiled code */ }
}
