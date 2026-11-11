@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_chooseColorA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_chooseColorW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_chooseFontA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_chooseFontW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_commDlgExtendedError
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_findTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_findTextW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_getFileTitleA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_getFileTitleW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_printDlgA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_printDlgExA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_printDlgExW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_printDlgW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_replaceTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssys_windows_win32_ui_controls_dialogs_replaceTextW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun chooseColorA(param0: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_chooseColorA(param0?.value?.toCPointer<ByteVar>())

public actual fun chooseColorW(param0: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_chooseColorW(param0?.value?.toCPointer<ByteVar>())

public actual fun chooseFontA(param0: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_chooseFontA(param0?.value?.toCPointer<ByteVar>())

public actual fun chooseFontW(param0: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_chooseFontW(param0?.value?.toCPointer<ByteVar>())

public actual fun commDlgExtendedError(): CommonDlgErrors =
    windowssys_windows_win32_ui_controls_dialogs_commDlgExtendedError()

public actual fun findTextA(param0: COpaquePointer?): Hwnd =
    windowssys_windows_win32_ui_controls_dialogs_findTextA(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findTextW(param0: COpaquePointer?): Hwnd =
    windowssys_windows_win32_ui_controls_dialogs_findTextW(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short =
    windowssys_windows_win32_ui_controls_dialogs_getFileTitleA(param0?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), cchsize)

public actual fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short =
    windowssys_windows_win32_ui_controls_dialogs_getFileTitleW(param0?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), cchsize)

public actual fun getOpenFileNameA(param0: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameA(param0?.value?.toCPointer<ByteVar>())

public actual fun getOpenFileNameW(param0: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameW(param0?.value?.toCPointer<ByteVar>())

public actual fun getSaveFileNameA(param0: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameA(param0?.value?.toCPointer<ByteVar>())

public actual fun getSaveFileNameW(param0: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameW(param0?.value?.toCPointer<ByteVar>())

public actual fun pageSetupDlgA(param0: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgA(param0?.value?.toCPointer<ByteVar>())

public actual fun pageSetupDlgW(param0: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgW(param0?.value?.toCPointer<ByteVar>())

public actual fun printDlgA(ppd: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_printDlgA(ppd?.value?.toCPointer<ByteVar>())

public actual fun printDlgExA(ppd: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_controls_dialogs_printDlgExA(ppd?.value?.toCPointer<ByteVar>())

public actual fun printDlgExW(ppd: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_controls_dialogs_printDlgExW(ppd?.value?.toCPointer<ByteVar>())

public actual fun printDlgW(ppd: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_controls_dialogs_printDlgW(ppd?.value?.toCPointer<ByteVar>())

public actual fun replaceTextA(param0: COpaquePointer?): Hwnd =
    windowssys_windows_win32_ui_controls_dialogs_replaceTextA(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun replaceTextW(param0: COpaquePointer?): Hwnd =
    windowssys_windows_win32_ui_controls_dialogs_replaceTextW(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }
