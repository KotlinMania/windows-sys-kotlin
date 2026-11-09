#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_IME_WINDOWS_WIN32_UI_INPUT_IME_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_IME_WINDOWS_WIN32_UI_INPUT_IME_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_ui_input_ime_ImmAssociateContext(void* param0, void* param1);
int32_t windowssys_windows_win32_ui_input_ime_ImmAssociateContextEx(void* param0, void* param1, uint32_t param2);
int32_t windowssys_windows_win32_ui_input_ime_ImmConfigureIMEA(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_ui_input_ime_ImmConfigureIMEW(void* param0, void* param1, uint32_t param2, void* param3);
void* windowssys_windows_win32_ui_input_ime_ImmCreateContext(void);
void* windowssys_windows_win32_ui_input_ime_ImmCreateIMCC(uint32_t param0);
void* windowssys_windows_win32_ui_input_ime_ImmCreateSoftKeyboard(uint32_t param0, void* param1, int32_t param2, int32_t param3);
int32_t windowssys_windows_win32_ui_input_ime_ImmDestroyContext(void* param0);
void* windowssys_windows_win32_ui_input_ime_ImmDestroyIMCC(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_ImmDestroySoftKeyboard(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_ImmDisableIME(uint32_t param0);
int32_t windowssys_windows_win32_ui_input_ime_ImmDisableLegacyIME(void);
int32_t windowssys_windows_win32_ui_input_ime_ImmDisableTextFrameService(uint32_t idthread);
int32_t windowssys_windows_win32_ui_input_ime_ImmEnumInputContext(uint32_t idthread, void* lpfn, int64_t lparam);
uint32_t windowssys_windows_win32_ui_input_ime_ImmEnumRegisterWordA(void* param0, void* param1, void* lpszreading, uint32_t param3, void* lpszregister, void* param5);
uint32_t windowssys_windows_win32_ui_input_ime_ImmEnumRegisterWordW(void* param0, void* param1, void* lpszreading, uint32_t param3, void* lpszregister, void* param5);
int64_t windowssys_windows_win32_ui_input_ime_ImmEscapeA(void* param0, void* param1, uint32_t param2, void* param3);
int64_t windowssys_windows_win32_ui_input_ime_ImmEscapeW(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_ui_input_ime_ImmGenerateMessage(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetCandidateListA(void* param0, uint32_t deindex, void* lpcandlist, uint32_t dwbuflen);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetCandidateListCountA(void* param0, void* lpdwlistcount);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetCandidateListCountW(void* param0, void* lpdwlistcount);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetCandidateListW(void* param0, uint32_t deindex, void* lpcandlist, uint32_t dwbuflen);
int32_t windowssys_windows_win32_ui_input_ime_ImmGetCandidateWindow(void* param0, uint32_t param1, void* lpcandidate);
int32_t windowssys_windows_win32_ui_input_ime_ImmGetCompositionFontA(void* param0, void* lplf);
int32_t windowssys_windows_win32_ui_input_ime_ImmGetCompositionFontW(void* param0, void* lplf);
int32_t windowssys_windows_win32_ui_input_ime_ImmGetCompositionStringA(void* param0, uint32_t param1, void* lpbuf, uint32_t dwbuflen);
int32_t windowssys_windows_win32_ui_input_ime_ImmGetCompositionStringW(void* param0, uint32_t param1, void* lpbuf, uint32_t dwbuflen);
int32_t windowssys_windows_win32_ui_input_ime_ImmGetCompositionWindow(void* param0, void* lpcompform);
void* windowssys_windows_win32_ui_input_ime_ImmGetContext(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetConversionListA(void* param0, void* param1, void* lpsrc, void* lpdst, uint32_t dwbuflen, uint32_t uflag);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetConversionListW(void* param0, void* param1, void* lpsrc, void* lpdst, uint32_t dwbuflen, uint32_t uflag);
int32_t windowssys_windows_win32_ui_input_ime_ImmGetConversionStatus(void* param0, void* lpfdwconversion, void* lpfdwsentence);
void* windowssys_windows_win32_ui_input_ime_ImmGetDefaultIMEWnd(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetDescriptionA(void* param0, void* lpszdescription, uint32_t ubuflen);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetDescriptionW(void* param0, void* lpszdescription, uint32_t ubuflen);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetGuideLineA(void* param0, uint32_t dwindex, void* lpbuf, uint32_t dwbuflen);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetGuideLineW(void* param0, uint32_t dwindex, void* lpbuf, uint32_t dwbuflen);
int32_t windowssys_windows_win32_ui_input_ime_ImmGetHotKey(uint32_t param0, void* lpumodifiers, void* lpuvkey, void* phkl);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetIMCCLockCount(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetIMCCSize(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetIMCLockCount(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetIMEFileNameA(void* param0, void* lpszfilename, uint32_t ubuflen);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetIMEFileNameW(void* param0, void* lpszfilename, uint32_t ubuflen);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetImeMenuItemsA(void* param0, uint32_t param1, uint32_t param2, void* lpimeparentmenu, void* lpimemenu, uint32_t dwsize);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetImeMenuItemsW(void* param0, uint32_t param1, uint32_t param2, void* lpimeparentmenu, void* lpimemenu, uint32_t dwsize);
int32_t windowssys_windows_win32_ui_input_ime_ImmGetOpenStatus(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetProperty(void* param0, uint32_t param1);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetRegisterWordStyleA(void* param0, uint32_t nitem, void* lpstylebuf);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetRegisterWordStyleW(void* param0, uint32_t nitem, void* lpstylebuf);
int32_t windowssys_windows_win32_ui_input_ime_ImmGetStatusWindowPos(void* param0, void* lpptpos);
uint32_t windowssys_windows_win32_ui_input_ime_ImmGetVirtualKey(void* param0);
void* windowssys_windows_win32_ui_input_ime_ImmInstallIMEA(void* lpszimefilename, void* lpszlayouttext);
void* windowssys_windows_win32_ui_input_ime_ImmInstallIMEW(void* lpszimefilename, void* lpszlayouttext);
int32_t windowssys_windows_win32_ui_input_ime_ImmIsIME(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_ImmIsUIMessageA(void* param0, uint32_t param1, uint64_t param2, int64_t param3);
int32_t windowssys_windows_win32_ui_input_ime_ImmIsUIMessageW(void* param0, uint32_t param1, uint64_t param2, int64_t param3);
void* windowssys_windows_win32_ui_input_ime_ImmLockIMC(void* param0);
void* windowssys_windows_win32_ui_input_ime_ImmLockIMCC(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_ImmNotifyIME(void* param0, uint32_t dwaction, uint32_t dwindex, uint32_t dwvalue);
void* windowssys_windows_win32_ui_input_ime_ImmReSizeIMCC(void* param0, uint32_t param1);
int32_t windowssys_windows_win32_ui_input_ime_ImmRegisterWordA(void* param0, void* lpszreading, uint32_t param2, void* lpszregister);
int32_t windowssys_windows_win32_ui_input_ime_ImmRegisterWordW(void* param0, void* lpszreading, uint32_t param2, void* lpszregister);
int32_t windowssys_windows_win32_ui_input_ime_ImmReleaseContext(void* param0, void* param1);
int64_t windowssys_windows_win32_ui_input_ime_ImmRequestMessageA(void* param0, uint64_t param1, int64_t param2);
int64_t windowssys_windows_win32_ui_input_ime_ImmRequestMessageW(void* param0, uint64_t param1, int64_t param2);
int32_t windowssys_windows_win32_ui_input_ime_ImmSetCandidateWindow(void* param0, void* lpcandidate);
int32_t windowssys_windows_win32_ui_input_ime_ImmSetCompositionFontA(void* param0, void* lplf);
int32_t windowssys_windows_win32_ui_input_ime_ImmSetCompositionFontW(void* param0, void* lplf);
int32_t windowssys_windows_win32_ui_input_ime_ImmSetCompositionStringA(void* param0, uint32_t dwindex, void* lpcomp, uint32_t dwcomplen, void* lpread, uint32_t dwreadlen);
int32_t windowssys_windows_win32_ui_input_ime_ImmSetCompositionStringW(void* param0, uint32_t dwindex, void* lpcomp, uint32_t dwcomplen, void* lpread, uint32_t dwreadlen);
int32_t windowssys_windows_win32_ui_input_ime_ImmSetCompositionWindow(void* param0, void* lpcompform);
int32_t windowssys_windows_win32_ui_input_ime_ImmSetConversionStatus(void* param0, uint32_t param1, uint32_t param2);
int32_t windowssys_windows_win32_ui_input_ime_ImmSetHotKey(uint32_t param0, uint32_t param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_ui_input_ime_ImmSetOpenStatus(void* param0, int32_t param1);
int32_t windowssys_windows_win32_ui_input_ime_ImmSetStatusWindowPos(void* param0, void* lpptpos);
int32_t windowssys_windows_win32_ui_input_ime_ImmShowSoftKeyboard(void* param0, int32_t param1);
int32_t windowssys_windows_win32_ui_input_ime_ImmSimulateHotKey(void* param0, uint32_t param1);
int32_t windowssys_windows_win32_ui_input_ime_ImmUnlockIMC(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_ImmUnlockIMCC(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_ImmUnregisterWordA(void* param0, void* lpszreading, uint32_t param2, void* lpszunregister);
int32_t windowssys_windows_win32_ui_input_ime_ImmUnregisterWordW(void* param0, void* lpszreading, uint32_t param2, void* lpszunregister);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_IME_WINDOWS_WIN32_UI_INPUT_IME_WRAPPER_H */
