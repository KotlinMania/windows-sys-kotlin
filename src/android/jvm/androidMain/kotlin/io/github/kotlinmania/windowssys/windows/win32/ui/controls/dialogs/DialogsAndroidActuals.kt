@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32UiControlsDialogsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_chooseColorA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_chooseColorW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_chooseFontA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_chooseFontW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_commDlgExtendedError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_findTextA(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_findTextW(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_getFileTitleA(param0: Long, buf: Long, cchsize: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_getFileTitleW(param0: Long, buf: Long, cchsize: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_printDlgA(ppd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_printDlgExA(ppd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_printDlgExW(ppd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_printDlgW(ppd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_replaceTextA(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dialogs_replaceTextW(param0: Long): Long
}

public actual fun chooseColorA(param0: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_chooseColorA((param0?.value ?: 0L))

public actual fun chooseColorW(param0: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_chooseColorW((param0?.value ?: 0L))

public actual fun chooseFontA(param0: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_chooseFontA((param0?.value ?: 0L))

public actual fun chooseFontW(param0: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_chooseFontW((param0?.value ?: 0L))

public actual fun commDlgExtendedError(): CommonDlgErrors =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_commDlgExtendedError().toUInt()

public actual fun findTextA(param0: COpaquePointer?): Hwnd =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_findTextA((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findTextW(param0: COpaquePointer?): Hwnd =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_findTextW((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_getFileTitleA((param0?.value ?: 0L), (buf?.value ?: 0L), cchsize.toShort())

public actual fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_getFileTitleW((param0?.value ?: 0L), (buf?.value ?: 0L), cchsize.toShort())

public actual fun getOpenFileNameA(param0: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameA((param0?.value ?: 0L))

public actual fun getOpenFileNameW(param0: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameW((param0?.value ?: 0L))

public actual fun getSaveFileNameA(param0: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameA((param0?.value ?: 0L))

public actual fun getSaveFileNameW(param0: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameW((param0?.value ?: 0L))

public actual fun pageSetupDlgA(param0: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgA((param0?.value ?: 0L))

public actual fun pageSetupDlgW(param0: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgW((param0?.value ?: 0L))

public actual fun printDlgA(ppd: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_printDlgA((ppd?.value ?: 0L))

public actual fun printDlgExA(ppd: COpaquePointer?): Hresult =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_printDlgExA((ppd?.value ?: 0L))

public actual fun printDlgExW(ppd: COpaquePointer?): Hresult =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_printDlgExW((ppd?.value ?: 0L))

public actual fun printDlgW(ppd: COpaquePointer?): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_printDlgW((ppd?.value ?: 0L))

public actual fun replaceTextA(param0: COpaquePointer?): Hwnd =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_replaceTextA((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun replaceTextW(param0: COpaquePointer?): Hwnd =
    WindowsWin32UiControlsDialogsJniBridge.windowssys_windows_win32_ui_controls_dialogs_replaceTextW((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }
