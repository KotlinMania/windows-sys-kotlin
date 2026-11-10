#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_TABLETPC_WINDOWS_WIN32_UI_TABLETPC_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_TABLETPC_WINDOWS_WIN32_UI_TABLETPC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_tabletpc_addStroke(void* hrc, void* ppacketdesc, uint32_t cbpacket, void* ppacket, void* pxform);
int32_t windowssys_windows_win32_ui_tabletpc_addWordsToWordList(void* hwl, void* pwcwords);
int32_t windowssys_windows_win32_ui_tabletpc_adviseInkChange(void* hrc, int32_t bnewstroke);
int32_t windowssys_windows_win32_ui_tabletpc_createContext(void* hrec, void* phrc);
int32_t windowssys_windows_win32_ui_tabletpc_createRecognizer(void* pclsid, void* phrec);
int32_t windowssys_windows_win32_ui_tabletpc_destroyContext(void* hrc);
int32_t windowssys_windows_win32_ui_tabletpc_destroyRecognizer(void* hrec);
int32_t windowssys_windows_win32_ui_tabletpc_destroyWordList(void* hwl);
int32_t windowssys_windows_win32_ui_tabletpc_endInkInput(void* hrc);
int32_t windowssys_windows_win32_ui_tabletpc_getAllRecognizers(void* recognizerclsids, void* count);
int32_t windowssys_windows_win32_ui_tabletpc_getBestResultString(void* hrc, void* pcsize, void* pwcbestresult);
int32_t windowssys_windows_win32_ui_tabletpc_getLatticePtr(void* hrc, void* pplattice);
int32_t windowssys_windows_win32_ui_tabletpc_getLeftSeparator(void* hrc, void* pcsize, void* pwcleftseparator);
int32_t windowssys_windows_win32_ui_tabletpc_getRecoAttributes(void* hrec, void* precoattrs);
int32_t windowssys_windows_win32_ui_tabletpc_getResultPropertyList(void* hrec, void* ppropertycount, void* ppropertyguid);
int32_t windowssys_windows_win32_ui_tabletpc_getRightSeparator(void* hrc, void* pcsize, void* pwcrightseparator);
int32_t windowssys_windows_win32_ui_tabletpc_getUnicodeRanges(void* hrec, void* pcranges, void* pcr);
int32_t windowssys_windows_win32_ui_tabletpc_isStringSupported(void* hrc, uint32_t wcstring, void* pwcstring);
int32_t windowssys_windows_win32_ui_tabletpc_makeWordList(void* hrec, void* pbuffer, void* phwl);
int32_t windowssys_windows_win32_ui_tabletpc_process(void* hrc, void* pbpartialprocessing);
int32_t windowssys_windows_win32_ui_tabletpc_setEnabledUnicodeRanges(void* hrc, uint32_t cranges, void* pcr);
int32_t windowssys_windows_win32_ui_tabletpc_setFactoid(void* hrc, uint32_t cwcfactoid, void* pwcfactoid);
int32_t windowssys_windows_win32_ui_tabletpc_setFlags(void* hrc, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_tabletpc_setGuide(void* hrc, void* pguide, uint32_t iindex);
int32_t windowssys_windows_win32_ui_tabletpc_setTextContext(void* hrc, uint32_t cwcbefore, void* pwcbefore, uint32_t cwcafter, void* pwcafter);
int32_t windowssys_windows_win32_ui_tabletpc_setWordList(void* hrc, void* hwl);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_TABLETPC_WINDOWS_WIN32_UI_TABLETPC_WRAPPER_H */
