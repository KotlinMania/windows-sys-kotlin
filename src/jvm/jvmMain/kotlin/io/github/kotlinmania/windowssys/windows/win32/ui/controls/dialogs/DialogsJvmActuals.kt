@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32UiControlsDialogsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_ChooseColorA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_ChooseColorW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_ChooseFontA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_ChooseFontW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_CommDlgExtendedError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_FindTextA(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_FindTextW(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_GetFileTitleA(param0: Long, buf: Long, cchsize: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_GetFileTitleW(param0: Long, buf: Long, cchsize: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_GetOpenFileNameA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_GetOpenFileNameW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_GetSaveFileNameA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_GetSaveFileNameW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_PageSetupDlgA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_PageSetupDlgW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_PrintDlgA(ppd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_PrintDlgExA(ppd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_PrintDlgExW(ppd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_PrintDlgW(ppd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_ReplaceTextA(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_ReplaceTextW(param0: Long): Long
}

public actual fun ChooseColorA(param0: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_ChooseColorA(param0)

public actual fun ChooseColorW(param0: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_ChooseColorW(param0)

public actual fun ChooseFontA(param0: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_ChooseFontA(param0)

public actual fun ChooseFontW(param0: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_ChooseFontW(param0)

public actual fun CommDlgExtendedError(): COMMON_DLG_ERRORS =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_CommDlgExtendedError().toUInt()

public actual fun FindTextA(param0: Long): HWND =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_FindTextA(param0)

public actual fun FindTextW(param0: Long): HWND =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_FindTextW(param0)

public actual fun GetFileTitleA(param0: PCSTR, buf: PSTR, cchsize: UShort): Short =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_GetFileTitleA(param0, buf, cchsize.toShort())

public actual fun GetFileTitleW(param0: PCWSTR, buf: PWSTR, cchsize: UShort): Short =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_GetFileTitleW(param0, buf, cchsize.toShort())

public actual fun GetOpenFileNameA(param0: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_GetOpenFileNameA(param0)

public actual fun GetOpenFileNameW(param0: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_GetOpenFileNameW(param0)

public actual fun GetSaveFileNameA(param0: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_GetSaveFileNameA(param0)

public actual fun GetSaveFileNameW(param0: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_GetSaveFileNameW(param0)

public actual fun PageSetupDlgA(param0: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_PageSetupDlgA(param0)

public actual fun PageSetupDlgW(param0: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_PageSetupDlgW(param0)

public actual fun PrintDlgA(ppd: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_PrintDlgA(ppd)

public actual fun PrintDlgExA(ppd: Long): HRESULT =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_PrintDlgExA(ppd)

public actual fun PrintDlgExW(ppd: Long): HRESULT =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_PrintDlgExW(ppd)

public actual fun PrintDlgW(ppd: Long): BOOL =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_PrintDlgW(ppd)

public actual fun ReplaceTextA(param0: Long): HWND =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_ReplaceTextA(param0)

public actual fun ReplaceTextW(param0: Long): HWND =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_ReplaceTextW(param0)
