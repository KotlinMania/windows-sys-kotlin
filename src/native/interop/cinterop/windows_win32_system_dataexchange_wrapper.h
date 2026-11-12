#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint16_t windowssysWindowsWin32SystemDataexchangeAddAtomA(void* lpstring);
uint16_t windowssysWindowsWin32SystemDataexchangeAddAtomW(void* lpstring);
int32_t windowssysWindowsWin32SystemDataexchangeAddClipboardFormatListener(void* hwnd);
int32_t windowssysWindowsWin32SystemDataexchangeChangeClipboardChain(void* hwndremove, void* hwndnewnext);
int32_t windowssysWindowsWin32SystemDataexchangeCloseClipboard(void);
int32_t windowssysWindowsWin32SystemDataexchangeCountClipboardFormats(void);
int32_t windowssysWindowsWin32SystemDataexchangeDdeAbandonTransaction(uint32_t idinst, void* hconv, uint32_t idtransaction);
void* windowssysWindowsWin32SystemDataexchangeDdeAccessData(void* hdata, void* pcbdatasize);
void* windowssysWindowsWin32SystemDataexchangeDdeAddData(void* hdata, void* psrc, uint32_t cb, uint32_t cboff);
void* windowssysWindowsWin32SystemDataexchangeDdeClientTransaction(void* pdata, uint32_t cbdata, void* hconv, void* hszitem, uint32_t wfmt, uint32_t wtype, uint32_t dwtimeout, void* pdwresult);
int32_t windowssysWindowsWin32SystemDataexchangeDdeCmpStringHandles(void* hsz1, void* hsz2);
void* windowssysWindowsWin32SystemDataexchangeDdeConnect(uint32_t idinst, void* hszservice, void* hsztopic, void* pcc);
void* windowssysWindowsWin32SystemDataexchangeDdeConnectList(uint32_t idinst, void* hszservice, void* hsztopic, void* hconvlist, void* pcc);
void* windowssysWindowsWin32SystemDataexchangeDdeCreateDataHandle(uint32_t idinst, void* psrc, uint32_t cb, uint32_t cboff, void* hszitem, uint32_t wfmt, uint32_t afcmd);
void* windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleA(uint32_t idinst, void* psz, int32_t icodepage);
void* windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleW(uint32_t idinst, void* psz, int32_t icodepage);
int32_t windowssysWindowsWin32SystemDataexchangeDdeDisconnect(void* hconv);
int32_t windowssysWindowsWin32SystemDataexchangeDdeDisconnectList(void* hconvlist);
int32_t windowssysWindowsWin32SystemDataexchangeDdeEnableCallback(uint32_t idinst, void* hconv, uint32_t wcmd);
int32_t windowssysWindowsWin32SystemDataexchangeDdeFreeDataHandle(void* hdata);
int32_t windowssysWindowsWin32SystemDataexchangeDdeFreeStringHandle(uint32_t idinst, void* hsz);
uint32_t windowssysWindowsWin32SystemDataexchangeDdeGetData(void* hdata, void* pdst, uint32_t cbmax, uint32_t cboff);
uint32_t windowssysWindowsWin32SystemDataexchangeDdeGetLastError(uint32_t idinst);
int32_t windowssysWindowsWin32SystemDataexchangeDdeImpersonateClient(void* hconv);
uint32_t windowssysWindowsWin32SystemDataexchangeDdeInitializeA(void* pidinst, void* pfncallback, uint32_t afcmd, uint32_t ulres);
uint32_t windowssysWindowsWin32SystemDataexchangeDdeInitializeW(void* pidinst, void* pfncallback, uint32_t afcmd, uint32_t ulres);
int32_t windowssysWindowsWin32SystemDataexchangeDdeKeepStringHandle(uint32_t idinst, void* hsz);
void* windowssysWindowsWin32SystemDataexchangeDdeNameService(uint32_t idinst, void* hsz1, void* hsz2, uint32_t afcmd);
int32_t windowssysWindowsWin32SystemDataexchangeDdePostAdvise(uint32_t idinst, void* hsztopic, void* hszitem);
uint32_t windowssysWindowsWin32SystemDataexchangeDdeQueryConvInfo(void* hconv, uint32_t idtransaction, void* pconvinfo);
void* windowssysWindowsWin32SystemDataexchangeDdeQueryNextServer(void* hconvlist, void* hconvprev);
uint32_t windowssysWindowsWin32SystemDataexchangeDdeQueryStringA(uint32_t idinst, void* hsz, void* psz, uint32_t cchmax, int32_t icodepage);
uint32_t windowssysWindowsWin32SystemDataexchangeDdeQueryStringW(uint32_t idinst, void* hsz, void* psz, uint32_t cchmax, int32_t icodepage);
void* windowssysWindowsWin32SystemDataexchangeDdeReconnect(void* hconv);
int32_t windowssysWindowsWin32SystemDataexchangeDdeSetQualityOfService(void* hwndclient, void* pqosnew, void* pqosprev);
int32_t windowssysWindowsWin32SystemDataexchangeDdeSetUserHandle(void* hconv, uint32_t id, uint64_t huser);
int32_t windowssysWindowsWin32SystemDataexchangeDdeUnaccessData(void* hdata);
int32_t windowssysWindowsWin32SystemDataexchangeDdeUninitialize(uint32_t idinst);
uint16_t windowssysWindowsWin32SystemDataexchangeDeleteAtom(uint16_t natom);
int32_t windowssysWindowsWin32SystemDataexchangeEmptyClipboard(void);
uint32_t windowssysWindowsWin32SystemDataexchangeEnumClipboardFormats(uint32_t format);
uint16_t windowssysWindowsWin32SystemDataexchangeFindAtomA(void* lpstring);
uint16_t windowssysWindowsWin32SystemDataexchangeFindAtomW(void* lpstring);
int32_t windowssysWindowsWin32SystemDataexchangeFreeDDElParam(uint32_t msg, int64_t lparam);
uint32_t windowssysWindowsWin32SystemDataexchangeGetAtomNameA(uint16_t natom, void* lpbuffer, int32_t nsize);
uint32_t windowssysWindowsWin32SystemDataexchangeGetAtomNameW(uint16_t natom, void* lpbuffer, int32_t nsize);
void* windowssysWindowsWin32SystemDataexchangeGetClipboardData(uint32_t uformat);
int32_t windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameA(uint32_t format, void* lpszformatname, int32_t cchmaxcount);
int32_t windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameW(uint32_t format, void* lpszformatname, int32_t cchmaxcount);
void* windowssysWindowsWin32SystemDataexchangeGetClipboardOwner(void);
uint32_t windowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber(void);
void* windowssysWindowsWin32SystemDataexchangeGetClipboardViewer(void);
void* windowssysWindowsWin32SystemDataexchangeGetOpenClipboardWindow(void);
int32_t windowssysWindowsWin32SystemDataexchangeGetPriorityClipboardFormat(void* paformatprioritylist, int32_t cformats);
int32_t windowssysWindowsWin32SystemDataexchangeGetUpdatedClipboardFormats(void* lpuiformats, uint32_t cformats, void* pcformatsout);
uint16_t windowssysWindowsWin32SystemDataexchangeGlobalAddAtomA(void* lpstring);
uint16_t windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExA(void* lpstring, uint32_t flags);
uint16_t windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExW(void* lpstring, uint32_t flags);
uint16_t windowssysWindowsWin32SystemDataexchangeGlobalAddAtomW(void* lpstring);
uint16_t windowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom(uint16_t natom);
uint16_t windowssysWindowsWin32SystemDataexchangeGlobalFindAtomA(void* lpstring);
uint16_t windowssysWindowsWin32SystemDataexchangeGlobalFindAtomW(void* lpstring);
uint32_t windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameA(uint16_t natom, void* lpbuffer, int32_t nsize);
uint32_t windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameW(uint16_t natom, void* lpbuffer, int32_t nsize);
int32_t windowssysWindowsWin32SystemDataexchangeImpersonateDdeClientWindow(void* hwndclient, void* hwndserver);
int32_t windowssysWindowsWin32SystemDataexchangeInitAtomTable(uint32_t nsize);
int32_t windowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable(uint32_t format);
int32_t windowssysWindowsWin32SystemDataexchangeOpenClipboard(void* hwndnewowner);
int64_t windowssysWindowsWin32SystemDataexchangePackDDElParam(uint32_t msg, uint64_t uilo, uint64_t uihi);
uint32_t windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatA(void* lpszformat);
uint32_t windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatW(void* lpszformat);
int32_t windowssysWindowsWin32SystemDataexchangeRemoveClipboardFormatListener(void* hwnd);
int64_t windowssysWindowsWin32SystemDataexchangeReuseDDElParam(int64_t lparam, uint32_t msgin, uint32_t msgout, uint64_t uilo, uint64_t uihi);
void* windowssysWindowsWin32SystemDataexchangeSetClipboardData(uint32_t uformat, void* hmem);
void* windowssysWindowsWin32SystemDataexchangeSetClipboardViewer(void* hwndnewviewer);
void* windowssysWindowsWin32SystemDataexchangeSetWinMetaFileBits(uint32_t nsize, void* lpmeta16data, void* hdcref, void* lpmfp);
int32_t windowssysWindowsWin32SystemDataexchangeUnpackDDElParam(uint32_t msg, int64_t lparam, void* puilo, void* puihi);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WRAPPER_H */
