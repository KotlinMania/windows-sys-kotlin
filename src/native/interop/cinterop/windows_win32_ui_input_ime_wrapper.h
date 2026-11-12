#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_IME_WINDOWS_WIN32_UI_INPUT_IME_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_IME_WINDOWS_WIN32_UI_INPUT_IME_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssysWindowsWin32UiInputImeImmAssociateContext(void* param0, void* param1);
int32_t windowssysWindowsWin32UiInputImeImmAssociateContextEx(void* param0, void* param1, uint32_t param2);
int32_t windowssysWindowsWin32UiInputImeImmConfigureIMEA(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssysWindowsWin32UiInputImeImmConfigureIMEW(void* param0, void* param1, uint32_t param2, void* param3);
void* windowssysWindowsWin32UiInputImeImmCreateContext(void);
void* windowssysWindowsWin32UiInputImeImmCreateIMCC(uint32_t param0);
void* windowssysWindowsWin32UiInputImeImmCreateSoftKeyboard(uint32_t param0, void* param1, int32_t param2, int32_t param3);
int32_t windowssysWindowsWin32UiInputImeImmDestroyContext(void* param0);
void* windowssysWindowsWin32UiInputImeImmDestroyIMCC(void* param0);
int32_t windowssysWindowsWin32UiInputImeImmDestroySoftKeyboard(void* param0);
int32_t windowssysWindowsWin32UiInputImeImmDisableIME(uint32_t param0);
int32_t windowssysWindowsWin32UiInputImeImmDisableLegacyIME(void);
int32_t windowssysWindowsWin32UiInputImeImmDisableTextFrameService(uint32_t idthread);
int32_t windowssysWindowsWin32UiInputImeImmEnumInputContext(uint32_t idthread, void* lpfn, int64_t lparam);
uint32_t windowssysWindowsWin32UiInputImeImmEnumRegisterWordA(void* param0, void* param1, void* lpszreading, uint32_t param3, void* lpszregister, void* param5);
uint32_t windowssysWindowsWin32UiInputImeImmEnumRegisterWordW(void* param0, void* param1, void* lpszreading, uint32_t param3, void* lpszregister, void* param5);
int64_t windowssysWindowsWin32UiInputImeImmEscapeA(void* param0, void* param1, uint32_t param2, void* param3);
int64_t windowssysWindowsWin32UiInputImeImmEscapeW(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssysWindowsWin32UiInputImeImmGenerateMessage(void* param0);
uint32_t windowssysWindowsWin32UiInputImeImmGetCandidateListA(void* param0, uint32_t deindex, void* lpcandlist, uint32_t dwbuflen);
uint32_t windowssysWindowsWin32UiInputImeImmGetCandidateListCountA(void* param0, void* lpdwlistcount);
uint32_t windowssysWindowsWin32UiInputImeImmGetCandidateListCountW(void* param0, void* lpdwlistcount);
uint32_t windowssysWindowsWin32UiInputImeImmGetCandidateListW(void* param0, uint32_t deindex, void* lpcandlist, uint32_t dwbuflen);
int32_t windowssysWindowsWin32UiInputImeImmGetCandidateWindow(void* param0, uint32_t param1, void* lpcandidate);
int32_t windowssysWindowsWin32UiInputImeImmGetCompositionFontA(void* param0, void* lplf);
int32_t windowssysWindowsWin32UiInputImeImmGetCompositionFontW(void* param0, void* lplf);
int32_t windowssysWindowsWin32UiInputImeImmGetCompositionStringA(void* param0, uint32_t param1, void* lpbuf, uint32_t dwbuflen);
int32_t windowssysWindowsWin32UiInputImeImmGetCompositionStringW(void* param0, uint32_t param1, void* lpbuf, uint32_t dwbuflen);
int32_t windowssysWindowsWin32UiInputImeImmGetCompositionWindow(void* param0, void* lpcompform);
void* windowssysWindowsWin32UiInputImeImmGetContext(void* param0);
uint32_t windowssysWindowsWin32UiInputImeImmGetConversionListA(void* param0, void* param1, void* lpsrc, void* lpdst, uint32_t dwbuflen, uint32_t uflag);
uint32_t windowssysWindowsWin32UiInputImeImmGetConversionListW(void* param0, void* param1, void* lpsrc, void* lpdst, uint32_t dwbuflen, uint32_t uflag);
int32_t windowssysWindowsWin32UiInputImeImmGetConversionStatus(void* param0, void* lpfdwconversion, void* lpfdwsentence);
void* windowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd(void* param0);
uint32_t windowssysWindowsWin32UiInputImeImmGetDescriptionA(void* param0, void* lpszdescription, uint32_t ubuflen);
uint32_t windowssysWindowsWin32UiInputImeImmGetDescriptionW(void* param0, void* lpszdescription, uint32_t ubuflen);
uint32_t windowssysWindowsWin32UiInputImeImmGetGuideLineA(void* param0, uint32_t dwindex, void* lpbuf, uint32_t dwbuflen);
uint32_t windowssysWindowsWin32UiInputImeImmGetGuideLineW(void* param0, uint32_t dwindex, void* lpbuf, uint32_t dwbuflen);
int32_t windowssysWindowsWin32UiInputImeImmGetHotKey(uint32_t param0, void* lpumodifiers, void* lpuvkey, void* phkl);
uint32_t windowssysWindowsWin32UiInputImeImmGetIMCCLockCount(void* param0);
uint32_t windowssysWindowsWin32UiInputImeImmGetIMCCSize(void* param0);
uint32_t windowssysWindowsWin32UiInputImeImmGetIMCLockCount(void* param0);
uint32_t windowssysWindowsWin32UiInputImeImmGetIMEFileNameA(void* param0, void* lpszfilename, uint32_t ubuflen);
uint32_t windowssysWindowsWin32UiInputImeImmGetIMEFileNameW(void* param0, void* lpszfilename, uint32_t ubuflen);
uint32_t windowssysWindowsWin32UiInputImeImmGetImeMenuItemsA(void* param0, uint32_t param1, uint32_t param2, void* lpimeparentmenu, void* lpimemenu, uint32_t dwsize);
uint32_t windowssysWindowsWin32UiInputImeImmGetImeMenuItemsW(void* param0, uint32_t param1, uint32_t param2, void* lpimeparentmenu, void* lpimemenu, uint32_t dwsize);
int32_t windowssysWindowsWin32UiInputImeImmGetOpenStatus(void* param0);
uint32_t windowssysWindowsWin32UiInputImeImmGetProperty(void* param0, uint32_t param1);
uint32_t windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA(void* param0, uint32_t nitem, void* lpstylebuf);
uint32_t windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW(void* param0, uint32_t nitem, void* lpstylebuf);
int32_t windowssysWindowsWin32UiInputImeImmGetStatusWindowPos(void* param0, void* lpptpos);
uint32_t windowssysWindowsWin32UiInputImeImmGetVirtualKey(void* param0);
void* windowssysWindowsWin32UiInputImeImmInstallIMEA(void* lpszimefilename, void* lpszlayouttext);
void* windowssysWindowsWin32UiInputImeImmInstallIMEW(void* lpszimefilename, void* lpszlayouttext);
int32_t windowssysWindowsWin32UiInputImeImmIsIME(void* param0);
int32_t windowssysWindowsWin32UiInputImeImmIsUIMessageA(void* param0, uint32_t param1, uint64_t param2, int64_t param3);
int32_t windowssysWindowsWin32UiInputImeImmIsUIMessageW(void* param0, uint32_t param1, uint64_t param2, int64_t param3);
void* windowssysWindowsWin32UiInputImeImmLockIMC(void* param0);
void* windowssysWindowsWin32UiInputImeImmLockIMCC(void* param0);
int32_t windowssysWindowsWin32UiInputImeImmNotifyIME(void* param0, uint32_t dwaction, uint32_t dwindex, uint32_t dwvalue);
void* windowssysWindowsWin32UiInputImeImmReSizeIMCC(void* param0, uint32_t param1);
int32_t windowssysWindowsWin32UiInputImeImmRegisterWordA(void* param0, void* lpszreading, uint32_t param2, void* lpszregister);
int32_t windowssysWindowsWin32UiInputImeImmRegisterWordW(void* param0, void* lpszreading, uint32_t param2, void* lpszregister);
int32_t windowssysWindowsWin32UiInputImeImmReleaseContext(void* param0, void* param1);
int64_t windowssysWindowsWin32UiInputImeImmRequestMessageA(void* param0, uint64_t param1, int64_t param2);
int64_t windowssysWindowsWin32UiInputImeImmRequestMessageW(void* param0, uint64_t param1, int64_t param2);
int32_t windowssysWindowsWin32UiInputImeImmSetCandidateWindow(void* param0, void* lpcandidate);
int32_t windowssysWindowsWin32UiInputImeImmSetCompositionFontA(void* param0, void* lplf);
int32_t windowssysWindowsWin32UiInputImeImmSetCompositionFontW(void* param0, void* lplf);
int32_t windowssysWindowsWin32UiInputImeImmSetCompositionStringA(void* param0, uint32_t dwindex, void* lpcomp, uint32_t dwcomplen, void* lpread, uint32_t dwreadlen);
int32_t windowssysWindowsWin32UiInputImeImmSetCompositionStringW(void* param0, uint32_t dwindex, void* lpcomp, uint32_t dwcomplen, void* lpread, uint32_t dwreadlen);
int32_t windowssysWindowsWin32UiInputImeImmSetCompositionWindow(void* param0, void* lpcompform);
int32_t windowssysWindowsWin32UiInputImeImmSetConversionStatus(void* param0, uint32_t param1, uint32_t param2);
int32_t windowssysWindowsWin32UiInputImeImmSetHotKey(uint32_t param0, uint32_t param1, uint32_t param2, void* param3);
int32_t windowssysWindowsWin32UiInputImeImmSetOpenStatus(void* param0, int32_t param1);
int32_t windowssysWindowsWin32UiInputImeImmSetStatusWindowPos(void* param0, void* lpptpos);
int32_t windowssysWindowsWin32UiInputImeImmShowSoftKeyboard(void* param0, int32_t param1);
int32_t windowssysWindowsWin32UiInputImeImmSimulateHotKey(void* param0, uint32_t param1);
int32_t windowssysWindowsWin32UiInputImeImmUnlockIMC(void* param0);
int32_t windowssysWindowsWin32UiInputImeImmUnlockIMCC(void* param0);
int32_t windowssysWindowsWin32UiInputImeImmUnregisterWordA(void* param0, void* lpszreading, uint32_t param2, void* lpszunregister);
int32_t windowssysWindowsWin32UiInputImeImmUnregisterWordW(void* param0, void* lpszreading, uint32_t param2, void* lpszunregister);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_IME_WINDOWS_WIN32_UI_INPUT_IME_WRAPPER_H */
