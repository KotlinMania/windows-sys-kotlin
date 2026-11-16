@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleAddConsoleAliasA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleAddConsoleAliasW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleAllocConsole
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleAttachConsole
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleClosePseudoConsole
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleConsoleControl
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleFreeConsole
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleAliasA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleAliasW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleAliasesA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleAliasesW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleCP
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleCursorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleDisplayMode
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleMode
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleOutputCP
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleProcessList
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleTitleA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleTitleW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetConsoleWindow
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetCurrentConsoleFont
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleGetStdHandle
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsolePeekConsoleInputA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsolePeekConsoleInputW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleReadConsoleA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleReadConsoleInputA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleReadConsoleInputW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleReadConsoleW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleCP
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleCursorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleDisplayMode
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleMode
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleOutputCP
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleTextAttribute
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleTitleA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleTitleW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetConsoleWindowInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetStdHandle
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleSetStdHandleEx
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleWriteConsoleA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleWriteConsoleInputA
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleWriteConsoleInputW
import io.github.kotlinmania.windowssys.windows.win32.system.console.cinterop.windowssysWindowsWin32SystemConsoleWriteConsoleW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addConsoleAliasA(source: Pcstr, target: Pcstr, exename: Pcstr): Bool =
    windowssysWindowsWin32SystemConsoleAddConsoleAliasA(source.rawAddress.toCPointer<ByteVar>(), target.rawAddress.toCPointer<ByteVar>(), exename.rawAddress.toCPointer<ByteVar>())

public actual fun addConsoleAliasW(source: Pcwstr, target: Pcwstr, exename: Pcwstr): Bool =
    windowssysWindowsWin32SystemConsoleAddConsoleAliasW(source.rawAddress.toCPointer<ByteVar>(), target.rawAddress.toCPointer<ByteVar>(), exename.rawAddress.toCPointer<ByteVar>())

public actual fun allocConsole(): Bool =
    windowssysWindowsWin32SystemConsoleAllocConsole()

public actual fun attachConsole(dwprocessid: UInt): Bool =
    windowssysWindowsWin32SystemConsoleAttachConsole(dwprocessid)

public actual fun closePseudoConsole(hpc: Hpcon) {
    windowssysWindowsWin32SystemConsoleClosePseudoConsole(hpc)
}

public actual fun consoleControl(command: Consolecontrol, consoleinformation: ConstPtr, consoleinformationlength: UInt): Ntstatus =
    windowssysWindowsWin32SystemConsoleConsoleControl(command, consoleinformation.rawAddress.toCPointer<ByteVar>(), consoleinformationlength)

public actual fun createConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr, dwflags: UInt, lpscreenbufferdata: ConstPtr): Handle =
    MutPtr(windowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer(dwdesiredaccess, dwsharemode, lpsecurityattributes.rawAddress.toCPointer<ByteVar>(), dwflags, lpscreenbufferdata.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createPseudoConsole(size: Coord, hinput: Handle, houtput: Handle, dwflags: UInt, phpc: MutPtr): Hresult =
    0

public actual fun expungeConsoleCommandHistoryA(exename: Pcstr) {
    windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA(exename.rawAddress.toCPointer<ByteVar>())
}

public actual fun expungeConsoleCommandHistoryW(exename: Pcwstr) {
    windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW(exename.rawAddress.toCPointer<ByteVar>())
}

public actual fun fillConsoleOutputAttribute(hconsoleoutput: Handle, wattribute: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr): Bool =
    0

public actual fun fillConsoleOutputCharacterA(hconsoleoutput: Handle, ccharacter: Byte, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr): Bool =
    0

public actual fun fillConsoleOutputCharacterW(hconsoleoutput: Handle, ccharacter: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr): Bool =
    0

public actual fun flushConsoleInputBuffer(hconsoleinput: Handle): Bool =
    windowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer(hconsoleinput.rawAddress.toCPointer<ByteVar>())

public actual fun freeConsole(): Bool =
    windowssysWindowsWin32SystemConsoleFreeConsole()

public actual fun generateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): Bool =
    windowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(dwctrlevent, dwprocessgroupid)

public actual fun getConsoleAliasA(source: Pcstr, targetbuffer: Pstr, targetbufferlength: UInt, exename: Pcstr): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleAliasA(source.rawAddress.toCPointer<ByteVar>(), targetbuffer.rawAddress.toCPointer<ByteVar>(), targetbufferlength, exename.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleAliasExesA(exenamebuffer: Pstr, exenamebufferlength: UInt): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleAliasExesA(exenamebuffer.rawAddress.toCPointer<ByteVar>(), exenamebufferlength)

public actual fun getConsoleAliasExesLengthA(): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA()

public actual fun getConsoleAliasExesLengthW(): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW()

public actual fun getConsoleAliasExesW(exenamebuffer: Pwstr, exenamebufferlength: UInt): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleAliasExesW(exenamebuffer.rawAddress.toCPointer<ByteVar>(), exenamebufferlength)

public actual fun getConsoleAliasW(source: Pcwstr, targetbuffer: Pwstr, targetbufferlength: UInt, exename: Pcwstr): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleAliasW(source.rawAddress.toCPointer<ByteVar>(), targetbuffer.rawAddress.toCPointer<ByteVar>(), targetbufferlength, exename.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleAliasesA(aliasbuffer: Pstr, aliasbufferlength: UInt, exename: Pcstr): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleAliasesA(aliasbuffer.rawAddress.toCPointer<ByteVar>(), aliasbufferlength, exename.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleAliasesLengthA(exename: Pcstr): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA(exename.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleAliasesLengthW(exename: Pcwstr): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW(exename.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleAliasesW(aliasbuffer: Pwstr, aliasbufferlength: UInt, exename: Pcwstr): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleAliasesW(aliasbuffer.rawAddress.toCPointer<ByteVar>(), aliasbufferlength, exename.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleCP(): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleCP()

public actual fun getConsoleCommandHistoryA(commands: Pstr, commandbufferlength: UInt, exename: Pcstr): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA(commands.rawAddress.toCPointer<ByteVar>(), commandbufferlength, exename.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleCommandHistoryLengthA(exename: Pcstr): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA(exename.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleCommandHistoryLengthW(exename: Pcwstr): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW(exename.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleCommandHistoryW(commands: Pwstr, commandbufferlength: UInt, exename: Pcwstr): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW(commands.rawAddress.toCPointer<ByteVar>(), commandbufferlength, exename.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetConsoleCursorInfo(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), lpconsolecursorinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleDisplayMode(lpmodeflags: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetConsoleDisplayMode(lpmodeflags.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleFontSize(hconsoleoutput: Handle, nfont: UInt): Coord =
    Coord()

public actual fun getConsoleHistoryInfo(lpconsolehistoryinfo: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo(lpconsolehistoryinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleMode(hconsolehandle: Handle, lpmode: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetConsoleMode(hconsolehandle.rawAddress.toCPointer<ByteVar>(), lpmode.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleOriginalTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA(lpconsoletitle.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getConsoleOriginalTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW(lpconsoletitle.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getConsoleOutputCP(): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleOutputCP()

public actual fun getConsoleProcessList(lpdwprocesslist: MutPtr, dwprocesscount: UInt): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleProcessList(lpdwprocesslist.rawAddress.toCPointer<ByteVar>(), dwprocesscount)

public actual fun getConsoleScreenBufferInfo(hconsoleoutput: Handle, lpconsolescreenbufferinfo: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), lpconsolescreenbufferinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), lpconsolescreenbufferinfoex.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleSelectionInfo(lpconsoleselectioninfo: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo(lpconsoleselectioninfo.rawAddress.toCPointer<ByteVar>())

public actual fun getConsoleTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleTitleA(lpconsoletitle.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getConsoleTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemConsoleGetConsoleTitleW(lpconsoletitle.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getConsoleWindow(): Hwnd =
    MutPtr(windowssysWindowsWin32SystemConsoleGetConsoleWindow()?.toLong() ?: 0L)

public actual fun getCurrentConsoleFont(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfont: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetCurrentConsoleFont(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), bmaximumwindow, lpconsolecurrentfont.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), bmaximumwindow, lpconsolecurrentfontex.rawAddress.toCPointer<ByteVar>())

public actual fun getLargestConsoleWindowSize(hconsoleoutput: Handle): Coord =
    Coord()

public actual fun getNumberOfConsoleInputEvents(hconsoleinput: Handle, lpnumberofevents: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents(hconsoleinput.rawAddress.toCPointer<ByteVar>(), lpnumberofevents.rawAddress.toCPointer<ByteVar>())

public actual fun getNumberOfConsoleMouseButtons(lpnumberofmousebuttons: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons(lpnumberofmousebuttons.rawAddress.toCPointer<ByteVar>())

public actual fun getStdHandle(nstdhandle: StdHandle): Handle =
    MutPtr(windowssysWindowsWin32SystemConsoleGetStdHandle(nstdhandle)?.toLong() ?: 0L)

public actual fun peekConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr, nlength: UInt, lpnumberofeventsread: MutPtr): Bool =
    windowssysWindowsWin32SystemConsolePeekConsoleInputA(hconsoleinput.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nlength, lpnumberofeventsread.rawAddress.toCPointer<ByteVar>())

public actual fun peekConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr, nlength: UInt, lpnumberofeventsread: MutPtr): Bool =
    windowssysWindowsWin32SystemConsolePeekConsoleInputW(hconsoleinput.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nlength, lpnumberofeventsread.rawAddress.toCPointer<ByteVar>())

public actual fun readConsoleA(hconsoleinput: Handle, lpbuffer: MutPtr, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr, pinputcontrol: ConstPtr): Bool =
    windowssysWindowsWin32SystemConsoleReadConsoleA(hconsoleinput.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nnumberofcharstoread, lpnumberofcharsread.rawAddress.toCPointer<ByteVar>(), pinputcontrol.rawAddress.toCPointer<ByteVar>())

public actual fun readConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr, nlength: UInt, lpnumberofeventsread: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleReadConsoleInputA(hconsoleinput.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nlength, lpnumberofeventsread.rawAddress.toCPointer<ByteVar>())

public actual fun readConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr, nlength: UInt, lpnumberofeventsread: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleReadConsoleInputW(hconsoleinput.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nlength, lpnumberofeventsread.rawAddress.toCPointer<ByteVar>())

public actual fun readConsoleOutputA(hconsoleoutput: Handle, lpbuffer: MutPtr, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr): Bool =
    0

public actual fun readConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: MutPtr, nlength: UInt, dwreadcoord: Coord, lpnumberofattrsread: MutPtr): Bool =
    0

public actual fun readConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr): Bool =
    0

public actual fun readConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pwstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr): Bool =
    0

public actual fun readConsoleOutputW(hconsoleoutput: Handle, lpbuffer: MutPtr, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr): Bool =
    0

public actual fun readConsoleW(hconsoleinput: Handle, lpbuffer: MutPtr, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr, pinputcontrol: ConstPtr): Bool =
    windowssysWindowsWin32SystemConsoleReadConsoleW(hconsoleinput.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nnumberofcharstoread, lpnumberofcharsread.rawAddress.toCPointer<ByteVar>(), pinputcontrol.rawAddress.toCPointer<ByteVar>())

public actual fun resizePseudoConsole(hpc: Hpcon, size: Coord): Hresult =
    0

public actual fun scrollConsoleScreenBufferA(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr, lpcliprectangle: ConstPtr, dwdestinationorigin: Coord, lpfill: ConstPtr): Bool =
    0

public actual fun scrollConsoleScreenBufferW(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr, lpcliprectangle: ConstPtr, dwdestinationorigin: Coord, lpfill: ConstPtr): Bool =
    0

public actual fun setConsoleActiveScreenBuffer(hconsoleoutput: Handle): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer(hconsoleoutput.rawAddress.toCPointer<ByteVar>())

public actual fun setConsoleCP(wcodepageid: UInt): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleCP(wcodepageid)

public actual fun setConsoleCtrlHandler(handlerroutine: PhandlerRoutine, add: Bool): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler(0L.toCPointer<ByteVar>(), add)

public actual fun setConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: ConstPtr): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleCursorInfo(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), lpconsolecursorinfo.rawAddress.toCPointer<ByteVar>())

public actual fun setConsoleCursorPosition(hconsoleoutput: Handle, dwcursorposition: Coord): Bool =
    0

public actual fun setConsoleDisplayMode(hconsoleoutput: Handle, dwflags: UInt, lpnewscreenbufferdimensions: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleDisplayMode(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), dwflags, lpnewscreenbufferdimensions.rawAddress.toCPointer<ByteVar>())

public actual fun setConsoleHistoryInfo(lpconsolehistoryinfo: ConstPtr): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo(lpconsolehistoryinfo.rawAddress.toCPointer<ByteVar>())

public actual fun setConsoleMode(hconsolehandle: Handle, dwmode: ConsoleMode): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleMode(hconsolehandle.rawAddress.toCPointer<ByteVar>(), dwmode)

public actual fun setConsoleNumberOfCommandsA(number: UInt, exename: Pcstr): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA(number, exename.rawAddress.toCPointer<ByteVar>())

public actual fun setConsoleNumberOfCommandsW(number: UInt, exename: Pcwstr): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW(number, exename.rawAddress.toCPointer<ByteVar>())

public actual fun setConsoleOutputCP(wcodepageid: UInt): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleOutputCP(wcodepageid)

public actual fun setConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: ConstPtr): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), lpconsolescreenbufferinfoex.rawAddress.toCPointer<ByteVar>())

public actual fun setConsoleScreenBufferSize(hconsoleoutput: Handle, dwsize: Coord): Bool =
    0

public actual fun setConsoleTextAttribute(hconsoleoutput: Handle, wattributes: ConsoleCharacterAttributes): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleTextAttribute(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), wattributes)

public actual fun setConsoleTitleA(lpconsoletitle: Pcstr): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleTitleA(lpconsoletitle.rawAddress.toCPointer<ByteVar>())

public actual fun setConsoleTitleW(lpconsoletitle: Pcwstr): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleTitleW(lpconsoletitle.rawAddress.toCPointer<ByteVar>())

public actual fun setConsoleWindowInfo(hconsoleoutput: Handle, babsolute: Bool, lpconsolewindow: ConstPtr): Bool =
    windowssysWindowsWin32SystemConsoleSetConsoleWindowInfo(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), babsolute, lpconsolewindow.rawAddress.toCPointer<ByteVar>())

public actual fun setCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: ConstPtr): Bool =
    windowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), bmaximumwindow, lpconsolecurrentfontex.rawAddress.toCPointer<ByteVar>())

public actual fun setStdHandle(nstdhandle: StdHandle, hhandle: Handle): Bool =
    windowssysWindowsWin32SystemConsoleSetStdHandle(nstdhandle, hhandle.rawAddress.toCPointer<ByteVar>())

public actual fun setStdHandleEx(nstdhandle: StdHandle, hhandle: Handle, phprevvalue: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleSetStdHandleEx(nstdhandle, hhandle.rawAddress.toCPointer<ByteVar>(), phprevvalue.rawAddress.toCPointer<ByteVar>())

public actual fun writeConsoleA(hconsoleoutput: Handle, lpbuffer: Pcstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr, lpreserved: ConstPtr): Bool =
    windowssysWindowsWin32SystemConsoleWriteConsoleA(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nnumberofcharstowrite, lpnumberofcharswritten.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>())

public actual fun writeConsoleInputA(hconsoleinput: Handle, lpbuffer: ConstPtr, nlength: UInt, lpnumberofeventswritten: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleWriteConsoleInputA(hconsoleinput.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nlength, lpnumberofeventswritten.rawAddress.toCPointer<ByteVar>())

public actual fun writeConsoleInputW(hconsoleinput: Handle, lpbuffer: ConstPtr, nlength: UInt, lpnumberofeventswritten: MutPtr): Bool =
    windowssysWindowsWin32SystemConsoleWriteConsoleInputW(hconsoleinput.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nlength, lpnumberofeventswritten.rawAddress.toCPointer<ByteVar>())

public actual fun writeConsoleOutputA(hconsoleoutput: Handle, lpbuffer: ConstPtr, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr): Bool =
    0

public actual fun writeConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: ConstPtr, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr): Bool =
    0

public actual fun writeConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pcstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr): Bool =
    0

public actual fun writeConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pcwstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr): Bool =
    0

public actual fun writeConsoleOutputW(hconsoleoutput: Handle, lpbuffer: ConstPtr, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr): Bool =
    0

public actual fun writeConsoleW(hconsoleoutput: Handle, lpbuffer: Pcwstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr, lpreserved: ConstPtr): Bool =
    windowssysWindowsWin32SystemConsoleWriteConsoleW(hconsoleoutput.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nnumberofcharstowrite, lpnumberofcharswritten.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>())
