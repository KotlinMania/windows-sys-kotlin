#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint16_t windowssys_windows_win32_system_dataexchange_addAtomA(void* lpstring);
uint16_t windowssys_windows_win32_system_dataexchange_addAtomW(void* lpstring);
int32_t windowssys_windows_win32_system_dataexchange_addClipboardFormatListener(void* hwnd);
int32_t windowssys_windows_win32_system_dataexchange_changeClipboardChain(void* hwndremove, void* hwndnewnext);
int32_t windowssys_windows_win32_system_dataexchange_closeClipboard(void);
int32_t windowssys_windows_win32_system_dataexchange_countClipboardFormats(void);
int32_t windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction(uint32_t idinst, void* hconv, uint32_t idtransaction);
void* windowssys_windows_win32_system_dataexchange_ddeAccessData(void* hdata, void* pcbdatasize);
void* windowssys_windows_win32_system_dataexchange_ddeAddData(void* hdata, void* psrc, uint32_t cb, uint32_t cboff);
void* windowssys_windows_win32_system_dataexchange_ddeClientTransaction(void* pdata, uint32_t cbdata, void* hconv, void* hszitem, uint32_t wfmt, uint32_t wtype, uint32_t dwtimeout, void* pdwresult);
int32_t windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles(void* hsz1, void* hsz2);
void* windowssys_windows_win32_system_dataexchange_ddeConnect(uint32_t idinst, void* hszservice, void* hsztopic, void* pcc);
void* windowssys_windows_win32_system_dataexchange_ddeConnectList(uint32_t idinst, void* hszservice, void* hsztopic, void* hconvlist, void* pcc);
void* windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle(uint32_t idinst, void* psrc, uint32_t cb, uint32_t cboff, void* hszitem, uint32_t wfmt, uint32_t afcmd);
void* windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA(uint32_t idinst, void* psz, int32_t icodepage);
void* windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW(uint32_t idinst, void* psz, int32_t icodepage);
int32_t windowssys_windows_win32_system_dataexchange_ddeDisconnect(void* hconv);
int32_t windowssys_windows_win32_system_dataexchange_ddeDisconnectList(void* hconvlist);
int32_t windowssys_windows_win32_system_dataexchange_ddeEnableCallback(uint32_t idinst, void* hconv, uint32_t wcmd);
int32_t windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle(void* hdata);
int32_t windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle(uint32_t idinst, void* hsz);
uint32_t windowssys_windows_win32_system_dataexchange_ddeGetData(void* hdata, void* pdst, uint32_t cbmax, uint32_t cboff);
uint32_t windowssys_windows_win32_system_dataexchange_ddeGetLastError(uint32_t idinst);
int32_t windowssys_windows_win32_system_dataexchange_ddeImpersonateClient(void* hconv);
uint32_t windowssys_windows_win32_system_dataexchange_ddeInitializeA(void* pidinst, void* pfncallback, uint32_t afcmd, uint32_t ulres);
uint32_t windowssys_windows_win32_system_dataexchange_ddeInitializeW(void* pidinst, void* pfncallback, uint32_t afcmd, uint32_t ulres);
int32_t windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle(uint32_t idinst, void* hsz);
void* windowssys_windows_win32_system_dataexchange_ddeNameService(uint32_t idinst, void* hsz1, void* hsz2, uint32_t afcmd);
int32_t windowssys_windows_win32_system_dataexchange_ddePostAdvise(uint32_t idinst, void* hsztopic, void* hszitem);
uint32_t windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo(void* hconv, uint32_t idtransaction, void* pconvinfo);
void* windowssys_windows_win32_system_dataexchange_ddeQueryNextServer(void* hconvlist, void* hconvprev);
uint32_t windowssys_windows_win32_system_dataexchange_ddeQueryStringA(uint32_t idinst, void* hsz, void* psz, uint32_t cchmax, int32_t icodepage);
uint32_t windowssys_windows_win32_system_dataexchange_ddeQueryStringW(uint32_t idinst, void* hsz, void* psz, uint32_t cchmax, int32_t icodepage);
void* windowssys_windows_win32_system_dataexchange_ddeReconnect(void* hconv);
int32_t windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService(void* hwndclient, void* pqosnew, void* pqosprev);
int32_t windowssys_windows_win32_system_dataexchange_ddeSetUserHandle(void* hconv, uint32_t id, uint64_t huser);
int32_t windowssys_windows_win32_system_dataexchange_ddeUnaccessData(void* hdata);
int32_t windowssys_windows_win32_system_dataexchange_ddeUninitialize(uint32_t idinst);
uint16_t windowssys_windows_win32_system_dataexchange_deleteAtom(uint16_t natom);
int32_t windowssys_windows_win32_system_dataexchange_emptyClipboard(void);
uint32_t windowssys_windows_win32_system_dataexchange_enumClipboardFormats(uint32_t format);
uint16_t windowssys_windows_win32_system_dataexchange_findAtomA(void* lpstring);
uint16_t windowssys_windows_win32_system_dataexchange_findAtomW(void* lpstring);
int32_t windowssys_windows_win32_system_dataexchange_freeDDElParam(uint32_t msg, int64_t lparam);
uint32_t windowssys_windows_win32_system_dataexchange_getAtomNameA(uint16_t natom, void* lpbuffer, int32_t nsize);
uint32_t windowssys_windows_win32_system_dataexchange_getAtomNameW(uint16_t natom, void* lpbuffer, int32_t nsize);
void* windowssys_windows_win32_system_dataexchange_getClipboardData(uint32_t uformat);
int32_t windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA(uint32_t format, void* lpszformatname, int32_t cchmaxcount);
int32_t windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW(uint32_t format, void* lpszformatname, int32_t cchmaxcount);
void* windowssys_windows_win32_system_dataexchange_getClipboardOwner(void);
uint32_t windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber(void);
void* windowssys_windows_win32_system_dataexchange_getClipboardViewer(void);
void* windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow(void);
int32_t windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat(void* paformatprioritylist, int32_t cformats);
int32_t windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats(void* lpuiformats, uint32_t cformats, void* pcformatsout);
uint16_t windowssys_windows_win32_system_dataexchange_globalAddAtomA(void* lpstring);
uint16_t windowssys_windows_win32_system_dataexchange_globalAddAtomExA(void* lpstring, uint32_t flags);
uint16_t windowssys_windows_win32_system_dataexchange_globalAddAtomExW(void* lpstring, uint32_t flags);
uint16_t windowssys_windows_win32_system_dataexchange_globalAddAtomW(void* lpstring);
uint16_t windowssys_windows_win32_system_dataexchange_globalDeleteAtom(uint16_t natom);
uint16_t windowssys_windows_win32_system_dataexchange_globalFindAtomA(void* lpstring);
uint16_t windowssys_windows_win32_system_dataexchange_globalFindAtomW(void* lpstring);
uint32_t windowssys_windows_win32_system_dataexchange_globalGetAtomNameA(uint16_t natom, void* lpbuffer, int32_t nsize);
uint32_t windowssys_windows_win32_system_dataexchange_globalGetAtomNameW(uint16_t natom, void* lpbuffer, int32_t nsize);
int32_t windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow(void* hwndclient, void* hwndserver);
int32_t windowssys_windows_win32_system_dataexchange_initAtomTable(uint32_t nsize);
int32_t windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable(uint32_t format);
int32_t windowssys_windows_win32_system_dataexchange_openClipboard(void* hwndnewowner);
int64_t windowssys_windows_win32_system_dataexchange_packDDElParam(uint32_t msg, uint64_t uilo, uint64_t uihi);
uint32_t windowssys_windows_win32_system_dataexchange_registerClipboardFormatA(void* lpszformat);
uint32_t windowssys_windows_win32_system_dataexchange_registerClipboardFormatW(void* lpszformat);
int32_t windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener(void* hwnd);
int64_t windowssys_windows_win32_system_dataexchange_reuseDDElParam(int64_t lparam, uint32_t msgin, uint32_t msgout, uint64_t uilo, uint64_t uihi);
void* windowssys_windows_win32_system_dataexchange_setClipboardData(uint32_t uformat, void* hmem);
void* windowssys_windows_win32_system_dataexchange_setClipboardViewer(void* hwndnewviewer);
void* windowssys_windows_win32_system_dataexchange_setWinMetaFileBits(uint32_t nsize, void* lpmeta16data, void* hdcref, void* lpmfp);
int32_t windowssys_windows_win32_system_dataexchange_unpackDDElParam(uint32_t msg, int64_t lparam, void* puilo, void* puihi);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WRAPPER_H */
