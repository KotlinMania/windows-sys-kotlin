#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_addressbook_buildDisplayTable(void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpmalloc, void* hinstance, uint32_t cpages, void* lppage, uint32_t ulflags, void* lpptable, void* lpptbldata);
void windowssys_windows_win32_system_addressbook_changeIdleRoutine(void* ftg, void* lpfnidle, void* lpvidleparam, int16_t priidle, uint32_t csecidle, uint16_t iroidle, uint16_t ircidle);
int32_t windowssys_windows_win32_system_addressbook_createIProp(void* lpinterface, void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpvreserved, void* lpppropdata);
int32_t windowssys_windows_win32_system_addressbook_createTable(void* lpinterface, void* lpallocatebuffer, void* lpallocatemore, void* lpfreebuffer, void* lpvreserved, uint32_t ultabletype, uint32_t ulproptagindexcolumn, void* lpsproptagarraycolumns, void* lpptabledata);
void windowssys_windows_win32_system_addressbook_deinitMapiUtil(void);
void windowssys_windows_win32_system_addressbook_deregisterIdleRoutine(void* ftg);
void windowssys_windows_win32_system_addressbook_enableIdleRoutine(void* ftg, int32_t fenable);
int32_t windowssys_windows_win32_system_addressbook_fEqualNames(void* lpname1, void* lpname2);
int32_t windowssys_windows_win32_system_addressbook_fPropCompareProp(void* lpspropvalue1, uint32_t ulrelop, void* lpspropvalue2);
int32_t windowssys_windows_win32_system_addressbook_fPropContainsProp(void* lpspropvaluedst, void* lpspropvaluesrc, uint32_t ulfuzzylevel);
int32_t windowssys_windows_win32_system_addressbook_fPropExists(void* lpmapiprop, uint32_t ulproptag);
void windowssys_windows_win32_system_addressbook_freePadrlist(void* lpadrlist);
void windowssys_windows_win32_system_addressbook_freeProws(void* lprows);
void* windowssys_windows_win32_system_addressbook_ftgRegisterIdleRoutine(void* lpfnidle, void* lpvidleparam, int16_t priidle, uint32_t csecidle, uint16_t iroidle);
int32_t windowssys_windows_win32_system_addressbook_hrAddColumns(void* lptbl, void* lpproptagcolumnsnew, void* lpallocatebuffer, void* lpfreebuffer);
int32_t windowssys_windows_win32_system_addressbook_hrAddColumnsEx(void* lptbl, void* lpproptagcolumnsnew, void* lpallocatebuffer, void* lpfreebuffer, int64_t lpfnfiltercolumns);
int32_t windowssys_windows_win32_system_addressbook_hrAllocAdviseSink(void* lpfncallback, void* lpvcontext, void* lppadvisesink);
int32_t windowssys_windows_win32_system_addressbook_hrDispatchNotifications(uint32_t ulflags);
int32_t windowssys_windows_win32_system_addressbook_hrGetOneProp(void* lpmapiprop, uint32_t ulproptag, void* lppprop);
int32_t windowssys_windows_win32_system_addressbook_hrIStorageFromStream(void* lpunkin, void* lpinterface, uint32_t ulflags, void* lppstorageout);
int32_t windowssys_windows_win32_system_addressbook_hrQueryAllRows(void* lptable, void* lpproptags, void* lprestriction, void* lpsortorderset, int32_t crowsmax, void* lpprows);
int32_t windowssys_windows_win32_system_addressbook_hrSetOneProp(void* lpmapiprop, void* lpprop);
int32_t windowssys_windows_win32_system_addressbook_hrThisThreadAdviseSink(void* lpadvisesink, void* lppadvisesink);
int32_t windowssys_windows_win32_system_addressbook_lPropCompareProp(void* lpspropvaluea, void* lpspropvalueb);
void* windowssys_windows_win32_system_addressbook_lpValFindProp(uint32_t ulproptag, uint32_t cvalues, void* lpproparray);
void windowssys_windows_win32_system_addressbook_mAPIDeinitIdle(void);
void* windowssys_windows_win32_system_addressbook_mAPIGetDefaultMalloc(void);
int32_t windowssys_windows_win32_system_addressbook_mAPIInitIdle(void* lpvreserved);
int32_t windowssys_windows_win32_system_addressbook_openStreamOnFile(void* lpallocatebuffer, void* lpfreebuffer, uint32_t ulflags, void* lpszfilename, void* lpszprefix, void* lppstream);
void* windowssys_windows_win32_system_addressbook_ppropFindProp(void* lpproparray, uint32_t cvalues, uint32_t ulproptag);
int32_t windowssys_windows_win32_system_addressbook_propCopyMore(void* lpspropvaluedest, void* lpspropvaluesrc, void* lpfallocmore, void* lpvobject);
int32_t windowssys_windows_win32_system_addressbook_rTFSync(void* lpmessage, uint32_t ulflags, void* lpfmessageupdated);
int32_t windowssys_windows_win32_system_addressbook_scCopyNotifications(int32_t cnotification, void* lpnotifications, void* lpvdst, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_scCopyProps(int32_t cvalues, void* lpproparray, void* lpvdst, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_scCountNotifications(int32_t cnotifications, void* lpnotifications, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_scCountProps(int32_t cvalues, void* lpproparray, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_scCreateConversationIndex(uint32_t cbparent, void* lpbparent, void* lpcbconvindex, void* lppbconvindex);
int32_t windowssys_windows_win32_system_addressbook_scDupPropset(int32_t cvalues, void* lpproparray, void* lpallocatebuffer, void* lppproparray);
int32_t windowssys_windows_win32_system_addressbook_scInitMapiUtil(uint32_t ulflags);
int32_t windowssys_windows_win32_system_addressbook_scLocalPathFromUNC(void* lpszunc, void* lpszlocal, uint32_t cchlocal);
int32_t windowssys_windows_win32_system_addressbook_scRelocNotifications(int32_t cnotification, void* lpnotifications, void* lpvbaseold, void* lpvbasenew, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_scRelocProps(int32_t cvalues, void* lpproparray, void* lpvbaseold, void* lpvbasenew, void* lpcb);
int32_t windowssys_windows_win32_system_addressbook_scUNCFromLocalPath(void* lpszlocal, void* lpszunc, uint32_t cchunc);
void* windowssys_windows_win32_system_addressbook_szFindCh(void* lpsz, uint16_t ch);
void* windowssys_windows_win32_system_addressbook_szFindLastCh(void* lpsz, uint16_t ch);
void* windowssys_windows_win32_system_addressbook_szFindSz(void* lpsz, void* lpszkey);
uint32_t windowssys_windows_win32_system_addressbook_uFromSz(void* lpsz);
uint32_t windowssys_windows_win32_system_addressbook_ulAddRef(void* lpunk);
uint32_t windowssys_windows_win32_system_addressbook_ulPropSize(void* lpspropvalue);
uint32_t windowssys_windows_win32_system_addressbook_ulRelease(void* lpunk);
int32_t windowssys_windows_win32_system_addressbook_wrapCompressedRTFStream(void* lpcompressedrtfstream, uint32_t ulflags, void* lpuncompressedrtfstream);
int32_t windowssys_windows_win32_system_addressbook_wrapStoreEntryID(uint32_t ulflags, void* lpszdllname, uint32_t cborigentry, void* lporigentry, void* lpcbwrappedentry, void* lppwrappedentry);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WINDOWS_WIN32_SYSTEM_ADDRESSBOOK_WRAPPER_H */
