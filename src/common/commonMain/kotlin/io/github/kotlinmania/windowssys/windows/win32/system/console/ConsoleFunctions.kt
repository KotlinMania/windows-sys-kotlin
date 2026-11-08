package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public fun interface FnCallback {
    public operator fun invoke(ctrltype: UInt): BOOL
}

public fun AddConsoleAliasA(source: PCSTR, target: PCSTR, exename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddConsoleAliasA", longArrayOf(source, target, exename)).toInt()
}

public fun AddConsoleAliasW(source: PCWSTR, target: PCWSTR, exename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddConsoleAliasW", longArrayOf(source, target, exename)).toInt()
}

public fun AllocConsole(): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AllocConsole", longArrayOf()).toInt()
}

public fun AttachConsole(dwprocessid: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AttachConsole", longArrayOf(dwprocessid.toLong())).toInt()
}

public fun ClosePseudoConsole(hpc: HPCON) {
    Win32DynamicFfi.invoke("kernel32.dll", "ClosePseudoConsole", longArrayOf(hpc))
}

public fun ConsoleControl(command: CONSOLECONTROL, consoleinformation: Long, consoleinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("user32.dll", "ConsoleControl", longArrayOf(command.toLong(), consoleinformation, consoleinformationlength.toLong())).toInt()
}

public fun CreateConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwflags: UInt, lpscreenbufferdata: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateConsoleScreenBuffer", longArrayOf(dwdesiredaccess.toLong(), dwsharemode.toLong(), lpsecurityattributes, dwflags.toLong(), lpscreenbufferdata))
}

public fun CreatePseudoConsole(size: COORD, hinput: HANDLE, houtput: HANDLE, dwflags: UInt, phpc: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreatePseudoConsole", longArrayOf(((size.X.toLong() and 0xFFFFL) or ((size.Y.toLong() and 0xFFFFL) shl 16)), hinput, houtput, dwflags.toLong(), phpc)).toInt()
}

public fun ExpungeConsoleCommandHistoryA(exename: PCSTR) {
    Win32DynamicFfi.invoke("kernel32.dll", "ExpungeConsoleCommandHistoryA", longArrayOf(exename))
}

public fun ExpungeConsoleCommandHistoryW(exename: PCWSTR) {
    Win32DynamicFfi.invoke("kernel32.dll", "ExpungeConsoleCommandHistoryW", longArrayOf(exename))
}

public fun FillConsoleOutputAttribute(hconsoleoutput: HANDLE, wattribute: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FillConsoleOutputAttribute", longArrayOf(hconsoleoutput, wattribute.toLong(), nlength.toLong(), ((dwwritecoord.X.toLong() and 0xFFFFL) or ((dwwritecoord.Y.toLong() and 0xFFFFL) shl 16)), lpnumberofattrswritten)).toInt()
}

public fun FillConsoleOutputCharacterA(hconsoleoutput: HANDLE, ccharacter: Byte, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FillConsoleOutputCharacterA", longArrayOf(hconsoleoutput, ccharacter.toLong(), nlength.toLong(), ((dwwritecoord.X.toLong() and 0xFFFFL) or ((dwwritecoord.Y.toLong() and 0xFFFFL) shl 16)), lpnumberofcharswritten)).toInt()
}

public fun FillConsoleOutputCharacterW(hconsoleoutput: HANDLE, ccharacter: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FillConsoleOutputCharacterW", longArrayOf(hconsoleoutput, ccharacter.toLong(), nlength.toLong(), ((dwwritecoord.X.toLong() and 0xFFFFL) or ((dwwritecoord.Y.toLong() and 0xFFFFL) shl 16)), lpnumberofcharswritten)).toInt()
}

public fun FlushConsoleInputBuffer(hconsoleinput: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FlushConsoleInputBuffer", longArrayOf(hconsoleinput)).toInt()
}

public fun FreeConsole(): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FreeConsole", longArrayOf()).toInt()
}

public fun GenerateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GenerateConsoleCtrlEvent", longArrayOf(dwctrlevent.toLong(), dwprocessgroupid.toLong())).toInt()
}

public fun GetConsoleAliasA(source: PCSTR, targetbuffer: PSTR, targetbufferlength: UInt, exename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleAliasA", longArrayOf(source, targetbuffer, targetbufferlength.toLong(), exename)).toUInt()
}

public fun GetConsoleAliasExesA(exenamebuffer: PSTR, exenamebufferlength: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleAliasExesA", longArrayOf(exenamebuffer, exenamebufferlength.toLong())).toUInt()
}

public fun GetConsoleAliasExesLengthA(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleAliasExesLengthA", longArrayOf()).toUInt()
}

public fun GetConsoleAliasExesLengthW(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleAliasExesLengthW", longArrayOf()).toUInt()
}

public fun GetConsoleAliasExesW(exenamebuffer: PWSTR, exenamebufferlength: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleAliasExesW", longArrayOf(exenamebuffer, exenamebufferlength.toLong())).toUInt()
}

public fun GetConsoleAliasW(source: PCWSTR, targetbuffer: PWSTR, targetbufferlength: UInt, exename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleAliasW", longArrayOf(source, targetbuffer, targetbufferlength.toLong(), exename)).toUInt()
}

public fun GetConsoleAliasesA(aliasbuffer: PSTR, aliasbufferlength: UInt, exename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleAliasesA", longArrayOf(aliasbuffer, aliasbufferlength.toLong(), exename)).toUInt()
}

public fun GetConsoleAliasesLengthA(exename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleAliasesLengthA", longArrayOf(exename)).toUInt()
}

public fun GetConsoleAliasesLengthW(exename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleAliasesLengthW", longArrayOf(exename)).toUInt()
}

public fun GetConsoleAliasesW(aliasbuffer: PWSTR, aliasbufferlength: UInt, exename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleAliasesW", longArrayOf(aliasbuffer, aliasbufferlength.toLong(), exename)).toUInt()
}

public fun GetConsoleCP(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleCP", longArrayOf()).toUInt()
}

public fun GetConsoleCommandHistoryA(commands: PSTR, commandbufferlength: UInt, exename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleCommandHistoryA", longArrayOf(commands, commandbufferlength.toLong(), exename)).toUInt()
}

public fun GetConsoleCommandHistoryLengthA(exename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleCommandHistoryLengthA", longArrayOf(exename)).toUInt()
}

public fun GetConsoleCommandHistoryLengthW(exename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleCommandHistoryLengthW", longArrayOf(exename)).toUInt()
}

public fun GetConsoleCommandHistoryW(commands: PWSTR, commandbufferlength: UInt, exename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleCommandHistoryW", longArrayOf(commands, commandbufferlength.toLong(), exename)).toUInt()
}

public fun GetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleCursorInfo", longArrayOf(hconsoleoutput, lpconsolecursorinfo)).toInt()
}

public fun GetConsoleDisplayMode(lpmodeflags: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleDisplayMode", longArrayOf(lpmodeflags)).toInt()
}

public fun GetConsoleFontSize(hconsoleoutput: HANDLE, nfont: UInt): COORD {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleFontSize", longArrayOf(hconsoleoutput, nfont.toLong()))
    return COORD(X = rawRet.toShort(), Y = (rawRet ushr 16).toShort())
}

public fun GetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleHistoryInfo", longArrayOf(lpconsolehistoryinfo)).toInt()
}

public fun GetConsoleMode(hconsolehandle: HANDLE, lpmode: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleMode", longArrayOf(hconsolehandle, lpmode)).toInt()
}

public fun GetConsoleOriginalTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleOriginalTitleA", longArrayOf(lpconsoletitle, nsize.toLong())).toUInt()
}

public fun GetConsoleOriginalTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleOriginalTitleW", longArrayOf(lpconsoletitle, nsize.toLong())).toUInt()
}

public fun GetConsoleOutputCP(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleOutputCP", longArrayOf()).toUInt()
}

public fun GetConsoleProcessList(lpdwprocesslist: Long, dwprocesscount: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleProcessList", longArrayOf(lpdwprocesslist, dwprocesscount.toLong())).toUInt()
}

public fun GetConsoleScreenBufferInfo(hconsoleoutput: HANDLE, lpconsolescreenbufferinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleScreenBufferInfo", longArrayOf(hconsoleoutput, lpconsolescreenbufferinfo)).toInt()
}

public fun GetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleScreenBufferInfoEx", longArrayOf(hconsoleoutput, lpconsolescreenbufferinfoex)).toInt()
}

public fun GetConsoleSelectionInfo(lpconsoleselectioninfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleSelectionInfo", longArrayOf(lpconsoleselectioninfo)).toInt()
}

public fun GetConsoleTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleTitleA", longArrayOf(lpconsoletitle, nsize.toLong())).toUInt()
}

public fun GetConsoleTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleTitleW", longArrayOf(lpconsoletitle, nsize.toLong())).toUInt()
}

public fun GetConsoleWindow(): HWND {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleWindow", longArrayOf())
}

public fun GetCurrentConsoleFont(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfont: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentConsoleFont", longArrayOf(hconsoleoutput, bmaximumwindow.toLong(), lpconsolecurrentfont)).toInt()
}

public fun GetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentConsoleFontEx", longArrayOf(hconsoleoutput, bmaximumwindow.toLong(), lpconsolecurrentfontex)).toInt()
}

public fun GetLargestConsoleWindowSize(hconsoleoutput: HANDLE): COORD {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "GetLargestConsoleWindowSize", longArrayOf(hconsoleoutput))
    return COORD(X = rawRet.toShort(), Y = (rawRet ushr 16).toShort())
}

public fun GetNumberOfConsoleInputEvents(hconsoleinput: HANDLE, lpnumberofevents: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumberOfConsoleInputEvents", longArrayOf(hconsoleinput, lpnumberofevents)).toInt()
}

public fun GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumberOfConsoleMouseButtons", longArrayOf(lpnumberofmousebuttons)).toInt()
}

public fun GetStdHandle(nstdhandle: STD_HANDLE): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetStdHandle", longArrayOf(nstdhandle.toLong()))
}

public fun PeekConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PeekConsoleInputA", longArrayOf(hconsoleinput, lpbuffer, nlength.toLong(), lpnumberofeventsread)).toInt()
}

public fun PeekConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PeekConsoleInputW", longArrayOf(hconsoleinput, lpbuffer, nlength.toLong(), lpnumberofeventsread)).toInt()
}

public fun ReadConsoleA(hconsoleinput: HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleA", longArrayOf(hconsoleinput, lpbuffer, nnumberofcharstoread.toLong(), lpnumberofcharsread, pinputcontrol)).toInt()
}

public fun ReadConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleInputA", longArrayOf(hconsoleinput, lpbuffer, nlength.toLong(), lpnumberofeventsread)).toInt()
}

public fun ReadConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleInputW", longArrayOf(hconsoleinput, lpbuffer, nlength.toLong(), lpnumberofeventsread)).toInt()
}

public fun ReadConsoleOutputA(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpreadregion: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleOutputA", longArrayOf(hconsoleoutput, lpbuffer, ((dwbuffersize.X.toLong() and 0xFFFFL) or ((dwbuffersize.Y.toLong() and 0xFFFFL) shl 16)), ((dwbuffercoord.X.toLong() and 0xFFFFL) or ((dwbuffercoord.Y.toLong() and 0xFFFFL) shl 16)), lpreadregion)).toInt()
}

public fun ReadConsoleOutputAttribute(hconsoleoutput: HANDLE, lpattribute: Long, nlength: UInt, dwreadcoord: COORD, lpnumberofattrsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleOutputAttribute", longArrayOf(hconsoleoutput, lpattribute, nlength.toLong(), ((dwreadcoord.X.toLong() and 0xFFFFL) or ((dwreadcoord.Y.toLong() and 0xFFFFL) shl 16)), lpnumberofattrsread)).toInt()
}

public fun ReadConsoleOutputCharacterA(hconsoleoutput: HANDLE, lpcharacter: PSTR, nlength: UInt, dwreadcoord: COORD, lpnumberofcharsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleOutputCharacterA", longArrayOf(hconsoleoutput, lpcharacter, nlength.toLong(), ((dwreadcoord.X.toLong() and 0xFFFFL) or ((dwreadcoord.Y.toLong() and 0xFFFFL) shl 16)), lpnumberofcharsread)).toInt()
}

public fun ReadConsoleOutputCharacterW(hconsoleoutput: HANDLE, lpcharacter: PWSTR, nlength: UInt, dwreadcoord: COORD, lpnumberofcharsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleOutputCharacterW", longArrayOf(hconsoleoutput, lpcharacter, nlength.toLong(), ((dwreadcoord.X.toLong() and 0xFFFFL) or ((dwreadcoord.Y.toLong() and 0xFFFFL) shl 16)), lpnumberofcharsread)).toInt()
}

public fun ReadConsoleOutputW(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpreadregion: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleOutputW", longArrayOf(hconsoleoutput, lpbuffer, ((dwbuffersize.X.toLong() and 0xFFFFL) or ((dwbuffersize.Y.toLong() and 0xFFFFL) shl 16)), ((dwbuffercoord.X.toLong() and 0xFFFFL) or ((dwbuffercoord.Y.toLong() and 0xFFFFL) shl 16)), lpreadregion)).toInt()
}

public fun ReadConsoleW(hconsoleinput: HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleW", longArrayOf(hconsoleinput, lpbuffer, nnumberofcharstoread.toLong(), lpnumberofcharsread, pinputcontrol)).toInt()
}

public fun ResizePseudoConsole(hpc: HPCON, size: COORD): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "ResizePseudoConsole", longArrayOf(hpc, ((size.X.toLong() and 0xFFFFL) or ((size.Y.toLong() and 0xFFFFL) shl 16)))).toInt()
}

public fun ScrollConsoleScreenBufferA(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ScrollConsoleScreenBufferA", longArrayOf(hconsoleoutput, lpscrollrectangle, lpcliprectangle, ((dwdestinationorigin.X.toLong() and 0xFFFFL) or ((dwdestinationorigin.Y.toLong() and 0xFFFFL) shl 16)), lpfill)).toInt()
}

public fun ScrollConsoleScreenBufferW(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ScrollConsoleScreenBufferW", longArrayOf(hconsoleoutput, lpscrollrectangle, lpcliprectangle, ((dwdestinationorigin.X.toLong() and 0xFFFFL) or ((dwdestinationorigin.Y.toLong() and 0xFFFFL) shl 16)), lpfill)).toInt()
}

public fun SetConsoleActiveScreenBuffer(hconsoleoutput: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleActiveScreenBuffer", longArrayOf(hconsoleoutput)).toInt()
}

public fun SetConsoleCP(wcodepageid: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleCP", longArrayOf(wcodepageid.toLong())).toInt()
}

public fun SetConsoleCtrlHandler(handlerroutine: PHANDLER_ROUTINE, add: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleCtrlHandler", longArrayOf(Win32DynamicFfi.objectSlot(handlerroutine), add.toLong())).toInt()
}

public fun SetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleCursorInfo", longArrayOf(hconsoleoutput, lpconsolecursorinfo)).toInt()
}

public fun SetConsoleCursorPosition(hconsoleoutput: HANDLE, dwcursorposition: COORD): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleCursorPosition", longArrayOf(hconsoleoutput, ((dwcursorposition.X.toLong() and 0xFFFFL) or ((dwcursorposition.Y.toLong() and 0xFFFFL) shl 16)))).toInt()
}

public fun SetConsoleDisplayMode(hconsoleoutput: HANDLE, dwflags: UInt, lpnewscreenbufferdimensions: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleDisplayMode", longArrayOf(hconsoleoutput, dwflags.toLong(), lpnewscreenbufferdimensions)).toInt()
}

public fun SetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleHistoryInfo", longArrayOf(lpconsolehistoryinfo)).toInt()
}

public fun SetConsoleMode(hconsolehandle: HANDLE, dwmode: CONSOLE_MODE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleMode", longArrayOf(hconsolehandle, dwmode.toLong())).toInt()
}

public fun SetConsoleNumberOfCommandsA(number: UInt, exename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleNumberOfCommandsA", longArrayOf(number.toLong(), exename)).toInt()
}

public fun SetConsoleNumberOfCommandsW(number: UInt, exename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleNumberOfCommandsW", longArrayOf(number.toLong(), exename)).toInt()
}

public fun SetConsoleOutputCP(wcodepageid: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleOutputCP", longArrayOf(wcodepageid.toLong())).toInt()
}

public fun SetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleScreenBufferInfoEx", longArrayOf(hconsoleoutput, lpconsolescreenbufferinfoex)).toInt()
}

public fun SetConsoleScreenBufferSize(hconsoleoutput: HANDLE, dwsize: COORD): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleScreenBufferSize", longArrayOf(hconsoleoutput, ((dwsize.X.toLong() and 0xFFFFL) or ((dwsize.Y.toLong() and 0xFFFFL) shl 16)))).toInt()
}

public fun SetConsoleTextAttribute(hconsoleoutput: HANDLE, wattributes: CONSOLE_CHARACTER_ATTRIBUTES): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleTextAttribute", longArrayOf(hconsoleoutput, wattributes.toLong())).toInt()
}

public fun SetConsoleTitleA(lpconsoletitle: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleTitleA", longArrayOf(lpconsoletitle)).toInt()
}

public fun SetConsoleTitleW(lpconsoletitle: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleTitleW", longArrayOf(lpconsoletitle)).toInt()
}

public fun SetConsoleWindowInfo(hconsoleoutput: HANDLE, babsolute: BOOL, lpconsolewindow: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleWindowInfo", longArrayOf(hconsoleoutput, babsolute.toLong(), lpconsolewindow)).toInt()
}

public fun SetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCurrentConsoleFontEx", longArrayOf(hconsoleoutput, bmaximumwindow.toLong(), lpconsolecurrentfontex)).toInt()
}

public fun SetStdHandle(nstdhandle: STD_HANDLE, hhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetStdHandle", longArrayOf(nstdhandle.toLong(), hhandle)).toInt()
}

public fun SetStdHandleEx(nstdhandle: STD_HANDLE, hhandle: HANDLE, phprevvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetStdHandleEx", longArrayOf(nstdhandle.toLong(), hhandle, phprevvalue)).toInt()
}

public fun WriteConsoleA(hconsoleoutput: HANDLE, lpbuffer: PCSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleA", longArrayOf(hconsoleoutput, lpbuffer, nnumberofcharstowrite.toLong(), lpnumberofcharswritten, lpreserved)).toInt()
}

public fun WriteConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleInputA", longArrayOf(hconsoleinput, lpbuffer, nlength.toLong(), lpnumberofeventswritten)).toInt()
}

public fun WriteConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleInputW", longArrayOf(hconsoleinput, lpbuffer, nlength.toLong(), lpnumberofeventswritten)).toInt()
}

public fun WriteConsoleOutputA(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpwriteregion: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleOutputA", longArrayOf(hconsoleoutput, lpbuffer, ((dwbuffersize.X.toLong() and 0xFFFFL) or ((dwbuffersize.Y.toLong() and 0xFFFFL) shl 16)), ((dwbuffercoord.X.toLong() and 0xFFFFL) or ((dwbuffercoord.Y.toLong() and 0xFFFFL) shl 16)), lpwriteregion)).toInt()
}

public fun WriteConsoleOutputAttribute(hconsoleoutput: HANDLE, lpattribute: Long, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleOutputAttribute", longArrayOf(hconsoleoutput, lpattribute, nlength.toLong(), ((dwwritecoord.X.toLong() and 0xFFFFL) or ((dwwritecoord.Y.toLong() and 0xFFFFL) shl 16)), lpnumberofattrswritten)).toInt()
}

public fun WriteConsoleOutputCharacterA(hconsoleoutput: HANDLE, lpcharacter: PCSTR, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleOutputCharacterA", longArrayOf(hconsoleoutput, lpcharacter, nlength.toLong(), ((dwwritecoord.X.toLong() and 0xFFFFL) or ((dwwritecoord.Y.toLong() and 0xFFFFL) shl 16)), lpnumberofcharswritten)).toInt()
}

public fun WriteConsoleOutputCharacterW(hconsoleoutput: HANDLE, lpcharacter: PCWSTR, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleOutputCharacterW", longArrayOf(hconsoleoutput, lpcharacter, nlength.toLong(), ((dwwritecoord.X.toLong() and 0xFFFFL) or ((dwwritecoord.Y.toLong() and 0xFFFFL) shl 16)), lpnumberofcharswritten)).toInt()
}

public fun WriteConsoleOutputW(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpwriteregion: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleOutputW", longArrayOf(hconsoleoutput, lpbuffer, ((dwbuffersize.X.toLong() and 0xFFFFL) or ((dwbuffersize.Y.toLong() and 0xFFFFL) shl 16)), ((dwbuffercoord.X.toLong() and 0xFFFFL) or ((dwbuffercoord.Y.toLong() and 0xFFFFL) shl 16)), lpwriteregion)).toInt()
}

public fun WriteConsoleW(hconsoleoutput: HANDLE, lpbuffer: PCWSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleW", longArrayOf(hconsoleoutput, lpbuffer, nnumberofcharstowrite.toLong(), lpnumberofcharswritten, lpreserved)).toInt()
}
