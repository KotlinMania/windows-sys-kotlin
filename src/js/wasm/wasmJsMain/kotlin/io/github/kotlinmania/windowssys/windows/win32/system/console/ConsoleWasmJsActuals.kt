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

public actual fun AddConsoleAliasA(source: PCSTR, target: PCSTR, exename: PCSTR): BOOL =
    0

public actual fun AddConsoleAliasW(source: PCWSTR, target: PCWSTR, exename: PCWSTR): BOOL =
    0

public actual fun AllocConsole(): BOOL =
    0

public actual fun AttachConsole(dwprocessid: UInt): BOOL =
    0

public actual fun ClosePseudoConsole(hpc: HPCON) {
}

public actual fun ConsoleControl(command: CONSOLECONTROL, consoleinformation: Long, consoleinformationlength: UInt): NTSTATUS =
    0

public actual fun CreateConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwflags: UInt, lpscreenbufferdata: Long): HANDLE =
    0L

public actual fun CreatePseudoConsole(size: COORD, hinput: HANDLE, houtput: HANDLE, dwflags: UInt, phpc: Long): HRESULT =
    0

public actual fun ExpungeConsoleCommandHistoryA(exename: PCSTR) {
}

public actual fun ExpungeConsoleCommandHistoryW(exename: PCWSTR) {
}

public actual fun FillConsoleOutputAttribute(hconsoleoutput: HANDLE, wattribute: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL =
    0

public actual fun FillConsoleOutputCharacterA(hconsoleoutput: HANDLE, ccharacter: Byte, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL =
    0

public actual fun FillConsoleOutputCharacterW(hconsoleoutput: HANDLE, ccharacter: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL =
    0

public actual fun FlushConsoleInputBuffer(hconsoleinput: HANDLE): BOOL =
    0

public actual fun FreeConsole(): BOOL =
    0

public actual fun GenerateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): BOOL =
    0

public actual fun GetConsoleAliasA(source: PCSTR, targetbuffer: PSTR, targetbufferlength: UInt, exename: PCSTR): UInt =
    0u

public actual fun GetConsoleAliasExesA(exenamebuffer: PSTR, exenamebufferlength: UInt): UInt =
    0u

public actual fun GetConsoleAliasExesLengthA(): UInt =
    0u

public actual fun GetConsoleAliasExesLengthW(): UInt =
    0u

public actual fun GetConsoleAliasExesW(exenamebuffer: PWSTR, exenamebufferlength: UInt): UInt =
    0u

public actual fun GetConsoleAliasW(source: PCWSTR, targetbuffer: PWSTR, targetbufferlength: UInt, exename: PCWSTR): UInt =
    0u

public actual fun GetConsoleAliasesA(aliasbuffer: PSTR, aliasbufferlength: UInt, exename: PCSTR): UInt =
    0u

public actual fun GetConsoleAliasesLengthA(exename: PCSTR): UInt =
    0u

public actual fun GetConsoleAliasesLengthW(exename: PCWSTR): UInt =
    0u

public actual fun GetConsoleAliasesW(aliasbuffer: PWSTR, aliasbufferlength: UInt, exename: PCWSTR): UInt =
    0u

public actual fun GetConsoleCP(): UInt =
    0u

public actual fun GetConsoleCommandHistoryA(commands: PSTR, commandbufferlength: UInt, exename: PCSTR): UInt =
    0u

public actual fun GetConsoleCommandHistoryLengthA(exename: PCSTR): UInt =
    0u

public actual fun GetConsoleCommandHistoryLengthW(exename: PCWSTR): UInt =
    0u

public actual fun GetConsoleCommandHistoryW(commands: PWSTR, commandbufferlength: UInt, exename: PCWSTR): UInt =
    0u

public actual fun GetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL =
    0

public actual fun GetConsoleDisplayMode(lpmodeflags: Long): BOOL =
    0

public actual fun GetConsoleFontSize(hconsoleoutput: HANDLE, nfont: UInt): COORD =
    COORD()

public actual fun GetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL =
    0

public actual fun GetConsoleMode(hconsolehandle: HANDLE, lpmode: Long): BOOL =
    0

public actual fun GetConsoleOriginalTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetConsoleOriginalTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetConsoleOutputCP(): UInt =
    0u

public actual fun GetConsoleProcessList(lpdwprocesslist: Long, dwprocesscount: UInt): UInt =
    0u

public actual fun GetConsoleScreenBufferInfo(hconsoleoutput: HANDLE, lpconsolescreenbufferinfo: Long): BOOL =
    0

public actual fun GetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL =
    0

public actual fun GetConsoleSelectionInfo(lpconsoleselectioninfo: Long): BOOL =
    0

public actual fun GetConsoleTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetConsoleTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetConsoleWindow(): HWND =
    0L

public actual fun GetCurrentConsoleFont(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfont: Long): BOOL =
    0

public actual fun GetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL =
    0

public actual fun GetLargestConsoleWindowSize(hconsoleoutput: HANDLE): COORD =
    COORD()

public actual fun GetNumberOfConsoleInputEvents(hconsoleinput: HANDLE, lpnumberofevents: Long): BOOL =
    0

public actual fun GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons: Long): BOOL =
    0

public actual fun GetStdHandle(nstdhandle: STD_HANDLE): HANDLE =
    0L

public actual fun PeekConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    0

public actual fun PeekConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    0

public actual fun ReadConsoleA(hconsoleinput: HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL =
    0

public actual fun ReadConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    0

public actual fun ReadConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    0

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
    0

public actual fun ResizePseudoConsole(hpc: HPCON, size: COORD): HRESULT =
    0

public actual fun ScrollConsoleScreenBufferA(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL =
    0

public actual fun ScrollConsoleScreenBufferW(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL =
    0

public actual fun SetConsoleActiveScreenBuffer(hconsoleoutput: HANDLE): BOOL =
    0

public actual fun SetConsoleCP(wcodepageid: UInt): BOOL =
    0

public actual fun SetConsoleCtrlHandler(handlerroutine: PHANDLER_ROUTINE, add: BOOL): BOOL =
    0

public actual fun SetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL =
    0

public actual fun SetConsoleCursorPosition(hconsoleoutput: HANDLE, dwcursorposition: COORD): BOOL =
    0

public actual fun SetConsoleDisplayMode(hconsoleoutput: HANDLE, dwflags: UInt, lpnewscreenbufferdimensions: Long): BOOL =
    0

public actual fun SetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL =
    0

public actual fun SetConsoleMode(hconsolehandle: HANDLE, dwmode: CONSOLE_MODE): BOOL =
    0

public actual fun SetConsoleNumberOfCommandsA(number: UInt, exename: PCSTR): BOOL =
    0

public actual fun SetConsoleNumberOfCommandsW(number: UInt, exename: PCWSTR): BOOL =
    0

public actual fun SetConsoleOutputCP(wcodepageid: UInt): BOOL =
    0

public actual fun SetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL =
    0

public actual fun SetConsoleScreenBufferSize(hconsoleoutput: HANDLE, dwsize: COORD): BOOL =
    0

public actual fun SetConsoleTextAttribute(hconsoleoutput: HANDLE, wattributes: CONSOLE_CHARACTER_ATTRIBUTES): BOOL =
    0

public actual fun SetConsoleTitleA(lpconsoletitle: PCSTR): BOOL =
    0

public actual fun SetConsoleTitleW(lpconsoletitle: PCWSTR): BOOL =
    0

public actual fun SetConsoleWindowInfo(hconsoleoutput: HANDLE, babsolute: BOOL, lpconsolewindow: Long): BOOL =
    0

public actual fun SetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL =
    0

public actual fun SetStdHandle(nstdhandle: STD_HANDLE, hhandle: HANDLE): BOOL =
    0

public actual fun SetStdHandleEx(nstdhandle: STD_HANDLE, hhandle: HANDLE, phprevvalue: Long): BOOL =
    0

public actual fun WriteConsoleA(hconsoleoutput: HANDLE, lpbuffer: PCSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL =
    0

public actual fun WriteConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL =
    0

public actual fun WriteConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL =
    0

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
    0
