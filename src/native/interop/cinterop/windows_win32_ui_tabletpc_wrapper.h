#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_TABLETPC_WINDOWS_WIN32_UI_TABLETPC_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_TABLETPC_WINDOWS_WIN32_UI_TABLETPC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_tabletpc_AddStroke(void* hrc, void* ppacketdesc, uint32_t cbpacket, void* ppacket, void* pxform);
int32_t windowssys_windows_win32_ui_tabletpc_AddWordsToWordList(void* hwl, void* pwcwords);
int32_t windowssys_windows_win32_ui_tabletpc_AdviseInkChange(void* hrc, int32_t bnewstroke);
int32_t windowssys_windows_win32_ui_tabletpc_CreateContext(void* hrec, void* phrc);
int32_t windowssys_windows_win32_ui_tabletpc_CreateRecognizer(void* pclsid, void* phrec);
int32_t windowssys_windows_win32_ui_tabletpc_DestroyContext(void* hrc);
int32_t windowssys_windows_win32_ui_tabletpc_DestroyRecognizer(void* hrec);
int32_t windowssys_windows_win32_ui_tabletpc_DestroyWordList(void* hwl);
int32_t windowssys_windows_win32_ui_tabletpc_EndInkInput(void* hrc);
int32_t windowssys_windows_win32_ui_tabletpc_GetAllRecognizers(void* recognizerclsids, void* count);
int32_t windowssys_windows_win32_ui_tabletpc_GetBestResultString(void* hrc, void* pcsize, void* pwcbestresult);
int32_t windowssys_windows_win32_ui_tabletpc_GetLatticePtr(void* hrc, void* pplattice);
int32_t windowssys_windows_win32_ui_tabletpc_GetLeftSeparator(void* hrc, void* pcsize, void* pwcleftseparator);
int32_t windowssys_windows_win32_ui_tabletpc_GetRecoAttributes(void* hrec, void* precoattrs);
int32_t windowssys_windows_win32_ui_tabletpc_GetResultPropertyList(void* hrec, void* ppropertycount, void* ppropertyguid);
int32_t windowssys_windows_win32_ui_tabletpc_GetRightSeparator(void* hrc, void* pcsize, void* pwcrightseparator);
int32_t windowssys_windows_win32_ui_tabletpc_GetUnicodeRanges(void* hrec, void* pcranges, void* pcr);
int32_t windowssys_windows_win32_ui_tabletpc_IsStringSupported(void* hrc, uint32_t wcstring, void* pwcstring);
int32_t windowssys_windows_win32_ui_tabletpc_MakeWordList(void* hrec, void* pbuffer, void* phwl);
int32_t windowssys_windows_win32_ui_tabletpc_Process(void* hrc, void* pbpartialprocessing);
int32_t windowssys_windows_win32_ui_tabletpc_SetEnabledUnicodeRanges(void* hrc, uint32_t cranges, void* pcr);
int32_t windowssys_windows_win32_ui_tabletpc_SetFactoid(void* hrc, uint32_t cwcfactoid, void* pwcfactoid);
int32_t windowssys_windows_win32_ui_tabletpc_SetFlags(void* hrc, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_tabletpc_SetGuide(void* hrc, void* pguide, uint32_t iindex);
int32_t windowssys_windows_win32_ui_tabletpc_SetTextContext(void* hrc, uint32_t cwcbefore, void* pwcbefore, uint32_t cwcafter, void* pwcafter);
int32_t windowssys_windows_win32_ui_tabletpc_SetWordList(void* hrc, void* hwl);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_TABLETPC_WINDOWS_WIN32_UI_TABLETPC_WRAPPER_H */
