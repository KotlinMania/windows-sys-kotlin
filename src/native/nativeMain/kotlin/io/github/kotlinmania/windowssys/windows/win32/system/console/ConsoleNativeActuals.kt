@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_addConsoleAliasA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_addConsoleAliasW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_allocConsole
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_attachConsole
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_closePseudoConsole
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_consoleControl
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_createConsoleScreenBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_expungeConsoleCommandHistoryA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_expungeConsoleCommandHistoryW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_flushConsoleInputBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_freeConsole
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_generateConsoleCtrlEvent
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleAliasA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleAliasExesA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleAliasExesLengthA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleAliasExesLengthW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleAliasExesW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleAliasW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleAliasesA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleAliasesLengthA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleAliasesLengthW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleAliasesW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleCP
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleCommandHistoryA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleCommandHistoryW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleCursorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleDisplayMode
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleHistoryInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleMode
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleOriginalTitleA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleOriginalTitleW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleOutputCP
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleProcessList
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleScreenBufferInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleScreenBufferInfoEx
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleSelectionInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleTitleA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleTitleW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getConsoleWindow
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getCurrentConsoleFont
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getCurrentConsoleFontEx
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getNumberOfConsoleInputEvents
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getNumberOfConsoleMouseButtons
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_getStdHandle
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_peekConsoleInputA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_peekConsoleInputW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_readConsoleA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_readConsoleInputA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_readConsoleInputW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_readConsoleW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleActiveScreenBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleCP
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleCtrlHandler
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleCursorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleDisplayMode
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleHistoryInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleMode
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleNumberOfCommandsA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleNumberOfCommandsW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleOutputCP
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleScreenBufferInfoEx
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleTextAttribute
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleTitleA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleTitleW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setConsoleWindowInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setCurrentConsoleFontEx
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setStdHandle
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_setStdHandleEx
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_writeConsoleA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_writeConsoleInputA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_writeConsoleInputW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssys_windows_win32_system_console_writeConsoleW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addConsoleAliasA(source: Pcstr, target: Pcstr, exename: Pcstr): Bool =
    windowssys_windows_win32_system_console_addConsoleAliasA(source?.value?.toCPointer<ByteVar>(), target?.value?.toCPointer<ByteVar>(), exename?.value?.toCPointer<ByteVar>())

public actual fun addConsoleAliasW(source: Pcwstr, target: Pcwstr, exename: Pcwstr): Bool =
    windowssys_windows_win32_system_console_addConsoleAliasW(source?.value?.toCPointer<ByteVar>(), target?.value?.toCPointer<ByteVar>(), exename?.value?.toCPointer<ByteVar>())

public actual fun allocConsole(): Bool =
    windowssys_windows_win32_system_console_allocConsole()

public actual fun attachConsole(dwprocessid: UInt): Bool =
    windowssys_windows_win32_system_console_attachConsole(dwprocessid)

public actual fun closePseudoConsole(hpc: Hpcon) {
    windowssys_windows_win32_system_console_closePseudoConsole(hpc)
}

public actual fun consoleControl(command: Consolecontrol, consoleinformation: COpaquePointer?, consoleinformationlength: UInt): Ntstatus =
    windowssys_windows_win32_system_console_consoleControl(command, consoleinformation?.value?.toCPointer<ByteVar>(), consoleinformationlength)

public actual fun createConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwflags: UInt, lpscreenbufferdata: COpaquePointer?): Handle =
    windowssys_windows_win32_system_console_createConsoleScreenBuffer(dwdesiredaccess, dwsharemode, lpsecurityattributes?.value?.toCPointer<ByteVar>(), dwflags, lpscreenbufferdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createPseudoConsole(size: Coord, hinput: Handle, houtput: Handle, dwflags: UInt, phpc: COpaquePointer?): Hresult =
    0

public actual fun expungeConsoleCommandHistoryA(exename: Pcstr) {
    windowssys_windows_win32_system_console_expungeConsoleCommandHistoryA(exename?.value?.toCPointer<ByteVar>())
}

public actual fun expungeConsoleCommandHistoryW(exename: Pcwstr) {
    windowssys_windows_win32_system_console_expungeConsoleCommandHistoryW(exename?.value?.toCPointer<ByteVar>())
}

public actual fun fillConsoleOutputAttribute(hconsoleoutput: Handle, wattribute: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: COpaquePointer?): Bool =
    0

public actual fun fillConsoleOutputCharacterA(hconsoleoutput: Handle, ccharacter: Byte, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: COpaquePointer?): Bool =
    0

public actual fun fillConsoleOutputCharacterW(hconsoleoutput: Handle, ccharacter: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: COpaquePointer?): Bool =
    0

public actual fun flushConsoleInputBuffer(hconsoleinput: Handle): Bool =
    windowssys_windows_win32_system_console_flushConsoleInputBuffer(hconsoleinput?.value?.toCPointer<ByteVar>())

public actual fun freeConsole(): Bool =
    windowssys_windows_win32_system_console_freeConsole()

public actual fun generateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): Bool =
    windowssys_windows_win32_system_console_generateConsoleCtrlEvent(dwctrlevent, dwprocessgroupid)

public actual fun getConsoleAliasA(source: Pcstr, targetbuffer: Pstr, targetbufferlength: UInt, exename: Pcstr): UInt =
    windowssys_windows_win32_system_console_getConsoleAliasA(source?.value?.toCPointer<ByteVar>(), targetbuffer?.value?.toCPointer<ByteVar>(), targetbufferlength, exename?.value?.toCPointer<ByteVar>())

public actual fun getConsoleAliasExesA(exenamebuffer: Pstr, exenamebufferlength: UInt): UInt =
    windowssys_windows_win32_system_console_getConsoleAliasExesA(exenamebuffer?.value?.toCPointer<ByteVar>(), exenamebufferlength)

public actual fun getConsoleAliasExesLengthA(): UInt =
    windowssys_windows_win32_system_console_getConsoleAliasExesLengthA()

public actual fun getConsoleAliasExesLengthW(): UInt =
    windowssys_windows_win32_system_console_getConsoleAliasExesLengthW()

public actual fun getConsoleAliasExesW(exenamebuffer: Pwstr, exenamebufferlength: UInt): UInt =
    windowssys_windows_win32_system_console_getConsoleAliasExesW(exenamebuffer?.value?.toCPointer<ByteVar>(), exenamebufferlength)

public actual fun getConsoleAliasW(source: Pcwstr, targetbuffer: Pwstr, targetbufferlength: UInt, exename: Pcwstr): UInt =
    windowssys_windows_win32_system_console_getConsoleAliasW(source?.value?.toCPointer<ByteVar>(), targetbuffer?.value?.toCPointer<ByteVar>(), targetbufferlength, exename?.value?.toCPointer<ByteVar>())

public actual fun getConsoleAliasesA(aliasbuffer: Pstr, aliasbufferlength: UInt, exename: Pcstr): UInt =
    windowssys_windows_win32_system_console_getConsoleAliasesA(aliasbuffer?.value?.toCPointer<ByteVar>(), aliasbufferlength, exename?.value?.toCPointer<ByteVar>())

public actual fun getConsoleAliasesLengthA(exename: Pcstr): UInt =
    windowssys_windows_win32_system_console_getConsoleAliasesLengthA(exename?.value?.toCPointer<ByteVar>())

public actual fun getConsoleAliasesLengthW(exename: Pcwstr): UInt =
    windowssys_windows_win32_system_console_getConsoleAliasesLengthW(exename?.value?.toCPointer<ByteVar>())

public actual fun getConsoleAliasesW(aliasbuffer: Pwstr, aliasbufferlength: UInt, exename: Pcwstr): UInt =
    windowssys_windows_win32_system_console_getConsoleAliasesW(aliasbuffer?.value?.toCPointer<ByteVar>(), aliasbufferlength, exename?.value?.toCPointer<ByteVar>())

public actual fun getConsoleCP(): UInt =
    windowssys_windows_win32_system_console_getConsoleCP()

public actual fun getConsoleCommandHistoryA(commands: Pstr, commandbufferlength: UInt, exename: Pcstr): UInt =
    windowssys_windows_win32_system_console_getConsoleCommandHistoryA(commands?.value?.toCPointer<ByteVar>(), commandbufferlength, exename?.value?.toCPointer<ByteVar>())

public actual fun getConsoleCommandHistoryLengthA(exename: Pcstr): UInt =
    windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthA(exename?.value?.toCPointer<ByteVar>())

public actual fun getConsoleCommandHistoryLengthW(exename: Pcwstr): UInt =
    windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthW(exename?.value?.toCPointer<ByteVar>())

public actual fun getConsoleCommandHistoryW(commands: Pwstr, commandbufferlength: UInt, exename: Pcwstr): UInt =
    windowssys_windows_win32_system_console_getConsoleCommandHistoryW(commands?.value?.toCPointer<ByteVar>(), commandbufferlength, exename?.value?.toCPointer<ByteVar>())

public actual fun getConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getConsoleCursorInfo(hconsoleoutput?.value?.toCPointer<ByteVar>(), lpconsolecursorinfo?.value?.toCPointer<ByteVar>())

public actual fun getConsoleDisplayMode(lpmodeflags: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getConsoleDisplayMode(lpmodeflags?.value?.toCPointer<ByteVar>())

public actual fun getConsoleFontSize(hconsoleoutput: Handle, nfont: UInt): Coord =
    Coord()

public actual fun getConsoleHistoryInfo(lpconsolehistoryinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getConsoleHistoryInfo(lpconsolehistoryinfo?.value?.toCPointer<ByteVar>())

public actual fun getConsoleMode(hconsolehandle: Handle, lpmode: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getConsoleMode(hconsolehandle?.value?.toCPointer<ByteVar>(), lpmode?.value?.toCPointer<ByteVar>())

public actual fun getConsoleOriginalTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    windowssys_windows_win32_system_console_getConsoleOriginalTitleA(lpconsoletitle?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getConsoleOriginalTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    windowssys_windows_win32_system_console_getConsoleOriginalTitleW(lpconsoletitle?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getConsoleOutputCP(): UInt =
    windowssys_windows_win32_system_console_getConsoleOutputCP()

public actual fun getConsoleProcessList(lpdwprocesslist: COpaquePointer?, dwprocesscount: UInt): UInt =
    windowssys_windows_win32_system_console_getConsoleProcessList(lpdwprocesslist?.value?.toCPointer<ByteVar>(), dwprocesscount)

public actual fun getConsoleScreenBufferInfo(hconsoleoutput: Handle, lpconsolescreenbufferinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getConsoleScreenBufferInfo(hconsoleoutput?.value?.toCPointer<ByteVar>(), lpconsolescreenbufferinfo?.value?.toCPointer<ByteVar>())

public actual fun getConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getConsoleScreenBufferInfoEx(hconsoleoutput?.value?.toCPointer<ByteVar>(), lpconsolescreenbufferinfoex?.value?.toCPointer<ByteVar>())

public actual fun getConsoleSelectionInfo(lpconsoleselectioninfo: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getConsoleSelectionInfo(lpconsoleselectioninfo?.value?.toCPointer<ByteVar>())

public actual fun getConsoleTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    windowssys_windows_win32_system_console_getConsoleTitleA(lpconsoletitle?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getConsoleTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    windowssys_windows_win32_system_console_getConsoleTitleW(lpconsoletitle?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getConsoleWindow(): Hwnd =
    windowssys_windows_win32_system_console_getConsoleWindow()?.let { COpaquePointer(it.toLong()) }

public actual fun getCurrentConsoleFont(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfont: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getCurrentConsoleFont(hconsoleoutput?.value?.toCPointer<ByteVar>(), bmaximumwindow, lpconsolecurrentfont?.value?.toCPointer<ByteVar>())

public actual fun getCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getCurrentConsoleFontEx(hconsoleoutput?.value?.toCPointer<ByteVar>(), bmaximumwindow, lpconsolecurrentfontex?.value?.toCPointer<ByteVar>())

public actual fun getLargestConsoleWindowSize(hconsoleoutput: Handle): Coord =
    Coord()

public actual fun getNumberOfConsoleInputEvents(hconsoleinput: Handle, lpnumberofevents: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getNumberOfConsoleInputEvents(hconsoleinput?.value?.toCPointer<ByteVar>(), lpnumberofevents?.value?.toCPointer<ByteVar>())

public actual fun getNumberOfConsoleMouseButtons(lpnumberofmousebuttons: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_getNumberOfConsoleMouseButtons(lpnumberofmousebuttons?.value?.toCPointer<ByteVar>())

public actual fun getStdHandle(nstdhandle: StdHandle): Handle =
    windowssys_windows_win32_system_console_getStdHandle(nstdhandle)?.let { COpaquePointer(it.toLong()) }

public actual fun peekConsoleInputA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_peekConsoleInputA(hconsoleinput?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nlength, lpnumberofeventsread?.value?.toCPointer<ByteVar>())

public actual fun peekConsoleInputW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_peekConsoleInputW(hconsoleinput?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nlength, lpnumberofeventsread?.value?.toCPointer<ByteVar>())

public actual fun readConsoleA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nnumberofcharstoread: UInt, lpnumberofcharsread: COpaquePointer?, pinputcontrol: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_readConsoleA(hconsoleinput?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofcharstoread, lpnumberofcharsread?.value?.toCPointer<ByteVar>(), pinputcontrol?.value?.toCPointer<ByteVar>())

public actual fun readConsoleInputA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_readConsoleInputA(hconsoleinput?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nlength, lpnumberofeventsread?.value?.toCPointer<ByteVar>())

public actual fun readConsoleInputW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_readConsoleInputW(hconsoleinput?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nlength, lpnumberofeventsread?.value?.toCPointer<ByteVar>())

public actual fun readConsoleOutputA(hconsoleoutput: Handle, lpbuffer: COpaquePointer?, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: COpaquePointer?): Bool =
    0

public actual fun readConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: COpaquePointer?, nlength: UInt, dwreadcoord: Coord, lpnumberofattrsread: COpaquePointer?): Bool =
    0

public actual fun readConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: COpaquePointer?): Bool =
    0

public actual fun readConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pwstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: COpaquePointer?): Bool =
    0

public actual fun readConsoleOutputW(hconsoleoutput: Handle, lpbuffer: COpaquePointer?, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: COpaquePointer?): Bool =
    0

public actual fun readConsoleW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nnumberofcharstoread: UInt, lpnumberofcharsread: COpaquePointer?, pinputcontrol: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_readConsoleW(hconsoleinput?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofcharstoread, lpnumberofcharsread?.value?.toCPointer<ByteVar>(), pinputcontrol?.value?.toCPointer<ByteVar>())

public actual fun resizePseudoConsole(hpc: Hpcon, size: Coord): Hresult =
    0

public actual fun scrollConsoleScreenBufferA(hconsoleoutput: Handle, lpscrollrectangle: COpaquePointer?, lpcliprectangle: COpaquePointer?, dwdestinationorigin: Coord, lpfill: COpaquePointer?): Bool =
    0

public actual fun scrollConsoleScreenBufferW(hconsoleoutput: Handle, lpscrollrectangle: COpaquePointer?, lpcliprectangle: COpaquePointer?, dwdestinationorigin: Coord, lpfill: COpaquePointer?): Bool =
    0

public actual fun setConsoleActiveScreenBuffer(hconsoleoutput: Handle): Bool =
    windowssys_windows_win32_system_console_setConsoleActiveScreenBuffer(hconsoleoutput?.value?.toCPointer<ByteVar>())

public actual fun setConsoleCP(wcodepageid: UInt): Bool =
    windowssys_windows_win32_system_console_setConsoleCP(wcodepageid)

public actual fun setConsoleCtrlHandler(handlerroutine: PhandlerRoutine, add: Bool): Bool =
    windowssys_windows_win32_system_console_setConsoleCtrlHandler(0L.toCPointer<ByteVar>(), add)

public actual fun setConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_setConsoleCursorInfo(hconsoleoutput?.value?.toCPointer<ByteVar>(), lpconsolecursorinfo?.value?.toCPointer<ByteVar>())

public actual fun setConsoleCursorPosition(hconsoleoutput: Handle, dwcursorposition: Coord): Bool =
    0

public actual fun setConsoleDisplayMode(hconsoleoutput: Handle, dwflags: UInt, lpnewscreenbufferdimensions: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_setConsoleDisplayMode(hconsoleoutput?.value?.toCPointer<ByteVar>(), dwflags, lpnewscreenbufferdimensions?.value?.toCPointer<ByteVar>())

public actual fun setConsoleHistoryInfo(lpconsolehistoryinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_setConsoleHistoryInfo(lpconsolehistoryinfo?.value?.toCPointer<ByteVar>())

public actual fun setConsoleMode(hconsolehandle: Handle, dwmode: ConsoleMode): Bool =
    windowssys_windows_win32_system_console_setConsoleMode(hconsolehandle?.value?.toCPointer<ByteVar>(), dwmode)

public actual fun setConsoleNumberOfCommandsA(number: UInt, exename: Pcstr): Bool =
    windowssys_windows_win32_system_console_setConsoleNumberOfCommandsA(number, exename?.value?.toCPointer<ByteVar>())

public actual fun setConsoleNumberOfCommandsW(number: UInt, exename: Pcwstr): Bool =
    windowssys_windows_win32_system_console_setConsoleNumberOfCommandsW(number, exename?.value?.toCPointer<ByteVar>())

public actual fun setConsoleOutputCP(wcodepageid: UInt): Bool =
    windowssys_windows_win32_system_console_setConsoleOutputCP(wcodepageid)

public actual fun setConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_setConsoleScreenBufferInfoEx(hconsoleoutput?.value?.toCPointer<ByteVar>(), lpconsolescreenbufferinfoex?.value?.toCPointer<ByteVar>())

public actual fun setConsoleScreenBufferSize(hconsoleoutput: Handle, dwsize: Coord): Bool =
    0

public actual fun setConsoleTextAttribute(hconsoleoutput: Handle, wattributes: ConsoleCharacterAttributes): Bool =
    windowssys_windows_win32_system_console_setConsoleTextAttribute(hconsoleoutput?.value?.toCPointer<ByteVar>(), wattributes)

public actual fun setConsoleTitleA(lpconsoletitle: Pcstr): Bool =
    windowssys_windows_win32_system_console_setConsoleTitleA(lpconsoletitle?.value?.toCPointer<ByteVar>())

public actual fun setConsoleTitleW(lpconsoletitle: Pcwstr): Bool =
    windowssys_windows_win32_system_console_setConsoleTitleW(lpconsoletitle?.value?.toCPointer<ByteVar>())

public actual fun setConsoleWindowInfo(hconsoleoutput: Handle, babsolute: Bool, lpconsolewindow: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_setConsoleWindowInfo(hconsoleoutput?.value?.toCPointer<ByteVar>(), babsolute, lpconsolewindow?.value?.toCPointer<ByteVar>())

public actual fun setCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_setCurrentConsoleFontEx(hconsoleoutput?.value?.toCPointer<ByteVar>(), bmaximumwindow, lpconsolecurrentfontex?.value?.toCPointer<ByteVar>())

public actual fun setStdHandle(nstdhandle: StdHandle, hhandle: Handle): Bool =
    windowssys_windows_win32_system_console_setStdHandle(nstdhandle, hhandle?.value?.toCPointer<ByteVar>())

public actual fun setStdHandleEx(nstdhandle: StdHandle, hhandle: Handle, phprevvalue: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_setStdHandleEx(nstdhandle, hhandle?.value?.toCPointer<ByteVar>(), phprevvalue?.value?.toCPointer<ByteVar>())

public actual fun writeConsoleA(hconsoleoutput: Handle, lpbuffer: Pcstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_writeConsoleA(hconsoleoutput?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofcharstowrite, lpnumberofcharswritten?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun writeConsoleInputA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventswritten: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_writeConsoleInputA(hconsoleinput?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nlength, lpnumberofeventswritten?.value?.toCPointer<ByteVar>())

public actual fun writeConsoleInputW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventswritten: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_writeConsoleInputW(hconsoleinput?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nlength, lpnumberofeventswritten?.value?.toCPointer<ByteVar>())

public actual fun writeConsoleOutputA(hconsoleoutput: Handle, lpbuffer: COpaquePointer?, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: COpaquePointer?): Bool =
    0

public actual fun writeConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: COpaquePointer?, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: COpaquePointer?): Bool =
    0

public actual fun writeConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pcstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: COpaquePointer?): Bool =
    0

public actual fun writeConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pcwstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: COpaquePointer?): Bool =
    0

public actual fun writeConsoleOutputW(hconsoleoutput: Handle, lpbuffer: COpaquePointer?, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: COpaquePointer?): Bool =
    0

public actual fun writeConsoleW(hconsoleoutput: Handle, lpbuffer: Pcwstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    windowssys_windows_win32_system_console_writeConsoleW(hconsoleoutput?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofcharstowrite, lpnumberofcharswritten?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())
