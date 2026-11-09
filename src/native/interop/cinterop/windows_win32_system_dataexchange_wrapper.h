#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint16_t windowssys_windows_win32_system_dataexchange_AddAtomA(void* lpstring);
uint16_t windowssys_windows_win32_system_dataexchange_AddAtomW(void* lpstring);
int32_t windowssys_windows_win32_system_dataexchange_AddClipboardFormatListener(void* hwnd);
int32_t windowssys_windows_win32_system_dataexchange_ChangeClipboardChain(void* hwndremove, void* hwndnewnext);
int32_t windowssys_windows_win32_system_dataexchange_CloseClipboard(void);
int32_t windowssys_windows_win32_system_dataexchange_CountClipboardFormats(void);
int32_t windowssys_windows_win32_system_dataexchange_DdeAbandonTransaction(uint32_t idinst, void* hconv, uint32_t idtransaction);
void* windowssys_windows_win32_system_dataexchange_DdeAccessData(void* hdata, void* pcbdatasize);
void* windowssys_windows_win32_system_dataexchange_DdeAddData(void* hdata, void* psrc, uint32_t cb, uint32_t cboff);
void* windowssys_windows_win32_system_dataexchange_DdeClientTransaction(void* pdata, uint32_t cbdata, void* hconv, void* hszitem, uint32_t wfmt, uint32_t wtype, uint32_t dwtimeout, void* pdwresult);
int32_t windowssys_windows_win32_system_dataexchange_DdeCmpStringHandles(void* hsz1, void* hsz2);
void* windowssys_windows_win32_system_dataexchange_DdeConnect(uint32_t idinst, void* hszservice, void* hsztopic, void* pcc);
void* windowssys_windows_win32_system_dataexchange_DdeConnectList(uint32_t idinst, void* hszservice, void* hsztopic, void* hconvlist, void* pcc);
void* windowssys_windows_win32_system_dataexchange_DdeCreateDataHandle(uint32_t idinst, void* psrc, uint32_t cb, uint32_t cboff, void* hszitem, uint32_t wfmt, uint32_t afcmd);
void* windowssys_windows_win32_system_dataexchange_DdeCreateStringHandleA(uint32_t idinst, void* psz, int32_t icodepage);
void* windowssys_windows_win32_system_dataexchange_DdeCreateStringHandleW(uint32_t idinst, void* psz, int32_t icodepage);
int32_t windowssys_windows_win32_system_dataexchange_DdeDisconnect(void* hconv);
int32_t windowssys_windows_win32_system_dataexchange_DdeDisconnectList(void* hconvlist);
int32_t windowssys_windows_win32_system_dataexchange_DdeEnableCallback(uint32_t idinst, void* hconv, uint32_t wcmd);
int32_t windowssys_windows_win32_system_dataexchange_DdeFreeDataHandle(void* hdata);
int32_t windowssys_windows_win32_system_dataexchange_DdeFreeStringHandle(uint32_t idinst, void* hsz);
uint32_t windowssys_windows_win32_system_dataexchange_DdeGetData(void* hdata, void* pdst, uint32_t cbmax, uint32_t cboff);
uint32_t windowssys_windows_win32_system_dataexchange_DdeGetLastError(uint32_t idinst);
int32_t windowssys_windows_win32_system_dataexchange_DdeImpersonateClient(void* hconv);
uint32_t windowssys_windows_win32_system_dataexchange_DdeInitializeA(void* pidinst, void* pfncallback, uint32_t afcmd, uint32_t ulres);
uint32_t windowssys_windows_win32_system_dataexchange_DdeInitializeW(void* pidinst, void* pfncallback, uint32_t afcmd, uint32_t ulres);
int32_t windowssys_windows_win32_system_dataexchange_DdeKeepStringHandle(uint32_t idinst, void* hsz);
void* windowssys_windows_win32_system_dataexchange_DdeNameService(uint32_t idinst, void* hsz1, void* hsz2, uint32_t afcmd);
int32_t windowssys_windows_win32_system_dataexchange_DdePostAdvise(uint32_t idinst, void* hsztopic, void* hszitem);
uint32_t windowssys_windows_win32_system_dataexchange_DdeQueryConvInfo(void* hconv, uint32_t idtransaction, void* pconvinfo);
void* windowssys_windows_win32_system_dataexchange_DdeQueryNextServer(void* hconvlist, void* hconvprev);
uint32_t windowssys_windows_win32_system_dataexchange_DdeQueryStringA(uint32_t idinst, void* hsz, void* psz, uint32_t cchmax, int32_t icodepage);
uint32_t windowssys_windows_win32_system_dataexchange_DdeQueryStringW(uint32_t idinst, void* hsz, void* psz, uint32_t cchmax, int32_t icodepage);
void* windowssys_windows_win32_system_dataexchange_DdeReconnect(void* hconv);
int32_t windowssys_windows_win32_system_dataexchange_DdeSetQualityOfService(void* hwndclient, void* pqosnew, void* pqosprev);
int32_t windowssys_windows_win32_system_dataexchange_DdeSetUserHandle(void* hconv, uint32_t id, uint64_t huser);
int32_t windowssys_windows_win32_system_dataexchange_DdeUnaccessData(void* hdata);
int32_t windowssys_windows_win32_system_dataexchange_DdeUninitialize(uint32_t idinst);
uint16_t windowssys_windows_win32_system_dataexchange_DeleteAtom(uint16_t natom);
int32_t windowssys_windows_win32_system_dataexchange_EmptyClipboard(void);
uint32_t windowssys_windows_win32_system_dataexchange_EnumClipboardFormats(uint32_t format);
uint16_t windowssys_windows_win32_system_dataexchange_FindAtomA(void* lpstring);
uint16_t windowssys_windows_win32_system_dataexchange_FindAtomW(void* lpstring);
int32_t windowssys_windows_win32_system_dataexchange_FreeDDElParam(uint32_t msg, int64_t lparam);
uint32_t windowssys_windows_win32_system_dataexchange_GetAtomNameA(uint16_t natom, void* lpbuffer, int32_t nsize);
uint32_t windowssys_windows_win32_system_dataexchange_GetAtomNameW(uint16_t natom, void* lpbuffer, int32_t nsize);
void* windowssys_windows_win32_system_dataexchange_GetClipboardData(uint32_t uformat);
int32_t windowssys_windows_win32_system_dataexchange_GetClipboardFormatNameA(uint32_t format, void* lpszformatname, int32_t cchmaxcount);
int32_t windowssys_windows_win32_system_dataexchange_GetClipboardFormatNameW(uint32_t format, void* lpszformatname, int32_t cchmaxcount);
void* windowssys_windows_win32_system_dataexchange_GetClipboardOwner(void);
uint32_t windowssys_windows_win32_system_dataexchange_GetClipboardSequenceNumber(void);
void* windowssys_windows_win32_system_dataexchange_GetClipboardViewer(void);
void* windowssys_windows_win32_system_dataexchange_GetOpenClipboardWindow(void);
int32_t windowssys_windows_win32_system_dataexchange_GetPriorityClipboardFormat(void* paformatprioritylist, int32_t cformats);
int32_t windowssys_windows_win32_system_dataexchange_GetUpdatedClipboardFormats(void* lpuiformats, uint32_t cformats, void* pcformatsout);
uint16_t windowssys_windows_win32_system_dataexchange_GlobalAddAtomA(void* lpstring);
uint16_t windowssys_windows_win32_system_dataexchange_GlobalAddAtomExA(void* lpstring, uint32_t flags);
uint16_t windowssys_windows_win32_system_dataexchange_GlobalAddAtomExW(void* lpstring, uint32_t flags);
uint16_t windowssys_windows_win32_system_dataexchange_GlobalAddAtomW(void* lpstring);
uint16_t windowssys_windows_win32_system_dataexchange_GlobalDeleteAtom(uint16_t natom);
uint16_t windowssys_windows_win32_system_dataexchange_GlobalFindAtomA(void* lpstring);
uint16_t windowssys_windows_win32_system_dataexchange_GlobalFindAtomW(void* lpstring);
uint32_t windowssys_windows_win32_system_dataexchange_GlobalGetAtomNameA(uint16_t natom, void* lpbuffer, int32_t nsize);
uint32_t windowssys_windows_win32_system_dataexchange_GlobalGetAtomNameW(uint16_t natom, void* lpbuffer, int32_t nsize);
int32_t windowssys_windows_win32_system_dataexchange_ImpersonateDdeClientWindow(void* hwndclient, void* hwndserver);
int32_t windowssys_windows_win32_system_dataexchange_InitAtomTable(uint32_t nsize);
int32_t windowssys_windows_win32_system_dataexchange_IsClipboardFormatAvailable(uint32_t format);
int32_t windowssys_windows_win32_system_dataexchange_OpenClipboard(void* hwndnewowner);
int64_t windowssys_windows_win32_system_dataexchange_PackDDElParam(uint32_t msg, uint64_t uilo, uint64_t uihi);
uint32_t windowssys_windows_win32_system_dataexchange_RegisterClipboardFormatA(void* lpszformat);
uint32_t windowssys_windows_win32_system_dataexchange_RegisterClipboardFormatW(void* lpszformat);
int32_t windowssys_windows_win32_system_dataexchange_RemoveClipboardFormatListener(void* hwnd);
int64_t windowssys_windows_win32_system_dataexchange_ReuseDDElParam(int64_t lparam, uint32_t msgin, uint32_t msgout, uint64_t uilo, uint64_t uihi);
void* windowssys_windows_win32_system_dataexchange_SetClipboardData(uint32_t uformat, void* hmem);
void* windowssys_windows_win32_system_dataexchange_SetClipboardViewer(void* hwndnewviewer);
void* windowssys_windows_win32_system_dataexchange_SetWinMetaFileBits(uint32_t nsize, void* lpmeta16data, void* hdcref, void* lpmfp);
int32_t windowssys_windows_win32_system_dataexchange_UnpackDDElParam(uint32_t msg, int64_t lparam, void* puilo, void* puihi);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WINDOWS_WIN32_SYSTEM_DATAEXCHANGE_WRAPPER_H */
