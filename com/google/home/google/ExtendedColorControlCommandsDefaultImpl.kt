// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedColorControlCommandsDefaultImpl : com.google.home.google.ExtendedColorControlCommands {
    public open suspend fun moveToColorName(colorName: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToColorRgb(red: kotlin.UByte, green: kotlin.UByte, blue: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToColorHsv(hue: kotlin.Float, saturation: kotlin.Float, value: kotlin.Float): kotlin.Unit { /* compiled code */ }

    public open fun moveToColorNameBatchable(colorName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToColorRgbBatchable(red: kotlin.UByte, green: kotlin.UByte, blue: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToColorHsvBatchable(hue: kotlin.Float, saturation: kotlin.Float, value: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
