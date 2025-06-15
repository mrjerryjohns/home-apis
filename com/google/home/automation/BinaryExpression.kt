// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public sealed class BinaryExpression : com.google.home.automation.ExpressionWithId {
    protected constructor(operand1: com.google.home.automation.Expression, operand2: com.google.home.automation.Expression) { /* compiled code */ }

    protected constructor(operand1: com.google.home.automation.Expression, operand2: com.google.home.automation.Expression, expressionId: kotlin.String) { /* compiled code */ }

    public final val operand1: com.google.home.automation.Expression /* compiled code */

    public final val operand2: com.google.home.automation.Expression /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
