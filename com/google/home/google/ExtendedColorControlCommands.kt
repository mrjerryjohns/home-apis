// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedColorControlCommands {
    public abstract suspend fun moveToColorName(colorName: kotlin.String): kotlin.Unit

    public abstract suspend fun moveToColorRgb(red: kotlin.UByte, green: kotlin.UByte, blue: kotlin.UByte): kotlin.Unit

    public abstract suspend fun moveToColorHsv(hue: kotlin.Float, saturation: kotlin.Float, value: kotlin.Float): kotlin.Unit

    public abstract fun moveToColorNameBatchable(colorName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveToColorRgbBatchable(red: kotlin.UByte, green: kotlin.UByte, blue: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveToColorHsvBatchable(hue: kotlin.Float, saturation: kotlin.Float, value: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit>
}
