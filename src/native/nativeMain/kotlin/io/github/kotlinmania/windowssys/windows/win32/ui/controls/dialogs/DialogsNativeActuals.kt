@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ChooseColorA(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_ChooseColorA(param0.toCPointer<ByteVar>())

public actual fun ChooseColorW(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_ChooseColorW(param0.toCPointer<ByteVar>())

public actual fun ChooseFontA(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_ChooseFontA(param0.toCPointer<ByteVar>())

public actual fun ChooseFontW(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_ChooseFontW(param0.toCPointer<ByteVar>())

public actual fun CommDlgExtendedError(): COMMON_DLG_ERRORS =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_CommDlgExtendedError()

public actual fun FindTextA(param0: Long): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_FindTextA(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindTextW(param0: Long): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_FindTextW(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetFileTitleA(param0: PCSTR, buf: PSTR, cchsize: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_GetFileTitleA(param0.toCPointer<ByteVar>(), buf.toCPointer<ByteVar>(), cchsize)

public actual fun GetFileTitleW(param0: PCWSTR, buf: PWSTR, cchsize: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_GetFileTitleW(param0.toCPointer<ByteVar>(), buf.toCPointer<ByteVar>(), cchsize)

public actual fun GetOpenFileNameA(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_GetOpenFileNameA(param0.toCPointer<ByteVar>())

public actual fun GetOpenFileNameW(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_GetOpenFileNameW(param0.toCPointer<ByteVar>())

public actual fun GetSaveFileNameA(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_GetSaveFileNameA(param0.toCPointer<ByteVar>())

public actual fun GetSaveFileNameW(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_GetSaveFileNameW(param0.toCPointer<ByteVar>())

public actual fun PageSetupDlgA(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_PageSetupDlgA(param0.toCPointer<ByteVar>())

public actual fun PageSetupDlgW(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_PageSetupDlgW(param0.toCPointer<ByteVar>())

public actual fun PrintDlgA(ppd: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_PrintDlgA(ppd.toCPointer<ByteVar>())

public actual fun PrintDlgExA(ppd: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_PrintDlgExA(ppd.toCPointer<ByteVar>())

public actual fun PrintDlgExW(ppd: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_PrintDlgExW(ppd.toCPointer<ByteVar>())

public actual fun PrintDlgW(ppd: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_PrintDlgW(ppd.toCPointer<ByteVar>())

public actual fun ReplaceTextA(param0: Long): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_ReplaceTextA(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ReplaceTextW(param0: Long): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_ReplaceTextW(param0.toCPointer<ByteVar>())?.toLong() ?: 0L
