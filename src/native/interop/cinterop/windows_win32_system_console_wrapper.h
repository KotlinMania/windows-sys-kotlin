#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CONSOLE_WINDOWS_WIN32_SYSTEM_CONSOLE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CONSOLE_WINDOWS_WIN32_SYSTEM_CONSOLE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemConsoleAddConsoleAliasA(void* source, void* target, void* exename);
int32_t windowssysWindowsWin32SystemConsoleAddConsoleAliasW(void* source, void* target, void* exename);
int32_t windowssysWindowsWin32SystemConsoleAllocConsole(void);
int32_t windowssysWindowsWin32SystemConsoleAttachConsole(uint32_t dwprocessid);
void windowssysWindowsWin32SystemConsoleClosePseudoConsole(int64_t hpc);
int32_t windowssysWindowsWin32SystemConsoleConsoleControl(int32_t command, void* consoleinformation, uint32_t consoleinformationlength);
void* windowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer(uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwflags, void* lpscreenbufferdata);
void windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA(void* exename);
void windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW(void* exename);
int32_t windowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer(void* hconsoleinput);
int32_t windowssysWindowsWin32SystemConsoleFreeConsole(void);
int32_t windowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(uint32_t dwctrlevent, uint32_t dwprocessgroupid);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasA(void* source, void* targetbuffer, uint32_t targetbufferlength, void* exename);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasExesA(void* exenamebuffer, uint32_t exenamebufferlength);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA(void);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW(void);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasExesW(void* exenamebuffer, uint32_t exenamebufferlength);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasW(void* source, void* targetbuffer, uint32_t targetbufferlength, void* exename);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasesA(void* aliasbuffer, uint32_t aliasbufferlength, void* exename);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA(void* exename);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW(void* exename);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasesW(void* aliasbuffer, uint32_t aliasbufferlength, void* exename);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleCP(void);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA(void* commands, uint32_t commandbufferlength, void* exename);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA(void* exename);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW(void* exename);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW(void* commands, uint32_t commandbufferlength, void* exename);
int32_t windowssysWindowsWin32SystemConsoleGetConsoleCursorInfo(void* hconsoleoutput, void* lpconsolecursorinfo);
int32_t windowssysWindowsWin32SystemConsoleGetConsoleDisplayMode(void* lpmodeflags);
int32_t windowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo(void* lpconsolehistoryinfo);
int32_t windowssysWindowsWin32SystemConsoleGetConsoleMode(void* hconsolehandle, void* lpmode);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA(void* lpconsoletitle, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW(void* lpconsoletitle, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleOutputCP(void);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleProcessList(void* lpdwprocesslist, uint32_t dwprocesscount);
int32_t windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo(void* hconsoleoutput, void* lpconsolescreenbufferinfo);
int32_t windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx(void* hconsoleoutput, void* lpconsolescreenbufferinfoex);
int32_t windowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo(void* lpconsoleselectioninfo);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleTitleA(void* lpconsoletitle, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemConsoleGetConsoleTitleW(void* lpconsoletitle, uint32_t nsize);
void* windowssysWindowsWin32SystemConsoleGetConsoleWindow(void);
int32_t windowssysWindowsWin32SystemConsoleGetCurrentConsoleFont(void* hconsoleoutput, int32_t bmaximumwindow, void* lpconsolecurrentfont);
int32_t windowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx(void* hconsoleoutput, int32_t bmaximumwindow, void* lpconsolecurrentfontex);
int32_t windowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents(void* hconsoleinput, void* lpnumberofevents);
int32_t windowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons(void* lpnumberofmousebuttons);
void* windowssysWindowsWin32SystemConsoleGetStdHandle(uint32_t nstdhandle);
int32_t windowssysWindowsWin32SystemConsolePeekConsoleInputA(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventsread);
int32_t windowssysWindowsWin32SystemConsolePeekConsoleInputW(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventsread);
int32_t windowssysWindowsWin32SystemConsoleReadConsoleA(void* hconsoleinput, void* lpbuffer, uint32_t nnumberofcharstoread, void* lpnumberofcharsread, void* pinputcontrol);
int32_t windowssysWindowsWin32SystemConsoleReadConsoleInputA(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventsread);
int32_t windowssysWindowsWin32SystemConsoleReadConsoleInputW(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventsread);
int32_t windowssysWindowsWin32SystemConsoleReadConsoleW(void* hconsoleinput, void* lpbuffer, uint32_t nnumberofcharstoread, void* lpnumberofcharsread, void* pinputcontrol);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer(void* hconsoleoutput);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleCP(uint32_t wcodepageid);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler(void* handlerroutine, int32_t add);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleCursorInfo(void* hconsoleoutput, void* lpconsolecursorinfo);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleDisplayMode(void* hconsoleoutput, uint32_t dwflags, void* lpnewscreenbufferdimensions);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo(void* lpconsolehistoryinfo);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleMode(void* hconsolehandle, uint32_t dwmode);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA(uint32_t number, void* exename);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW(uint32_t number, void* exename);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleOutputCP(uint32_t wcodepageid);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx(void* hconsoleoutput, void* lpconsolescreenbufferinfoex);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleTextAttribute(void* hconsoleoutput, uint16_t wattributes);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleTitleA(void* lpconsoletitle);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleTitleW(void* lpconsoletitle);
int32_t windowssysWindowsWin32SystemConsoleSetConsoleWindowInfo(void* hconsoleoutput, int32_t babsolute, void* lpconsolewindow);
int32_t windowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx(void* hconsoleoutput, int32_t bmaximumwindow, void* lpconsolecurrentfontex);
int32_t windowssysWindowsWin32SystemConsoleSetStdHandle(uint32_t nstdhandle, void* hhandle);
int32_t windowssysWindowsWin32SystemConsoleSetStdHandleEx(uint32_t nstdhandle, void* hhandle, void* phprevvalue);
int32_t windowssysWindowsWin32SystemConsoleWriteConsoleA(void* hconsoleoutput, void* lpbuffer, uint32_t nnumberofcharstowrite, void* lpnumberofcharswritten, void* lpreserved);
int32_t windowssysWindowsWin32SystemConsoleWriteConsoleInputA(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventswritten);
int32_t windowssysWindowsWin32SystemConsoleWriteConsoleInputW(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventswritten);
int32_t windowssysWindowsWin32SystemConsoleWriteConsoleW(void* hconsoleoutput, void* lpbuffer, uint32_t nnumberofcharstowrite, void* lpnumberofcharswritten, void* lpreserved);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CONSOLE_WINDOWS_WIN32_SYSTEM_CONSOLE_WRAPPER_H */
