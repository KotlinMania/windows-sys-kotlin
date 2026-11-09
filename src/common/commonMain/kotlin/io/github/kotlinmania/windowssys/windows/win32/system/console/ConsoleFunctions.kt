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

public expect fun AddConsoleAliasA(source: PCSTR, target: PCSTR, exename: PCSTR): BOOL

public expect fun AddConsoleAliasW(source: PCWSTR, target: PCWSTR, exename: PCWSTR): BOOL

public expect fun AllocConsole(): BOOL

public expect fun AttachConsole(dwprocessid: UInt): BOOL

public expect fun ClosePseudoConsole(hpc: HPCON)

public expect fun ConsoleControl(command: CONSOLECONTROL, consoleinformation: Long, consoleinformationlength: UInt): NTSTATUS

public expect fun CreateConsoleScreenBuffer(dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwflags: UInt, lpscreenbufferdata: Long): HANDLE

public expect fun CreatePseudoConsole(size: COORD, hinput: HANDLE, houtput: HANDLE, dwflags: UInt, phpc: Long): HRESULT

public expect fun ExpungeConsoleCommandHistoryA(exename: PCSTR)

public expect fun ExpungeConsoleCommandHistoryW(exename: PCWSTR)

public expect fun FillConsoleOutputAttribute(hconsoleoutput: HANDLE, wattribute: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL

public expect fun FillConsoleOutputCharacterA(hconsoleoutput: HANDLE, ccharacter: Byte, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL

public expect fun FillConsoleOutputCharacterW(hconsoleoutput: HANDLE, ccharacter: UShort, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL

public expect fun FlushConsoleInputBuffer(hconsoleinput: HANDLE): BOOL

public expect fun FreeConsole(): BOOL

public expect fun GenerateConsoleCtrlEvent(dwctrlevent: UInt, dwprocessgroupid: UInt): BOOL

public expect fun GetConsoleAliasA(source: PCSTR, targetbuffer: PSTR, targetbufferlength: UInt, exename: PCSTR): UInt

public expect fun GetConsoleAliasExesA(exenamebuffer: PSTR, exenamebufferlength: UInt): UInt

public expect fun GetConsoleAliasExesLengthA(): UInt

public expect fun GetConsoleAliasExesLengthW(): UInt

public expect fun GetConsoleAliasExesW(exenamebuffer: PWSTR, exenamebufferlength: UInt): UInt

public expect fun GetConsoleAliasW(source: PCWSTR, targetbuffer: PWSTR, targetbufferlength: UInt, exename: PCWSTR): UInt

public expect fun GetConsoleAliasesA(aliasbuffer: PSTR, aliasbufferlength: UInt, exename: PCSTR): UInt

public expect fun GetConsoleAliasesLengthA(exename: PCSTR): UInt

public expect fun GetConsoleAliasesLengthW(exename: PCWSTR): UInt

public expect fun GetConsoleAliasesW(aliasbuffer: PWSTR, aliasbufferlength: UInt, exename: PCWSTR): UInt

public expect fun GetConsoleCP(): UInt

public expect fun GetConsoleCommandHistoryA(commands: PSTR, commandbufferlength: UInt, exename: PCSTR): UInt

public expect fun GetConsoleCommandHistoryLengthA(exename: PCSTR): UInt

public expect fun GetConsoleCommandHistoryLengthW(exename: PCWSTR): UInt

public expect fun GetConsoleCommandHistoryW(commands: PWSTR, commandbufferlength: UInt, exename: PCWSTR): UInt

public expect fun GetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL

public expect fun GetConsoleDisplayMode(lpmodeflags: Long): BOOL

public expect fun GetConsoleFontSize(hconsoleoutput: HANDLE, nfont: UInt): COORD

public expect fun GetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL

public expect fun GetConsoleMode(hconsolehandle: HANDLE, lpmode: Long): BOOL

public expect fun GetConsoleOriginalTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt

public expect fun GetConsoleOriginalTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt

public expect fun GetConsoleOutputCP(): UInt

public expect fun GetConsoleProcessList(lpdwprocesslist: Long, dwprocesscount: UInt): UInt

public expect fun GetConsoleScreenBufferInfo(hconsoleoutput: HANDLE, lpconsolescreenbufferinfo: Long): BOOL

public expect fun GetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL

public expect fun GetConsoleSelectionInfo(lpconsoleselectioninfo: Long): BOOL

public expect fun GetConsoleTitleA(lpconsoletitle: PSTR, nsize: UInt): UInt

public expect fun GetConsoleTitleW(lpconsoletitle: PWSTR, nsize: UInt): UInt

public expect fun GetConsoleWindow(): HWND

public expect fun GetCurrentConsoleFont(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfont: Long): BOOL

public expect fun GetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL

public expect fun GetLargestConsoleWindowSize(hconsoleoutput: HANDLE): COORD

public expect fun GetNumberOfConsoleInputEvents(hconsoleinput: HANDLE, lpnumberofevents: Long): BOOL

public expect fun GetNumberOfConsoleMouseButtons(lpnumberofmousebuttons: Long): BOOL

public expect fun GetStdHandle(nstdhandle: STD_HANDLE): HANDLE

public expect fun PeekConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL

public expect fun PeekConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL

public expect fun ReadConsoleA(hconsoleinput: HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL

public expect fun ReadConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL

public expect fun ReadConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventsread: Long): BOOL

public expect fun ReadConsoleOutputA(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpreadregion: Long): BOOL

public expect fun ReadConsoleOutputAttribute(hconsoleoutput: HANDLE, lpattribute: Long, nlength: UInt, dwreadcoord: COORD, lpnumberofattrsread: Long): BOOL

public expect fun ReadConsoleOutputCharacterA(hconsoleoutput: HANDLE, lpcharacter: PSTR, nlength: UInt, dwreadcoord: COORD, lpnumberofcharsread: Long): BOOL

public expect fun ReadConsoleOutputCharacterW(hconsoleoutput: HANDLE, lpcharacter: PWSTR, nlength: UInt, dwreadcoord: COORD, lpnumberofcharsread: Long): BOOL

public expect fun ReadConsoleOutputW(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpreadregion: Long): BOOL

public expect fun ReadConsoleW(hconsoleinput: HANDLE, lpbuffer: Long, nnumberofcharstoread: UInt, lpnumberofcharsread: Long, pinputcontrol: Long): BOOL

public expect fun ResizePseudoConsole(hpc: HPCON, size: COORD): HRESULT

public expect fun ScrollConsoleScreenBufferA(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL

public expect fun ScrollConsoleScreenBufferW(hconsoleoutput: HANDLE, lpscrollrectangle: Long, lpcliprectangle: Long, dwdestinationorigin: COORD, lpfill: Long): BOOL

public expect fun SetConsoleActiveScreenBuffer(hconsoleoutput: HANDLE): BOOL

public expect fun SetConsoleCP(wcodepageid: UInt): BOOL

public expect fun SetConsoleCtrlHandler(handlerroutine: PHANDLER_ROUTINE, add: BOOL): BOOL

public expect fun SetConsoleCursorInfo(hconsoleoutput: HANDLE, lpconsolecursorinfo: Long): BOOL

public expect fun SetConsoleCursorPosition(hconsoleoutput: HANDLE, dwcursorposition: COORD): BOOL

public expect fun SetConsoleDisplayMode(hconsoleoutput: HANDLE, dwflags: UInt, lpnewscreenbufferdimensions: Long): BOOL

public expect fun SetConsoleHistoryInfo(lpconsolehistoryinfo: Long): BOOL

public expect fun SetConsoleMode(hconsolehandle: HANDLE, dwmode: CONSOLE_MODE): BOOL

public expect fun SetConsoleNumberOfCommandsA(number: UInt, exename: PCSTR): BOOL

public expect fun SetConsoleNumberOfCommandsW(number: UInt, exename: PCWSTR): BOOL

public expect fun SetConsoleOutputCP(wcodepageid: UInt): BOOL

public expect fun SetConsoleScreenBufferInfoEx(hconsoleoutput: HANDLE, lpconsolescreenbufferinfoex: Long): BOOL

public expect fun SetConsoleScreenBufferSize(hconsoleoutput: HANDLE, dwsize: COORD): BOOL

public expect fun SetConsoleTextAttribute(hconsoleoutput: HANDLE, wattributes: CONSOLE_CHARACTER_ATTRIBUTES): BOOL

public expect fun SetConsoleTitleA(lpconsoletitle: PCSTR): BOOL

public expect fun SetConsoleTitleW(lpconsoletitle: PCWSTR): BOOL

public expect fun SetConsoleWindowInfo(hconsoleoutput: HANDLE, babsolute: BOOL, lpconsolewindow: Long): BOOL

public expect fun SetCurrentConsoleFontEx(hconsoleoutput: HANDLE, bmaximumwindow: BOOL, lpconsolecurrentfontex: Long): BOOL

public expect fun SetStdHandle(nstdhandle: STD_HANDLE, hhandle: HANDLE): BOOL

public expect fun SetStdHandleEx(nstdhandle: STD_HANDLE, hhandle: HANDLE, phprevvalue: Long): BOOL

public expect fun WriteConsoleA(hconsoleoutput: HANDLE, lpbuffer: PCSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL

public expect fun WriteConsoleInputA(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL

public expect fun WriteConsoleInputW(hconsoleinput: HANDLE, lpbuffer: Long, nlength: UInt, lpnumberofeventswritten: Long): BOOL

public expect fun WriteConsoleOutputA(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpwriteregion: Long): BOOL

public expect fun WriteConsoleOutputAttribute(hconsoleoutput: HANDLE, lpattribute: Long, nlength: UInt, dwwritecoord: COORD, lpnumberofattrswritten: Long): BOOL

public expect fun WriteConsoleOutputCharacterA(hconsoleoutput: HANDLE, lpcharacter: PCSTR, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL

public expect fun WriteConsoleOutputCharacterW(hconsoleoutput: HANDLE, lpcharacter: PCWSTR, nlength: UInt, dwwritecoord: COORD, lpnumberofcharswritten: Long): BOOL

public expect fun WriteConsoleOutputW(hconsoleoutput: HANDLE, lpbuffer: Long, dwbuffersize: COORD, dwbuffercoord: COORD, lpwriteregion: Long): BOOL

public expect fun WriteConsoleW(hconsoleoutput: HANDLE, lpbuffer: PCWSTR, nnumberofcharstowrite: UInt, lpnumberofcharswritten: Long, lpreserved: Long): BOOL
