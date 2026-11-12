@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addConsoleAliasA(source: Pcstr, target: Pcstr, exename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleAddConsoleAliasA")

public actual fun addConsoleAliasW(source: Pcwstr, target: Pcwstr, exename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleAddConsoleAliasW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleAllocConsole")
private external fun wasiWindowssysWindowsWin32SystemConsoleAllocConsole(): Int

public actual fun allocConsole(): Bool =
    wasiWindowssysWindowsWin32SystemConsoleAllocConsole()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleAttachConsole")
private external fun wasiWindowssysWindowsWin32SystemConsoleAttachConsole(dwprocessid: Int): Int

public actual fun attachConsole(dwprocessid: UInt): Bool =
    wasiWindowssysWindowsWin32SystemConsoleAttachConsole(dwprocessid.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleClosePseudoConsole")
private external fun wasiWindowssysWindowsWin32SystemConsoleClosePseudoConsole(hpc: Long): Unit

public actual fun closePseudoConsole(hpc: Hpcon): Unit =
    wasiWindowssysWindowsWin32SystemConsoleClosePseudoConsole(hpc)

public actual fun consoleControl(command: Consolecontrol, consoleinformation: ConstPtr<CVoid>, consoleinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleConsoleControl")

public actual fun createConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwflags: UInt, lpscreenbufferdata: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer")

public actual fun createPseudoConsole(size: Coord, hinput: Handle, houtput: Handle, dwflags: UInt, phpc: MutPtr<Hpcon>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleCreatePseudoConsole")

public actual fun expungeConsoleCommandHistoryA(exename: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA")

public actual fun expungeConsoleCommandHistoryW(exename: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW")

public actual fun fillConsoleOutputAttribute(hconsoleoutput: Handle, wattribute: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleFillConsoleOutputAttribute")

public actual fun fillConsoleOutputCharacterA(hconsoleoutput: Handle, ccharacter: Byte, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleFillConsoleOutputCharacterA")

public actual fun fillConsoleOutputCharacterW(hconsoleoutput: Handle, ccharacter: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleFillConsoleOutputCharacterW")

public actual fun flushConsoleInputBuffer(hconsoleinput: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleFreeConsole")
private external fun wasiWindowssysWindowsWin32SystemConsoleFreeConsole(): Int

public actual fun freeConsole(): Bool =
    wasiWindowssysWindowsWin32SystemConsoleFreeConsole()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent")
private external fun wasiWindowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(dwctrlevent: Int, dwprocessgroupid: Int): Int

public actual fun generateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): Bool =
    wasiWindowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(dwctrlevent.toInt(), dwprocessgroupid.toInt())

public actual fun getConsoleAliasA(source: Pcstr, targetbuffer: Pstr, targetbufferlength: UInt, exename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleAliasA")

public actual fun getConsoleAliasExesA(exenamebuffer: Pstr, exenamebufferlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleAliasExesA")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA")
private external fun wasiWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA(): Int

public actual fun getConsoleAliasExesLengthA(): UInt =
    wasiWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW")
private external fun wasiWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW(): Int

public actual fun getConsoleAliasExesLengthW(): UInt =
    wasiWindowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW().toUInt()

public actual fun getConsoleAliasExesW(exenamebuffer: Pwstr, exenamebufferlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleAliasExesW")

public actual fun getConsoleAliasW(source: Pcwstr, targetbuffer: Pwstr, targetbufferlength: UInt, exename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleAliasW")

public actual fun getConsoleAliasesA(aliasbuffer: Pstr, aliasbufferlength: UInt, exename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleAliasesA")

public actual fun getConsoleAliasesLengthA(exename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA")

public actual fun getConsoleAliasesLengthW(exename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW")

public actual fun getConsoleAliasesW(aliasbuffer: Pwstr, aliasbufferlength: UInt, exename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleAliasesW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleGetConsoleCP")
private external fun wasiWindowssysWindowsWin32SystemConsoleGetConsoleCP(): Int

public actual fun getConsoleCP(): UInt =
    wasiWindowssysWindowsWin32SystemConsoleGetConsoleCP().toUInt()

public actual fun getConsoleCommandHistoryA(commands: Pstr, commandbufferlength: UInt, exename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA")

public actual fun getConsoleCommandHistoryLengthA(exename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA")

public actual fun getConsoleCommandHistoryLengthW(exename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW")

public actual fun getConsoleCommandHistoryW(commands: Pwstr, commandbufferlength: UInt, exename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW")

public actual fun getConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: MutPtr<ConsoleCursorInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleCursorInfo")

public actual fun getConsoleDisplayMode(lpmodeflags: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleDisplayMode")

public actual fun getConsoleFontSize(hconsoleoutput: Handle, nfont: UInt): Coord =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleFontSize")

public actual fun getConsoleHistoryInfo(lpconsolehistoryinfo: MutPtr<ConsoleHistoryInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo")

public actual fun getConsoleMode(hconsolehandle: Handle, lpmode: MutPtr<ConsoleMode>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleMode")

public actual fun getConsoleOriginalTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA")

public actual fun getConsoleOriginalTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleGetConsoleOutputCP")
private external fun wasiWindowssysWindowsWin32SystemConsoleGetConsoleOutputCP(): Int

public actual fun getConsoleOutputCP(): UInt =
    wasiWindowssysWindowsWin32SystemConsoleGetConsoleOutputCP().toUInt()

public actual fun getConsoleProcessList(lpdwprocesslist: MutPtr<UInt>, dwprocesscount: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleProcessList")

public actual fun getConsoleScreenBufferInfo(hconsoleoutput: Handle, lpconsolescreenbufferinfo: MutPtr<ConsoleScreenBufferInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo")

public actual fun getConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: MutPtr<ConsoleScreenBufferInfoex>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx")

public actual fun getConsoleSelectionInfo(lpconsoleselectioninfo: MutPtr<ConsoleSelectionInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo")

public actual fun getConsoleTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleTitleA")

public actual fun getConsoleTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleTitleW")

public actual fun getConsoleWindow(): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetConsoleWindow")

public actual fun getCurrentConsoleFont(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfont: MutPtr<ConsoleFontInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetCurrentConsoleFont")

public actual fun getCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: MutPtr<ConsoleFontInfoex>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx")

public actual fun getLargestConsoleWindowSize(hconsoleoutput: Handle): Coord =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetLargestConsoleWindowSize")

public actual fun getNumberOfConsoleInputEvents(hconsoleinput: Handle, lpnumberofevents: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents")

public actual fun getNumberOfConsoleMouseButtons(lpnumberofmousebuttons: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons")

public actual fun getStdHandle(nstdhandle: StdHandle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleGetStdHandle")

public actual fun peekConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsolePeekConsoleInputA")

public actual fun peekConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsolePeekConsoleInputW")

public actual fun readConsoleA(hconsoleinput: Handle, lpbuffer: MutPtr<CVoid>, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr<UInt>, pinputcontrol: ConstPtr<ConsoleReadconsoleControl>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleReadConsoleA")

public actual fun readConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleReadConsoleInputA")

public actual fun readConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleReadConsoleInputW")

public actual fun readConsoleOutputA(hconsoleoutput: Handle, lpbuffer: MutPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleReadConsoleOutputA")

public actual fun readConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: MutPtr<UShort>, nlength: UInt, dwreadcoord: Coord, lpnumberofattrsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleReadConsoleOutputAttribute")

public actual fun readConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleReadConsoleOutputCharacterA")

public actual fun readConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pwstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleReadConsoleOutputCharacterW")

public actual fun readConsoleOutputW(hconsoleoutput: Handle, lpbuffer: MutPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleReadConsoleOutputW")

public actual fun readConsoleW(hconsoleinput: Handle, lpbuffer: MutPtr<CVoid>, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr<UInt>, pinputcontrol: ConstPtr<ConsoleReadconsoleControl>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleReadConsoleW")

public actual fun resizePseudoConsole(hpc: Hpcon, size: Coord): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleResizePseudoConsole")

public actual fun scrollConsoleScreenBufferA(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr<SmallRect>, lpcliprectangle: ConstPtr<SmallRect>, dwdestinationorigin: Coord, lpfill: ConstPtr<CharInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleScrollConsoleScreenBufferA")

public actual fun scrollConsoleScreenBufferW(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr<SmallRect>, lpcliprectangle: ConstPtr<SmallRect>, dwdestinationorigin: Coord, lpfill: ConstPtr<CharInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleScrollConsoleScreenBufferW")

public actual fun setConsoleActiveScreenBuffer(hconsoleoutput: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleSetConsoleCP")
private external fun wasiWindowssysWindowsWin32SystemConsoleSetConsoleCP(wcodepageid: Int): Int

public actual fun setConsoleCP(wcodepageid: UInt): Bool =
    wasiWindowssysWindowsWin32SystemConsoleSetConsoleCP(wcodepageid.toInt())

public actual fun setConsoleCtrlHandler(handlerroutine: PhandlerRoutine, add: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler")

public actual fun setConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: ConstPtr<ConsoleCursorInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleCursorInfo")

public actual fun setConsoleCursorPosition(hconsoleoutput: Handle, dwcursorposition: Coord): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleCursorPosition")

public actual fun setConsoleDisplayMode(hconsoleoutput: Handle, dwflags: UInt, lpnewscreenbufferdimensions: MutPtr<Coord>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleDisplayMode")

public actual fun setConsoleHistoryInfo(lpconsolehistoryinfo: ConstPtr<ConsoleHistoryInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo")

public actual fun setConsoleMode(hconsolehandle: Handle, dwmode: ConsoleMode): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleMode")

public actual fun setConsoleNumberOfCommandsA(number: UInt, exename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA")

public actual fun setConsoleNumberOfCommandsW(number: UInt, exename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemConsoleSetConsoleOutputCP")
private external fun wasiWindowssysWindowsWin32SystemConsoleSetConsoleOutputCP(wcodepageid: Int): Int

public actual fun setConsoleOutputCP(wcodepageid: UInt): Bool =
    wasiWindowssysWindowsWin32SystemConsoleSetConsoleOutputCP(wcodepageid.toInt())

public actual fun setConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: ConstPtr<ConsoleScreenBufferInfoex>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx")

public actual fun setConsoleScreenBufferSize(hconsoleoutput: Handle, dwsize: Coord): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleScreenBufferSize")

public actual fun setConsoleTextAttribute(hconsoleoutput: Handle, wattributes: ConsoleCharacterAttributes): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleTextAttribute")

public actual fun setConsoleTitleA(lpconsoletitle: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleTitleA")

public actual fun setConsoleTitleW(lpconsoletitle: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleTitleW")

public actual fun setConsoleWindowInfo(hconsoleoutput: Handle, babsolute: Bool, lpconsolewindow: ConstPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetConsoleWindowInfo")

public actual fun setCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: ConstPtr<ConsoleFontInfoex>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx")

public actual fun setStdHandle(nstdhandle: StdHandle, hhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetStdHandle")

public actual fun setStdHandleEx(nstdhandle: StdHandle, hhandle: Handle, phprevvalue: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleSetStdHandleEx")

public actual fun writeConsoleA(hconsoleoutput: Handle, lpbuffer: Pcstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleWriteConsoleA")

public actual fun writeConsoleInputA(hconsoleinput: Handle, lpbuffer: ConstPtr<InputRecord>, nlength: UInt, lpnumberofeventswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleWriteConsoleInputA")

public actual fun writeConsoleInputW(hconsoleinput: Handle, lpbuffer: ConstPtr<InputRecord>, nlength: UInt, lpnumberofeventswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleWriteConsoleInputW")

public actual fun writeConsoleOutputA(hconsoleoutput: Handle, lpbuffer: ConstPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleWriteConsoleOutputA")

public actual fun writeConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: ConstPtr<UShort>, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleWriteConsoleOutputAttribute")

public actual fun writeConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pcstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleWriteConsoleOutputCharacterA")

public actual fun writeConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pcwstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleWriteConsoleOutputCharacterW")

public actual fun writeConsoleOutputW(hconsoleoutput: Handle, lpbuffer: ConstPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleWriteConsoleOutputW")

public actual fun writeConsoleW(hconsoleoutput: Handle, lpbuffer: Pcwstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemConsoleWriteConsoleW")
