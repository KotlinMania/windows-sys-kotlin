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

public expect fun addConsoleAliasA(source: Pcstr, target: Pcstr, exename: Pcstr): Bool

public expect fun addConsoleAliasW(source: Pcwstr, target: Pcwstr, exename: Pcwstr): Bool

public expect fun allocConsole(): Bool

public expect fun attachConsole(dwprocessid: UInt): Bool

public expect fun closePseudoConsole(hpc: Hpcon)

public expect fun consoleControl(command: Consolecontrol, consoleinformation: ConstPtr<CVoid>, consoleinformationlength: UInt): Ntstatus

public expect fun createConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwflags: UInt, lpscreenbufferdata: ConstPtr<CVoid>): Handle

public expect fun createPseudoConsole(size: Coord, hinput: Handle, houtput: Handle, dwflags: UInt, phpc: MutPtr<Hpcon>): Hresult

public expect fun expungeConsoleCommandHistoryA(exename: Pcstr)

public expect fun expungeConsoleCommandHistoryW(exename: Pcwstr)

public expect fun fillConsoleOutputAttribute(hconsoleoutput: Handle, wattribute: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr<UInt>): Bool

public expect fun fillConsoleOutputCharacterA(hconsoleoutput: Handle, ccharacter: Byte, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool

public expect fun fillConsoleOutputCharacterW(hconsoleoutput: Handle, ccharacter: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool

public expect fun flushConsoleInputBuffer(hconsoleinput: Handle): Bool

public expect fun freeConsole(): Bool

public expect fun generateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): Bool

public expect fun getConsoleAliasA(source: Pcstr, targetbuffer: Pstr, targetbufferlength: UInt, exename: Pcstr): UInt

public expect fun getConsoleAliasExesA(exenamebuffer: Pstr, exenamebufferlength: UInt): UInt

public expect fun getConsoleAliasExesLengthA(): UInt

public expect fun getConsoleAliasExesLengthW(): UInt

public expect fun getConsoleAliasExesW(exenamebuffer: Pwstr, exenamebufferlength: UInt): UInt

public expect fun getConsoleAliasW(source: Pcwstr, targetbuffer: Pwstr, targetbufferlength: UInt, exename: Pcwstr): UInt

public expect fun getConsoleAliasesA(aliasbuffer: Pstr, aliasbufferlength: UInt, exename: Pcstr): UInt

public expect fun getConsoleAliasesLengthA(exename: Pcstr): UInt

public expect fun getConsoleAliasesLengthW(exename: Pcwstr): UInt

public expect fun getConsoleAliasesW(aliasbuffer: Pwstr, aliasbufferlength: UInt, exename: Pcwstr): UInt

public expect fun getConsoleCP(): UInt

public expect fun getConsoleCommandHistoryA(commands: Pstr, commandbufferlength: UInt, exename: Pcstr): UInt

public expect fun getConsoleCommandHistoryLengthA(exename: Pcstr): UInt

public expect fun getConsoleCommandHistoryLengthW(exename: Pcwstr): UInt

public expect fun getConsoleCommandHistoryW(commands: Pwstr, commandbufferlength: UInt, exename: Pcwstr): UInt

public expect fun getConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: MutPtr<ConsoleCursorInfo>): Bool

public expect fun getConsoleDisplayMode(lpmodeflags: MutPtr<UInt>): Bool

public expect fun getConsoleFontSize(hconsoleoutput: Handle, nfont: UInt): Coord

public expect fun getConsoleHistoryInfo(lpconsolehistoryinfo: MutPtr<ConsoleHistoryInfo>): Bool

public expect fun getConsoleMode(hconsolehandle: Handle, lpmode: MutPtr<ConsoleMode>): Bool

public expect fun getConsoleOriginalTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt

public expect fun getConsoleOriginalTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt

public expect fun getConsoleOutputCP(): UInt

public expect fun getConsoleProcessList(lpdwprocesslist: MutPtr<UInt>, dwprocesscount: UInt): UInt

public expect fun getConsoleScreenBufferInfo(hconsoleoutput: Handle, lpconsolescreenbufferinfo: MutPtr<ConsoleScreenBufferInfo>): Bool

public expect fun getConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: MutPtr<ConsoleScreenBufferInfoex>): Bool

public expect fun getConsoleSelectionInfo(lpconsoleselectioninfo: MutPtr<ConsoleSelectionInfo>): Bool

public expect fun getConsoleTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt

public expect fun getConsoleTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt

public expect fun getConsoleWindow(): Hwnd

public expect fun getCurrentConsoleFont(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfont: MutPtr<ConsoleFontInfo>): Bool

public expect fun getCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: MutPtr<ConsoleFontInfoex>): Bool

public expect fun getLargestConsoleWindowSize(hconsoleoutput: Handle): Coord

public expect fun getNumberOfConsoleInputEvents(hconsoleinput: Handle, lpnumberofevents: MutPtr<UInt>): Bool

public expect fun getNumberOfConsoleMouseButtons(lpnumberofmousebuttons: MutPtr<UInt>): Bool

public expect fun getStdHandle(nstdhandle: StdHandle): Handle

public expect fun peekConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool

public expect fun peekConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool

public expect fun readConsoleA(hconsoleinput: Handle, lpbuffer: MutPtr<CVoid>, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr<UInt>, pinputcontrol: ConstPtr<ConsoleReadconsoleControl>): Bool

public expect fun readConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool

public expect fun readConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool

public expect fun readConsoleOutputA(hconsoleoutput: Handle, lpbuffer: MutPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr<SmallRect>): Bool

public expect fun readConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: MutPtr<UShort>, nlength: UInt, dwreadcoord: Coord, lpnumberofattrsread: MutPtr<UInt>): Bool

public expect fun readConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr<UInt>): Bool

public expect fun readConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pwstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr<UInt>): Bool

public expect fun readConsoleOutputW(hconsoleoutput: Handle, lpbuffer: MutPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr<SmallRect>): Bool

public expect fun readConsoleW(hconsoleinput: Handle, lpbuffer: MutPtr<CVoid>, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr<UInt>, pinputcontrol: ConstPtr<ConsoleReadconsoleControl>): Bool

public expect fun resizePseudoConsole(hpc: Hpcon, size: Coord): Hresult

public expect fun scrollConsoleScreenBufferA(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr<SmallRect>, lpcliprectangle: ConstPtr<SmallRect>, dwdestinationorigin: Coord, lpfill: ConstPtr<CharInfo>): Bool

public expect fun scrollConsoleScreenBufferW(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr<SmallRect>, lpcliprectangle: ConstPtr<SmallRect>, dwdestinationorigin: Coord, lpfill: ConstPtr<CharInfo>): Bool

public expect fun setConsoleActiveScreenBuffer(hconsoleoutput: Handle): Bool

public expect fun setConsoleCP(wcodepageid: UInt): Bool

public expect fun setConsoleCtrlHandler(handlerroutine: PhandlerRoutine, add: Bool): Bool

public expect fun setConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: ConstPtr<ConsoleCursorInfo>): Bool

public expect fun setConsoleCursorPosition(hconsoleoutput: Handle, dwcursorposition: Coord): Bool

public expect fun setConsoleDisplayMode(hconsoleoutput: Handle, dwflags: UInt, lpnewscreenbufferdimensions: MutPtr<Coord>): Bool

public expect fun setConsoleHistoryInfo(lpconsolehistoryinfo: ConstPtr<ConsoleHistoryInfo>): Bool

public expect fun setConsoleMode(hconsolehandle: Handle, dwmode: ConsoleMode): Bool

public expect fun setConsoleNumberOfCommandsA(number: UInt, exename: Pcstr): Bool

public expect fun setConsoleNumberOfCommandsW(number: UInt, exename: Pcwstr): Bool

public expect fun setConsoleOutputCP(wcodepageid: UInt): Bool

public expect fun setConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: ConstPtr<ConsoleScreenBufferInfoex>): Bool

public expect fun setConsoleScreenBufferSize(hconsoleoutput: Handle, dwsize: Coord): Bool

public expect fun setConsoleTextAttribute(hconsoleoutput: Handle, wattributes: ConsoleCharacterAttributes): Bool

public expect fun setConsoleTitleA(lpconsoletitle: Pcstr): Bool

public expect fun setConsoleTitleW(lpconsoletitle: Pcwstr): Bool

public expect fun setConsoleWindowInfo(hconsoleoutput: Handle, babsolute: Bool, lpconsolewindow: ConstPtr<SmallRect>): Bool

public expect fun setCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: ConstPtr<ConsoleFontInfoex>): Bool

public expect fun setStdHandle(nstdhandle: StdHandle, hhandle: Handle): Bool

public expect fun setStdHandleEx(nstdhandle: StdHandle, hhandle: Handle, phprevvalue: MutPtr<Handle>): Bool

public expect fun writeConsoleA(hconsoleoutput: Handle, lpbuffer: Pcstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun writeConsoleInputA(hconsoleinput: Handle, lpbuffer: ConstPtr<InputRecord>, nlength: UInt, lpnumberofeventswritten: MutPtr<UInt>): Bool

public expect fun writeConsoleInputW(hconsoleinput: Handle, lpbuffer: ConstPtr<InputRecord>, nlength: UInt, lpnumberofeventswritten: MutPtr<UInt>): Bool

public expect fun writeConsoleOutputA(hconsoleoutput: Handle, lpbuffer: ConstPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr<SmallRect>): Bool

public expect fun writeConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: ConstPtr<UShort>, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr<UInt>): Bool

public expect fun writeConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pcstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool

public expect fun writeConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pcwstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool

public expect fun writeConsoleOutputW(hconsoleoutput: Handle, lpbuffer: ConstPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr<SmallRect>): Bool

public expect fun writeConsoleW(hconsoleoutput: Handle, lpbuffer: Pcwstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool
