#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_IME_WINDOWS_WIN32_UI_INPUT_IME_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_IME_WINDOWS_WIN32_UI_INPUT_IME_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_ui_input_ime_immAssociateContext(void* param0, void* param1);
int32_t windowssys_windows_win32_ui_input_ime_immAssociateContextEx(void* param0, void* param1, uint32_t param2);
int32_t windowssys_windows_win32_ui_input_ime_immConfigureIMEA(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_ui_input_ime_immConfigureIMEW(void* param0, void* param1, uint32_t param2, void* param3);
void* windowssys_windows_win32_ui_input_ime_immCreateContext(void);
void* windowssys_windows_win32_ui_input_ime_immCreateIMCC(uint32_t param0);
void* windowssys_windows_win32_ui_input_ime_immCreateSoftKeyboard(uint32_t param0, void* param1, int32_t param2, int32_t param3);
int32_t windowssys_windows_win32_ui_input_ime_immDestroyContext(void* param0);
void* windowssys_windows_win32_ui_input_ime_immDestroyIMCC(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_immDestroySoftKeyboard(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_immDisableIME(uint32_t param0);
int32_t windowssys_windows_win32_ui_input_ime_immDisableLegacyIME(void);
int32_t windowssys_windows_win32_ui_input_ime_immDisableTextFrameService(uint32_t idthread);
int32_t windowssys_windows_win32_ui_input_ime_immEnumInputContext(uint32_t idthread, void* lpfn, int64_t lparam);
uint32_t windowssys_windows_win32_ui_input_ime_immEnumRegisterWordA(void* param0, void* param1, void* lpszreading, uint32_t param3, void* lpszregister, void* param5);
uint32_t windowssys_windows_win32_ui_input_ime_immEnumRegisterWordW(void* param0, void* param1, void* lpszreading, uint32_t param3, void* lpszregister, void* param5);
int64_t windowssys_windows_win32_ui_input_ime_immEscapeA(void* param0, void* param1, uint32_t param2, void* param3);
int64_t windowssys_windows_win32_ui_input_ime_immEscapeW(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_ui_input_ime_immGenerateMessage(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_immGetCandidateListA(void* param0, uint32_t deindex, void* lpcandlist, uint32_t dwbuflen);
uint32_t windowssys_windows_win32_ui_input_ime_immGetCandidateListCountA(void* param0, void* lpdwlistcount);
uint32_t windowssys_windows_win32_ui_input_ime_immGetCandidateListCountW(void* param0, void* lpdwlistcount);
uint32_t windowssys_windows_win32_ui_input_ime_immGetCandidateListW(void* param0, uint32_t deindex, void* lpcandlist, uint32_t dwbuflen);
int32_t windowssys_windows_win32_ui_input_ime_immGetCandidateWindow(void* param0, uint32_t param1, void* lpcandidate);
int32_t windowssys_windows_win32_ui_input_ime_immGetCompositionFontA(void* param0, void* lplf);
int32_t windowssys_windows_win32_ui_input_ime_immGetCompositionFontW(void* param0, void* lplf);
int32_t windowssys_windows_win32_ui_input_ime_immGetCompositionStringA(void* param0, uint32_t param1, void* lpbuf, uint32_t dwbuflen);
int32_t windowssys_windows_win32_ui_input_ime_immGetCompositionStringW(void* param0, uint32_t param1, void* lpbuf, uint32_t dwbuflen);
int32_t windowssys_windows_win32_ui_input_ime_immGetCompositionWindow(void* param0, void* lpcompform);
void* windowssys_windows_win32_ui_input_ime_immGetContext(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_immGetConversionListA(void* param0, void* param1, void* lpsrc, void* lpdst, uint32_t dwbuflen, uint32_t uflag);
uint32_t windowssys_windows_win32_ui_input_ime_immGetConversionListW(void* param0, void* param1, void* lpsrc, void* lpdst, uint32_t dwbuflen, uint32_t uflag);
int32_t windowssys_windows_win32_ui_input_ime_immGetConversionStatus(void* param0, void* lpfdwconversion, void* lpfdwsentence);
void* windowssys_windows_win32_ui_input_ime_immGetDefaultIMEWnd(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_immGetDescriptionA(void* param0, void* lpszdescription, uint32_t ubuflen);
uint32_t windowssys_windows_win32_ui_input_ime_immGetDescriptionW(void* param0, void* lpszdescription, uint32_t ubuflen);
uint32_t windowssys_windows_win32_ui_input_ime_immGetGuideLineA(void* param0, uint32_t dwindex, void* lpbuf, uint32_t dwbuflen);
uint32_t windowssys_windows_win32_ui_input_ime_immGetGuideLineW(void* param0, uint32_t dwindex, void* lpbuf, uint32_t dwbuflen);
int32_t windowssys_windows_win32_ui_input_ime_immGetHotKey(uint32_t param0, void* lpumodifiers, void* lpuvkey, void* phkl);
uint32_t windowssys_windows_win32_ui_input_ime_immGetIMCCLockCount(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_immGetIMCCSize(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_immGetIMCLockCount(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_immGetIMEFileNameA(void* param0, void* lpszfilename, uint32_t ubuflen);
uint32_t windowssys_windows_win32_ui_input_ime_immGetIMEFileNameW(void* param0, void* lpszfilename, uint32_t ubuflen);
uint32_t windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsA(void* param0, uint32_t param1, uint32_t param2, void* lpimeparentmenu, void* lpimemenu, uint32_t dwsize);
uint32_t windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsW(void* param0, uint32_t param1, uint32_t param2, void* lpimeparentmenu, void* lpimemenu, uint32_t dwsize);
int32_t windowssys_windows_win32_ui_input_ime_immGetOpenStatus(void* param0);
uint32_t windowssys_windows_win32_ui_input_ime_immGetProperty(void* param0, uint32_t param1);
uint32_t windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleA(void* param0, uint32_t nitem, void* lpstylebuf);
uint32_t windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleW(void* param0, uint32_t nitem, void* lpstylebuf);
int32_t windowssys_windows_win32_ui_input_ime_immGetStatusWindowPos(void* param0, void* lpptpos);
uint32_t windowssys_windows_win32_ui_input_ime_immGetVirtualKey(void* param0);
void* windowssys_windows_win32_ui_input_ime_immInstallIMEA(void* lpszimefilename, void* lpszlayouttext);
void* windowssys_windows_win32_ui_input_ime_immInstallIMEW(void* lpszimefilename, void* lpszlayouttext);
int32_t windowssys_windows_win32_ui_input_ime_immIsIME(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_immIsUIMessageA(void* param0, uint32_t param1, uint64_t param2, int64_t param3);
int32_t windowssys_windows_win32_ui_input_ime_immIsUIMessageW(void* param0, uint32_t param1, uint64_t param2, int64_t param3);
void* windowssys_windows_win32_ui_input_ime_immLockIMC(void* param0);
void* windowssys_windows_win32_ui_input_ime_immLockIMCC(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_immNotifyIME(void* param0, uint32_t dwaction, uint32_t dwindex, uint32_t dwvalue);
void* windowssys_windows_win32_ui_input_ime_immReSizeIMCC(void* param0, uint32_t param1);
int32_t windowssys_windows_win32_ui_input_ime_immRegisterWordA(void* param0, void* lpszreading, uint32_t param2, void* lpszregister);
int32_t windowssys_windows_win32_ui_input_ime_immRegisterWordW(void* param0, void* lpszreading, uint32_t param2, void* lpszregister);
int32_t windowssys_windows_win32_ui_input_ime_immReleaseContext(void* param0, void* param1);
int64_t windowssys_windows_win32_ui_input_ime_immRequestMessageA(void* param0, uint64_t param1, int64_t param2);
int64_t windowssys_windows_win32_ui_input_ime_immRequestMessageW(void* param0, uint64_t param1, int64_t param2);
int32_t windowssys_windows_win32_ui_input_ime_immSetCandidateWindow(void* param0, void* lpcandidate);
int32_t windowssys_windows_win32_ui_input_ime_immSetCompositionFontA(void* param0, void* lplf);
int32_t windowssys_windows_win32_ui_input_ime_immSetCompositionFontW(void* param0, void* lplf);
int32_t windowssys_windows_win32_ui_input_ime_immSetCompositionStringA(void* param0, uint32_t dwindex, void* lpcomp, uint32_t dwcomplen, void* lpread, uint32_t dwreadlen);
int32_t windowssys_windows_win32_ui_input_ime_immSetCompositionStringW(void* param0, uint32_t dwindex, void* lpcomp, uint32_t dwcomplen, void* lpread, uint32_t dwreadlen);
int32_t windowssys_windows_win32_ui_input_ime_immSetCompositionWindow(void* param0, void* lpcompform);
int32_t windowssys_windows_win32_ui_input_ime_immSetConversionStatus(void* param0, uint32_t param1, uint32_t param2);
int32_t windowssys_windows_win32_ui_input_ime_immSetHotKey(uint32_t param0, uint32_t param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_ui_input_ime_immSetOpenStatus(void* param0, int32_t param1);
int32_t windowssys_windows_win32_ui_input_ime_immSetStatusWindowPos(void* param0, void* lpptpos);
int32_t windowssys_windows_win32_ui_input_ime_immShowSoftKeyboard(void* param0, int32_t param1);
int32_t windowssys_windows_win32_ui_input_ime_immSimulateHotKey(void* param0, uint32_t param1);
int32_t windowssys_windows_win32_ui_input_ime_immUnlockIMC(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_immUnlockIMCC(void* param0);
int32_t windowssys_windows_win32_ui_input_ime_immUnregisterWordA(void* param0, void* lpszreading, uint32_t param2, void* lpszunregister);
int32_t windowssys_windows_win32_ui_input_ime_immUnregisterWordW(void* param0, void* lpszreading, uint32_t param2, void* lpszunregister);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_IME_WINDOWS_WIN32_UI_INPUT_IME_WRAPPER_H */
