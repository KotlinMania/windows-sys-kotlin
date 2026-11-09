@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private val _windowsWin32SystemConsoleNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AddConsoleAliasA(source: PCSTR, target: PCSTR, exename: PCSTR): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_AddConsoleAliasA(source.toString(), target.toString(), exename.toString()) as Int) else 0

public actual fun AddConsoleAliasW(source: PCWSTR, target: PCWSTR, exename: PCWSTR): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_AddConsoleAliasW(source.toString(), target.toString(), exename.toString()) as Int) else 0

public actual fun AllocConsole(): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_AllocConsole() as Int) else 0

public actual fun AttachConsole(dwprocessid: UInt): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_AttachConsole(dwprocessid.toInt()) as Int) else 0

public actual fun ClosePseudoConsole(hpc: HPCON) {
    if (_windowsWin32SystemConsoleNapiAddon != null) {
        _windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_ClosePseudoConsole(hpc.toString())
    }
}

public actual fun ConsoleControl(command: CONSOLECONTROL, consoleinformation: Long, consoleinformationlength: UInt): NTSTATUS =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_ConsoleControl(command, consoleinformation.toString(), consoleinformationlength.toInt()) as Int) else 0

public actual fun CreateConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwflags: UInt, lpscreenbufferdata: Long): HANDLE =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_CreateConsoleScreenBuffer(dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.toString(), dwflags.toInt(), lpscreenbufferdata.toString()) as String).toLong() else 0L

public actual fun CreatePseudoConsole(size: COORD, hinput: HANDLE, houtput: HANDLE, dwflags: UInt, phpc: Long): HRESULT =
    0

public actual fun ExpungeConsoleCommandHistoryA(exename: PCSTR) {
    if (_windowsWin32SystemConsoleNapiAddon != null) {
        _windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_ExpungeConsoleCommandHistoryA(exename.toString())
    }
}

public actual fun ExpungeConsoleCommandHistoryW(exename: PCWSTR) {
    if (_windowsWin32SystemConsoleNapiAddon != null) {
        _windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_ExpungeConsoleCommandHistoryW(exename.toString())
    }
}

public actual fun FillConsoleOutputAttribute(hconsoleoutput: HANDLE, wattribute: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL =
    0

public actual fun FillConsoleOutputCharacterA(hconsoleoutput: HANDLE, ccharacter: Byte, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL =
    0

public actual fun FillConsoleOutputCharacterW(hconsoleoutput: HANDLE, ccharacter: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL =
    0

public actual fun FlushConsoleInputBuffer(hconsoleinput: HANDLE): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_FlushConsoleInputBuffer(hconsoleinput.toString()) as Int) else 0

public actual fun FreeConsole(): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_FreeConsole() as Int) else 0

public actual fun GenerateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GenerateConsoleCtrlEvent(dwctrlevent.toInt(), dwprocessgroupid.toInt()) as Int) else 0

public actual fun GetConsoleAliasA(source: PCSTR, targetbuffer: PSTR, targetbufferlength: UInt, exename: PCSTR): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleAliasA(source.toString(), targetbuffer.toString(), targetbufferlength.toInt(), exename.toString()) as Int).toUInt() else 0u

public actual fun GetConsoleAliasExesA(exenamebuffer: PSTR, exenamebufferlength: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleAliasExesA(exenamebuffer.toString(), exenamebufferlength.toInt()) as Int).toUInt() else 0u

public actual fun GetConsoleAliasExesLengthA(): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleAliasExesLengthA() as Int).toUInt() else 0u

public actual fun GetConsoleAliasExesLengthW(): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleAliasExesLengthW() as Int).toUInt() else 0u

public actual fun GetConsoleAliasExesW(exenamebuffer: PWSTR, exenamebufferlength: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleAliasExesW(exenamebuffer.toString(), exenamebufferlength.toInt()) as Int).toUInt() else 0u

public actual fun GetConsoleAliasW(source: PCWSTR, targetbuffer: PWSTR, targetbufferlength: UInt, exename: PCWSTR): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleAliasW(source.toString(), targetbuffer.toString(), targetbufferlength.toInt(), exename.toString()) as Int).toUInt() else 0u

public actual fun GetConsoleAliasesA(aliasbuffer: PSTR, aliasbufferlength: UInt, exename: PCSTR): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleAliasesA(aliasbuffer.toString(), aliasbufferlength.toInt(), exename.toString()) as Int).toUInt() else 0u

public actual fun GetConsoleAliasesLengthA(exename: PCSTR): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleAliasesLengthA(exename.toString()) as Int).toUInt() else 0u

public actual fun GetConsoleAliasesLengthW(exename: PCWSTR): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleAliasesLengthW(exename.toString()) as Int).toUInt() else 0u

public actual fun GetConsoleAliasesW(aliasbuffer: PWSTR, aliasbufferlength: UInt, exename: PCWSTR): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleAliasesW(aliasbuffer.toString(), aliasbufferlength.toInt(), exename.toString()) as Int).toUInt() else 0u

public actual fun GetConsoleCP(): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleCP() as Int).toUInt() else 0u

public actual fun GetConsoleCommandHistoryA(commands: PSTR, commandbufferlength: UInt, exename: PCSTR): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleCommandHistoryA(commands.toString(), commandbufferlength.toInt(), exename.toString()) as Int).toUInt() else 0u

public actual fun GetConsoleCommandHistoryLengthA(exename: PCSTR): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleCommandHistoryLengthA(exename.toString()) as Int).toUInt() else 0u

public actual fun GetConsoleCommandHistoryLengthW(exename: PCWSTR): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleCommandHistoryLengthW(exename.toString()) as Int).toUInt() else 0u

public actual fun GetConsoleCommandHistoryW(commands: PWSTR, commandbufferlength: UInt, exename: PCWSTR): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleCommandHistoryW(commands.toString(), commandbufferlength.toInt(), exename.toString()) as Int).toUInt() else 0u

public actual fun GetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleCursorInfo(hconsoleoutput.toString(), lpconsolecursorinfo.toString()) as Int) else 0

public actual fun GetConsoleDisplayMode(lpmodeflags: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleDisplayMode(lpmodeflags.toString()) as Int) else 0

public actual fun GetConsoleFontSize(hconsoleoutput: HANDLE, nfont: UInt): COORD =
    COORD()

public actual fun GetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleHistoryInfo(lpconsolehistoryinfo.toString()) as Int) else 0

public actual fun GetConsoleMode(hconsolehandle: HANDLE, lpmode: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleMode(hconsolehandle.toString(), lpmode.toString()) as Int) else 0

public actual fun GetConsoleOriginalTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleOriginalTitleA(lpconsoletitle.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetConsoleOriginalTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleOriginalTitleW(lpconsoletitle.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetConsoleOutputCP(): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleOutputCP() as Int).toUInt() else 0u

public actual fun GetConsoleProcessList(lpdwprocesslist: Long, dwprocesscount: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleProcessList(lpdwprocesslist.toString(), dwprocesscount.toInt()) as Int).toUInt() else 0u

public actual fun GetConsoleScreenBufferInfo(hconsoleoutput: HANDLE, lpconsolescreenbufferinfo: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleScreenBufferInfo(hconsoleoutput.toString(), lpconsolescreenbufferinfo.toString()) as Int) else 0

public actual fun GetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleScreenBufferInfoEx(hconsoleoutput.toString(), lpconsolescreenbufferinfoex.toString()) as Int) else 0

public actual fun GetConsoleSelectionInfo(lpconsoleselectioninfo: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleSelectionInfo(lpconsoleselectioninfo.toString()) as Int) else 0

public actual fun GetConsoleTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleTitleA(lpconsoletitle.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetConsoleTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleTitleW(lpconsoletitle.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetConsoleWindow(): HWND =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetConsoleWindow() as String).toLong() else 0L

public actual fun GetCurrentConsoleFont(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfont: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetCurrentConsoleFont(hconsoleoutput.toString(), bmaximumwindow, lpconsolecurrentfont.toString()) as Int) else 0

public actual fun GetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetCurrentConsoleFontEx(hconsoleoutput.toString(), bmaximumwindow, lpconsolecurrentfontex.toString()) as Int) else 0

public actual fun GetLargestConsoleWindowSize(hconsoleoutput: HANDLE): COORD =
    COORD()

public actual fun GetNumberOfConsoleInputEvents(hconsoleinput: HANDLE, lpnumberofevents: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetNumberOfConsoleInputEvents(hconsoleinput.toString(), lpnumberofevents.toString()) as Int) else 0

public actual fun GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons.toString()) as Int) else 0

public actual fun GetStdHandle(nstdhandle: STD_HANDLE): HANDLE =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_GetStdHandle(nstdhandle.toInt()) as String).toLong() else 0L

public actual fun PeekConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_PeekConsoleInputA(hconsoleinput.toString(), lpbuffer.toString(), nlength.toInt(), lpnumberofeventsread.toString()) as Int) else 0

public actual fun PeekConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_PeekConsoleInputW(hconsoleinput.toString(), lpbuffer.toString(), nlength.toInt(), lpnumberofeventsread.toString()) as Int) else 0

public actual fun ReadConsoleA(hconsoleinput: HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_ReadConsoleA(hconsoleinput.toString(), lpbuffer.toString(), nnumberofcharstoread.toInt(), lpnumberofcharsread.toString(), pinputcontrol.toString()) as Int) else 0

public actual fun ReadConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_ReadConsoleInputA(hconsoleinput.toString(), lpbuffer.toString(), nlength.toInt(), lpnumberofeventsread.toString()) as Int) else 0

public actual fun ReadConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_ReadConsoleInputW(hconsoleinput.toString(), lpbuffer.toString(), nlength.toInt(), lpnumberofeventsread.toString()) as Int) else 0

public actual fun ReadConsoleOutputA(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpreadregion: Long): BOOL =
    0

public actual fun ReadConsoleOutputAttribute(hconsoleoutput: HANDLE, lpattribute: Long, nlength: UInt, dwreadcoord: COORD, lpnumberofattrsread: Long): BOOL =
    0

public actual fun ReadConsoleOutputCharacterA(hconsoleoutput: HANDLE, lpcharacter: PSTR, nlength: UInt, dwreadcoord: COORD, lpnumberofcharsread: Long): BOOL =
    0

public actual fun ReadConsoleOutputCharacterW(hconsoleoutput: HANDLE, lpcharacter: PWSTR, nlength: UInt, dwreadcoord: COORD, lpnumberofcharsread: Long): BOOL =
    0

public actual fun ReadConsoleOutputW(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpreadregion: Long): BOOL =
    0

public actual fun ReadConsoleW(hconsoleinput: HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_ReadConsoleW(hconsoleinput.toString(), lpbuffer.toString(), nnumberofcharstoread.toInt(), lpnumberofcharsread.toString(), pinputcontrol.toString()) as Int) else 0

public actual fun ResizePseudoConsole(hpc: HPCON, size: COORD): HRESULT =
    0

public actual fun ScrollConsoleScreenBufferA(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL =
    0

public actual fun ScrollConsoleScreenBufferW(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL =
    0

public actual fun SetConsoleActiveScreenBuffer(hconsoleoutput: HANDLE): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleActiveScreenBuffer(hconsoleoutput.toString()) as Int) else 0

public actual fun SetConsoleCP(wcodepageid: UInt): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleCP(wcodepageid.toInt()) as Int) else 0

public actual fun SetConsoleCtrlHandler(handlerroutine: PHANDLER_ROUTINE, add: BOOL): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleCtrlHandler(handlerroutine.toLong().toString(), add) as Int) else 0

public actual fun SetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleCursorInfo(hconsoleoutput.toString(), lpconsolecursorinfo.toString()) as Int) else 0

public actual fun SetConsoleCursorPosition(hconsoleoutput: HANDLE, dwcursorposition: COORD): BOOL =
    0

public actual fun SetConsoleDisplayMode(hconsoleoutput: HANDLE, dwflags: UInt, lpnewscreenbufferdimensions: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleDisplayMode(hconsoleoutput.toString(), dwflags.toInt(), lpnewscreenbufferdimensions.toString()) as Int) else 0

public actual fun SetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleHistoryInfo(lpconsolehistoryinfo.toString()) as Int) else 0

public actual fun SetConsoleMode(hconsolehandle: HANDLE, dwmode: CONSOLE_MODE): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleMode(hconsolehandle.toString(), dwmode.toInt()) as Int) else 0

public actual fun SetConsoleNumberOfCommandsA(number: UInt, exename: PCSTR): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleNumberOfCommandsA(number.toInt(), exename.toString()) as Int) else 0

public actual fun SetConsoleNumberOfCommandsW(number: UInt, exename: PCWSTR): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleNumberOfCommandsW(number.toInt(), exename.toString()) as Int) else 0

public actual fun SetConsoleOutputCP(wcodepageid: UInt): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleOutputCP(wcodepageid.toInt()) as Int) else 0

public actual fun SetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleScreenBufferInfoEx(hconsoleoutput.toString(), lpconsolescreenbufferinfoex.toString()) as Int) else 0

public actual fun SetConsoleScreenBufferSize(hconsoleoutput: HANDLE, dwsize: COORD): BOOL =
    0

public actual fun SetConsoleTextAttribute(hconsoleoutput: HANDLE, wattributes: CONSOLE_CHARACTER_ATTRIBUTES): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleTextAttribute(hconsoleoutput.toString(), wattributes.toInt()) as Int) else 0

public actual fun SetConsoleTitleA(lpconsoletitle: PCSTR): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleTitleA(lpconsoletitle.toString()) as Int) else 0

public actual fun SetConsoleTitleW(lpconsoletitle: PCWSTR): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleTitleW(lpconsoletitle.toString()) as Int) else 0

public actual fun SetConsoleWindowInfo(hconsoleoutput: HANDLE, babsolute: BOOL, lpconsolewindow: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetConsoleWindowInfo(hconsoleoutput.toString(), babsolute, lpconsolewindow.toString()) as Int) else 0

public actual fun SetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetCurrentConsoleFontEx(hconsoleoutput.toString(), bmaximumwindow, lpconsolecurrentfontex.toString()) as Int) else 0

public actual fun SetStdHandle(nstdhandle: STD_HANDLE, hhandle: HANDLE): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetStdHandle(nstdhandle.toInt(), hhandle.toString()) as Int) else 0

public actual fun SetStdHandleEx(nstdhandle: STD_HANDLE, hhandle: HANDLE, phprevvalue: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_SetStdHandleEx(nstdhandle.toInt(), hhandle.toString(), phprevvalue.toString()) as Int) else 0

public actual fun WriteConsoleA(hconsoleoutput: HANDLE, lpbuffer: PCSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_WriteConsoleA(hconsoleoutput.toString(), lpbuffer.toString(), nnumberofcharstowrite.toInt(), lpnumberofcharswritten.toString(), lpreserved.toString()) as Int) else 0

public actual fun WriteConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_WriteConsoleInputA(hconsoleinput.toString(), lpbuffer.toString(), nlength.toInt(), lpnumberofeventswritten.toString()) as Int) else 0

public actual fun WriteConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_WriteConsoleInputW(hconsoleinput.toString(), lpbuffer.toString(), nlength.toInt(), lpnumberofeventswritten.toString()) as Int) else 0

public actual fun WriteConsoleOutputA(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpwriteregion: Long): BOOL =
    0

public actual fun WriteConsoleOutputAttribute(hconsoleoutput: HANDLE, lpattribute: Long, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL =
    0

public actual fun WriteConsoleOutputCharacterA(hconsoleoutput: HANDLE, lpcharacter: PCSTR, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL =
    0

public actual fun WriteConsoleOutputCharacterW(hconsoleoutput: HANDLE, lpcharacter: PCWSTR, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL =
    0

public actual fun WriteConsoleOutputW(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpwriteregion: Long): BOOL =
    0

public actual fun WriteConsoleW(hconsoleoutput: HANDLE, lpbuffer: PCWSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL =
    if (_windowsWin32SystemConsoleNapiAddon != null) (_windowsWin32SystemConsoleNapiAddon.windowssys_windows_win32_system_console_WriteConsoleW(hconsoleoutput.toString(), lpbuffer.toString(), nnumberofcharstowrite.toInt(), lpnumberofcharswritten.toString(), lpreserved.toString()) as Int) else 0
