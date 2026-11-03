package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

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

public fun ConsoleControl(command: CONSOLECONTROL, consoleinformation: Long, consoleinformationlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("user32.dll", "ConsoleControl", longArrayOf(command.toLong(), consoleinformation, consoleinformationlength.toLong()))
    return Foundation.NTSTATUS()
}

public fun CreateConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwflags: UInt, lpscreenbufferdata: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateConsoleScreenBuffer", longArrayOf(dwdesiredaccess.toLong(), dwsharemode.toLong(), lpsecurityattributes, dwflags.toLong(), lpscreenbufferdata))
    return Foundation.HANDLE()
}

public fun CreatePseudoConsole(size: COORD, hinput: Foundation.HANDLE, houtput: Foundation.HANDLE, dwflags: UInt, phpc: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreatePseudoConsole", longArrayOf((((size.X.toLong()) and 0xFFFFL) or (((size.Y.toLong()) and 0xFFFFL) shl 16)), Win32DynamicFfi.objectSlot(hinput), Win32DynamicFfi.objectSlot(houtput), dwflags.toLong(), phpc)).toInt()
}

public fun ExpungeConsoleCommandHistoryA(exename: PCSTR) {
    Win32DynamicFfi.invoke("kernel32.dll", "ExpungeConsoleCommandHistoryA", longArrayOf(exename))
}

public fun ExpungeConsoleCommandHistoryW(exename: PCWSTR) {
    Win32DynamicFfi.invoke("kernel32.dll", "ExpungeConsoleCommandHistoryW", longArrayOf(exename))
}

public fun FillConsoleOutputAttribute(hconsoleoutput: Foundation.HANDLE, wattribute: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FillConsoleOutputAttribute", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), wattribute.toLong(), nlength.toLong(), (((dwwritecoord.X.toLong()) and 0xFFFFL) or (((dwwritecoord.Y.toLong()) and 0xFFFFL) shl 16)), lpnumberofattrswritten)).toInt()
}

public fun FillConsoleOutputCharacterA(hconsoleoutput: Foundation.HANDLE, ccharacter: Byte, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FillConsoleOutputCharacterA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), ccharacter.toLong(), nlength.toLong(), (((dwwritecoord.X.toLong()) and 0xFFFFL) or (((dwwritecoord.Y.toLong()) and 0xFFFFL) shl 16)), lpnumberofcharswritten)).toInt()
}

public fun FillConsoleOutputCharacterW(hconsoleoutput: Foundation.HANDLE, ccharacter: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FillConsoleOutputCharacterW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), ccharacter.toLong(), nlength.toLong(), (((dwwritecoord.X.toLong()) and 0xFFFFL) or (((dwwritecoord.Y.toLong()) and 0xFFFFL) shl 16)), lpnumberofcharswritten)).toInt()
}

public fun FlushConsoleInputBuffer(hconsoleinput: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FlushConsoleInputBuffer", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleinput))).toInt()
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

public fun GetConsoleCursorInfo(hconsoleoutput: Foundation.HANDLE, lpconsolecursorinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleCursorInfo", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpconsolecursorinfo)).toInt()
}

public fun GetConsoleDisplayMode(lpmodeflags: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleDisplayMode", longArrayOf(lpmodeflags)).toInt()
}

public fun GetConsoleFontSize(hconsoleoutput: Foundation.HANDLE, nfont: UInt): COORD {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleFontSize", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), nfont.toLong()))
    return COORD(X = rawRet.toShort(), Y = (rawRet ushr 16).toShort())
}

public fun GetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleHistoryInfo", longArrayOf(lpconsolehistoryinfo)).toInt()
}

public fun GetConsoleMode(hconsolehandle: Foundation.HANDLE, lpmode: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleMode", longArrayOf(Win32DynamicFfi.objectSlot(hconsolehandle), lpmode)).toInt()
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

public fun GetConsoleScreenBufferInfo(hconsoleoutput: Foundation.HANDLE, lpconsolescreenbufferinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleScreenBufferInfo", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpconsolescreenbufferinfo)).toInt()
}

public fun GetConsoleScreenBufferInfoEx(hconsoleoutput: Foundation.HANDLE, lpconsolescreenbufferinfoex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleScreenBufferInfoEx", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpconsolescreenbufferinfoex)).toInt()
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

public fun GetConsoleWindow(): Foundation.HWND {
    Win32DynamicFfi.invoke("kernel32.dll", "GetConsoleWindow", longArrayOf())
    return Foundation.HWND()
}

public fun GetCurrentConsoleFont(hconsoleoutput: Foundation.HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfont: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentConsoleFont", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), bmaximumwindow.toLong(), lpconsolecurrentfont)).toInt()
}

public fun GetCurrentConsoleFontEx(hconsoleoutput: Foundation.HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentConsoleFontEx", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), bmaximumwindow.toLong(), lpconsolecurrentfontex)).toInt()
}

public fun GetLargestConsoleWindowSize(hconsoleoutput: Foundation.HANDLE): COORD {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "GetLargestConsoleWindowSize", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput)))
    return COORD(X = rawRet.toShort(), Y = (rawRet ushr 16).toShort())
}

public fun GetNumberOfConsoleInputEvents(hconsoleinput: Foundation.HANDLE, lpnumberofevents: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumberOfConsoleInputEvents", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleinput), lpnumberofevents)).toInt()
}

public fun GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumberOfConsoleMouseButtons", longArrayOf(lpnumberofmousebuttons)).toInt()
}

public fun GetStdHandle(nstdhandle: STD_HANDLE): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "GetStdHandle", longArrayOf(nstdhandle.toLong()))
    return Foundation.HANDLE()
}

public fun PeekConsoleInputA(hconsoleinput: Foundation.HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PeekConsoleInputA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleinput), lpbuffer, nlength.toLong(), lpnumberofeventsread)).toInt()
}

public fun PeekConsoleInputW(hconsoleinput: Foundation.HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PeekConsoleInputW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleinput), lpbuffer, nlength.toLong(), lpnumberofeventsread)).toInt()
}

public fun ReadConsoleA(hconsoleinput: Foundation.HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleinput), lpbuffer, nnumberofcharstoread.toLong(), lpnumberofcharsread, pinputcontrol)).toInt()
}

public fun ReadConsoleInputA(hconsoleinput: Foundation.HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleInputA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleinput), lpbuffer, nlength.toLong(), lpnumberofeventsread)).toInt()
}

public fun ReadConsoleInputW(hconsoleinput: Foundation.HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleInputW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleinput), lpbuffer, nlength.toLong(), lpnumberofeventsread)).toInt()
}

public fun ReadConsoleOutputA(hconsoleoutput: Foundation.HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpreadregion: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleOutputA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpbuffer, (((dwbuffersize.X.toLong()) and 0xFFFFL) or (((dwbuffersize.Y.toLong()) and 0xFFFFL) shl 16)), (((dwbuffercoord.X.toLong()) and 0xFFFFL) or (((dwbuffercoord.Y.toLong()) and 0xFFFFL) shl 16)), lpreadregion)).toInt()
}

public fun ReadConsoleOutputAttribute(hconsoleoutput: Foundation.HANDLE, lpattribute: Long, nlength: UInt, dwreadcoord: COORD, lpnumberofattrsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleOutputAttribute", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpattribute, nlength.toLong(), (((dwreadcoord.X.toLong()) and 0xFFFFL) or (((dwreadcoord.Y.toLong()) and 0xFFFFL) shl 16)), lpnumberofattrsread)).toInt()
}

public fun ReadConsoleOutputCharacterA(hconsoleoutput: Foundation.HANDLE, lpcharacter: PSTR, nlength: UInt, dwreadcoord: COORD, lpnumberofcharsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleOutputCharacterA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpcharacter, nlength.toLong(), (((dwreadcoord.X.toLong()) and 0xFFFFL) or (((dwreadcoord.Y.toLong()) and 0xFFFFL) shl 16)), lpnumberofcharsread)).toInt()
}

public fun ReadConsoleOutputCharacterW(hconsoleoutput: Foundation.HANDLE, lpcharacter: PWSTR, nlength: UInt, dwreadcoord: COORD, lpnumberofcharsread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleOutputCharacterW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpcharacter, nlength.toLong(), (((dwreadcoord.X.toLong()) and 0xFFFFL) or (((dwreadcoord.Y.toLong()) and 0xFFFFL) shl 16)), lpnumberofcharsread)).toInt()
}

public fun ReadConsoleOutputW(hconsoleoutput: Foundation.HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpreadregion: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleOutputW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpbuffer, (((dwbuffersize.X.toLong()) and 0xFFFFL) or (((dwbuffersize.Y.toLong()) and 0xFFFFL) shl 16)), (((dwbuffercoord.X.toLong()) and 0xFFFFL) or (((dwbuffercoord.Y.toLong()) and 0xFFFFL) shl 16)), lpreadregion)).toInt()
}

public fun ReadConsoleW(hconsoleinput: Foundation.HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadConsoleW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleinput), lpbuffer, nnumberofcharstoread.toLong(), lpnumberofcharsread, pinputcontrol)).toInt()
}

public fun ResizePseudoConsole(hpc: HPCON, size: COORD): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "ResizePseudoConsole", longArrayOf(hpc, (((size.X.toLong()) and 0xFFFFL) or (((size.Y.toLong()) and 0xFFFFL) shl 16)))).toInt()
}

public fun ScrollConsoleScreenBufferA(hconsoleoutput: Foundation.HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ScrollConsoleScreenBufferA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpscrollrectangle, lpcliprectangle, (((dwdestinationorigin.X.toLong()) and 0xFFFFL) or (((dwdestinationorigin.Y.toLong()) and 0xFFFFL) shl 16)), lpfill)).toInt()
}

public fun ScrollConsoleScreenBufferW(hconsoleoutput: Foundation.HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ScrollConsoleScreenBufferW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpscrollrectangle, lpcliprectangle, (((dwdestinationorigin.X.toLong()) and 0xFFFFL) or (((dwdestinationorigin.Y.toLong()) and 0xFFFFL) shl 16)), lpfill)).toInt()
}

public fun SetConsoleActiveScreenBuffer(hconsoleoutput: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleActiveScreenBuffer", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput))).toInt()
}

public fun SetConsoleCP(wcodepageid: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleCP", longArrayOf(wcodepageid.toLong())).toInt()
}

public fun SetConsoleCtrlHandler(handlerroutine: PHANDLER_ROUTINE, add: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleCtrlHandler", longArrayOf(Win32DynamicFfi.objectSlot(handlerroutine), add.toLong())).toInt()
}

public fun SetConsoleCursorInfo(hconsoleoutput: Foundation.HANDLE, lpconsolecursorinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleCursorInfo", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpconsolecursorinfo)).toInt()
}

public fun SetConsoleCursorPosition(hconsoleoutput: Foundation.HANDLE, dwcursorposition: COORD): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleCursorPosition", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), (((dwcursorposition.X.toLong()) and 0xFFFFL) or (((dwcursorposition.Y.toLong()) and 0xFFFFL) shl 16)))).toInt()
}

public fun SetConsoleDisplayMode(hconsoleoutput: Foundation.HANDLE, dwflags: UInt, lpnewscreenbufferdimensions: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleDisplayMode", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), dwflags.toLong(), lpnewscreenbufferdimensions)).toInt()
}

public fun SetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleHistoryInfo", longArrayOf(lpconsolehistoryinfo)).toInt()
}

public fun SetConsoleMode(hconsolehandle: Foundation.HANDLE, dwmode: CONSOLE_MODE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleMode", longArrayOf(Win32DynamicFfi.objectSlot(hconsolehandle), dwmode.toLong())).toInt()
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

public fun SetConsoleScreenBufferInfoEx(hconsoleoutput: Foundation.HANDLE, lpconsolescreenbufferinfoex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleScreenBufferInfoEx", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpconsolescreenbufferinfoex)).toInt()
}

public fun SetConsoleScreenBufferSize(hconsoleoutput: Foundation.HANDLE, dwsize: COORD): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleScreenBufferSize", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), (((dwsize.X.toLong()) and 0xFFFFL) or (((dwsize.Y.toLong()) and 0xFFFFL) shl 16)))).toInt()
}

public fun SetConsoleTextAttribute(hconsoleoutput: Foundation.HANDLE, wattributes: CONSOLE_CHARACTER_ATTRIBUTES): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleTextAttribute", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), wattributes.toLong())).toInt()
}

public fun SetConsoleTitleA(lpconsoletitle: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleTitleA", longArrayOf(lpconsoletitle)).toInt()
}

public fun SetConsoleTitleW(lpconsoletitle: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleTitleW", longArrayOf(lpconsoletitle)).toInt()
}

public fun SetConsoleWindowInfo(hconsoleoutput: Foundation.HANDLE, babsolute: BOOL, lpconsolewindow: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetConsoleWindowInfo", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), babsolute.toLong(), lpconsolewindow)).toInt()
}

public fun SetCurrentConsoleFontEx(hconsoleoutput: Foundation.HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCurrentConsoleFontEx", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), bmaximumwindow.toLong(), lpconsolecurrentfontex)).toInt()
}

public fun SetStdHandle(nstdhandle: STD_HANDLE, hhandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetStdHandle", longArrayOf(nstdhandle.toLong(), Win32DynamicFfi.objectSlot(hhandle))).toInt()
}

public fun SetStdHandleEx(nstdhandle: STD_HANDLE, hhandle: Foundation.HANDLE, phprevvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetStdHandleEx", longArrayOf(nstdhandle.toLong(), Win32DynamicFfi.objectSlot(hhandle), phprevvalue)).toInt()
}

public fun WriteConsoleA(hconsoleoutput: Foundation.HANDLE, lpbuffer: PCSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpbuffer, nnumberofcharstowrite.toLong(), lpnumberofcharswritten, lpreserved)).toInt()
}

public fun WriteConsoleInputA(hconsoleinput: Foundation.HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleInputA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleinput), lpbuffer, nlength.toLong(), lpnumberofeventswritten)).toInt()
}

public fun WriteConsoleInputW(hconsoleinput: Foundation.HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleInputW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleinput), lpbuffer, nlength.toLong(), lpnumberofeventswritten)).toInt()
}

public fun WriteConsoleOutputA(hconsoleoutput: Foundation.HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpwriteregion: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleOutputA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpbuffer, (((dwbuffersize.X.toLong()) and 0xFFFFL) or (((dwbuffersize.Y.toLong()) and 0xFFFFL) shl 16)), (((dwbuffercoord.X.toLong()) and 0xFFFFL) or (((dwbuffercoord.Y.toLong()) and 0xFFFFL) shl 16)), lpwriteregion)).toInt()
}

public fun WriteConsoleOutputAttribute(hconsoleoutput: Foundation.HANDLE, lpattribute: Long, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleOutputAttribute", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpattribute, nlength.toLong(), (((dwwritecoord.X.toLong()) and 0xFFFFL) or (((dwwritecoord.Y.toLong()) and 0xFFFFL) shl 16)), lpnumberofattrswritten)).toInt()
}

public fun WriteConsoleOutputCharacterA(hconsoleoutput: Foundation.HANDLE, lpcharacter: PCSTR, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleOutputCharacterA", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpcharacter, nlength.toLong(), (((dwwritecoord.X.toLong()) and 0xFFFFL) or (((dwwritecoord.Y.toLong()) and 0xFFFFL) shl 16)), lpnumberofcharswritten)).toInt()
}

public fun WriteConsoleOutputCharacterW(hconsoleoutput: Foundation.HANDLE, lpcharacter: PCWSTR, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleOutputCharacterW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpcharacter, nlength.toLong(), (((dwwritecoord.X.toLong()) and 0xFFFFL) or (((dwwritecoord.Y.toLong()) and 0xFFFFL) shl 16)), lpnumberofcharswritten)).toInt()
}

public fun WriteConsoleOutputW(hconsoleoutput: Foundation.HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpwriteregion: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleOutputW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpbuffer, (((dwbuffersize.X.toLong()) and 0xFFFFL) or (((dwbuffersize.Y.toLong()) and 0xFFFFL) shl 16)), (((dwbuffercoord.X.toLong()) and 0xFFFFL) or (((dwbuffercoord.Y.toLong()) and 0xFFFFL) shl 16)), lpwriteregion)).toInt()
}

public fun WriteConsoleW(hconsoleoutput: Foundation.HANDLE, lpbuffer: PCWSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteConsoleW", longArrayOf(Win32DynamicFfi.objectSlot(hconsoleoutput), lpbuffer, nnumberofcharstowrite.toLong(), lpnumberofcharswritten, lpreserved)).toInt()
}
