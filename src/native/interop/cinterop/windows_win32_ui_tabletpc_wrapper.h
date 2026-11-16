#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_TABLETPC_WINDOWS_WIN32_UI_TABLETPC_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_TABLETPC_WINDOWS_WIN32_UI_TABLETPC_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32UiTabletpcAddStroke(void* hrc, void* ppacketdesc, uint32_t cbpacket, void* ppacket, void* pxform);
int32_t windowssysWindowsWin32UiTabletpcAddWordsToWordList(void* hwl, void* pwcwords);
int32_t windowssysWindowsWin32UiTabletpcAdviseInkChange(void* hrc, int32_t bnewstroke);
int32_t windowssysWindowsWin32UiTabletpcCreateContext(void* hrec, void* phrc);
int32_t windowssysWindowsWin32UiTabletpcCreateRecognizer(void* pclsid, void* phrec);
int32_t windowssysWindowsWin32UiTabletpcDestroyContext(void* hrc);
int32_t windowssysWindowsWin32UiTabletpcDestroyRecognizer(void* hrec);
int32_t windowssysWindowsWin32UiTabletpcDestroyWordList(void* hwl);
int32_t windowssysWindowsWin32UiTabletpcEndInkInput(void* hrc);
int32_t windowssysWindowsWin32UiTabletpcGetAllRecognizers(void* recognizerclsids, void* count);
int32_t windowssysWindowsWin32UiTabletpcGetBestResultString(void* hrc, void* pcsize, void* pwcbestresult);
int32_t windowssysWindowsWin32UiTabletpcGetLatticePtr(void* hrc, void* pplattice);
int32_t windowssysWindowsWin32UiTabletpcGetLeftSeparator(void* hrc, void* pcsize, void* pwcleftseparator);
int32_t windowssysWindowsWin32UiTabletpcGetRecoAttributes(void* hrec, void* precoattrs);
int32_t windowssysWindowsWin32UiTabletpcGetResultPropertyList(void* hrec, void* ppropertycount, void* ppropertyguid);
int32_t windowssysWindowsWin32UiTabletpcGetRightSeparator(void* hrc, void* pcsize, void* pwcrightseparator);
int32_t windowssysWindowsWin32UiTabletpcGetUnicodeRanges(void* hrec, void* pcranges, void* pcr);
int32_t windowssysWindowsWin32UiTabletpcIsStringSupported(void* hrc, uint32_t wcstring, void* pwcstring);
int32_t windowssysWindowsWin32UiTabletpcMakeWordList(void* hrec, void* pbuffer, void* phwl);
int32_t windowssysWindowsWin32UiTabletpcProcess(void* hrc, void* pbpartialprocessing);
int32_t windowssysWindowsWin32UiTabletpcSetEnabledUnicodeRanges(void* hrc, uint32_t cranges, void* pcr);
int32_t windowssysWindowsWin32UiTabletpcSetFactoid(void* hrc, uint32_t cwcfactoid, void* pwcfactoid);
int32_t windowssysWindowsWin32UiTabletpcSetFlags(void* hrc, uint32_t dwflags);
int32_t windowssysWindowsWin32UiTabletpcSetGuide(void* hrc, void* pguide, uint32_t iindex);
int32_t windowssysWindowsWin32UiTabletpcSetTextContext(void* hrc, uint32_t cwcbefore, void* pwcbefore, uint32_t cwcafter, void* pwcafter);
int32_t windowssysWindowsWin32UiTabletpcSetWordList(void* hrc, void* hwl);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_TABLETPC_WINDOWS_WIN32_UI_TABLETPC_WRAPPER_H */
