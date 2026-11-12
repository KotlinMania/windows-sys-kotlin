@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

private object WindowsWin32SystemConsoleJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleAddConsoleAliasA(source: Long, target: Long, exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleAddConsoleAliasW(source: Long, target: Long, exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleAllocConsole(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleAttachConsole(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleClosePseudoConsole(hpc: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleConsoleControl(command: Int, consoleinformation: Long, consoleinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer(dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwflags: Int, lpscreenbufferdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA(exename: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW(exename: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer(hconsoleinput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleFreeConsole(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(dwctrlevent: Int, dwprocessgroupid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleAliasA(source: Long, targetbuffer: Long, targetbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleAliasExesA(exenamebuffer: Long, exenamebufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleAliasExesW(exenamebuffer: Long, exenamebufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleAliasW(source: Long, targetbuffer: Long, targetbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleAliasesA(aliasbuffer: Long, aliasbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA(exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW(exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleAliasesW(aliasbuffer: Long, aliasbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleCP(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA(commands: Long, commandbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA(exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW(exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW(commands: Long, commandbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleCursorInfo(hconsoleoutput: Long, lpconsolecursorinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleDisplayMode(lpmodeflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo(lpconsolehistoryinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleMode(hconsolehandle: Long, lpmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleOutputCP(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleProcessList(lpdwprocesslist: Long, dwprocesscount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo(hconsoleoutput: Long, lpconsolescreenbufferinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx(hconsoleoutput: Long, lpconsolescreenbufferinfoex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo(lpconsoleselectioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleTitleA(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleTitleW(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetConsoleWindow(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetCurrentConsoleFont(hconsoleoutput: Long, bmaximumwindow: Int, lpconsolecurrentfont: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx(hconsoleoutput: Long, bmaximumwindow: Int, lpconsolecurrentfontex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents(hconsoleinput: Long, lpnumberofevents: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons(lpnumberofmousebuttons: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleGetStdHandle(nstdhandle: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsolePeekConsoleInputA(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsolePeekConsoleInputW(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleReadConsoleA(hconsoleinput: Long, lpbuffer: Long, nnumberofcharstoread: Int, lpnumberofcharsread: Long, pinputcontrol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleReadConsoleInputA(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleReadConsoleInputW(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleReadConsoleW(hconsoleinput: Long, lpbuffer: Long, nnumberofcharstoread: Int, lpnumberofcharsread: Long, pinputcontrol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer(hconsoleoutput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleCP(wcodepageid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler(handlerroutine: Long, add: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleCursorInfo(hconsoleoutput: Long, lpconsolecursorinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleDisplayMode(hconsoleoutput: Long, dwflags: Int, lpnewscreenbufferdimensions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo(lpconsolehistoryinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleMode(hconsolehandle: Long, dwmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA(number: Int, exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW(number: Int, exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleOutputCP(wcodepageid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx(hconsoleoutput: Long, lpconsolescreenbufferinfoex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleTextAttribute(hconsoleoutput: Long, wattributes: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleTitleA(lpconsoletitle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleTitleW(lpconsoletitle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetConsoleWindowInfo(hconsoleoutput: Long, babsolute: Int, lpconsolewindow: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx(hconsoleoutput: Long, bmaximumwindow: Int, lpconsolecurrentfontex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetStdHandle(nstdhandle: Int, hhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleSetStdHandleEx(nstdhandle: Int, hhandle: Long, phprevvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleWriteConsoleA(hconsoleoutput: Long, lpbuffer: Long, nnumberofcharstowrite: Int, lpnumberofcharswritten: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleWriteConsoleInputA(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleWriteConsoleInputW(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemConsoleWriteConsoleW(hconsoleoutput: Long, lpbuffer: Long, nnumberofcharstowrite: Int, lpnumberofcharswritten: Long, lpreserved: Long): Int
}

public actual fun addConsoleAliasA(source: Pcstr, target: Pcstr, exename: Pcstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleAddConsoleAliasA(source.rawAddress, target.rawAddress, exename.rawAddress)

public actual fun addConsoleAliasW(source: Pcwstr, target: Pcwstr, exename: Pcwstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleAddConsoleAliasW(source.rawAddress, target.rawAddress, exename.rawAddress)

public actual fun allocConsole(): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleAllocConsole()

public actual fun attachConsole(dwprocessid: UInt): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleAttachConsole(dwprocessid.toInt())

public actual fun closePseudoConsole(hpc: Hpcon) {
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleClosePseudoConsole(hpc)
}

public actual fun consoleControl(command: Consolecontrol, consoleinformation: ConstPtr<CVoid>, consoleinformationlength: UInt): Ntstatus =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleConsoleControl(command, consoleinformation.rawAddress, consoleinformationlength.toInt())

public actual fun createConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwflags: UInt, lpscreenbufferdata: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer(dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress, dwflags.toInt(), lpscreenbufferdata.rawAddress))

public actual fun createPseudoConsole(size: Coord, hinput: Handle, houtput: Handle, dwflags: UInt, phpc: MutPtr<Hpcon>): Hresult =
    0

public actual fun expungeConsoleCommandHistoryA(exename: Pcstr) {
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA(exename.rawAddress)
}

public actual fun expungeConsoleCommandHistoryW(exename: Pcwstr) {
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW(exename.rawAddress)
}

public actual fun fillConsoleOutputAttribute(hconsoleoutput: Handle, wattribute: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr<UInt>): Bool =
    0

public actual fun fillConsoleOutputCharacterA(hconsoleoutput: Handle, ccharacter: Byte, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    0

public actual fun fillConsoleOutputCharacterW(hconsoleoutput: Handle, ccharacter: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    0

public actual fun flushConsoleInputBuffer(hconsoleinput: Handle): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer(hconsoleinput.rawAddress)

public actual fun freeConsole(): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleFreeConsole()

public actual fun generateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(dwctrlevent.toInt(), dwprocessgroupid.toInt())

public actual fun getConsoleAliasA(source: Pcstr, targetbuffer: Pstr, targetbufferlength: UInt, exename: Pcstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleAliasA(source.rawAddress, targetbuffer.rawAddress, targetbufferlength.toInt(), exename.rawAddress).toUInt()

public actual fun getConsoleAliasExesA(exenamebuffer: Pstr, exenamebufferlength: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesA(exenamebuffer.rawAddress, exenamebufferlength.toInt()).toUInt()

public actual fun getConsoleAliasExesLengthA(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA().toUInt()

public actual fun getConsoleAliasExesLengthW(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW().toUInt()

public actual fun getConsoleAliasExesW(exenamebuffer: Pwstr, exenamebufferlength: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesW(exenamebuffer.rawAddress, exenamebufferlength.toInt()).toUInt()

public actual fun getConsoleAliasW(source: Pcwstr, targetbuffer: Pwstr, targetbufferlength: UInt, exename: Pcwstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleAliasW(source.rawAddress, targetbuffer.rawAddress, targetbufferlength.toInt(), exename.rawAddress).toUInt()

public actual fun getConsoleAliasesA(aliasbuffer: Pstr, aliasbufferlength: UInt, exename: Pcstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleAliasesA(aliasbuffer.rawAddress, aliasbufferlength.toInt(), exename.rawAddress).toUInt()

public actual fun getConsoleAliasesLengthA(exename: Pcstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA(exename.rawAddress).toUInt()

public actual fun getConsoleAliasesLengthW(exename: Pcwstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW(exename.rawAddress).toUInt()

public actual fun getConsoleAliasesW(aliasbuffer: Pwstr, aliasbufferlength: UInt, exename: Pcwstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleAliasesW(aliasbuffer.rawAddress, aliasbufferlength.toInt(), exename.rawAddress).toUInt()

public actual fun getConsoleCP(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleCP().toUInt()

public actual fun getConsoleCommandHistoryA(commands: Pstr, commandbufferlength: UInt, exename: Pcstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA(commands.rawAddress, commandbufferlength.toInt(), exename.rawAddress).toUInt()

public actual fun getConsoleCommandHistoryLengthA(exename: Pcstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA(exename.rawAddress).toUInt()

public actual fun getConsoleCommandHistoryLengthW(exename: Pcwstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW(exename.rawAddress).toUInt()

public actual fun getConsoleCommandHistoryW(commands: Pwstr, commandbufferlength: UInt, exename: Pcwstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW(commands.rawAddress, commandbufferlength.toInt(), exename.rawAddress).toUInt()

public actual fun getConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: MutPtr<ConsoleCursorInfo>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleCursorInfo(hconsoleoutput.rawAddress, lpconsolecursorinfo.rawAddress)

public actual fun getConsoleDisplayMode(lpmodeflags: MutPtr<UInt>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleDisplayMode(lpmodeflags.rawAddress)

public actual fun getConsoleFontSize(hconsoleoutput: Handle, nfont: UInt): Coord =
    Coord()

public actual fun getConsoleHistoryInfo(lpconsolehistoryinfo: MutPtr<ConsoleHistoryInfo>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo(lpconsolehistoryinfo.rawAddress)

public actual fun getConsoleMode(hconsolehandle: Handle, lpmode: MutPtr<ConsoleMode>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleMode(hconsolehandle.rawAddress, lpmode.rawAddress)

public actual fun getConsoleOriginalTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA(lpconsoletitle.rawAddress, nsize.toInt()).toUInt()

public actual fun getConsoleOriginalTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW(lpconsoletitle.rawAddress, nsize.toInt()).toUInt()

public actual fun getConsoleOutputCP(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleOutputCP().toUInt()

public actual fun getConsoleProcessList(lpdwprocesslist: MutPtr<UInt>, dwprocesscount: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleProcessList(lpdwprocesslist.rawAddress, dwprocesscount.toInt()).toUInt()

public actual fun getConsoleScreenBufferInfo(hconsoleoutput: Handle, lpconsolescreenbufferinfo: MutPtr<ConsoleScreenBufferInfo>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo(hconsoleoutput.rawAddress, lpconsolescreenbufferinfo.rawAddress)

public actual fun getConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: MutPtr<ConsoleScreenBufferInfoex>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx(hconsoleoutput.rawAddress, lpconsolescreenbufferinfoex.rawAddress)

public actual fun getConsoleSelectionInfo(lpconsoleselectioninfo: MutPtr<ConsoleSelectionInfo>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo(lpconsoleselectioninfo.rawAddress)

public actual fun getConsoleTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleTitleA(lpconsoletitle.rawAddress, nsize.toInt()).toUInt()

public actual fun getConsoleTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleTitleW(lpconsoletitle.rawAddress, nsize.toInt()).toUInt()

public actual fun getConsoleWindow(): Hwnd =
    MutPtr(WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetConsoleWindow())

public actual fun getCurrentConsoleFont(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfont: MutPtr<ConsoleFontInfo>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetCurrentConsoleFont(hconsoleoutput.rawAddress, bmaximumwindow, lpconsolecurrentfont.rawAddress)

public actual fun getCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: MutPtr<ConsoleFontInfoex>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx(hconsoleoutput.rawAddress, bmaximumwindow, lpconsolecurrentfontex.rawAddress)

public actual fun getLargestConsoleWindowSize(hconsoleoutput: Handle): Coord =
    Coord()

public actual fun getNumberOfConsoleInputEvents(hconsoleinput: Handle, lpnumberofevents: MutPtr<UInt>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents(hconsoleinput.rawAddress, lpnumberofevents.rawAddress)

public actual fun getNumberOfConsoleMouseButtons(lpnumberofmousebuttons: MutPtr<UInt>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons(lpnumberofmousebuttons.rawAddress)

public actual fun getStdHandle(nstdhandle: StdHandle): Handle =
    MutPtr(WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleGetStdHandle(nstdhandle.toInt()))

public actual fun peekConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsolePeekConsoleInputA(hconsoleinput.rawAddress, lpbuffer.rawAddress, nlength.toInt(), lpnumberofeventsread.rawAddress)

public actual fun peekConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsolePeekConsoleInputW(hconsoleinput.rawAddress, lpbuffer.rawAddress, nlength.toInt(), lpnumberofeventsread.rawAddress)

public actual fun readConsoleA(hconsoleinput: Handle, lpbuffer: MutPtr<CVoid>, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr<UInt>, pinputcontrol: ConstPtr<ConsoleReadconsoleControl>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleReadConsoleA(hconsoleinput.rawAddress, lpbuffer.rawAddress, nnumberofcharstoread.toInt(), lpnumberofcharsread.rawAddress, pinputcontrol.rawAddress)

public actual fun readConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleReadConsoleInputA(hconsoleinput.rawAddress, lpbuffer.rawAddress, nlength.toInt(), lpnumberofeventsread.rawAddress)

public actual fun readConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleReadConsoleInputW(hconsoleinput.rawAddress, lpbuffer.rawAddress, nlength.toInt(), lpnumberofeventsread.rawAddress)

public actual fun readConsoleOutputA(hconsoleoutput: Handle, lpbuffer: MutPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr<SmallRect>): Bool =
    0

public actual fun readConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: MutPtr<UShort>, nlength: UInt, dwreadcoord: Coord, lpnumberofattrsread: MutPtr<UInt>): Bool =
    0

public actual fun readConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr<UInt>): Bool =
    0

public actual fun readConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pwstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr<UInt>): Bool =
    0

public actual fun readConsoleOutputW(hconsoleoutput: Handle, lpbuffer: MutPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr<SmallRect>): Bool =
    0

public actual fun readConsoleW(hconsoleinput: Handle, lpbuffer: MutPtr<CVoid>, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr<UInt>, pinputcontrol: ConstPtr<ConsoleReadconsoleControl>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleReadConsoleW(hconsoleinput.rawAddress, lpbuffer.rawAddress, nnumberofcharstoread.toInt(), lpnumberofcharsread.rawAddress, pinputcontrol.rawAddress)

public actual fun resizePseudoConsole(hpc: Hpcon, size: Coord): Hresult =
    0

public actual fun scrollConsoleScreenBufferA(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr<SmallRect>, lpcliprectangle: ConstPtr<SmallRect>, dwdestinationorigin: Coord, lpfill: ConstPtr<CharInfo>): Bool =
    0

public actual fun scrollConsoleScreenBufferW(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr<SmallRect>, lpcliprectangle: ConstPtr<SmallRect>, dwdestinationorigin: Coord, lpfill: ConstPtr<CharInfo>): Bool =
    0

public actual fun setConsoleActiveScreenBuffer(hconsoleoutput: Handle): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer(hconsoleoutput.rawAddress)

public actual fun setConsoleCP(wcodepageid: UInt): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleCP(wcodepageid.toInt())

public actual fun setConsoleCtrlHandler(handlerroutine: PhandlerRoutine, add: Bool): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler(0L, add)

public actual fun setConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: ConstPtr<ConsoleCursorInfo>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleCursorInfo(hconsoleoutput.rawAddress, lpconsolecursorinfo.rawAddress)

public actual fun setConsoleCursorPosition(hconsoleoutput: Handle, dwcursorposition: Coord): Bool =
    0

public actual fun setConsoleDisplayMode(hconsoleoutput: Handle, dwflags: UInt, lpnewscreenbufferdimensions: MutPtr<Coord>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleDisplayMode(hconsoleoutput.rawAddress, dwflags.toInt(), lpnewscreenbufferdimensions.rawAddress)

public actual fun setConsoleHistoryInfo(lpconsolehistoryinfo: ConstPtr<ConsoleHistoryInfo>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo(lpconsolehistoryinfo.rawAddress)

public actual fun setConsoleMode(hconsolehandle: Handle, dwmode: ConsoleMode): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleMode(hconsolehandle.rawAddress, dwmode.toInt())

public actual fun setConsoleNumberOfCommandsA(number: UInt, exename: Pcstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA(number.toInt(), exename.rawAddress)

public actual fun setConsoleNumberOfCommandsW(number: UInt, exename: Pcwstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW(number.toInt(), exename.rawAddress)

public actual fun setConsoleOutputCP(wcodepageid: UInt): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleOutputCP(wcodepageid.toInt())

public actual fun setConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: ConstPtr<ConsoleScreenBufferInfoex>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx(hconsoleoutput.rawAddress, lpconsolescreenbufferinfoex.rawAddress)

public actual fun setConsoleScreenBufferSize(hconsoleoutput: Handle, dwsize: Coord): Bool =
    0

public actual fun setConsoleTextAttribute(hconsoleoutput: Handle, wattributes: ConsoleCharacterAttributes): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleTextAttribute(hconsoleoutput.rawAddress, wattributes.toShort())

public actual fun setConsoleTitleA(lpconsoletitle: Pcstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleTitleA(lpconsoletitle.rawAddress)

public actual fun setConsoleTitleW(lpconsoletitle: Pcwstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleTitleW(lpconsoletitle.rawAddress)

public actual fun setConsoleWindowInfo(hconsoleoutput: Handle, babsolute: Bool, lpconsolewindow: ConstPtr<SmallRect>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetConsoleWindowInfo(hconsoleoutput.rawAddress, babsolute, lpconsolewindow.rawAddress)

public actual fun setCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: ConstPtr<ConsoleFontInfoex>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx(hconsoleoutput.rawAddress, bmaximumwindow, lpconsolecurrentfontex.rawAddress)

public actual fun setStdHandle(nstdhandle: StdHandle, hhandle: Handle): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetStdHandle(nstdhandle.toInt(), hhandle.rawAddress)

public actual fun setStdHandleEx(nstdhandle: StdHandle, hhandle: Handle, phprevvalue: MutPtr<Handle>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleSetStdHandleEx(nstdhandle.toInt(), hhandle.rawAddress, phprevvalue.rawAddress)

public actual fun writeConsoleA(hconsoleoutput: Handle, lpbuffer: Pcstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleWriteConsoleA(hconsoleoutput.rawAddress, lpbuffer.rawAddress, nnumberofcharstowrite.toInt(), lpnumberofcharswritten.rawAddress, lpreserved.rawAddress)

public actual fun writeConsoleInputA(hconsoleinput: Handle, lpbuffer: ConstPtr<InputRecord>, nlength: UInt, lpnumberofeventswritten: MutPtr<UInt>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleWriteConsoleInputA(hconsoleinput.rawAddress, lpbuffer.rawAddress, nlength.toInt(), lpnumberofeventswritten.rawAddress)

public actual fun writeConsoleInputW(hconsoleinput: Handle, lpbuffer: ConstPtr<InputRecord>, nlength: UInt, lpnumberofeventswritten: MutPtr<UInt>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleWriteConsoleInputW(hconsoleinput.rawAddress, lpbuffer.rawAddress, nlength.toInt(), lpnumberofeventswritten.rawAddress)

public actual fun writeConsoleOutputA(hconsoleoutput: Handle, lpbuffer: ConstPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr<SmallRect>): Bool =
    0

public actual fun writeConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: ConstPtr<UShort>, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr<UInt>): Bool =
    0

public actual fun writeConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pcstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    0

public actual fun writeConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pcwstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    0

public actual fun writeConsoleOutputW(hconsoleoutput: Handle, lpbuffer: ConstPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr<SmallRect>): Bool =
    0

public actual fun writeConsoleW(hconsoleoutput: Handle, lpbuffer: Pcwstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssysWindowsWin32SystemConsoleWriteConsoleW(hconsoleoutput.rawAddress, lpbuffer.rawAddress, nnumberofcharstowrite.toInt(), lpnumberofcharswritten.rawAddress, lpreserved.rawAddress)
