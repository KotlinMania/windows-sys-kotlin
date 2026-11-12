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

private val windowsWin32SystemConsoleNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addConsoleAliasA(source: Pcstr, target: Pcstr, exename: Pcstr): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleAddConsoleAliasA(source.rawAddress.toString(), target.rawAddress.toString(), exename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addConsoleAliasW(source: Pcwstr, target: Pcwstr, exename: Pcwstr): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleAddConsoleAliasW(source.rawAddress.toString(), target.rawAddress.toString(), exename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocConsole(): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleAllocConsole() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun attachConsole(dwprocessid: UInt): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleAttachConsole(dwprocessid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePseudoConsole(hpc: Hpcon) {
    if (windowsWin32SystemConsoleNapiAddon != null) {
        windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleClosePseudoConsole(hpc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun consoleControl(command: Consolecontrol, consoleinformation: ConstPtr<CVoid>, consoleinformationlength: UInt): Ntstatus =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleConsoleControl(command, consoleinformation.rawAddress.toString(), consoleinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwflags: UInt, lpscreenbufferdata: ConstPtr<CVoid>): Handle =
    if (windowsWin32SystemConsoleNapiAddon != null) MutPtr((windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer(dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwflags.toInt(), lpscreenbufferdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPseudoConsole(size: Coord, hinput: Handle, houtput: Handle, dwflags: UInt, phpc: MutPtr<Hpcon>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expungeConsoleCommandHistoryA(exename: Pcstr) {
    if (windowsWin32SystemConsoleNapiAddon != null) {
        windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA(exename.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun expungeConsoleCommandHistoryW(exename: Pcwstr) {
    if (windowsWin32SystemConsoleNapiAddon != null) {
        windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW(exename.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fillConsoleOutputAttribute(hconsoleoutput: Handle, wattribute: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillConsoleOutputCharacterA(hconsoleoutput: Handle, ccharacter: Byte, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillConsoleOutputCharacterW(hconsoleoutput: Handle, ccharacter: UShort, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushConsoleInputBuffer(hconsoleinput: Handle): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer(hconsoleinput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeConsole(): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleFreeConsole() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(dwctrlevent.toInt(), dwprocessgroupid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasA(source: Pcstr, targetbuffer: Pstr, targetbufferlength: UInt, exename: Pcstr): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleAliasA(source.rawAddress.toString(), targetbuffer.rawAddress.toString(), targetbufferlength.toInt(), exename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesA(exenamebuffer: Pstr, exenamebufferlength: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesA(exenamebuffer.rawAddress.toString(), exenamebufferlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesLengthA(): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesLengthW(): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasExesW(exenamebuffer: Pwstr, exenamebufferlength: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleAliasExesW(exenamebuffer.rawAddress.toString(), exenamebufferlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasW(source: Pcwstr, targetbuffer: Pwstr, targetbufferlength: UInt, exename: Pcwstr): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleAliasW(source.rawAddress.toString(), targetbuffer.rawAddress.toString(), targetbufferlength.toInt(), exename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesA(aliasbuffer: Pstr, aliasbufferlength: UInt, exename: Pcstr): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleAliasesA(aliasbuffer.rawAddress.toString(), aliasbufferlength.toInt(), exename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesLengthA(exename: Pcstr): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA(exename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesLengthW(exename: Pcwstr): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW(exename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleAliasesW(aliasbuffer: Pwstr, aliasbufferlength: UInt, exename: Pcwstr): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleAliasesW(aliasbuffer.rawAddress.toString(), aliasbufferlength.toInt(), exename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCP(): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleCP() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryA(commands: Pstr, commandbufferlength: UInt, exename: Pcstr): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA(commands.rawAddress.toString(), commandbufferlength.toInt(), exename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryLengthA(exename: Pcstr): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA(exename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryLengthW(exename: Pcwstr): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW(exename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCommandHistoryW(commands: Pwstr, commandbufferlength: UInt, exename: Pcwstr): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW(commands.rawAddress.toString(), commandbufferlength.toInt(), exename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: MutPtr<ConsoleCursorInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleCursorInfo(hconsoleoutput.rawAddress.toString(), lpconsolecursorinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleDisplayMode(lpmodeflags: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleDisplayMode(lpmodeflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleFontSize(hconsoleoutput: Handle, nfont: UInt): Coord =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleHistoryInfo(lpconsolehistoryinfo: MutPtr<ConsoleHistoryInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo(lpconsolehistoryinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleMode(hconsolehandle: Handle, lpmode: MutPtr<ConsoleMode>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleMode(hconsolehandle.rawAddress.toString(), lpmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleOriginalTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA(lpconsoletitle.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleOriginalTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW(lpconsoletitle.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleOutputCP(): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleOutputCP() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleProcessList(lpdwprocesslist: MutPtr<UInt>, dwprocesscount: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleProcessList(lpdwprocesslist.rawAddress.toString(), dwprocesscount.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleScreenBufferInfo(hconsoleoutput: Handle, lpconsolescreenbufferinfo: MutPtr<ConsoleScreenBufferInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo(hconsoleoutput.rawAddress.toString(), lpconsolescreenbufferinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: MutPtr<ConsoleScreenBufferInfoex>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx(hconsoleoutput.rawAddress.toString(), lpconsolescreenbufferinfoex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleSelectionInfo(lpconsoleselectioninfo: MutPtr<ConsoleSelectionInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo(lpconsoleselectioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleTitleA(lpconsoletitle: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleTitleA(lpconsoletitle.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleTitleW(lpconsoletitle: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleTitleW(lpconsoletitle.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConsoleWindow(): Hwnd =
    if (windowsWin32SystemConsoleNapiAddon != null) MutPtr((windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetConsoleWindow() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentConsoleFont(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfont: MutPtr<ConsoleFontInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetCurrentConsoleFont(hconsoleoutput.rawAddress.toString(), bmaximumwindow, lpconsolecurrentfont.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: MutPtr<ConsoleFontInfoex>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx(hconsoleoutput.rawAddress.toString(), bmaximumwindow, lpconsolecurrentfontex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLargestConsoleWindowSize(hconsoleoutput: Handle): Coord =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfConsoleInputEvents(hconsoleinput: Handle, lpnumberofevents: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents(hconsoleinput.rawAddress.toString(), lpnumberofevents.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfConsoleMouseButtons(lpnumberofmousebuttons: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons(lpnumberofmousebuttons.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStdHandle(nstdhandle: StdHandle): Handle =
    if (windowsWin32SystemConsoleNapiAddon != null) MutPtr((windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleGetStdHandle(nstdhandle.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsolePeekConsoleInputA(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventsread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsolePeekConsoleInputW(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventsread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleA(hconsoleinput: Handle, lpbuffer: MutPtr<CVoid>, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr<UInt>, pinputcontrol: ConstPtr<ConsoleReadconsoleControl>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleReadConsoleA(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofcharstoread.toInt(), lpnumberofcharsread.rawAddress.toString(), pinputcontrol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleInputA(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleReadConsoleInputA(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventsread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleInputW(hconsoleinput: Handle, lpbuffer: MutPtr<InputRecord>, nlength: UInt, lpnumberofeventsread: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleReadConsoleInputW(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventsread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputA(hconsoleoutput: Handle, lpbuffer: MutPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: MutPtr<UShort>, nlength: UInt, dwreadcoord: Coord, lpnumberofattrsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pwstr, nlength: UInt, dwreadcoord: Coord, lpnumberofcharsread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleOutputW(hconsoleoutput: Handle, lpbuffer: MutPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpreadregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readConsoleW(hconsoleinput: Handle, lpbuffer: MutPtr<CVoid>, nnumberofcharstoread: UInt, lpnumberofcharsread: MutPtr<UInt>, pinputcontrol: ConstPtr<ConsoleReadconsoleControl>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleReadConsoleW(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofcharstoread.toInt(), lpnumberofcharsread.rawAddress.toString(), pinputcontrol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizePseudoConsole(hpc: Hpcon, size: Coord): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollConsoleScreenBufferA(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr<SmallRect>, lpcliprectangle: ConstPtr<SmallRect>, dwdestinationorigin: Coord, lpfill: ConstPtr<CharInfo>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollConsoleScreenBufferW(hconsoleoutput: Handle, lpscrollrectangle: ConstPtr<SmallRect>, lpcliprectangle: ConstPtr<SmallRect>, dwdestinationorigin: Coord, lpfill: ConstPtr<CharInfo>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleActiveScreenBuffer(hconsoleoutput: Handle): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer(hconsoleoutput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCP(wcodepageid: UInt): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleCP(wcodepageid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCtrlHandler(handlerroutine: PhandlerRoutine, add: Bool): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler(0L.toString(), add) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCursorInfo(hconsoleoutput: Handle, lpconsolecursorinfo: ConstPtr<ConsoleCursorInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleCursorInfo(hconsoleoutput.rawAddress.toString(), lpconsolecursorinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleCursorPosition(hconsoleoutput: Handle, dwcursorposition: Coord): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleDisplayMode(hconsoleoutput: Handle, dwflags: UInt, lpnewscreenbufferdimensions: MutPtr<Coord>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleDisplayMode(hconsoleoutput.rawAddress.toString(), dwflags.toInt(), lpnewscreenbufferdimensions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleHistoryInfo(lpconsolehistoryinfo: ConstPtr<ConsoleHistoryInfo>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo(lpconsolehistoryinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleMode(hconsolehandle: Handle, dwmode: ConsoleMode): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleMode(hconsolehandle.rawAddress.toString(), dwmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleNumberOfCommandsA(number: UInt, exename: Pcstr): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA(number.toInt(), exename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleNumberOfCommandsW(number: UInt, exename: Pcwstr): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW(number.toInt(), exename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleOutputCP(wcodepageid: UInt): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleOutputCP(wcodepageid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleScreenBufferInfoEx(hconsoleoutput: Handle, lpconsolescreenbufferinfoex: ConstPtr<ConsoleScreenBufferInfoex>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx(hconsoleoutput.rawAddress.toString(), lpconsolescreenbufferinfoex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleScreenBufferSize(hconsoleoutput: Handle, dwsize: Coord): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleTextAttribute(hconsoleoutput: Handle, wattributes: ConsoleCharacterAttributes): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleTextAttribute(hconsoleoutput.rawAddress.toString(), wattributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleTitleA(lpconsoletitle: Pcstr): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleTitleA(lpconsoletitle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleTitleW(lpconsoletitle: Pcwstr): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleTitleW(lpconsoletitle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConsoleWindowInfo(hconsoleoutput: Handle, babsolute: Bool, lpconsolewindow: ConstPtr<SmallRect>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetConsoleWindowInfo(hconsoleoutput.rawAddress.toString(), babsolute, lpconsolewindow.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentConsoleFontEx(hconsoleoutput: Handle, bmaximumwindow: Bool, lpconsolecurrentfontex: ConstPtr<ConsoleFontInfoex>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx(hconsoleoutput.rawAddress.toString(), bmaximumwindow, lpconsolecurrentfontex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStdHandle(nstdhandle: StdHandle, hhandle: Handle): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetStdHandle(nstdhandle.toInt(), hhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStdHandleEx(nstdhandle: StdHandle, hhandle: Handle, phprevvalue: MutPtr<Handle>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleSetStdHandleEx(nstdhandle.toInt(), hhandle.rawAddress.toString(), phprevvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleA(hconsoleoutput: Handle, lpbuffer: Pcstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleWriteConsoleA(hconsoleoutput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofcharstowrite.toInt(), lpnumberofcharswritten.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleInputA(hconsoleinput: Handle, lpbuffer: ConstPtr<InputRecord>, nlength: UInt, lpnumberofeventswritten: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleWriteConsoleInputA(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleInputW(hconsoleinput: Handle, lpbuffer: ConstPtr<InputRecord>, nlength: UInt, lpnumberofeventswritten: MutPtr<UInt>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleWriteConsoleInputW(hconsoleinput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nlength.toInt(), lpnumberofeventswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputA(hconsoleoutput: Handle, lpbuffer: ConstPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputAttribute(hconsoleoutput: Handle, lpattribute: ConstPtr<UShort>, nlength: UInt, dwwritecoord: Coord, lpnumberofattrswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputCharacterA(hconsoleoutput: Handle, lpcharacter: Pcstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputCharacterW(hconsoleoutput: Handle, lpcharacter: Pcwstr, nlength: UInt, dwwritecoord: Coord, lpnumberofcharswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleOutputW(hconsoleoutput: Handle, lpbuffer: ConstPtr<CharInfo>, dwbuffersize: Coord, dwbuffercoord: Coord, lpwriteregion: MutPtr<SmallRect>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeConsoleW(hconsoleoutput: Handle, lpbuffer: Pcwstr, nnumberofcharstowrite: UInt, lpnumberofcharswritten: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemConsoleNapiAddon != null) (windowsWin32SystemConsoleNapiAddon.windowssysWindowsWin32SystemConsoleWriteConsoleW(hconsoleoutput.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofcharstowrite.toInt(), lpnumberofcharswritten.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
