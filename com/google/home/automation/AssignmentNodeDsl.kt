// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public interface AssignmentNodeDsl : com.google.home.automation.AutomationFlowContributor {
    public open fun <T> variable(): com.google.home.automation.AssignmentNodeDsl.Variable<T> { /* compiled code */ }

    public open fun <T> @receiver:androidx.annotation.NonNull com.google.home.automation.AssignmentNodeDsl.Variable<T>.assign(expression: com.google.home.automation.TypedExpression<T>): kotlin.Unit { /* compiled code */ }

    public open fun <T> @receiver:androidx.annotation.NonNull com.google.home.automation.AssignmentNodeDsl.Variable<T>.assign(value: T): kotlin.Unit { /* compiled code */ }

    public final class Variable<T> internal constructor() : com.google.home.automation.TypedExpression<T> {
        public companion object {
        }

        internal final var assignment: com.google.home.automation.Assignment? /* compiled code */

        internal final val output: kotlin.String /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}
