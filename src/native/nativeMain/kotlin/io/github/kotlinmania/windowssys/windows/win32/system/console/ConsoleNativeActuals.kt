@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AddConsoleAliasA(source: PCSTR, target: PCSTR, exename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_AddConsoleAliasA(source.toCPointer<ByteVar>(), target.toCPointer<ByteVar>(), exename.toCPointer<ByteVar>())

public actual fun AddConsoleAliasW(source: PCWSTR, target: PCWSTR, exename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_AddConsoleAliasW(source.toCPointer<ByteVar>(), target.toCPointer<ByteVar>(), exename.toCPointer<ByteVar>())

public actual fun AllocConsole(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_AllocConsole()

public actual fun AttachConsole(dwprocessid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_AttachConsole(dwprocessid)

public actual fun ClosePseudoConsole(hpc: HPCON) {
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_ClosePseudoConsole(hpc)
}

public actual fun ConsoleControl(command: CONSOLECONTROL, consoleinformation: Long, consoleinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_ConsoleControl(command, consoleinformation.toCPointer<ByteVar>(), consoleinformationlength)

public actual fun CreateConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwflags: UInt, lpscreenbufferdata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_CreateConsoleScreenBuffer(dwdesiredaccess, dwsharemode, lpsecurityattributes.toCPointer<ByteVar>(), dwflags, lpscreenbufferdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreatePseudoConsole(size: COORD, hinput: HANDLE, houtput: HANDLE, dwflags: UInt, phpc: Long): HRESULT =
    0

public actual fun ExpungeConsoleCommandHistoryA(exename: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_ExpungeConsoleCommandHistoryA(exename.toCPointer<ByteVar>())
}

public actual fun ExpungeConsoleCommandHistoryW(exename: PCWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_ExpungeConsoleCommandHistoryW(exename.toCPointer<ByteVar>())
}

public actual fun FillConsoleOutputAttribute(hconsoleoutput: HANDLE, wattribute: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL =
    0

public actual fun FillConsoleOutputCharacterA(hconsoleoutput: HANDLE, ccharacter: Byte, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL =
    0

public actual fun FillConsoleOutputCharacterW(hconsoleoutput: HANDLE, ccharacter: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL =
    0

public actual fun FlushConsoleInputBuffer(hconsoleinput: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_FlushConsoleInputBuffer(hconsoleinput.toCPointer<ByteVar>())

public actual fun FreeConsole(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_FreeConsole()

public actual fun GenerateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GenerateConsoleCtrlEvent(dwctrlevent, dwprocessgroupid)

public actual fun GetConsoleAliasA(source: PCSTR, targetbuffer: PSTR, targetbufferlength: UInt, exename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleAliasA(source.toCPointer<ByteVar>(), targetbuffer.toCPointer<ByteVar>(), targetbufferlength, exename.toCPointer<ByteVar>())

public actual fun GetConsoleAliasExesA(exenamebuffer: PSTR, exenamebufferlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleAliasExesA(exenamebuffer.toCPointer<ByteVar>(), exenamebufferlength)

public actual fun GetConsoleAliasExesLengthA(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleAliasExesLengthA()

public actual fun GetConsoleAliasExesLengthW(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleAliasExesLengthW()

public actual fun GetConsoleAliasExesW(exenamebuffer: PWSTR, exenamebufferlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleAliasExesW(exenamebuffer.toCPointer<ByteVar>(), exenamebufferlength)

public actual fun GetConsoleAliasW(source: PCWSTR, targetbuffer: PWSTR, targetbufferlength: UInt, exename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleAliasW(source.toCPointer<ByteVar>(), targetbuffer.toCPointer<ByteVar>(), targetbufferlength, exename.toCPointer<ByteVar>())

public actual fun GetConsoleAliasesA(aliasbuffer: PSTR, aliasbufferlength: UInt, exename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleAliasesA(aliasbuffer.toCPointer<ByteVar>(), aliasbufferlength, exename.toCPointer<ByteVar>())

public actual fun GetConsoleAliasesLengthA(exename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleAliasesLengthA(exename.toCPointer<ByteVar>())

public actual fun GetConsoleAliasesLengthW(exename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleAliasesLengthW(exename.toCPointer<ByteVar>())

public actual fun GetConsoleAliasesW(aliasbuffer: PWSTR, aliasbufferlength: UInt, exename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleAliasesW(aliasbuffer.toCPointer<ByteVar>(), aliasbufferlength, exename.toCPointer<ByteVar>())

public actual fun GetConsoleCP(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleCP()

public actual fun GetConsoleCommandHistoryA(commands: PSTR, commandbufferlength: UInt, exename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleCommandHistoryA(commands.toCPointer<ByteVar>(), commandbufferlength, exename.toCPointer<ByteVar>())

public actual fun GetConsoleCommandHistoryLengthA(exename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleCommandHistoryLengthA(exename.toCPointer<ByteVar>())

public actual fun GetConsoleCommandHistoryLengthW(exename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleCommandHistoryLengthW(exename.toCPointer<ByteVar>())

public actual fun GetConsoleCommandHistoryW(commands: PWSTR, commandbufferlength: UInt, exename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleCommandHistoryW(commands.toCPointer<ByteVar>(), commandbufferlength, exename.toCPointer<ByteVar>())

public actual fun GetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleCursorInfo(hconsoleoutput.toCPointer<ByteVar>(), lpconsolecursorinfo.toCPointer<ByteVar>())

public actual fun GetConsoleDisplayMode(lpmodeflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleDisplayMode(lpmodeflags.toCPointer<ByteVar>())

public actual fun GetConsoleFontSize(hconsoleoutput: HANDLE, nfont: UInt): COORD =
    COORD()

public actual fun GetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleHistoryInfo(lpconsolehistoryinfo.toCPointer<ByteVar>())

public actual fun GetConsoleMode(hconsolehandle: HANDLE, lpmode: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleMode(hconsolehandle.toCPointer<ByteVar>(), lpmode.toCPointer<ByteVar>())

public actual fun GetConsoleOriginalTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleOriginalTitleA(lpconsoletitle.toCPointer<ByteVar>(), nsize)

public actual fun GetConsoleOriginalTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleOriginalTitleW(lpconsoletitle.toCPointer<ByteVar>(), nsize)

public actual fun GetConsoleOutputCP(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleOutputCP()

public actual fun GetConsoleProcessList(lpdwprocesslist: Long, dwprocesscount: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleProcessList(lpdwprocesslist.toCPointer<ByteVar>(), dwprocesscount)

public actual fun GetConsoleScreenBufferInfo(hconsoleoutput: HANDLE, lpconsolescreenbufferinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleScreenBufferInfo(hconsoleoutput.toCPointer<ByteVar>(), lpconsolescreenbufferinfo.toCPointer<ByteVar>())

public actual fun GetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleScreenBufferInfoEx(hconsoleoutput.toCPointer<ByteVar>(), lpconsolescreenbufferinfoex.toCPointer<ByteVar>())

public actual fun GetConsoleSelectionInfo(lpconsoleselectioninfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleSelectionInfo(lpconsoleselectioninfo.toCPointer<ByteVar>())

public actual fun GetConsoleTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleTitleA(lpconsoletitle.toCPointer<ByteVar>(), nsize)

public actual fun GetConsoleTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleTitleW(lpconsoletitle.toCPointer<ByteVar>(), nsize)

public actual fun GetConsoleWindow(): HWND =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetConsoleWindow()?.toLong() ?: 0L

public actual fun GetCurrentConsoleFont(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfont: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetCurrentConsoleFont(hconsoleoutput.toCPointer<ByteVar>(), bmaximumwindow, lpconsolecurrentfont.toCPointer<ByteVar>())

public actual fun GetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetCurrentConsoleFontEx(hconsoleoutput.toCPointer<ByteVar>(), bmaximumwindow, lpconsolecurrentfontex.toCPointer<ByteVar>())

public actual fun GetLargestConsoleWindowSize(hconsoleoutput: HANDLE): COORD =
    COORD()

public actual fun GetNumberOfConsoleInputEvents(hconsoleinput: HANDLE, lpnumberofevents: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetNumberOfConsoleInputEvents(hconsoleinput.toCPointer<ByteVar>(), lpnumberofevents.toCPointer<ByteVar>())

public actual fun GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons.toCPointer<ByteVar>())

public actual fun GetStdHandle(nstdhandle: STD_HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_GetStdHandle(nstdhandle)?.toLong() ?: 0L

public actual fun PeekConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_PeekConsoleInputA(hconsoleinput.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nlength, lpnumberofeventsread.toCPointer<ByteVar>())

public actual fun PeekConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_PeekConsoleInputW(hconsoleinput.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nlength, lpnumberofeventsread.toCPointer<ByteVar>())

public actual fun ReadConsoleA(hconsoleinput: HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_ReadConsoleA(hconsoleinput.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nnumberofcharstoread, lpnumberofcharsread.toCPointer<ByteVar>(), pinputcontrol.toCPointer<ByteVar>())

public actual fun ReadConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_ReadConsoleInputA(hconsoleinput.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nlength, lpnumberofeventsread.toCPointer<ByteVar>())

public actual fun ReadConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_ReadConsoleInputW(hconsoleinput.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nlength, lpnumberofeventsread.toCPointer<ByteVar>())

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
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_ReadConsoleW(hconsoleinput.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nnumberofcharstoread, lpnumberofcharsread.toCPointer<ByteVar>(), pinputcontrol.toCPointer<ByteVar>())

public actual fun ResizePseudoConsole(hpc: HPCON, size: COORD): HRESULT =
    0

public actual fun ScrollConsoleScreenBufferA(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL =
    0

public actual fun ScrollConsoleScreenBufferW(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL =
    0

public actual fun SetConsoleActiveScreenBuffer(hconsoleoutput: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleActiveScreenBuffer(hconsoleoutput.toCPointer<ByteVar>())

public actual fun SetConsoleCP(wcodepageid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleCP(wcodepageid)

public actual fun SetConsoleCtrlHandler(handlerroutine: PHANDLER_ROUTINE, add: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleCtrlHandler(handlerroutine.toLong().toCPointer<ByteVar>(), add)

public actual fun SetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleCursorInfo(hconsoleoutput.toCPointer<ByteVar>(), lpconsolecursorinfo.toCPointer<ByteVar>())

public actual fun SetConsoleCursorPosition(hconsoleoutput: HANDLE, dwcursorposition: COORD): BOOL =
    0

public actual fun SetConsoleDisplayMode(hconsoleoutput: HANDLE, dwflags: UInt, lpnewscreenbufferdimensions: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleDisplayMode(hconsoleoutput.toCPointer<ByteVar>(), dwflags, lpnewscreenbufferdimensions.toCPointer<ByteVar>())

public actual fun SetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleHistoryInfo(lpconsolehistoryinfo.toCPointer<ByteVar>())

public actual fun SetConsoleMode(hconsolehandle: HANDLE, dwmode: CONSOLE_MODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleMode(hconsolehandle.toCPointer<ByteVar>(), dwmode)

public actual fun SetConsoleNumberOfCommandsA(number: UInt, exename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleNumberOfCommandsA(number, exename.toCPointer<ByteVar>())

public actual fun SetConsoleNumberOfCommandsW(number: UInt, exename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleNumberOfCommandsW(number, exename.toCPointer<ByteVar>())

public actual fun SetConsoleOutputCP(wcodepageid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleOutputCP(wcodepageid)

public actual fun SetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleScreenBufferInfoEx(hconsoleoutput.toCPointer<ByteVar>(), lpconsolescreenbufferinfoex.toCPointer<ByteVar>())

public actual fun SetConsoleScreenBufferSize(hconsoleoutput: HANDLE, dwsize: COORD): BOOL =
    0

public actual fun SetConsoleTextAttribute(hconsoleoutput: HANDLE, wattributes: CONSOLE_CHARACTER_ATTRIBUTES): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleTextAttribute(hconsoleoutput.toCPointer<ByteVar>(), wattributes)

public actual fun SetConsoleTitleA(lpconsoletitle: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleTitleA(lpconsoletitle.toCPointer<ByteVar>())

public actual fun SetConsoleTitleW(lpconsoletitle: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleTitleW(lpconsoletitle.toCPointer<ByteVar>())

public actual fun SetConsoleWindowInfo(hconsoleoutput: HANDLE, babsolute: BOOL, lpconsolewindow: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetConsoleWindowInfo(hconsoleoutput.toCPointer<ByteVar>(), babsolute, lpconsolewindow.toCPointer<ByteVar>())

public actual fun SetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetCurrentConsoleFontEx(hconsoleoutput.toCPointer<ByteVar>(), bmaximumwindow, lpconsolecurrentfontex.toCPointer<ByteVar>())

public actual fun SetStdHandle(nstdhandle: STD_HANDLE, hhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetStdHandle(nstdhandle, hhandle.toCPointer<ByteVar>())

public actual fun SetStdHandleEx(nstdhandle: STD_HANDLE, hhandle: HANDLE, phprevvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_SetStdHandleEx(nstdhandle, hhandle.toCPointer<ByteVar>(), phprevvalue.toCPointer<ByteVar>())

public actual fun WriteConsoleA(hconsoleoutput: HANDLE, lpbuffer: PCSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_WriteConsoleA(hconsoleoutput.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nnumberofcharstowrite, lpnumberofcharswritten.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun WriteConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_WriteConsoleInputA(hconsoleinput.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nlength, lpnumberofeventswritten.toCPointer<ByteVar>())

public actual fun WriteConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_WriteConsoleInputW(hconsoleinput.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nlength, lpnumberofeventswritten.toCPointer<ByteVar>())

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
    io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_WriteConsoleW(hconsoleoutput.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nnumberofcharstowrite, lpnumberofcharswritten.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())
