@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemConsoleJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_console_addConsoleAliasA(source: Long, target: Long, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_addConsoleAliasW(source: Long, target: Long, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_allocConsole(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_attachConsole(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_closePseudoConsole(hpc: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_console_consoleControl(command: Int, consoleinformation: Long, consoleinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_createConsoleScreenBuffer(dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwflags: Int, lpscreenbufferdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_console_expungeConsoleCommandHistoryA(exename: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_console_expungeConsoleCommandHistoryW(exename: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_console_flushConsoleInputBuffer(hconsoleinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_freeConsole(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_generateConsoleCtrlEvent(dwctrlevent: Int, dwprocessgroupid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleAliasA(source: Long, targetbuffer: Long, targetbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleAliasExesA(exenamebuffer: Long, exenamebufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleAliasExesLengthA(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleAliasExesLengthW(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleAliasExesW(exenamebuffer: Long, exenamebufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleAliasW(source: Long, targetbuffer: Long, targetbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleAliasesA(aliasbuffer: Long, aliasbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleAliasesLengthA(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleAliasesLengthW(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleAliasesW(aliasbuffer: Long, aliasbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleCP(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleCommandHistoryA(commands: Long, commandbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthA(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthW(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleCommandHistoryW(commands: Long, commandbufferlength: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleCursorInfo(hconsoleoutput: Long, lpconsolecursorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleDisplayMode(lpmodeflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleHistoryInfo(lpconsolehistoryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleMode(hconsolehandle: Long, lpmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleOriginalTitleA(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleOriginalTitleW(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleOutputCP(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleProcessList(lpdwprocesslist: Long, dwprocesscount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleScreenBufferInfo(hconsoleoutput: Long, lpconsolescreenbufferinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleScreenBufferInfoEx(hconsoleoutput: Long, lpconsolescreenbufferinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleSelectionInfo(lpconsoleselectioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleTitleA(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleTitleW(lpconsoletitle: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getConsoleWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getCurrentConsoleFont(hconsoleoutput: Long, bmaximumwindow: Int, lpconsolecurrentfont: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getCurrentConsoleFontEx(hconsoleoutput: Long, bmaximumwindow: Int, lpconsolecurrentfontex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getNumberOfConsoleInputEvents(hconsoleinput: Long, lpnumberofevents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getNumberOfConsoleMouseButtons(lpnumberofmousebuttons: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_getStdHandle(nstdhandle: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_console_peekConsoleInputA(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_peekConsoleInputW(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_readConsoleA(hconsoleinput: Long, lpbuffer: Long, nnumberofcharstoread: Int, lpnumberofcharsread: Long, pinputcontrol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_readConsoleInputA(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_readConsoleInputW(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventsread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_readConsoleW(hconsoleinput: Long, lpbuffer: Long, nnumberofcharstoread: Int, lpnumberofcharsread: Long, pinputcontrol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleActiveScreenBuffer(hconsoleoutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleCP(wcodepageid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleCtrlHandler(handlerroutine: Long, add: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleCursorInfo(hconsoleoutput: Long, lpconsolecursorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleDisplayMode(hconsoleoutput: Long, dwflags: Int, lpnewscreenbufferdimensions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleHistoryInfo(lpconsolehistoryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleMode(hconsolehandle: Long, dwmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleNumberOfCommandsA(number: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleNumberOfCommandsW(number: Int, exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleOutputCP(wcodepageid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleScreenBufferInfoEx(hconsoleoutput: Long, lpconsolescreenbufferinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleTextAttribute(hconsoleoutput: Long, wattributes: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleTitleA(lpconsoletitle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleTitleW(lpconsoletitle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setConsoleWindowInfo(hconsoleoutput: Long, babsolute: Int, lpconsolewindow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setCurrentConsoleFontEx(hconsoleoutput: Long, bmaximumwindow: Int, lpconsolecurrentfontex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setStdHandle(nstdhandle: Int, hhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_setStdHandleEx(nstdhandle: Int, hhandle: Long, phprevvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_writeConsoleA(hconsoleoutput: Long, lpbuffer: Long, nnumberofcharstowrite: Int, lpnumberofcharswritten: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_writeConsoleInputA(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_writeConsoleInputW(hconsoleinput: Long, lpbuffer: Long, nlength: Int, lpnumberofeventswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_console_writeConsoleW(hconsoleoutput: Long, lpbuffer: Long, nnumberofcharstowrite: Int, lpnumberofcharswritten: Long, lpreserved: Long): Int
}

public actual fun addConsoleAliasA(source: Pcstr, target: Pcstr, exename: Pcstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_addConsoleAliasA((source?.value ?: 0L), (target?.value ?: 0L), (exename?.value ?: 0L))

public actual fun addConsoleAliasW(source: Pcwstr, target: Pcwstr, exename: Pcwstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_addConsoleAliasW((source?.value ?: 0L), (target?.value ?: 0L), (exename?.value ?: 0L))

public actual fun allocConsole(): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_allocConsole()

public actual fun attachConsole(dwprocessid: UInt): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_attachConsole(dwprocessid.toInt())

public actual fun closePseudoConsole(hpc: Hpcon) {
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_closePseudoConsole(hpc.toLong())
}

public actual fun consoleControl(command: Consolecontrol, consoleinformation: COpaquePointer?, consoleinformationlength: UInt): Ntstatus =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_consoleControl(command, (consoleinformation?.value ?: 0L), consoleinformationlength.toInt())

public actual fun createConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwflags: UInt, lpscreenbufferdata: COpaquePointer?): Handle =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_createConsoleScreenBuffer(dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L), dwflags.toInt(), (lpscreenbufferdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPseudoConsole(size: Coord, hinput: Handle, houtput: Handle, dwflags: UInt, phpc: COpaquePointer?): Hresult =
    0

public actual fun expungeConsoleCommandHistoryA(exename: Pcstr) {
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_expungeConsoleCommandHistoryA((exename?.value ?: 0L))
}

public actual fun expungeConsoleCommandHistoryW(exename: Pcwstr) {
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_expungeConsoleCommandHistoryW((exename?.value ?: 0L))
}

public actual fun fillConsoleOutputAttribute(hconsoleoutput: Handle, wattribute: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: COpaquePointer?): Bool =
    0

public actual fun fillConsoleOutputCharacterA(hconsoleoutput: Handle, ccharacter: Byte, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: COpaquePointer?): Bool =
    0

public actual fun fillConsoleOutputCharacterW(hconsoleoutput: Handle, ccharacter: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: COpaquePointer?): Bool =
    0

public actual fun flushConsoleInputBuffer(hconsoleinput: Handle): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_flushConsoleInputBuffer((hconsoleinput?.value ?: 0L))

public actual fun freeConsole(): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_freeConsole()

public actual fun generateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_generateConsoleCtrlEvent(dwctrlevent.toInt(), dwprocessgroupid.toInt())

public actual fun getConsoleAliasA(source: Pcstr, targetbuffer: Pstr, targetbufferlength: UInt, exename: Pcstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleAliasA((source?.value ?: 0L), (targetbuffer?.value ?: 0L), targetbufferlength.toInt(), (exename?.value ?: 0L)).toUInt()

public actual fun getConsoleAliasExesA(exenamebuffer: Pstr, exenamebufferlength: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleAliasExesA((exenamebuffer?.value ?: 0L), exenamebufferlength.toInt()).toUInt()

public actual fun getConsoleAliasExesLengthA(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleAliasExesLengthA().toUInt()

public actual fun getConsoleAliasExesLengthW(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleAliasExesLengthW().toUInt()

public actual fun getConsoleAliasExesW(exenamebuffer: Pwstr, exenamebufferlength: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleAliasExesW((exenamebuffer?.value ?: 0L), exenamebufferlength.toInt()).toUInt()

public actual fun getConsoleAliasW(source: Pcwstr, targetbuffer: Pwstr, targetbufferlength: UInt, exename: Pcwstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleAliasW((source?.value ?: 0L), (targetbuffer?.value ?: 0L), targetbufferlength.toInt(), (exename?.value ?: 0L)).toUInt()

public actual fun getConsoleAliasesA(aliasbuffer: Pstr, aliasbufferlength: UInt, exename: Pcstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleAliasesA((aliasbuffer?.value ?: 0L), aliasbufferlength.toInt(), (exename?.value ?: 0L)).toUInt()

public actual fun getConsoleAliasesLengthA(exename: Pcstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleAliasesLengthA((exename?.value ?: 0L)).toUInt()

public actual fun getConsoleAliasesLengthW(exename: Pcwstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleAliasesLengthW((exename?.value ?: 0L)).toUInt()

public actual fun getConsoleAliasesW(aliasbuffer: Pwstr, aliasbufferlength: UInt, exename: Pcwstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleAliasesW((aliasbuffer?.value ?: 0L), aliasbufferlength.toInt(), (exename?.value ?: 0L)).toUInt()

public actual fun getConsoleCP(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleCP().toUInt()

public actual fun getConsoleCommandHistoryA(commands: Pstr, commandbufferlength: UInt, exename: Pcstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleCommandHistoryA((commands?.value ?: 0L), commandbufferlength.toInt(), (exename?.value ?: 0L)).toUInt()

public actual fun getConsoleCommandHistoryLengthA(exename: Pcstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthA((exename?.value ?: 0L)).toUInt()

public actual fun getConsoleCommandHistoryLengthW(exename: Pcwstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleCommandHistoryLengthW((exename?.value ?: 0L)).toUInt()

public actual fun getConsoleCommandHistoryW(commands: Pwstr, commandbufferlength: UInt, exename: Pcwstr): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleCommandHistoryW((commands?.value ?: 0L), commandbufferlength.toInt(), (exename?.value ?: 0L)).toUInt()

public actual fun getConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleCursorInfo((hconsoleoutput?.value ?: 0L), (lpconsolecursorinfo?.value ?: 0L))

public actual fun getConsoleDisplayMode(lpmodeflags: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleDisplayMode((lpmodeflags?.value ?: 0L))

public actual fun getConsoleFontSize(hconsoleoutput: Handle, nfont: UInt): Coord =
    Coord()

public actual fun getConsoleHistoryInfo(lpconsolehistoryinfo: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleHistoryInfo((lpconsolehistoryinfo?.value ?: 0L))

public actual fun getConsoleMode(hconsolehandle: Handle, lpmode: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleMode((hconsolehandle?.value ?: 0L), (lpmode?.value ?: 0L))

public actual fun getConsoleOriginalTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleOriginalTitleA((lpconsoletitle?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getConsoleOriginalTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleOriginalTitleW((lpconsoletitle?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getConsoleOutputCP(): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleOutputCP().toUInt()

public actual fun getConsoleProcessList(lpdwprocesslist: COpaquePointer?, dwprocesscount: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleProcessList((lpdwprocesslist?.value ?: 0L), dwprocesscount.toInt()).toUInt()

public actual fun getConsoleScreenBufferInfo(hconsoleoutput: Handle, lpconsolescreenbufferinfo: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleScreenBufferInfo((hconsoleoutput?.value ?: 0L), (lpconsolescreenbufferinfo?.value ?: 0L))

public actual fun getConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleScreenBufferInfoEx((hconsoleoutput?.value ?: 0L), (lpconsolescreenbufferinfoex?.value ?: 0L))

public actual fun getConsoleSelectionInfo(lpconsoleselectioninfo: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleSelectionInfo((lpconsoleselectioninfo?.value ?: 0L))

public actual fun getConsoleTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleTitleA((lpconsoletitle?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getConsoleTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleTitleW((lpconsoletitle?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getConsoleWindow(): Hwnd =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getConsoleWindow().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getCurrentConsoleFont(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfont: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getCurrentConsoleFont((hconsoleoutput?.value ?: 0L), bmaximumwindow, (lpconsolecurrentfont?.value ?: 0L))

public actual fun getCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getCurrentConsoleFontEx((hconsoleoutput?.value ?: 0L), bmaximumwindow, (lpconsolecurrentfontex?.value ?: 0L))

public actual fun getLargestConsoleWindowSize(hconsoleoutput: Handle): Coord =
    Coord()

public actual fun getNumberOfConsoleInputEvents(hconsoleinput: Handle, lpnumberofevents: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getNumberOfConsoleInputEvents((hconsoleinput?.value ?: 0L), (lpnumberofevents?.value ?: 0L))

public actual fun getNumberOfConsoleMouseButtons(lpnumberofmousebuttons: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getNumberOfConsoleMouseButtons((lpnumberofmousebuttons?.value ?: 0L))

public actual fun getStdHandle(nstdhandle: StdHandle): Handle =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_getStdHandle(nstdhandle.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun peekConsoleInputA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_peekConsoleInputA((hconsoleinput?.value ?: 0L), (lpbuffer?.value ?: 0L), nlength.toInt(), (lpnumberofeventsread?.value ?: 0L))

public actual fun peekConsoleInputW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_peekConsoleInputW((hconsoleinput?.value ?: 0L), (lpbuffer?.value ?: 0L), nlength.toInt(), (lpnumberofeventsread?.value ?: 0L))

public actual fun readConsoleA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nnumberofcharstoread: UInt, lpnumberofcharsread: COpaquePointer?, pinputcontrol: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_readConsoleA((hconsoleinput?.value ?: 0L), (lpbuffer?.value ?: 0L), nnumberofcharstoread.toInt(), (lpnumberofcharsread?.value ?: 0L), (pinputcontrol?.value ?: 0L))

public actual fun readConsoleInputA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_readConsoleInputA((hconsoleinput?.value ?: 0L), (lpbuffer?.value ?: 0L), nlength.toInt(), (lpnumberofeventsread?.value ?: 0L))

public actual fun readConsoleInputW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventsread: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_readConsoleInputW((hconsoleinput?.value ?: 0L), (lpbuffer?.value ?: 0L), nlength.toInt(), (lpnumberofeventsread?.value ?: 0L))

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
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_readConsoleW((hconsoleinput?.value ?: 0L), (lpbuffer?.value ?: 0L), nnumberofcharstoread.toInt(), (lpnumberofcharsread?.value ?: 0L), (pinputcontrol?.value ?: 0L))

public actual fun resizePseudoConsole(hpc: Hpcon, size: Coord): Hresult =
    0

public actual fun scrollConsoleScreenBufferA(hconsoleoutput: Handle, lpscrollrectangle: COpaquePointer?, lpcliprectangle: COpaquePointer?, dwdestinationorigin: Coord, lpfill: COpaquePointer?): Bool =
    0

public actual fun scrollConsoleScreenBufferW(hconsoleoutput: Handle, lpscrollrectangle: COpaquePointer?, lpcliprectangle: COpaquePointer?, dwdestinationorigin: Coord, lpfill: COpaquePointer?): Bool =
    0

public actual fun setConsoleActiveScreenBuffer(hconsoleoutput: Handle): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleActiveScreenBuffer((hconsoleoutput?.value ?: 0L))

public actual fun setConsoleCP(wcodepageid: UInt): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleCP(wcodepageid.toInt())

public actual fun setConsoleCtrlHandler(handlerroutine: PhandlerRoutine, add: Bool): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleCtrlHandler(0L, add)

public actual fun setConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleCursorInfo((hconsoleoutput?.value ?: 0L), (lpconsolecursorinfo?.value ?: 0L))

public actual fun setConsoleCursorPosition(hconsoleoutput: Handle, dwcursorposition: Coord): Bool =
    0

public actual fun setConsoleDisplayMode(hconsoleoutput: Handle, dwflags: UInt, lpnewscreenbufferdimensions: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleDisplayMode((hconsoleoutput?.value ?: 0L), dwflags.toInt(), (lpnewscreenbufferdimensions?.value ?: 0L))

public actual fun setConsoleHistoryInfo(lpconsolehistoryinfo: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleHistoryInfo((lpconsolehistoryinfo?.value ?: 0L))

public actual fun setConsoleMode(hconsolehandle: Handle, dwmode: ConsoleMode): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleMode((hconsolehandle?.value ?: 0L), dwmode.toInt())

public actual fun setConsoleNumberOfCommandsA(number: UInt, exename: Pcstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleNumberOfCommandsA(number.toInt(), (exename?.value ?: 0L))

public actual fun setConsoleNumberOfCommandsW(number: UInt, exename: Pcwstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleNumberOfCommandsW(number.toInt(), (exename?.value ?: 0L))

public actual fun setConsoleOutputCP(wcodepageid: UInt): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleOutputCP(wcodepageid.toInt())

public actual fun setConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleScreenBufferInfoEx((hconsoleoutput?.value ?: 0L), (lpconsolescreenbufferinfoex?.value ?: 0L))

public actual fun setConsoleScreenBufferSize(hconsoleoutput: Handle, dwsize: Coord): Bool =
    0

public actual fun setConsoleTextAttribute(hconsoleoutput: Handle, wattributes: ConsoleCharacterAttributes): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleTextAttribute((hconsoleoutput?.value ?: 0L), wattributes.toShort())

public actual fun setConsoleTitleA(lpconsoletitle: Pcstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleTitleA((lpconsoletitle?.value ?: 0L))

public actual fun setConsoleTitleW(lpconsoletitle: Pcwstr): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleTitleW((lpconsoletitle?.value ?: 0L))

public actual fun setConsoleWindowInfo(hconsoleoutput: Handle, babsolute: Bool, lpconsolewindow: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setConsoleWindowInfo((hconsoleoutput?.value ?: 0L), babsolute, (lpconsolewindow?.value ?: 0L))

public actual fun setCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setCurrentConsoleFontEx((hconsoleoutput?.value ?: 0L), bmaximumwindow, (lpconsolecurrentfontex?.value ?: 0L))

public actual fun setStdHandle(nstdhandle: StdHandle, hhandle: Handle): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setStdHandle(nstdhandle.toInt(), (hhandle?.value ?: 0L))

public actual fun setStdHandleEx(nstdhandle: StdHandle, hhandle: Handle, phprevvalue: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_setStdHandleEx(nstdhandle.toInt(), (hhandle?.value ?: 0L), (phprevvalue?.value ?: 0L))

public actual fun writeConsoleA(hconsoleoutput: Handle, lpbuffer: Pcstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_writeConsoleA((hconsoleoutput?.value ?: 0L), (lpbuffer?.value ?: 0L), nnumberofcharstowrite.toInt(), (lpnumberofcharswritten?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun writeConsoleInputA(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventswritten: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_writeConsoleInputA((hconsoleinput?.value ?: 0L), (lpbuffer?.value ?: 0L), nlength.toInt(), (lpnumberofeventswritten?.value ?: 0L))

public actual fun writeConsoleInputW(hconsoleinput: Handle, lpbuffer: COpaquePointer?, nlength: UInt, lpnumberofeventswritten: COpaquePointer?): Bool =
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_writeConsoleInputW((hconsoleinput?.value ?: 0L), (lpbuffer?.value ?: 0L), nlength.toInt(), (lpnumberofeventswritten?.value ?: 0L))

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
    WindowsWin32SystemConsoleJniBridge.windowssys_windows_win32_system_console_writeConsoleW((hconsoleoutput?.value ?: 0L), (lpbuffer?.value ?: 0L), nnumberofcharstowrite.toInt(), (lpnumberofcharswritten?.value ?: 0L), (lpreserved?.value ?: 0L))
