@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32UiControlsDialogsNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ChooseColorA(param0: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_ChooseColorA(param0.toString()) as Int) else 0

public actual fun ChooseColorW(param0: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_ChooseColorW(param0.toString()) as Int) else 0

public actual fun ChooseFontA(param0: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_ChooseFontA(param0.toString()) as Int) else 0

public actual fun ChooseFontW(param0: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_ChooseFontW(param0.toString()) as Int) else 0

public actual fun CommDlgExtendedError(): COMMON_DLG_ERRORS =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_CommDlgExtendedError() as Int).toUInt() else 0u

public actual fun FindTextA(param0: Long): HWND =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_FindTextA(param0.toString()) as String).toLong() else 0L

public actual fun FindTextW(param0: Long): HWND =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_FindTextW(param0.toString()) as String).toLong() else 0L

public actual fun GetFileTitleA(param0: PCSTR, buf: PSTR, cchsize: UShort): Short =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_GetFileTitleA(param0.toString(), buf.toString(), cchsize.toInt()) as Int).toShort() else 0

public actual fun GetFileTitleW(param0: PCWSTR, buf: PWSTR, cchsize: UShort): Short =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_GetFileTitleW(param0.toString(), buf.toString(), cchsize.toInt()) as Int).toShort() else 0

public actual fun GetOpenFileNameA(param0: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_GetOpenFileNameA(param0.toString()) as Int) else 0

public actual fun GetOpenFileNameW(param0: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_GetOpenFileNameW(param0.toString()) as Int) else 0

public actual fun GetSaveFileNameA(param0: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_GetSaveFileNameA(param0.toString()) as Int) else 0

public actual fun GetSaveFileNameW(param0: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_GetSaveFileNameW(param0.toString()) as Int) else 0

public actual fun PageSetupDlgA(param0: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_PageSetupDlgA(param0.toString()) as Int) else 0

public actual fun PageSetupDlgW(param0: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_PageSetupDlgW(param0.toString()) as Int) else 0

public actual fun PrintDlgA(ppd: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_PrintDlgA(ppd.toString()) as Int) else 0

public actual fun PrintDlgExA(ppd: Long): HRESULT =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_PrintDlgExA(ppd.toString()) as Int) else 0

public actual fun PrintDlgExW(ppd: Long): HRESULT =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_PrintDlgExW(ppd.toString()) as Int) else 0

public actual fun PrintDlgW(ppd: Long): BOOL =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_PrintDlgW(ppd.toString()) as Int) else 0

public actual fun ReplaceTextA(param0: Long): HWND =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_ReplaceTextA(param0.toString()) as String).toLong() else 0L

public actual fun ReplaceTextW(param0: Long): HWND =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_ReplaceTextW(param0.toString()) as String).toLong() else 0L
