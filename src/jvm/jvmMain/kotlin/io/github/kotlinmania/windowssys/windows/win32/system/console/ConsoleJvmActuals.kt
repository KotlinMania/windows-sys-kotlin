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

private object WindowsWin32SystemConsoleJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_console_AddConsoleAliasA(source: Long, target: Long, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_AddConsoleAliasW(source: Long, target: Long, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_AllocConsole(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_AttachConsole(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_ClosePseudoConsole(hpc: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_console_ConsoleControl(command: Int, consoleinformation: Long, consoleinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_CreateConsoleScreenBuffer(dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwflags: Int, lpscreenbufferdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_console_ExpungeConsoleCommandHistoryA(exename: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_console_ExpungeConsoleCommandHistoryW(exename: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_console_FlushConsoleInputBuffer(hconsoleinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_FreeConsole(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GenerateConsoleCtrlEvent(dwctrlevent: Int, dwprocessgroupid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleAliasA(source: Long, targetbuffer: Long, targetbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleAliasExesA(exenamebuffer: Long, exenamebufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleAliasExesLengthA(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleAliasExesLengthW(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleAliasExesW(exenamebuffer: Long, exenamebufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleAliasW(source: Long, targetbuffer: Long, targetbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleAliasesA(aliasbuffer: Long, aliasbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleAliasesLengthA(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleAliasesLengthW(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleAliasesW(aliasbuffer: Long, aliasbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleCP(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleCommandHistoryA(commands: Long, commandbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleCommandHistoryLengthA(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleCommandHistoryLengthW(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleCommandHistoryW(commands: Long, commandbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleCursorInfo(hconsoleoutput: Long, lpconsolecursorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleDisplayMode(lpmodeflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleHistoryInfo(lpconsolehistoryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleMode(hconsolehandle: Long, lpmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleOriginalTitleA(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleOriginalTitleW(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleOutputCP(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleProcessList(lpdwprocesslist: Long, dwprocesscount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleScreenBufferInfo(hconsoleoutput: Long, lpconsolescreenbufferinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleScreenBufferInfoEx(hconsoleoutput: Long, lpconsolescreenbufferinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleSelectionInfo(lpconsoleselectioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleTitleA(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleTitleW(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetConsoleWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetCurrentConsoleFont(hconsoleoutput: Long, bmaximumwindow: Int, lpconsolecurrentfont: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetCurrentConsoleFontEx(hconsoleoutput: Long, bmaximumwindow: Int, lpconsolecurrentfontex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetNumberOfConsoleInputEvents(hconsoleinput: Long, lpnumberofevents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_GetStdHandle(nstdhandle: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_console_PeekConsoleInputA(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_PeekConsoleInputW(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_ReadConsoleA(hconsoleinput: Long, lpbuffer: Long, nnumberofcharstoread: Int, lpnumberofcharsread: Long, pinputcontrol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_ReadConsoleInputA(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_ReadConsoleInputW(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_ReadConsoleW(hconsoleinput: Long, lpbuffer: Long, nnumberofcharstoread: Int, lpnumberofcharsread: Long, pinputcontrol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleActiveScreenBuffer(hconsoleoutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleCP(wcodepageid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleCtrlHandler(handlerroutine: Long, add: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleCursorInfo(hconsoleoutput: Long, lpconsolecursorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleDisplayMode(hconsoleoutput: Long, dwflags: Int, lpnewscreenbufferdimensions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleHistoryInfo(lpconsolehistoryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleMode(hconsolehandle: Long, dwmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleNumberOfCommandsA(number: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleNumberOfCommandsW(number: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleOutputCP(wcodepageid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleScreenBufferInfoEx(hconsoleoutput: Long, lpconsolescreenbufferinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleTextAttribute(hconsoleoutput: Long, wattributes: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleTitleA(lpconsoletitle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleTitleW(lpconsoletitle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetConsoleWindowInfo(hconsoleoutput: Long, babsolute: Int, lpconsolewindow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetCurrentConsoleFontEx(hconsoleoutput: Long, bmaximumwindow: Int, lpconsolecurrentfontex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetStdHandle(nstdhandle: Int, hhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_SetStdHandleEx(nstdhandle: Int, hhandle: Long, phprevvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_WriteConsoleA(hconsoleoutput: Long, lpbuffer: Long, nnumberofcharstowrite: Int, lpnumberofcharswritten: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_WriteConsoleInputA(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_WriteConsoleInputW(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_WriteConsoleW(hconsoleoutput: Long, lpbuffer: Long, nnumberofcharstowrite: Int, lpnumberofcharswritten: Long, lpreserved: Long): Int
}

public actual fun AddConsoleAliasA(source: PCSTR, target: PCSTR, exename: PCSTR): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_AddConsoleAliasA(source, target, exename)

public actual fun AddConsoleAliasW(source: PCWSTR, target: PCWSTR, exename: PCWSTR): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_AddConsoleAliasW(source, target, exename)

public actual fun AllocConsole(): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_AllocConsole()

public actual fun AttachConsole(dwprocessid: UInt): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_AttachConsole(dwprocessid.toInt())

public actual fun ClosePseudoConsole(hpc: HPCON) {
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_ClosePseudoConsole(hpc)
}

public actual fun ConsoleControl(command: CONSOLECONTROL, consoleinformation: Long, consoleinformationlength: UInt): NTSTATUS =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_ConsoleControl(command, consoleinformation, consoleinformationlength.toInt())

public actual fun CreateConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwflags: UInt, lpscreenbufferdata: Long): HANDLE =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_CreateConsoleScreenBuffer(dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes, dwflags.toInt(), lpscreenbufferdata)

public actual fun CreatePseudoConsole(size: COORD, hinput: HANDLE, houtput: HANDLE, dwflags: UInt, phpc: Long): HRESULT =
    0

public actual fun ExpungeConsoleCommandHistoryA(exename: PCSTR) {
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_ExpungeConsoleCommandHistoryA(exename)
}

public actual fun ExpungeConsoleCommandHistoryW(exename: PCWSTR) {
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_ExpungeConsoleCommandHistoryW(exename)
}

public actual fun FillConsoleOutputAttribute(hconsoleoutput: HANDLE, wattribute: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL =
    0

public actual fun FillConsoleOutputCharacterA(hconsoleoutput: HANDLE, ccharacter: Byte, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL =
    0

public actual fun FillConsoleOutputCharacterW(hconsoleoutput: HANDLE, ccharacter: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL =
    0

public actual fun FlushConsoleInputBuffer(hconsoleinput: HANDLE): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_FlushConsoleInputBuffer(hconsoleinput)

public actual fun FreeConsole(): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_FreeConsole()

public actual fun GenerateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GenerateConsoleCtrlEvent(dwctrlevent.toInt(), dwprocessgroupid.toInt())

public actual fun GetConsoleAliasA(source: PCSTR, targetbuffer: PSTR, targetbufferlength: UInt, exename: PCSTR): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleAliasA(source, targetbuffer, targetbufferlength.toInt(), exename).toUInt()

public actual fun GetConsoleAliasExesA(exenamebuffer: PSTR, exenamebufferlength: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleAliasExesA(exenamebuffer, exenamebufferlength.toInt()).toUInt()

public actual fun GetConsoleAliasExesLengthA(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleAliasExesLengthA().toUInt()

public actual fun GetConsoleAliasExesLengthW(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleAliasExesLengthW().toUInt()

public actual fun GetConsoleAliasExesW(exenamebuffer: PWSTR, exenamebufferlength: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleAliasExesW(exenamebuffer, exenamebufferlength.toInt()).toUInt()

public actual fun GetConsoleAliasW(source: PCWSTR, targetbuffer: PWSTR, targetbufferlength: UInt, exename: PCWSTR): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleAliasW(source, targetbuffer, targetbufferlength.toInt(), exename).toUInt()

public actual fun GetConsoleAliasesA(aliasbuffer: PSTR, aliasbufferlength: UInt, exename: PCSTR): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleAliasesA(aliasbuffer, aliasbufferlength.toInt(), exename).toUInt()

public actual fun GetConsoleAliasesLengthA(exename: PCSTR): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleAliasesLengthA(exename).toUInt()

public actual fun GetConsoleAliasesLengthW(exename: PCWSTR): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleAliasesLengthW(exename).toUInt()

public actual fun GetConsoleAliasesW(aliasbuffer: PWSTR, aliasbufferlength: UInt, exename: PCWSTR): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleAliasesW(aliasbuffer, aliasbufferlength.toInt(), exename).toUInt()

public actual fun GetConsoleCP(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleCP().toUInt()

public actual fun GetConsoleCommandHistoryA(commands: PSTR, commandbufferlength: UInt, exename: PCSTR): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleCommandHistoryA(commands, commandbufferlength.toInt(), exename).toUInt()

public actual fun GetConsoleCommandHistoryLengthA(exename: PCSTR): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleCommandHistoryLengthA(exename).toUInt()

public actual fun GetConsoleCommandHistoryLengthW(exename: PCWSTR): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleCommandHistoryLengthW(exename).toUInt()

public actual fun GetConsoleCommandHistoryW(commands: PWSTR, commandbufferlength: UInt, exename: PCWSTR): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleCommandHistoryW(commands, commandbufferlength.toInt(), exename).toUInt()

public actual fun GetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleCursorInfo(hconsoleoutput, lpconsolecursorinfo)

public actual fun GetConsoleDisplayMode(lpmodeflags: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleDisplayMode(lpmodeflags)

public actual fun GetConsoleFontSize(hconsoleoutput: HANDLE, nfont: UInt): COORD =
    COORD()

public actual fun GetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleHistoryInfo(lpconsolehistoryinfo)

public actual fun GetConsoleMode(hconsolehandle: HANDLE, lpmode: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleMode(hconsolehandle, lpmode)

public actual fun GetConsoleOriginalTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleOriginalTitleA(lpconsoletitle, nsize.toInt()).toUInt()

public actual fun GetConsoleOriginalTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleOriginalTitleW(lpconsoletitle, nsize.toInt()).toUInt()

public actual fun GetConsoleOutputCP(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleOutputCP().toUInt()

public actual fun GetConsoleProcessList(lpdwprocesslist: Long, dwprocesscount: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleProcessList(lpdwprocesslist, dwprocesscount.toInt()).toUInt()

public actual fun GetConsoleScreenBufferInfo(hconsoleoutput: HANDLE, lpconsolescreenbufferinfo: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleScreenBufferInfo(hconsoleoutput, lpconsolescreenbufferinfo)

public actual fun GetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleScreenBufferInfoEx(hconsoleoutput, lpconsolescreenbufferinfoex)

public actual fun GetConsoleSelectionInfo(lpconsoleselectioninfo: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleSelectionInfo(lpconsoleselectioninfo)

public actual fun GetConsoleTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleTitleA(lpconsoletitle, nsize.toInt()).toUInt()

public actual fun GetConsoleTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleTitleW(lpconsoletitle, nsize.toInt()).toUInt()

public actual fun GetConsoleWindow(): HWND =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetConsoleWindow()

public actual fun GetCurrentConsoleFont(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfont: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetCurrentConsoleFont(hconsoleoutput, bmaximumwindow, lpconsolecurrentfont)

public actual fun GetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetCurrentConsoleFontEx(hconsoleoutput, bmaximumwindow, lpconsolecurrentfontex)

public actual fun GetLargestConsoleWindowSize(hconsoleoutput: HANDLE): COORD =
    COORD()

public actual fun GetNumberOfConsoleInputEvents(hconsoleinput: HANDLE, lpnumberofevents: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetNumberOfConsoleInputEvents(hconsoleinput, lpnumberofevents)

public actual fun GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons)

public actual fun GetStdHandle(nstdhandle: STD_HANDLE): HANDLE =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_GetStdHandle(nstdhandle.toInt())

public actual fun PeekConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_PeekConsoleInputA(hconsoleinput, lpbuffer, nlength.toInt(), lpnumberofeventsread)

public actual fun PeekConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_PeekConsoleInputW(hconsoleinput, lpbuffer, nlength.toInt(), lpnumberofeventsread)

public actual fun ReadConsoleA(hconsoleinput: HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_ReadConsoleA(hconsoleinput, lpbuffer, nnumberofcharstoread.toInt(), lpnumberofcharsread, pinputcontrol)

public actual fun ReadConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_ReadConsoleInputA(hconsoleinput, lpbuffer, nlength.toInt(), lpnumberofeventsread)

public actual fun ReadConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_ReadConsoleInputW(hconsoleinput, lpbuffer, nlength.toInt(), lpnumberofeventsread)

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
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_ReadConsoleW(hconsoleinput, lpbuffer, nnumberofcharstoread.toInt(), lpnumberofcharsread, pinputcontrol)

public actual fun ResizePseudoConsole(hpc: HPCON, size: COORD): HRESULT =
    0

public actual fun ScrollConsoleScreenBufferA(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL =
    0

public actual fun ScrollConsoleScreenBufferW(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL =
    0

public actual fun SetConsoleActiveScreenBuffer(hconsoleoutput: HANDLE): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleActiveScreenBuffer(hconsoleoutput)

public actual fun SetConsoleCP(wcodepageid: UInt): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleCP(wcodepageid.toInt())

public actual fun SetConsoleCtrlHandler(handlerroutine: PHANDLER_ROUTINE, add: BOOL): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleCtrlHandler(handlerroutine.toLong(), add)

public actual fun SetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleCursorInfo(hconsoleoutput, lpconsolecursorinfo)

public actual fun SetConsoleCursorPosition(hconsoleoutput: HANDLE, dwcursorposition: COORD): BOOL =
    0

public actual fun SetConsoleDisplayMode(hconsoleoutput: HANDLE, dwflags: UInt, lpnewscreenbufferdimensions: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleDisplayMode(hconsoleoutput, dwflags.toInt(), lpnewscreenbufferdimensions)

public actual fun SetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleHistoryInfo(lpconsolehistoryinfo)

public actual fun SetConsoleMode(hconsolehandle: HANDLE, dwmode: CONSOLE_MODE): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleMode(hconsolehandle, dwmode.toInt())

public actual fun SetConsoleNumberOfCommandsA(number: UInt, exename: PCSTR): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleNumberOfCommandsA(number.toInt(), exename)

public actual fun SetConsoleNumberOfCommandsW(number: UInt, exename: PCWSTR): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleNumberOfCommandsW(number.toInt(), exename)

public actual fun SetConsoleOutputCP(wcodepageid: UInt): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleOutputCP(wcodepageid.toInt())

public actual fun SetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleScreenBufferInfoEx(hconsoleoutput, lpconsolescreenbufferinfoex)

public actual fun SetConsoleScreenBufferSize(hconsoleoutput: HANDLE, dwsize: COORD): BOOL =
    0

public actual fun SetConsoleTextAttribute(hconsoleoutput: HANDLE, wattributes: CONSOLE_CHARACTER_ATTRIBUTES): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleTextAttribute(hconsoleoutput, wattributes.toShort())

public actual fun SetConsoleTitleA(lpconsoletitle: PCSTR): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleTitleA(lpconsoletitle)

public actual fun SetConsoleTitleW(lpconsoletitle: PCWSTR): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleTitleW(lpconsoletitle)

public actual fun SetConsoleWindowInfo(hconsoleoutput: HANDLE, babsolute: BOOL, lpconsolewindow: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetConsoleWindowInfo(hconsoleoutput, babsolute, lpconsolewindow)

public actual fun SetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetCurrentConsoleFontEx(hconsoleoutput, bmaximumwindow, lpconsolecurrentfontex)

public actual fun SetStdHandle(nstdhandle: STD_HANDLE, hhandle: HANDLE): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetStdHandle(nstdhandle.toInt(), hhandle)

public actual fun SetStdHandleEx(nstdhandle: STD_HANDLE, hhandle: HANDLE, phprevvalue: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_SetStdHandleEx(nstdhandle.toInt(), hhandle, phprevvalue)

public actual fun WriteConsoleA(hconsoleoutput: HANDLE, lpbuffer: PCSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_WriteConsoleA(hconsoleoutput, lpbuffer, nnumberofcharstowrite.toInt(), lpnumberofcharswritten, lpreserved)

public actual fun WriteConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_WriteConsoleInputA(hconsoleinput, lpbuffer, nlength.toInt(), lpnumberofeventswritten)

public actual fun WriteConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_WriteConsoleInputW(hconsoleinput, lpbuffer, nlength.toInt(), lpnumberofeventswritten)

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
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_WriteConsoleW(hconsoleoutput, lpbuffer, nnumberofcharstowrite.toInt(), lpnumberofcharswritten, lpreserved)
